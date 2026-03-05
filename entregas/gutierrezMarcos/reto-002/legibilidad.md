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

A partir del documento de [legibilidad](legibilidad.md), se pide:

- Por cada sección
  - Un ejemplo de aplicación correcta.
  - Dos ejemplos de aplicación incorrecta (uno en las secciones Código muerto, DRY y YAGNI).
  - Un argumento por cada ejemplo, que justifique por qué dicha clasificación. Cada argumento debe referenciar explícitamente un principio del documento de legibilidad y comentar el efecto concreto en mantenibilidad.
  - La corrección -sobre su propio repositorio- de los ejemplos incorrectos.
- Añada una sección final breve — 3-5 líneas — donde indique en cuál de las 8 categorías le resultó más difícil de encontrar en su propio código y por qué.
- Los ejemplos deben ser propios, públicos y existentes en sus propios repo.
- La entrega debe realizarse en un archivo creado a partir del documento [legibilidad.md](legibilidad.md), colocado en la carpeta de documentos de su carpeta de entregas, incluyendo completa la tabla que está indicada debajo.
- No se deben entregar más archivos: solo el README.md en la raíz de su carpeta personal y el archivo legibilidad.md en la carpeta docs.
- Complete la tabla con enlaces a las líneas exactas del archivo en el repositorio en el que identificó el escenario positivo o negativo.
- Agregue (en la columna de justificación) el argumento que justifique dicha elección. Se valorará ampliamente una justificación que combine teoría y práctica.
- Asimismo, para los casos de aplicación incorrecta, la corrección debe realizarse en una rama de su repo original, y debe concluir con un pull request a usted mismo, que incluya la justificación de la corrección que ha propuesto.

### Justificaciones

|Categoría||Justificación||
|-|-|-|-|
|**Nombrado**|Ejemplo +|NumeroMayor: Cumple perfectamente. Usa nombres en su dominio (primerNumero, mayor), sin codificaciones, camelCase correcto y la clase es un sustantivo en PascalCase.|<a href="https://github.dev/marcosgutierrez6/23-24-prg1/blob/correccion/entregas/gutierrezMarcos/reto-001/NumeroMayor.java">Archivo</a>|
||Ejemplo -|Extras: Clase con nombre desinformativo que no indica su función. Usa nombres ambiguos (metrosBaja) y números para booleanos (int coche = 1).|<a href="https://github.com/marcosgutierrez6/23-24-prg1/pull/1">PR corección</a>
||Ejemplo -|DevolverCambio: El nombre de la clase es un verbo (acción) en lugar de un sustantivo (entidad). Además usa la variable cantidad (muy ambigua).|<a href="https://github.com/marcosgutierrez6/23-24-prg1/pull/1">PR corección</a>
|**Comentarios**|Ejemplo +|No tengo comentarios||
||Ejemplo -|No tengo comentarios|PR corrección
||Ejemplo -|No tengo comentarios|PR corrección
|**Formato**|Ejemplo +|Utiliza líneas en blanco para separar perfectamente los grupos lógicos (entrada de datos, cálculo y salida). Aplica correctamente la sangría proporcional a la jerarquía de las clases y métodos. Declara las variables justo en el momento de su uso y mantiene líneas cortas, facilitando la lectura vertical.|<a href="https://github.com/marcosgutierrez6/23-24-prg1/blob/main/entregas/gutierrezMarcos/reto-004/Decostruccion.java">Archivo</a>|
||Ejemplo -|Se movió el atributo acumulacionConsumo al inicio de la clase para respetar la jerarquía estructural.Las variables locales se reubicaron justo antes de su primer uso, en lugar de agruparlas al inicio del main. Esto minimiza su tiempo de vida, reduce la carga mental al leer y previene errores de sobreescritura.|<a href="https://github.com/marcosgutierrez6/23-24-prg1/pull/1">PR corección</a>
||Ejemplo -|Se corrigió la legibilidad dividiendo los System.out.println que superaban el límite de 80-120 caracteres. Se aplicaron saltos de línea y sangría proporcional respetando la jerarquía de los bloques if/else. Esto permite una lectura estructurada de forma vertical, eliminando la necesidad de hacer scroll horizontal.|<a href="https://github.com/marcosgutierrez6/23-24-prg1/pull/1">PR corección</a>
|**Estándares**|Ejemplo +|Por qué está bien: Pone los atributos al principio de la clase. Utiliza el estándar de encapsulamiento básico de la industria (atributos private). Usa la convención de prefijos estándar get y set para acceder a ellos, y respeta estrictamente PascalCase para la clase y camelCase para variables/métodos.|<a href="https://github.com/marcosgutierrez6/24-25-EDA1/blob/cebf62b928a9a29f52013811d23ff6eb4e37fa76/entregas/gutierrezMarcos/Reto-002/Node.java">Archivo</a>|
||Ejemplo -|Primero, viola el estándar de encapsulamiento: casi ningún atributo de la clase tiene modificador de acceso (deberían ser private). Segundo, viola los estándares de nombrado de Java al llamar a un método exactamente igual que a un atributo (eleccion()  vs int eleccion), y además usa un sustantivo para el método en lugar de un verbo de acción (ej. pedirEleccion()).|<a href="https://github.com/marcosgutierrez6/24-25-EDA1/pull/1">PR corrección</a>
||Ejemplo -|Se centralizó la instanciación de Random en un único atributo de clase, evitando el alto coste de memoria por instanciaciones múltiples. Se eliminó el paso redundante del arreglo clientes por parámetro en métodos privados, aprovechando el acceso al atributo global. Se corrigieron los límites de los bucles for en los desplazamientos para evitar errores fatales de desbordamiento de índice (IndexOutOfBounds).|<a href="https://github.com/marcosgutierrez6/24-25-EDA1/pull/1">PR corrección</a>
|**Consistencia**|Ejemplo +|
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Código muerto**|Ejemplo +|
||Ejemplo -||PR corrección
|**DRY**|Ejemplo +|
||Ejemplo -||PR corrección
|**YAGNI**|Ejemplo +|
||Ejemplo -||PR corrección