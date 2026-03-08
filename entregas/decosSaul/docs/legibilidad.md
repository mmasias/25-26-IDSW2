# Legibilidad

<big>**_Una línea de código se escribe una vez y se lee cientos de veces_**</big> — Tom Love

<div align=center>

| Autoexplicativo | Consistente  | Mínimo        |
| --------------- | ------------ | ------------- |
| Formato         | Estándares   | Código Muerto |
| Comentarios     | Consistencia | YAGNI         |
| Nombrado        | Alertas      | DRY           |

</div>

## Nombrado

| Principio                                                                          | Descripción breve                                                                                                                                                                               |
| ---------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Elige nombres descriptivos                                                         | Utiliza nombres que expresen claramente el propósito o función del elemento, evitando abreviaciones confusas o nombres genéricos.                                                               |
| Elige nombres al nivel de abstracción apropiado                                    | El nombre debe corresponder al nivel conceptual en el que opera el elemento, ni muy general ni muy específico.                                                                                  |
| Usa nomenclatura estándar donde sea posible                                        | Sigue las convenciones establecidas en el lenguaje o framework que utilizas para facilitar la comprensión del código.                                                                           |
| Nombres no ambiguos                                                                | Evita nombres que puedan interpretarse de múltiples maneras o confundirse con otros elementos del programa.                                                                                     |
| Usa nombres largos para ámbitos largos                                             | Cuanto mayor sea el alcance de una variable o función, más descriptivo y específico debe ser su nombre.                                                                                         |
| Evita codificaciones                                                               | No uses prefijos o sufijos técnicos innecesarios que compliquen la lectura del código.                                                                                                          |
| Los nombres deberían describir los efectos laterales                               | Si una función produce efectos además de su propósito principal, el nombre debe sugerirlo.                                                                                                      |
| Los nombres deben revelar su intención                                             | Deberían revelar por qué existe lo que existe, qué hace y cómo se utiliza para facilitar la legibilidad para el desarrollo y el mantenimiento correctivo, perfectivo y adaptativo.              |
| La elección de buenos nombres lleva tiempo, pero ahorra más de lo que toma         | Así que ten cuidado con los nombres y cámbialos cuando encuentres otros mejores. Hay personas que tienen miedo de cambiar el nombre de las cosas por temor a que otros desarrolladores objeten. |
| Los nombres de archivo                                                             | Un adecuado conjunto de nombres de archivo no solo revela la intención de cada archivo individual, sino la estructura de estados y transiciones del sistema completo.                           |
| Nombres pronunciables que permitan mantener una conversación                       | Utiliza nombres que puedan pronunciarse fácilmente, facilitando las discusiones sobre el código entre desarrolladores.                                                                          |
| Mayúsculas en los caracteres inicio de palabra (CamelCase)                         | Sigue la convención de usar mayúsculas al inicio de cada palabra en identificadores compuestos para mejorar la legibilidad.                                                                     |
| Nombres del dominio del problema y de la solución                                  | Emplea términos tanto del ámbito del problema (negocio) como de la solución técnica, según corresponda al contexto.                                                                             |
| Elige una palabra para un concepto abstracto y aferrarte a él                      | Mantén consistencia usando el mismo término para representar un concepto específico a lo largo de todo el código.                                                                               |
| Nombres de paquetes deben ser sustantivos y comenzar en minúsculas                 | Los paquetes se nombran con sustantivos en minúsculas, generalmente siguiendo estructura de dominio invertido.                                                                                  |
| Nombres de clases deben ser sustantivos y comenzar en mayúsculas                   | Las clases se nombran con sustantivos que inician con mayúscula, representando entidades u objetos.                                                                                             |
| Nombres de métodos deben ser verbos o una frase con verbo y comenzar en minúsculas | Los métodos deben expresar acciones, usando verbos en infinitivo que comienzan con minúscula.                                                                                                   |
| Nombres de métodos de acceso deben anteponer get(is para lógicos) y /set o put     | Usa prefijos estándar para métodos accesores: "get" para obtener valores, "is" para booleanos, "set" o "put" para asignar valores.                                                              |
| Si un nombre requiere un comentario, el nombre no revela su intención              | Un identificador bien elegido no debería necesitar explicación adicional; si requiere comentario, debe ser replanteado.                                                                         |
| Nombres de una letra y muy en particular, 'O' y 'l' que se confunden con 0 y 1     | Evita identificadores de una sola letra, especialmente 'O' y 'l', que pueden confundirse visualmente con los dígitos 0 y 1.                                                                     |

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

| 👍                     | 😐                                 | 💩                             |
| ---------------------- | ---------------------------------- | ------------------------------ |
| Comentario aclaratorio | Comentario legal                   | Comentarios redundantes        |
| Otro                   | Comentario esporádico y "oportuno" | Comentarios de sección         |
|                        |                                    | Comentarios no mantenidos      |
|                        |                                    | Comentarios excesivos          |
|                        |                                    | Comentarios como documentación |
|                        |                                    | Comentarios confusos           |
|                        |                                    | Comentarios inexactos          |
|                        |                                    | Comentarios de atribución      |
|                        |                                    | Código comentado / Otro        |

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

