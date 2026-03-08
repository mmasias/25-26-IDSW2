

### Justificaciones

|Categoría||Justificación||
|-|-|-|-|
|**Nombrado**|Ejemplo +|Las variables dineroAPagar y dineroPagado utilizan términos claros del dominio del problema (negocio) y expresan exactamente su propósito sin necesidad de abreviaturas.| https://github.com/franvenero/23-24-prg1/blob/b3d00646416f7449b9b80888d079eeae7420d2b3/entregas/veneroFrancisco/reto-003/reto3.java#L8
||Ejemplo -|En el método main, se han renombrado las variables secuenciales (numero1, digito1, etc.) por nombres que revelan su intención y rol matemático (fuenteCentenas, digitoCentena, etc.), en lugar de usar nombres en serie que obligaban a leer la fórmula para deducir su propósito.|https://github.com/franvenero/23-24-prg1/pull/3
||Ejemplo -|En la lectura de datos, se han sustituido los nombres en serie (numero1, numero2) por primerOperando y segundoOperando para revelar claramente su intención en la comparación, en lugar de usar identificadores genéricos y desinformativos.|https://github.com/franvenero/23-24-prg1/pull/4
|**Comentarios**|Ejemplo +|La total ausencia de comentarios en el archivo.| https://github.com/franvenero/23-24-prg1/blob/main/entregas/veneroFrancisco/reto-003/reto3.java#L15
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Formato**|Ejemplo +|El código agrupa las sentencias por afinidad lógica y utiliza una línea en blanco para separar la fase de lectura, la fase de cálculo de cada billete/moneda y la fase de impresión.|https://github.com/franvenero/23-24-prg1/blob/b3d00646416f7449b9b80888d079eeae7420d2b3/entregas/veneroFrancisco/reto-003/reto3.java#L12
||Ejemplo -|Varias sentencias if (como la primera y la última) tienen la llave de cierre } en la misma línea que la instrucción interna. Esto viola el principio de visibilidad de la jerarquía del código mediante sangrado y saltos de línea. Afecta al mantenimiento porque dificulta la lectura en diagonal|https://github.com/franvenero/23-24-prg1/pull/5
||Ejemplo -||PR corrección
|**Estándares**|Ejemplo +|La clase Cotillas es un sustantivo y comienza con mayúscula, cumpliendo el estándar. Además, las variables de instancia (participantes, aleatorio, scanner) están correctamente declaradas al principio de la clase.|https://github.com/Ingenieria-Informatica-UNEATLANTICO/23-24-prg1-examen-extraordinario-franvenero/blob/6ebb69ae99bea6f3b9e4fe8acb46db0862165a0b/src/Cotillas.java#L4
||Ejemplo -|Se ha creado la clase ResultadoCompresion para devolver la cadena y la lista del diccionario de forma tipada|https://github.com/franvenero/24-25-EDA1/pull/1
||Ejemplo -||PR corrección
|**Consistencia**|Ejemplo +|Se ha elegido una forma de extraer las cantidades (una división seguida inmediatamente de una actualización por módulo) y se aplica exactamente el mismo patrón para todas las denominaciones (desde 100 hasta 1)|https://github.com/franvenero/23-24-prg1/blob/b3d00646416f7449b9b80888d079eeae7420d2b3/entregas/veneroFrancisco/reto-003/reto3.java#L15
||Ejemplo -|En la impresión de los billetes de 5 euros hay un espacio anómalo justo antes del punto y coma  ;, que no está presente en ninguna de las otras líneas similares.|https://github.com/franvenero/23-24-prg1/pull/2
||Ejemplo -||PR corrección
|**Código muerto**|Ejemplo +|No hay "Fragmentos de código injustificables, inexplicables u obsoletos"|https://github.com/Ingenieria-Informatica-UNEATLANTICO/23-24-prg1-examen-extraordinario-franvenero/blob/main/src/Cotillas.java#L4
||Ejemplo -|Hay un montón de líneas en blanco innecesarias y saltos de línea vacíos antes de la última llave de la clase. El exceso de líneas en blanco sin propósito rompe esa jerarquía visual.|https://github.com/franvenero/23-24-prg1/pull/6
|**DRY**|Ejemplo +|  | 
||Ejemplo -|En el cálculo del cambio, se utiliza un bucle for que itera sobre un arreglo de denominaciones en lugar de escribir de nuevo las operaciones de división, módulo e impresión para cada tipo de billete y moneda.|https://github.com/franvenero/23-24-prg1/pull/1
|**YAGNI**|Ejemplo +|No se han creado interfaces como IComportamientoParticipante, ni clases abstractas, ni estructuras de datos complejas asumiendo que "quizás en el futuro haya distintos tipos de rumores". Se ha implementado estrictamente lo necesario| https://github.com/Ingenieria-Informatica-UNEATLANTICO/23-24-prg1-examen-extraordinario-franvenero/blob/main/src/Cotillas.java#L4
||Ejemplo -||PR corrección