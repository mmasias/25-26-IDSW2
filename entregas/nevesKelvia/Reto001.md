# Reto 001 - Relaciones por Colaboración (Diseño)

**Escenario elegido:** Conversación

He elegido este escenario porque, aunque es un dominio cotidiano que todos entendemos (como WhatsApp o Discord), presenta varias posibilidades de diseño para este reto y permite debatir sobre sobre ciclos de vida (ej. ¿Un mensaje puede existir sin una conversacion? o ¿Un usuario desaparece si se borra la conversacion? o ¿Un archivo adjunto pertenece a un solo mensaje o se guarda en una galería compartida?)...

Y para modelar este dominio, he decidido abstraer el concepto de **Conversación** para que soporte tanto interacciones digitales (apps de mensajería) como físicas (encontrarse a un amigo en la calle, hablar en lenguaje de señas o usar código morse).

## 1. Identificar (Análisis de Dominio)

### Entidades Seleccionadas

### Entidades Seleccionadas (y su justificación)

* **Participante:** El ente (persona o sistema) que interactúa. Tiene identidad propia y existe independientemente de si está conversando o no.

* **Conversación (Interacción):** El evento donde ocurre el intercambio. Define quiénes participan y el contexto.

* **Mensaje:** La unidad de información transmitida por un Participante dentro de una Conversación.

* **Canal / Medio:** El entorno físico o virtual (ej. digital, acústico, visual). Es muy importante porque dice la temporalidad y persistencia del mensaje.

* **Código / Idioma:** El sistema de reglas utilizado (ej. texto, código morse, lenguaje de señas).

* **Formato:** La estructura o representación física/digital de la información (ej. Texto, Nota de voz, Video). Se mantiene separado porque un mismo "Código" (Español) puede viajar en distintos "Formatos" (texto escrito o audio).

* **Adjunto (Recurso):** Un elemento extra aportado al mensaje (un archivo digital o un objeto físico mostrado).

### Entidades Descartadas (Justificación)

* **Servidor / Red / Cuerdas vocales:** Se descartan porque son infraestructura técnica de bajo nivel. No pertenecen a la lógica pura de "comunicarse".

* **Notificación:** Se descarta para mantener la cohesión del modelo base. Es un efecto secundario de recibir un mensaje, no una parte estructural de la conversación.

* **Contacto (Agenda):** Se descarta porque pertenece al dominio de gestión personal del usuario, no a la conversación en sí (solo nos importan los participantes activos).

## 2. Relacionar

### 1. Conversación <---> Participante

* **Ciclo de vida:** Independiente. El `Participante` existe antes de la conversación y sobrevive si la `Conversación` se destruye.

* **Temporalidad:** Puede ser puntual o prolongada, pero no estática. Un participante se une y puede abandonar la interacción.

* **Exclusividad:** Compartida. Un `Participante` puede estar en múltiples `Conversaciones` simultáneamente.

* **Decisión de Diseño:** **Agregación (o Asociación).** * **Justificación:** Elegimos Agregación porque la Conversación "agrupa" participantes, pero no es dueña de ellos. No elegimos la relación inmediatamente más fuerte (Composición) porque destruir la Conversación implicaría destruir al Participante (lo cual borraría al usuario del sistema, y no está bien).

### 2. Conversación <---> Mensaje

* **Ciclo de vida:** Estricto. La `Conversación` controla la vida del `Mensaje`. Un mensaje no tiene sentido conceptual flotando en el vacío sin un contexto de conversación. Si se borra el chat/interacción, el registro de esos mensajes desaparece.

* **Temporalidad:** Permanente (mientras exista la conversación).

* **Exclusividad:** Exclusiva. Un `Mensaje` concreto (esa instancia específica de información en ese momento) pertenece única y exclusivamente a esa `Conversación`.

* **Decisión de Diseño:** **Composición.**
* **Justificación:** Es la relación más fuerte. No elegimos una relación más débil (como Agregación) porque dejaría la puerta abierta a que los mensajes existan huérfanos o se compartan directamente entre conversaciones distintas sin ser "reenviados" (copiados).

### 3. Mensaje <---> Canal y Código

* **Ciclo de vida:** Totalmente independiente. El idioma "Español" o el canal "Digital" existen independientemente de que se envíen mensajes.

* **Temporalidad:** Puntual para el mensaje (usa el canal en el momento de enviarse).

* **Exclusividad:** Compartida. Millones de mensajes usan el mismo `Canal` y `Código`.

* **Decisión de Diseño:** **Asociación simple (o Dependencia).**
* **Justificación:** El Mensaje simplemente "conoce" o "usa" un Código y un Canal para expresarse. No elegimos Agregación porque el Mensaje no "contiene" al Canal lógicamente, solo lo referencia.

### 4. Mensaje <---> Adjunto (Recurso)

* **Ciclo de vida:** Dependiente. Si se borra el mensaje, el adjunto que lo acompañaba pierde su contexto de envío. *(Nota: En algunos sistemas el archivo queda en una galería global, pero en nuestro en mi dominio de la interacción, el acto de adjuntar nace y muere con el mensaje).*

* **Temporalidad:** Permanente respecto al mensaje.

* **Exclusividad:** Exclusiva al mensaje (si reenvías una foto (por ejemplo), creas un nuevo mensaje con un nuevo enlace al adjunto).

* **Decisión de Diseño:** **Composición.**
* **Justificación:** Igual que el mensaje con la conversación, el adjunto es una parte integral de la estructura de *ese* mensaje específico.

### 5. Mensaje <---> Formato

* **Ciclo de vida:** Independiente. Los formatos (Texto, Audio, Video, JSON, Binario) son estándares o definiciones que existen en el sistema independientemente de que se envíen mensajes.

