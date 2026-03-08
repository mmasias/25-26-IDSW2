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
|**Nombrado**|Ejemplo +|
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Comentarios**|Ejemplo +|
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Formato**|Ejemplo +|
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Estándares**|Ejemplo +|
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Consistencia**|[Ejemplo +](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-003/entregas/rivasMiguel/reto003/Calculadora.java)|Aquí se puede observar claraente como todas las funciones y variables siguen la misma nomenclatura y la misma estructura de utilización|
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-004/entregas/rivasMiguel/reto004/Tiempo.java)|Se evidencia claramente en funciones como [equals](https://github.com/miguelrivasmorantes-devu/24-25-PRG2/blob/entrega-004/entregas/rivasMiguel/reto004/Tiempo.java#L23) La disonancia en cuanto al resto de funciones, dado que la gran mayoria se encuentran en español y con un nombre que describe mejor su funcionalidad|PR corrección
||[Ejemplo -](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java)|De igual manera al anterior, se ve en la función [participantsLength](https://github.com/miguelrivasmorantes-devu/25-26-EDA1/blob/reto-001/entregas/rivasMiguel/src/Juego.java#L61) que no sigue el formato del resto de funciones de nombrarse en español, que no está mal de por sí sin embargo teniendo en cuenta el resto de funciones ese nombre no concuerda|PR corrección
|**Código muerto**|Ejemplo +|
||Ejemplo -||PR corrección
|**DRY**|Ejemplo +|
||Ejemplo -||PR corrección
|**YAGNI**|Ejemplo +|
||Ejemplo -||PR corrección