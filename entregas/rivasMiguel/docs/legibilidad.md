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
|**Nombrado**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Nino.java)|La función [nombreEmpiezaPor](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Nino.java#L25) representa un buen nombramiento ya que podemos intuir cual es su funcionamiento 
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java)|La función [extraerMenoresConPosiciones](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java#L118) no tiene un nombre claro, no se entiende que es lo que significa "con posiciones", podría referirse a los niños que tienen posición, o que extrae la posición|[PR corrección](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/pull/1/commits)
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-004/entregas/rivasMiguel/reto004/Tiempo.java#)|De igual manera la función [compareTo](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-004/entregas/rivasMiguel/reto004/Tiempo.java#L44) no describe qué hace, qué compara o para que serviría. Un nombre mejor sería "compararTiempo"|[PR corrección](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/pull/2)
|**Comentarios**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Monitora.java)|Considero que es una clase cun una legibilidad suficientemente buena para no requerir el uso de comentarios en ningún momento
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/ArbolPedidos.java)|Algunas de las funciones allí presentes tienen un nombre que consideraría correcto, sin embargo aún así no se entiende del todo que papel cumplen, tal como [insertarRec](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/ArbolPedidos.java#L15), donde un comentario podría ayudar a su coprensión|PR corrección
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Nino.java#L25)|Misma historia en [modificarLetras](http://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Nino.java#L66), donde un comentario permitiría identificar rápidamente como se utiliza|[PR corrección](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/pull/1/commits)
|**Formato**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java)|Los métodos [participantesLength](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java#L61) y [leerMensajeDesdeConsola](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java#L71) se hayan contiguos a la función que los utiliza y además se declaran en el orden que se utilizan
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/Simulacion.java)|En la parte final del código se identifican diversos [getters](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/Simulacion.java#L56-L60) los cuales no cuentan con el espacio estándar entre ellos, además que en el resto de código se han colocado en varias líneas mientras que en este caso se presentan en una sola. [Aquí](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/Pedido.java#L18-L23) otro ejemplo del mismo error|PR corrección.
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-003/entregas/rivasMiguel/reto003/Calculadora.java)|En este código, a pesar de ser sumamente simple, hay una clara falta de organización dada a que el código sefué escribiendo sobre la marcha de lo que se necesitaba si tener en cuenta el orden o "agrupamiento" de métodos y atributos similares|PR corrección
|**Estándares**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/ArbolPedidos.java)|En este código hay varios ejemplos de nomenclaturas y prácticas que cumplen con los estándares de desarrollo, como por ejemplo utilizar funciones privadas con la lógica interna ([imprimirRec](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/ArbolPedidos.java#L80)), o los llamados getters y setters ([getCantidadPedidos](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/ArbolPedidos.java#L66))
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/MiRandom.java)|El nombre de MiRandom no es un nombre alineado con los estándares del desarrollo|[PR corrección](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/pull/2)
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java)|El nombre de la función [leerMensajeDesdeConsola](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java#L71) es demasiado específico y rígido, la funcionalidad de dicho método no amerita una declaración tan detallada según los estándares utilizados|PR corrección
|**Consistencia**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-003/entregas/rivasMiguel/reto003/Calculadora.java)|Aquí se puede observar claraente como todas las funciones y variables siguen la misma nomenclatura y la misma estructura de utilización|
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-004/entregas/rivasMiguel/reto004/Tiempo.java)|Se evidencia claramente en funciones como [equals](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-004/entregas/rivasMiguel/reto004/Tiempo.java#L23) La disonancia en cuanto al resto de funciones, dado que la gran mayoria se encuentran en español y con un nombre que describe mejor su funcionalidad|[PR corrección](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/pull/2)
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java)|De igual manera al anterior, se ve en la función [participantsLength](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java#L61) que no sigue el formato del resto de funciones de nombrarse en español, que no está mal de por sí sin embargo teniendo en cuenta el resto de funciones ese nombre no concuerda|PR corrección
|**Código muerto**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/buscaminas/blob/feature/minas-adyacentes/src/rivasMiguel/Tablero.java)|No se ha dejado ningún fragmento de código muerto
||Ejemplo -|En ningún codigo que haya realizado he identificado algún fragmento de código muertos|PR corrección
|**DRY**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-003/entregas/rivasMiguel/reto003/Calculadora.java)|En el código de calculadora, la función [extraerOperandos](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-003/entregas/rivasMiguel/reto003/Calculadora.java#L76) me parece un excelente ejemplo, ya que reutiliza una función declarada anteriormente cuyas características se pueden aprovechar para este caso, a además se reutiliza en varias partes del código. 
||[Ejemplo -](http://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java)|Aquí se puede identificar una clara repetición en lo que respecta a la lógica de redimensionar arrays para añadir tantos elementos como sea posible, en diversos lugares del código, tales como en [addPersonaACola](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java#L59-L63), [ponerEnCuidado](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java#L96-L100), y [recibirNino](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java#L190-L194) |[PR corrección](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/pull/1/commits)
|**YAGNI**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Pizarra.java)|En este caso, la función [limpiar](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Pizarra.java#L10-L13) roza lo considerado YAGNI, dado que en cuestión de utilidad hace lo mismo que "escribir("")", sin embago semánticamente sí que nos ayuda a identificar mucho mejor lo que queremos realizar, por lo que lo considero adecuado de existir, eso sí, dentro de limpiar podría llamarse a la función "escribir" en blanco para mejor reutilización (DRY).
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Nino.java)|Se puede identificar en el código citado que el método [limpiarPizarrin](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Nino.java#L22-L24) se puede considerar como programación defensiva, cosa que no nos hace falta dado que es un ejercicio simple y se nos ha indicado que este tipo de métodos no son necesarios aún, otro argumento es que, al punto al que estamos trabajando, a todo usuario (niño) se le [asigna un pizarrín](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Ludoteca.java#L47-L49), por tanto este método es innecesario|PR corrección