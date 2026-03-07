# Legibilidad

<big>***Una línea de código se escribe una vez y se lee cientos de veces***</big> — Tom Love

<div align=center>

|Autoexplicativo|Consistente|Mínimo|
|-|-|-|
|Formato|Estándares|Código Muerto|
|Comentarios|Consistencia|YAGNI|
|Nombrado|Alertas|DRY|

</div>

## Nombrado

|Principio|Descripción breve|
|-|-|
|Elige nombres descriptivos|Utiliza nombres que expresen claramente el propósito o función del elemento, evitando abreviaciones confusas o nombres genéricos.|
|Elige nombres al nivel de abstracción apropiado|El nombre debe corresponder al nivel conceptual en el que opera el elemento, ni muy general ni muy específico.|
|Usa nomenclatura estándar donde sea posible|Sigue las convenciones establecidas en el lenguaje o framework que utilizas para facilitar la comprensión del código.|
|Nombres no ambiguos|Evita nombres que puedan interpretarse de múltiples maneras o confundirse con otros elementos del programa.|
|Usa nombres largos para ámbitos largos|Cuanto mayor sea el alcance de una variable o función, más descriptivo y específico debe ser su nombre.|
|Evita codificaciones|No uses prefijos o sufijos técnicos innecesarios que compliquen la lectura del código.|
|Los nombres deberían describir los efectos laterales|Si una función produce efectos además de su propósito principal, el nombre debe sugerirlo.|
|Los nombres deben revelar su intención|Deberían revelar por qué existe lo que existe, qué hace y cómo se utiliza para facilitar la legibilidad para el desarrollo y el mantenimiento correctivo, perfectivo y adaptativo.|
|La elección de buenos nombres lleva tiempo, pero ahorra más de lo que toma|Así que ten cuidado con los nombres y cámbialos cuando encuentres otros mejores. Hay personas que tienen miedo de cambiar el nombre de las cosas por temor a que otros desarrolladores objeten.|
|Los nombres de archivo|Un adecuado conjunto de nombres de archivo no solo revela la intención de cada archivo individual, sino la estructura de estados y transiciones del sistema completo.|
|Nombres pronunciables que permitan mantener una conversación|Utiliza nombres que puedan pronunciarse fácilmente, facilitando las discusiones sobre el código entre desarrolladores.|
|Mayúsculas en los caracteres inicio de palabra (CamelCase)|Sigue la convención de usar mayúsculas al inicio de cada palabra en identificadores compuestos para mejorar la legibilidad.|
|Nombres del dominio del problema y de la solución|Emplea términos tanto del ámbito del problema (negocio) como de la solución técnica, según corresponda al contexto.|
|Elige una palabra para un concepto abstracto y aferrarte a él|Mantén consistencia usando el mismo término para representar un concepto específico a lo largo de todo el código.|
|Nombres de paquetes deben ser sustantivos y comenzar en minúsculas|Los paquetes se nombran con sustantivos en minúsculas, generalmente siguiendo estructura de dominio invertido.|
|Nombres de clases deben ser sustantivos y comenzar en mayúsculas|Las clases se nombran con sustantivos que inician con mayúscula, representando entidades u objetos.|
|Nombres de métodos deben ser verbos o una frase con verbo y comenzar en minúsculas|Los métodos deben expresar acciones, usando verbos en infinitivo que comienzan con minúscula.|
|Nombres de métodos de acceso deben anteponer get(is para lógicos) y /set o put|Usa prefijos estándar para métodos accesores: "get" para obtener valores, "is" para booleanos, "set" o "put" para asignar valores.|
|Si un nombre requiere un comentario, el nombre no revela su intención|Un identificador bien elegido no debería necesitar explicación adicional; si requiere comentario, debe ser replanteado.|
|Nombres de una letra y muy en particular, 'O' y 'l' que se confunden con 0 y 1|Evita identificadores de una sola letra, especialmente 'O' y 'l', que pueden confundirse visualmente con los dígitos 0 y 1.|

> **Excepcionalmente** en variables locales auxiliares de métodos. Un contador de bucle puede ser nombrado i o j o k (¡pero nunca l!) si su alcance es muy pequeño y no hay otros nombres que pueden entrar en conflicto con él. Esto se debe a que esos nombres de una sola letra para contadores de bucles son tradicionales.