* **Temporalidad:** Permanente respecto a esa instancia del mensaje. Si un mensaje nace como "Texto", esa instancia siempre será texto. (Si se pasa a nota de voz, se crea una *nueva* instancia de mensaje).

* **Exclusividad:** Compartida. Miles de mensajes pueden usar el mismo `Formato`.

* **Decisión de Diseño:** **Asociación simple.**
* **Justificación:** El Mensaje simplemente referencia en qué formato está envuelto su contenido. Utilizamos la relación más débil posible (Asociación) y favorecemos la composición sobre la herencia (es decir, no creamos clases hijas como `MensajeDeTexto` o `MensajeDeAudio`) para no atar rígidamente el sistema y permitir que un intermediario pueda transformar formatos fácilmente en el futuro.

## 3. Código java

A continuación, presento la implementación en Java donde los constructores reflejan las decisiones de ciclo de vida y exclusividad tomadas en la parte 2 (relacionar).

### 1. Entidades Independientes (Agregación / Asociación)
Estas clases tienen un ciclo de vida independiente. Sus constructores son básicos y pueden instanciarse por sí solas.

```java
public class Participante {

    private String nombre;

    public Participante(String nombre) { 

        this.nombre = nombre; 
        
        }

    public String getNombre() {

        return nombre; 
        
        }
}

public class Canal {

    private String tipo; 

    public Canal(String tipo) { 

        this.tipo = tipo; 
    }
}

public class Codigo {

    private String idioma;

    public Codigo(String idioma) { 
        
        this.idioma = idioma; 
        
        }

}

public class Formato {

    private String tipo; 

    public Formato(String tipo) { 

        this.tipo = tipo; 
        
        }

}
```

### 2. Entidades Dependientes (Composición)

Aquí se refleja la decisión de **Composición**. Ni un `Mensaje` ni un `Adjunto` deben crearse "sueltos" en el sistema, por lo que sus constructores son protegidos y su ciclo de vida lo controlan otras clases.

```java
public class Adjunto {

    private String contenido;

    protected Adjunto(String contenido) 
    { 
        this.contenido = contenido; 
    }
}

public class Mensaje {

    private Participante emisor;
    private Canal canal;
    private Codigo codigo;
    private Formato formato;
    private String texto;
    private Adjunto adjunto; 

    protected Mensaje(Participante emisor, Canal canal, Codigo codigo, Formato formato, String texto) {

        this.emisor = emisor;
        this.canal = canal;
        this.codigo = codigo;
        this.formato = formato;
        this.texto = texto;

    }

    public void agregarAdjunto(String contenidoAdjunto) {

        this.adjunto = new Adjunt (contenidoAdjunto);
    }
}
```

### 3. Contenedor Principal: Conversacion

Esta clase centraliza las reglas. Recibe a los participantes desde fuera (Agregación) pero es la única capaz de crear mensajes (Composición).

```java
import java.util.ArrayList;
import java.util.List;

public class Conversacion {

    private List<Participante> participantes; 
    private List<Mensaje> historial;          

    public Conversacion(List<Participante> participantes) {

        this.participantes = new ArrayList<>(participantes);
        this.historial = new ArrayList<>();

    }

    public Mensaje emitirMensaje(Participante emisor, Canal canal, Codigo codigo, Formato formato, String texto) {

        if (!participantes.contains(emisor)) {

            throw new IllegalArgumentException("El participante no está en esta conversación.");
        }

        Mensaje nuevoMensaje = new Mensaje(emisor, canal, codigo, formato, texto);
        this.historial.add(nuevoMensaje);
        return nuevoMensaje;
    }
}
```

### 4. Ejecución del Escenario (Main)

Para demostrar que las relaciones sobreviven a cambios de dominio, el `main` instancia dos situaciones usando las **mismas clases**: un chat asíncrono y un encuentro físico en la calle.

```java
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Participante kelvia = new Participante("Kelvia");
        Participante amigo = new Participante("Amigo");
        Canal digital = new Canal("Internet");
        Canal fisico = new Canal("Aire / Acústico");
        Codigo espanol = new Codigo("Español");
        Formato texto = new Formato("Texto escrito");
        Formato audio = new Formato("Voz hablada");

        Conversacion chatDigital = new Conversacion(Arrays.asList(kelvia, amigo));
        Mensaje msg1 = chatDigital.emitirMensaje(kelvia, digital, espanol, texto, "¡Hola! Mira los apuntes");
        msg1.agregarAdjunto("apuntes.pdf");

        Conversacion charlaCalle = new Conversacion(Arrays.asList(kelvia, amigo));
        Mensaje msg2 = charlaCalle.emitirMensaje(amigo, fisico, espanol, audio, "¡Qué casualidad verte!");
        msg2.agregarAdjunto("Mostrando foto en la pantalla del móvil");

    }
}
```

## 4. Cuestionar

### ¿Las relaciones sobreviven a los cambios de dominio?

**Sí.** Al separar `Canal`, `Código` y `Formato` del concepto de `Mensaje`, logré que la relación estricta de Composición (`Conversación` -> `Mensaje`) se mantenga intacta sin importar si la interacción es asíncrona por internet o en vivo y en directo en la calle. 

### Visión a futuro (Expansión del Dominio)

1. **Paso a Tiempo Real:** El modelo actual ya lo soporta conceptualmente (segundo scenario del Main). Para implementarlo a nivel de sistema, el `Canal` podría incorporar un socket abierto, pero la relación central no se rompe.

2. **Traducción / Transformación:** Al ser entidades separadas, es importante añadir un patrón *Interceptor* que tome un `Mensaje` en código "Morse", y cree una copia en la `Conversacion` con código "Texto", manteniendo la coherencia.