| Categoría         |                                                                                                                                                        | Justificación                                            |                                                              |
| ----------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------   | ------------------------------------------------------------ |
| **Nombrado**      |                                                                                                                                                        |                                                          |                                                              |
|                   | [Código](https://github.com/SdeCos/23-24-prg1/blob/37601f4a93f14f26633ae641f1122bba82dccaf3/retos/Aspiradora.java#L27)                                 | Nombre de metodo que no indica lo que hace               | [PR corrección](https://github.com/SdeCos/23-24-prg1/pull/3) |
|                   | [Código](https://github.com/SdeCos/23-24-prg1/blob/12131b1444944b820e434c8a6043ef15e294dc75/retos/Caracol.java#L94)                                    | Nombre de metodo sustantivo en vez de verbo              | [PR corrección](https://github.com/SdeCos/23-24-prg1/pull/3) |
| **Comentarios**   | [Código](https://github.com/SdeCos/23-24-prg1/blob/main/retos/Laberinto.java)                                                                          | Codigo sin comentarios                                   |                                                              |
|                   | [Código](https://github.com/SdeCos/24-25-EDA1/blob/caf715c0626a2ea78736b0cf25939e9e21b020ad/entregas/deCosSaul/reto-006/FileManager.java#L19)          | Comentario redundante                                    | [PR corrección](https://github.com/SdeCos/24-25-EDA1/pull/1) |
|                   | [Código](https://github.com/SdeCos/23-24-prg1/blob/fec7c6023ea963016aefd1a557ae946e04329af1/retos/Plantilla%20personalizada/MetodosEstaticos.java#L10) | Comentario redundante                                    | [PR corrección](https://github.com/SdeCos/23-24-prg1/pull/1) |
| **Formato**       |                                                                                                                                                        |                                                          |                                                              |
|                   | [Código](https://github.com/SdeCos/23-24-prg1/blob/12131b1444944b820e434c8a6043ef15e294dc75/retos/ViajeDeMarco.java#L87)                               | Linea demasiado larga                                    | [PR corrección](https://github.com/SdeCos/23-24-prg1/pull/4) |
|                   | [Código](https://github.com/SdeCos/23-24-prg1/blob/5717b700c340c97824067378a4f5fdc61def0dd2/retos/ViajeDeMarco.java#L61)                               | Indentacion incorrecta                                   | [PR corrección](https://github.com/SdeCos/23-24-prg1/pull/7) |
| **Estándares**    |                                                                                                                                                        |                                                          |                                                              |
|                   | [Código](https://github.com/SdeCos/23-24-prg1/blob/9964c7fef8db9b02efe708d68079c699e90cab14/retos/Caracol.java#L91)                                    | Comparaciones booleanas explicitas                       | [PR corrección](https://github.com/SdeCos/23-24-prg1/pull/5) |
|                   | [Código](https://github.com/SdeCos/23-24-prg1/blob/9017db8a4b6882fe9c6e25baace03d3851ff45cf/retos/ViajeDeMarco.java#L104)                              | Comparaciones booleanas explicitas                       | [PR corrección](https://github.com/SdeCos/23-24-prg1/pull/5) |
| **Consistencia**  |                                                                                                                                                        |                                                          |                                                              |
|                   | [Código](https://github.com/SdeCos/24-25-EDA1/blob/main/entregas/deCosSaul/reto-006/ClientApp.java#L8)                                                 | Variables en español en código con variables en inglés   | [PR corrección](https://github.com/SdeCos/24-25-EDA1/pull/2) |
|                   | [Código](https://github.com/SdeCos/23-24-prg1/blob/bd562229063a1e72f9fb56b462588e0d8462ad11/retos/Aspiradora.java#L54)                                 | Lineas de codigo que hacen lo mismo con diferente formato| [PR corrección](https://github.com/SdeCos/23-24-prg1/pull/8) |
| **Código muerto** |                                                                                                                                                        |                                                          |                                                              |
|                   | [Código](https://github.com/SdeCos/24-25-EDA2/blob/reto-004/entregas/deCosSaul/reto004/FloodFill.java#L30)                                             | Otros metodos de rellenado no usados en el codigo        | [PR corrección](https://github.com/SdeCos/24-25-EDA2/pull/1) |
| **DRY**           |                                                                                                                                                        |                                                          |                                                              |
|                   | [Código](https://github.com/SdeCos/23-24-prg1/blob/11aeef4f76f6b95724995f1c9748f4aaace556e8/retos/JuegoHerradura.java#L31)                             | Codigo repetido                                          | [PR corrección](https://github.com/SdeCos/23-24-prg1/pull/2) |
| **YAGNI**         |                                                                                                                                                        |                                                          |                                                              |
|                   | [Código](https://github.com/SdeCos/23-24-prg1/blob/9964c7fef8db9b02efe708d68079c699e90cab14/retos/Aspiradora.java#L11)                                 | Codigo no utilizado                                      | [PR corrección](https://github.com/SdeCos/23-24-prg1/pull/6) |