Es un estándar: allá donde fueres, haz lo que vieres.

### Nombrado a evitar

- Nombres acrónimos, a no ser que sean internacionales.
- Nombres con códigos de tipo o información del ámbito (codificaciones y similares).
- Nombre con palabras vacías de significado o redundantes.
- Nombres en serie.
- Nombres desinformativos que no son lo que dicen.
- Nombres indistinguibles.
- Nombres polisémicos en un mismo contexto.

## Comentarios

- Nada puede ser tan útil como un comentario bien colocado.
- Nada puede ser tan perjudicial como un enrevesado comentario desactualizado que propaga mentiras y desinformación
- Nada puede estorbar más encima de un módulo que frívolos comentarios dogmáticos.
- Es simplemente una tontería tener una regla que dice que cada variable debe tener un comentario o que cada función debe tener un javadoc a a no ser que sea publicado como biblioteca
- No comentes código malo, re-escríbelo — Kernighan & Plaugher

<div align=center>

|👍|😐|💩|
|-|-|-|
|Comentario aclaratorio|Comentario legal|Comentarios redundantes|
|Otro|Comentario esporádico y "oportuno"|Comentarios de sección|
|||Comentarios no mantenidos|
|||Comentarios excesivos|
|||Comentarios como documentación|
|||Comentarios confusos|
|||Comentarios inexactos|
|||Comentarios de atribución|
|||Código comentado / Otro|

</div>

## Formato

El formateo de código trata sobre la comunicación y la comunicación es de primer orden para los desarrolladores profesionales

Un equipo de desarrolladores debe ponerse de acuerdo sobre un único estilo de formato y luego todos los miembros de ese equipo debe usar ese estilo.

- Un código es una jerarquía.
  - Hay información que pertenece al archivo como un todo, a las clases individuales dentro del archivo, a los métodos dentro de las clases, a los bloques dentro de los métodos, y de forma recursiva a los bloques dentro de los bloques.
  - Cada nivel de esta jerarquía es un ámbito en el que los nombres pueden ser declarados y en la que las declaraciones y sentencias ejecutables se interpretan. Para hacer esta jerarquía visible, hay que sangrar la líneas de código fuente de forma proporcional a su posición en la jerarquía.
- Una línea entre grupos lógicos (atributos y cada método).
- Los atributos deben declararse al principio de la clase
- Las funciones dependientes en las que una llama a otra, deberían estar verticalmente cerca: primero la llamante y luego la llamada
- Grupos de funciones que realizan operaciones parecidas, deberían permanecer juntas
- Las variables deberían declararse tan cerca comos sea posible de su utilización: hay que minimizar el intervalo de vida de una variable
- Los programadores prefieren líneas cortas (~40, máximo80/120)

## Estándares

- Sigue las convenciones estándar basadas en normas comunes de la industria.
- Cada miembro del equipo debe ser lo suficientemente maduro como para darse cuenta de que no importa un ápice donde pones tus llaves, siempre y cuando todos estén de acuerdo en dónde ponerlos.
- Se deben especificar cosas como:
  - Dónde declarar variables de instancia;
  - Cómo nombrar las clases, métodos y variables
  - Dónde poner paréntesis, llaves; …​
- No se necesita un documento para describir estos convenios porque su código proporciona los ejemplos.

## Consistencia

- Si haces algo de cierta manera, haz todas las cosas similares de la misma forma.
- Una simple consistencia como esta, cuando se aplica de forma fiable, se puede conseguir código más fácil de leer y modificar.
- Ten cuidado con los convenios que eliges.
- Una vez elegidos, síguelos.

## Código muerto

- El código muerto se anquilosa y se endurece, rápidamente se hace imposible documentar el código o entender suficientemente su arquitectura para hacer mejoras.
- Si no se elimina el código muerto, puede continuar proliferando según se reutiliza código en otras áreas
- Puede haber crecimiento exponencial según los sucesivos desarrolladores, demasiado apremiados o intimidados por analizar los códigos originales, seguirán produciendo nuevos flujos secundarios en su intento de evitar los originales.
- Fragmentos de código injustificables, inexplicables u obsoletos en el sistema: interfaces, clases, funciones o segmentos de código complejo con aspecto importante pero que no están relacionados con el sistema
- Bloques de código comentado sin explicación o documentación
- Bloques de código con comentarios
- //TODO: "proceso de cambio", "para ser reemplazado", …

