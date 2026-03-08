# Reto 002 - Legibilidad

## ¿Por qué?

Código que no se relee críticamente acumula deuda de legibilidad invisible. El desarrollador que lo escribió es el menos preparado para detectarla, precisamente porque entiende su propia intención sin necesidad de leerla.

## ¿Qué?

|Releer código propio con ojos de auditor y más conocimiento|Identificar aciertos y errores relacionados con la legibilidad|Corregir con fundamento|
|:-:|:-:|:-:|

El objetivo no es encontrar ejemplos. Es **confrontar el propio código** contra principios de legibilidad y ser capaz de argumentar, con referencia teórica y consecuencia práctica, por qué algo funciona o falla como comunicación.

No se evalúa la cantidad de ejemplos encontrados (aunque son imprescindibles): se evalúa la calidad de la justificación: un argumento que conecte principio, código y efecto en mantenibilidad vale más que cuatro ejemplos con justificaciones genéricas.

## ¿Para qué?

Ver cómo en la distancia entre "sé lo que hace" y "se lee lo que hace" es donde vive la deuda técnica. Releer con ojos de auditor — no de autor — es la competencia que separa código que funciona de código que sobrevive.

## ¿Cómo?

A partir del documento de [legibilidad](https://github.com/mmasias/25-26-IDSW2/blob/main/evaluaciones/retos/reto002/legibilidad.md), se pide:

- Por cada sección
  - Un ejemplo de aplicación correcta.
  - Dos ejemplos de aplicación incorrecta (uno en las secciones Código muerto, DRY y YAGNI).
  - Un argumento por cada ejemplo, que justifique por qué dicha clasificación. Cada argumento debe referenciar explícitamente un principio del documento de legibilidad y comentar el efecto concreto en mantenibilidad.
  - La corrección -sobre su propio repositorio- de los ejemplos incorrectos.
- Añada una sección final breve — 3-5 líneas — donde indique en cuál de las 8 categorías le resultó más difícil de encontrar en su propio código y por qué.
- Los ejemplos deben ser propios, públicos y existentes en sus propios repo.
- La entrega debe realizarse en un archivo creado a partir del documento [legibilidad.md](https://github.com/mmasias/25-26-IDSW2/blob/main/evaluaciones/retos/reto002/legibilidad.md), colocado en la carpeta de documentos de su carpeta de entregas, incluyendo completa la tabla que está indicada debajo.
- No se deben entregar más archivos: solo el README.md en la raíz de su carpeta personal y el archivo legibilidad.md en la carpeta docs.
- Complete la tabla con enlaces a las líneas exactas del archivo en el repositorio en el que identificó el escenario positivo o negativo.
- Agregue (en la columna de justificación) el argumento que justifique dicha elección. Se valorará ampliamente una justificación que combine teoría y práctica.
- Asimismo, para los casos de aplicación incorrecta, la corrección debe realizarse en una rama de su repo original, y debe concluir con un pull request a usted mismo, que incluya la justificación de la corrección que ha propuesto.

### Justificaciones

|Categoría||Justificación||
|-|-|-|-|
|**Nombrado**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Nino.java)|La función [nombreEmpiezaPor](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Nino.java#L25) representa un buen nombramiento ya que podemos intuir cual es su funcionamiento 
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java)|La función [extraerMenoresConPosiciones](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java#L118) no tiene un nombre claro, no se entiende que es lo que significa "con posiciones", podría referirse a los niños que tienen posición, o que extrae la posición|PR corrección
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-004/entregas/rivasMiguel/reto004/Tiempo.java#)|De igual manera la función [compareTo](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-004/entregas/rivasMiguel/reto004/Tiempo.java#L44) no describe qué hace, qué compara o para que serviría. Un nombre mejor sería "compararTiempo"|PR corrección
|**Comentarios**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Monitora.java)|Considero que es una clase cun una legibilidad suficientemente buena para no requerir el uso de comentarios en ningún momento
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/ArbolPedidos.java)|Algunas de las funciones allí presentes tienen un nombre que consideraría correcto, sin embargo aún así no se entiende del todo que papel cumplen, tal como [insertarRec](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/ArbolPedidos.java#L15), donde un comentario podría ayudar a su coprensión|PR corrección
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Nino.java#L25)|Misma historia en [modificarLetras](http://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Nino.java#L66), donde un comentario permitiría identificar rápidamente como se utiliza|PR corrección
|**Formato**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java)|Los métodos [participantesLength](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java#L61) y [leerMensajeDesdeConsola](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java#L71) se hayan contiguos a la función que los utiliza y además se declaran en el orden que se utilizan
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/Simulacion.java)|En la parte final del código se identifican diversos [getters](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/Simulacion.java#L56-L60) los cuales no cuentan con el espacio estándar entre ellos, además que en el resto de código se han colocado en varias líneas mientras que en este caso se presentan en una sola. [Aquí](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/Pedido.java#L18-L23) otro ejemplo del mismo error|PR corrección.
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-003/entregas/rivasMiguel/reto003/Calculadora.java)|En este código, a pesar de ser sumamente simple, hay una clara falta de organización dada a que el código sefué escribiendo sobre la marcha de lo que se necesitaba si tener en cuenta el orden o "agrupamiento" de métodos y atributos similares|PR corrección
|**Estándares**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/ArbolPedidos.java)|En este código hay varios ejemplos de nomenclaturas y prácticas que cumplen con los estándares de desarrollo, como por ejemplo utilizar funciones privadas con la lógica interna ([imprimirRec](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/ArbolPedidos.java#L80)), o los llamados getters y setters ([getCantidadPedidos](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/ArbolPedidos.java#L66))
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-005/entregas/rivasMiguel/src/MiRandom.java)|El nombre de MiRandom no es un nombre alineado con los estándares del desarrollo|PR corrección
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java)|El nombre de la función [leerMensajeDesdeConsola](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java#L71) es demasiado específico y rígido, la funcionalidad de dicho método no amerita una declaración tan detallada según los estándares utilizados|PR corrección
|**Consistencia**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-003/entregas/rivasMiguel/reto003/Calculadora.java)|Aquí se puede observar claraente como todas las funciones y variables siguen la misma nomenclatura y la misma estructura de utilización|
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-004/entregas/rivasMiguel/reto004/Tiempo.java)|Se evidencia claramente en funciones como [equals](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-004/entregas/rivasMiguel/reto004/Tiempo.java#L23) La disonancia en cuanto al resto de funciones, dado que la gran mayoria se encuentran en español y con un nombre que describe mejor su funcionalidad|PR corrección
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java)|De igual manera al anterior, se ve en la función [participantsLength](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java#L61) que no sigue el formato del resto de funciones de nombrarse en español, que no está mal de por sí sin embargo teniendo en cuenta el resto de funciones ese nombre no concuerda|PR corrección
|**Código muerto**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/buscaminas/blob/feature/minas-adyacentes/src/rivasMiguel/Tablero.java)|No se ha dejado ningún fragmento de código muerto
||Ejemplo -|En ningún codigo que haya realizado he identificado algún fragmento de código muertos|PR corrección
|**DRY**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-003/entregas/rivasMiguel/reto003/Calculadora.java)|En el código de calculadora, la función [extraerOperandos](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-003/entregas/rivasMiguel/reto003/Calculadora.java#L76) me parece un excelente ejemplo, ya que reutiliza una función declarada anteriormente cuyas características se pueden aprovechar para este caso, a además se reutiliza en varias partes del código. 
||[Ejemplo -](http://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java)|Aquí se puede identificar una clara repetición en lo que respecta a la lógica de redimensionar arrays para añadir tantos elementos como sea posible, en diversos lugares del código, tales como en [addPersonaACola](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java#L59-L63), [ponerEnCuidado](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java#L96-L100), y [recibirNino](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-002/entregas/rivasMiguel/src/Monitora.java#L190-L194) |PR corrección
|**YAGNI**|Ejemplo +|
||Ejemplo -||PR corrección