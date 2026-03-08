

### Justificaciones

|Categoría||Justificación||
|-|-|-|-|
|**Nombrado**|Ejemplo +|Las variables dineroAPagar y dineroPagado utilizan términos claros del dominio del problema (negocio) y expresan exactamente su propósito sin necesidad de abreviaturas.| https://github.com/franvenero/23-24-prg1/blob/b3d00646416f7449b9b80888d079eeae7420d2b3/entregas/veneroFrancisco/reto-003/reto3.java#L8
||Ejemplo -|En el método main, se han renombrado las variables secuenciales (numero1, digito1, etc.) por nombres que revelan su intención y rol matemático (fuenteCentenas, digitoCentena, etc.), en lugar de usar nombres en serie que obligaban a leer la fórmula para deducir su propósito.|https://github.com/franvenero/23-24-prg1/pull/3
||Ejemplo -||PR corrección
|**Comentarios**|Ejemplo +|La total ausencia de comentarios en el archivo.| https://github.com/franvenero/23-24-prg1/blob/main/entregas/veneroFrancisco/reto-003/reto3.java#L15
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Formato**|Ejemplo +|El código agrupa las sentencias por afinidad lógica y utiliza una línea en blanco para separar la fase de lectura, la fase de cálculo de cada billete/moneda y la fase de impresión.|https://github.com/franvenero/23-24-prg1/blob/b3d00646416f7449b9b80888d079eeae7420d2b3/entregas/veneroFrancisco/reto-003/reto3.java#L12
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Estándares**|Ejemplo +|
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Consistencia**|Ejemplo +|Se ha elegido una forma de extraer las cantidades (una división seguida inmediatamente de una actualización por módulo) y se aplica exactamente el mismo patrón para todas las denominaciones (desde 100 hasta 1)|https://github.com/franvenero/23-24-prg1/blob/b3d00646416f7449b9b80888d079eeae7420d2b3/entregas/veneroFrancisco/reto-003/reto3.java#L15
||Ejemplo -|En la impresión de los billetes de 5 euros hay un espacio anómalo justo antes del punto y coma  ;, que no está presente en ninguna de las otras líneas similares.|https://github.com/franvenero/23-24-prg1/pull/2
||Ejemplo -||PR corrección
|**Código muerto**|Ejemplo +|
||Ejemplo -||PR corrección
|**DRY**|Ejemplo +|  | 
||Ejemplo -|En el cálculo del cambio, se utiliza un bucle for que itera sobre un arreglo de denominaciones en lugar de escribir de nuevo las operaciones de división, módulo e impresión para cada tipo de billete y moneda.|https://github.com/franvenero/23-24-prg1/pull/1
|**YAGNI**|Ejemplo +|
||Ejemplo -||PR corrección