## Don't repeat yourself - DRY

- Evitar re-analizar, re-diseñar, re-codificar, re-probar y re-documentar soluciones que complican enormemente el mantenimiento correctivo, perfectivo y adaptativo
- Cada pieza de conocimiento debe tener una única, inequívoca y autoritativa representación en un sistema.
- El objetivo es reducir la repetición de la información de todo tipo, lo que hace que los sistemas de software sean más fácil de mantener
- La consecuencia es que una modificación de cualquier elemento individual de un sistema no requiere un cambio en otros elementos lógicamente no relacionados.
- Aplicable a todo: programación, esquemas de bases de datos, planes de prueba, el sistema de construcción, análisis y diseños, incluso la documentación.

## YAGNI: You aren't going to need it

- Las características innecesarias son inconveniente por el tiempo gastado que se toma para la adición, la prueba o la mejora de funcionalidad innecesaria.
- Conduce a la hinchazón de código y el software se hace más grande y más complicado.
- Añadir nuevas características puede sugerir otras nuevas características. Si estas nuevas funciones se implementan así, esto podría resultar en un efecto bola de nieve.
- Siempre se debe implementar las cosas cuando realmente se necesite, no cuando se prevén que se necesiten. Por tanto, no se debe agregar funcionalidad hasta que se considere estrictamente necesario.
- Hasta que la característica es realmente necesaria, es difícil definir completamente lo que debe hacer y probarla. Si la nueva característica no está bien definida y probada, puede que no funcione correctamente, incluso si eventualmente se necesitara.
- A menos que existan especificaciones y algún tipo de control de revisión, la función no puede ser conocida por los programadores que podrían hacer uso de ella.
- Cualquier nueva característica impone restricciones en lo que se puede hacer en el futuro, por lo que una característica innecesaria puede interrumpir características necesarias que se agreguen en el futuro.

### Justificaciones

