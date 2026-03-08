# Reto 002 - Legibilidad

### Justificaciones

|Categoría||Justificación||
|-|-|-|-|
|**Nombrado**|[Ejemplo +](https://github.com/beatriizorozco/24-25-PRG1/blob/b2e97ae9d129c018bb02ca39577b8005708127a7/entregas/orozcoBeatriz/entregas/src/Edificio2.java#L50C5-L50C53)|
||[Ejemplo -](https://github.com/beatriizorozco/24-25-PRG1/blob/b2e97ae9d129c018bb02ca39577b8005708127a7/entregas/orozcoBeatriz/entregas/src/Escondite.java#L93C26-L94C39)||[PR corrección](https://github.com/beatriizorozco/24-25-PRG1/pull/1/changes)
||[Ejemplo -](https://github.com/beatriizorozco/24-25-PRG2/blob/5793eb83389129df171426ac009534c78f2f56f3/entregas/orozcoBeatriz/reto001/CalculoEscalaYAcordeMayor.java#L25)||[PR corrección](https://github.com/beatriizorozco/24-25-PRG2/pull/1/changes)
|**Comentarios**|Ejemplo +|
||[Ejemplo -](https://github.com/beatriizorozco/proyecto-final-sd-pp/blob/488372bd3c4d145bccc4565e9bfeef968d42681f/CentroHipico.API/Controllers/ClasesHipicaController.cs#L24)|Comentario de sección|[PR corrección](https://github.com/beatriizorozco/proyecto-final-sd-pp/pull/1/changes)
||[Ejemplo -](https://github.com/beatriizorozco/proyecto-final-sd-pp/blob/488372bd3c4d145bccc4565e9bfeef968d42681f/CentroHipico.API/Controllers/ClasesHipicaController.cs#L93)|Comentario redundante|[PR corrección](https://github.com/beatriizorozco/proyecto-final-sd-pp/pull/2/changes)
|**Formato**|[Ejemplo +](https://github.com/beatriizorozco/24-25-PRG2/blob/462cc50efc42469abbccfd2a0568627cac55cd23/entregas/orozcoBeatriz/reto004/Tiempo.java#L7)|Una línea entre grupos lógicos
||[Ejemplo -](https://github.com/beatriizorozco/24-25-PRG1/blob/b2e97ae9d129c018bb02ca39577b8005708127a7/entregas/orozcoBeatriz/entregas/src/CalculoNotaFinal.java#L6)|Para hacer esta jerarquía visible, hay que sangrar la líneas de código fuente de forma proporcional a su posición en la jerarquía.|[PR corrección](https://github.com/beatriizorozco/24-25-PRG1/pull/2/changes)
||[Ejemplo -](https://github.com/beatriizorozco/24-25-PRG1/blob/b2e97ae9d129c018bb02ca39577b8005708127a7/entregas/orozcoBeatriz/entregas/src/JuegoPiedraPapelTijera.java#L30)|La llave que cierra el do no está al mismo nivel que donde se abre, así que cuesta ver bien dónde acaba el bloque. Si estuviera alineada con el do, el bucle se entendería más fácil al leer el código.|[PR corrección](https://github.com/beatriizorozco/24-25-PRG1/pull/3/changes)
|**Estándares**|[Ejemplo +](https://github.com/beatriizorozco/24-25-PRG2/blob/6957ed2cdc918e49e4fc6a6f53d240271e5d48d9/entregas/orozcoBeatriz/reto001/CalculoEscalaYAcordeMayor.java#L6)|Las constantes (TONO, SEMITONO) están en mayúsculas, que es la forma habitual en Java para diferenciar constantes de variables normales.
||[Ejemplo -](https://github.com/beatriizorozco/24-25-PRG1/blob/b2e97ae9d129c018bb02ca39577b8005708127a7/entregas/orozcoBeatriz/entregas/src/RetoForIf.java#L6)|Se usa j = j + 1 y i = i + 1 en vez de j++ e i++. Funciona igual, pero no es la forma más común en Java.|[PR corrección](https://github.com/beatriizorozco/24-25-PRG1/pull/4/changes)
||[Ejemplo -](https://github.com/beatriizorozco/24-25-PRG1/blob/b2e97ae9d129c018bb02ca39577b8005708127a7/entregas/orozcoBeatriz/entregas/src/Matrices.java#L19)|Cambio int matriz[][] por int[][] matriz, que es la forma más típica de declarar arrays en Java. También cambio imprime por imprimir para que el nombre del método sea correcto.|[PR corrección](https://github.com/beatriizorozco/24-25-PRG1/pull/5/changes)
|**Consistencia**|Ejemplo +|
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Código muerto**|Ejemplo +|
||Ejemplo -||PR corrección
|**DRY**|Ejemplo +|
||Ejemplo -||PR corrección
|**YAGNI**|Ejemplo +|
||Ejemplo -||PR corrección

