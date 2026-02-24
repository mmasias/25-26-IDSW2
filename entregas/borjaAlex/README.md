# Composición y Agregación

## Concepto: Conversación

Se eligió modelar una **Conversación** porque es un concepto que tiene de todo: partes que no pueden existir solas y partes que viven por su cuenta. Esto permite comprender cuándo aplicar **composición** y cuándo **agregación**, pensando desde el dominio y no desde el código.

---

## Diagrama de Dominio

![Diagrama de Dominio](images/diagrama.png)

---

## ¿Cómo distinguir una de otra?

La pregunta clave es: **si se destruye el todo, ¿la parte tiene sentido por sí sola?**

|                  | Composición ◆                                  | Agregación ◇                                         |
| ---------------- | ---------------------------------------------- | ---------------------------------------------------- |
| **Dependencia**  | La parte **no existe** sin el todo             | La parte **existe independientemente**               |
| **Creación**     | El todo **crea** la parte internamente         | La parte se **crea fuera** y se pasa como referencia |
| **Destrucción**  | Si el todo se destruye, las partes **también** | Si el todo se destruye, las partes **sobreviven**    |
| **Compartición** | La parte pertenece a **un solo** todo          | La parte puede pertenecer a **múltiples** todos      |

---

## Composición ◆ — _"La parte NO existe sin el todo"_

### ¿Por qué estos elementos son composición?

Pensándolo desde la vida real:

- Un **Mensaje** no tiene sentido flotando solo. Siempre pertenece a una conversación concreta. Si borro la conversación, los mensajes desaparecen con ella.
- El **Contenido** de un mensaje (el texto, la imagen) no existe separado del mensaje. No tiene identidad propia fuera de él.
- Un **Adjunto** está atado al mensaje donde se envió. No lo encuentras suelto en ningún lado.
- Una **Reacción** solo existe en el contexto de un mensaje específico.
- Una **Notificación** se genera porque existe un mensaje. Sin ese mensaje, la notificación no tiene razón de ser.
- El **Contexto** (tema, motivo de la conversación) es propio de esa conversación. No se comparte con otras.

### ¿Cómo se refleja esto en el código?

En composición se observa que:

1. El constructor de la parte es **package-private** — solo el todo puede crearla.
2. La parte se **crea dentro** del todo, no se recibe como parámetro.
3. Si el todo se destruye, **destruye las partes en cascada**.
4. Se retornan listas **inmutables** para proteger la composición.

### `Conversacion ◆── Mensaje`

La conversación es la que crea el mensaje. Nadie de fuera puede hacer `new Mensaje()` directamente:

**Mensaje.java**

```java
public class Mensaje {

    private final String id;
    private final String contenido;
    private final Participante emisor;

    // Package-private: solo Conversacion puede crear Mensajes
    Mensaje(String contenido, Participante emisor) {
        this.id = UUID.randomUUID().toString();
        this.contenido = contenido;
        this.emisor = emisor;
    }

    void destruir() {
        // se limpia cuando la conversación se destruye
    }
}
```

**Conversacion.java**

```java
public class Conversacion {

    private final List<Mensaje> mensajes = new ArrayList<>();

    // El mensaje se crea DENTRO — la conversación decide cuándo nace
    public Mensaje agregarMensaje(String contenido, Participante emisor) {
        Mensaje mensaje = new Mensaje(contenido, emisor);
        mensajes.add(mensaje);
        return mensaje;
    }

    // Lista inmutable: nadie de fuera puede modificar los mensajes
    public List<Mensaje> obtenerMensajes() {
        return Collections.unmodifiableList(mensajes);
    }

    // Si la conversación muere, los mensajes mueren con ella
    public void destruir() {
        for (Mensaje mensaje : mensajes) {
            mensaje.destruir();
        }
        mensajes.clear();
    }
}
```

### `Mensaje ◆── Contenido`

El contenido nace con el mensaje. No tiene vida propia:

```java
public class Contenido {

    private final String cuerpo;
    private final TipoContenido tipo;

    Contenido(String cuerpo, TipoContenido tipo) {
        this.cuerpo = cuerpo;
        this.tipo = tipo;
    }
}
```

```java
public class Mensaje {

    private final Contenido contenido;

    Mensaje(String cuerpo, TipoContenido tipo, Participante emisor) {
        this.contenido = new Contenido(cuerpo, tipo); // nace aquí, no viene de fuera
    }
}
```

### `Mensaje ◆── Adjunto`

Un adjunto no existe sin su mensaje. Se crea dentro de él:

```java
public class Adjunto {

    private final String nombreArchivo;
    private final byte[] datos;

    Adjunto(String nombreArchivo, byte[] datos) {
        this.nombreArchivo = nombreArchivo;
        this.datos = datos;
    }
}
```

```java
public class Mensaje {

    private final List<Adjunto> adjuntos = new ArrayList<>();

    public Adjunto agregarAdjunto(String nombre, byte[] datos) {
        Adjunto adjunto = new Adjunto(nombre, datos);
        adjuntos.add(adjunto);
        return adjunto;
    }

    void destruir() {
        adjuntos.clear();
    }
}
```

---

## Agregación ◇ — _"La parte EXISTE independientemente del todo"_

### ¿Por qué estos elementos son agregación?

Aquí la lógica cambia completamente:

- Un **Participante** (una persona) existe antes, durante y después de cualquier conversación. Juan no desaparece porque se borre un chat. Además, puede estar en muchas conversaciones a la vez.
- Un **Medio** (digital, presencial, telefónico) es un concepto que existe por sí solo. Muchas conversaciones pueden usar el mismo medio.
- Un **Canal** (WhatsApp, email, presencial) también existe independientemente. Si se elimina una conversación, WhatsApp sigue existiendo.

### ¿Cómo se refleja esto en el código?

En agregación se observa que:

1. El constructor de la parte es **public** — cualquiera puede crearla.
2. La parte se **crea fuera** del todo y se pasa como **referencia**.
3. Si el todo se destruye, solo se **elimina la referencia** (la parte sigue viva).
4. La parte puede ser **compartida** entre múltiples todos.

### `Conversacion ◇── Participante`

El participante se crea fuera y se le pasa a la conversación. La conversación no lo posee, solo lo referencia:

**Participante.java**

```java
public class Participante {

    private final String id;
    private final String nombre;
    private final String email;

    // Público: un participante existe por sí mismo
    public Participante(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
}
```

**Conversacion.java**

```java
public class Conversacion {

    private final List<Participante> participantes = new ArrayList<>();

    // Se recibe desde fuera, no se crea aquí
    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void removerParticipante(Participante participante) {
        participantes.remove(participante);
    }

    // Al destruir, solo soltamos la referencia. El participante sigue vivo.
    public void destruir() {
        participantes.clear();
    }
}
```

### `Conversacion ◇── Medio`

El medio existe por sí solo. Varias conversaciones pueden compartir el mismo:

```java
public class Medio {

    private final String nombre;
    private final TipoMedio tipo;

    public Medio(String nombre, TipoMedio tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
}
```

```java
public class Conversacion {

    private Medio medio;

    public void asignarMedio(Medio medio) {
        this.medio = medio;
    }

    // Solo soltamos la referencia
    public void destruir() {
        this.medio = null;
    }
}
```

---

## Poniéndolo todo junto

Este ejemplo muestra cómo se ve la diferencia en la práctica. Lo interesante es observar qué ocurre al destruir la conversación:

```java
public class Main {
    public static void main(String[] args) {

        // ══════════════════════════════════════════════
        // AGREGACIÓN: estas entidades ya existen por su cuenta
        // ══════════════════════════════════════════════
        Participante juan = new Participante("P001", "Juan", "juan@email.com");
        Participante maria = new Participante("P002", "María", "maria@email.com");
        Medio internet = new Medio("Internet", TipoMedio.DIGITAL);
        Canal whatsapp = new Canal("CH001", "WhatsApp", "Mensajería");

        // ══════════════════════════════════════════════
        // Crear conversación y AGREGAR entidades que ya existían
        // ══════════════════════════════════════════════
        Conversacion conv = new Conversacion("C001", "Proyecto");
        conv.agregarParticipante(juan);    // ◇ solo una referencia
        conv.agregarParticipante(maria);   // ◇ solo una referencia
        conv.asignarMedio(internet);       // ◇ solo una referencia
        conv.asignarCanal(whatsapp);       // ◇ solo una referencia

        // ══════════════════════════════════════════════
        // COMPOSICIÓN: estas entidades nacen DENTRO de la conversación
        // ══════════════════════════════════════════════
        conv.establecerContexto("Sprint Planning", "Reunión"); // ◆ nace aquí
        Mensaje msg = conv.agregarMensaje("Hola", TipoContenido.TEXTO, juan); // ◆ nace aquí
        msg.agregarAdjunto("doc.pdf", new byte[1024]);  // ◆ nace aquí
        msg.agregarReaccion("like", maria);               // ◆ nace aquí

        // ══════════════════════════════════════════════
        // Juan puede estar en OTRA conversación al mismo tiempo
        // ══════════════════════════════════════════════
        Conversacion otra = new Conversacion("C002", "Chat");
        otra.agregarParticipante(juan);    // ¡el MISMO Juan!
        otra.asignarMedio(internet);       // ¡el MISMO Medio!

        // ══════════════════════════════════════════════
        // DESTRUIR la primera conversación
        // ══════════════════════════════════════════════
        conv.destruir();

        // Composición → Mensajes, Contexto, Adjuntos, Reacciones: DESTRUIDOS
        // Agregación  → Juan, María, Internet, WhatsApp: SIGUEN VIVOS

        System.out.println(juan);     // ← sigue existiendo
        System.out.println(internet); // ← sigue existiendo
        System.out.println(otra);     // ← Juan sigue aquí
    }
}
```

---

## Conclusión

```
COMPOSICIÓN ◆ (rombo negro)              AGREGACIÓN ◇ (rombo blanco)
─────────────────────────────             ─────────────────────────────
• La parte NO tiene sentido sola          • La parte EXISTE por sí misma
• Se crea DENTRO del todo                 • Se crea FUERA y se pasa
• Se destruye CON el todo                 • SOBREVIVE al todo
• Pertenece a UN solo todo                • Puede estar en VARIOS todos
```

La clave está en hacerse la pregunta: **¿esta parte puede existir sin el todo?** Si la respuesta es *no*, es composición. Si la respuesta es *sí*, es agregación. El código simplemente refleja esa decisión conceptual.