|Categoría||Justificación||
|-|-|-|-|
|**Nombrado**|Ejemplo +|Términos como `colaReproduccion`, `historial`, `cancionActual;`, `repetir`, `aleatorio`, `cancionesDisponibles`, `cancionEnHistorial` son correctos del dominio de un reproductor de música, facilitando su lectura. |[Enlace a código](https://github.com/martinlopez7/24-25-EDA1/blob/f15887def0eb106a1c84aa8a43834b3971a49823/entregas/lopezMartin/reto_004/Reproductor.java#L6-L12)|
||Ejemplo -|El nombre de la variable `pila` es un nombre técnico pero no representa correctamente el dominio. Cambiándolo a `pilaOperadores` al leerlo vas a entender mejor el contenido, el comportamiento y el contexto de esta variable.|[Enlace PR Corrección](https://github.com/martinlopez7/24-25-EDA2/pull/1)
||Ejemplo -|La variable `tamaño` usa una tilde. No es estándar Java y rompe la nomenclatura estándar|[Enlace PR Corrección](https://github.com/martinlopez7/24-25-EDA2/pull/2)
|**Comentarios**|No tengo comentarios en mi codigo debido a la insistencia del profesor desde el inicio, por lo que no puedo proporcionar ejemplos de buen o mal uso de ellos. |
|**Formato**|Ejemplo +|La variable `random` se declara justo antes de su utilización para minimizar su intervalo de vida |[Enlace a código](https://github.com/martinlopez7/24-25-EDA1/blob/f15887def0eb106a1c84aa8a43834b3971a49823/entregas/lopezMartin/reto_004/Reproductor.java#L40-L41)|
||Ejemplo -|El código está mal indentado. Además, usar `while(true)` es mala práctica porque no comunica la intención del bucle. Usar una variable booleana en la condición es más claro y expresa mejor su propósito.|[Enlace PR Corrección](https://github.com/martinlopez7/24-25-EDA1/pull/5)
||Ejemplo -|Las variables `altura` y `anchura` solo se utilizan dentro de la función `crearImagenEjemplo()` por lo que no tiene sentido declararlas fuera de la función. Es decir, estaban en niveles distintos de jerarquía sin ningún motivo justificado. |[Enlace PR Corrección](https://github.com/martinlopez7/24-25-EDA2/pull/6)
|**Estándares**|Ejemplo +|Sigue las convenciones comunes de Java: constantes en mayúsculas, métodos y variables en camelCase, las variables de clase se declaran al inicio de la clase antes de los métodos, el código usa llaves {} de forma consistente y tiene una indentación constante y clara.| [Enlace a código](https://github.com/martinlopez7/24-25-EDA2/blob/b154d5908574aa5b1ebdb452200bf1fe88d659b1/entregas/lopezMartin/reto004/RellenoInundacion.java)
||Ejemplo -|En vez de tener dos métodos para marcar o desmarcar una cancion como favorita. El estandar de la comunidad aplicado a este caso es simplemente tener un metodo y pasar si es favorito o no por parámetro a la función.|[Enlace PR Corrección](https://github.com/martinlopez7/24-25-EDA1/pull/4)
||Ejemplo -||PR corrección
|**Consistencia**|Ejemplo +|Todo el proyecto sigue la misma consistencia lógica|[Enlace a código](https://github.com/martinlopez7/24-25-EDA1/tree/f15887def0eb106a1c84aa8a43834b3971a49823/entregas/lopezMartin/reto_004)
||Ejemplo -|En `Cola` el campo `tamaño` se decrementa tanto en `dequeue()` como en `peek()`. La segunda es una inconsistencia lógica: peek no debería tener efectos en la variable ya que, como su propio nombre indica, es simplemente asomarse a la cima de la cola.|[Enlace PR Corrección](https://github.com/martinlopez7/24-25-EDA2/pull/3)
||Ejemplo -|El comportamiento actual del método `isEmpty()` de la clase `List` es el contrario del esperado por lo que rompe la consistencia.|[Enlace PR Corrección](https://github.com/martinlopez7/24-25-EDA1/pull/3)
|**Código muerto**|Ejemplo +|Todo el código es funcional. No hay bloques de código que no usen o que sea injustificable.|[Enlace a código](https://github.com/martinlopez7/24-25-EDA2/tree/4e9e88fe5f19146427f389c9fb5904d9274830a5/entregas/lopezMartin/reto006)
||Ejemplo -| Las variables `memoriaKB` y `tasaHZ` recuerdo que estaban en el enunciado del ejercicio, y como no sabía si se iba a utilizar para algo lo añadí por si caso, pero evidentemente es un fragmentos de código injustificable que no está relacionado con el sistema|[Enlace PR Corrección](https://github.com/martinlopez7/24-25-EDA2/pull/4)
|**DRY**|Ejemplo +|Se usa la interfaz `Comparador` para evitar la repeticion en la comparación de tipos. (`ComparadorNumerico` y `ComparadorTexto`)| [Enlace a código](https://github.com/martinlopez7/24-25-EDA2/blob/4e9e88fe5f19146427f389c9fb5904d9274830a5/entregas/lopezMartin/reto006/Comparador.java)
||Ejemplo -|Hay cierta repetición entre `dequeue()` y `peek()`: ambos crean un array de dos `Frame`, comprueban `tieneDosFrames()` y acceden dos veces a primero. Se ha creado un método auxiliar que devuelve los dos primeros elementos sin modificar el estado.|[Enlace PR Corrección](https://github.com/martinlopez7/24-25-EDA2/pull/5)
|**YAGNI**|Ejemplo +|Las clases que relacionadas a las estructuras de datos utilizadas (`Cola`,`ListaCanciones`, `ListaPlaylist`, `NodoCancion`, `NodoPlaylist`) son completamente funcionales y no tienen características innecesarias. Todo lo que contienen es utilizado.|[Enlace a código](https://github.com/martinlopez7/24-25-EDA1/tree/main/entregas/lopezMartin/reto_004)|
||Ejemplo -|El método `obtenerUltimo()` de la clase `List` no se utiliza y añade complejidad innecesaria al código |[Enlace PR Corrección](https://github.com/martinlopez7/24-25-EDA1/pull/2)