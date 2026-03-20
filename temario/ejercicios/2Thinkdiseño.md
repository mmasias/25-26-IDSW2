# 01 - Diseño - 2Think

## Propuesta general

<div align=center>

|||
|-|-|
![](/images/disenoMaloBasico.svg)|![](/images/disenoMalo.svg)

</div>

## Reflexiones

### Tienda es el todo. Y como todo todo, no es parte del todo

> *¿"Creas" una tienda o "arrancas"/"inicias" el sistema?*

- ¿Tiene la entidad ciclo de vida propio dentro del sistema?
  - Un Pedido se crea, se confirma, se envía, se cancela.
  - Un Cliente se registra, se modifica, se da de baja.
  - Un Producto se añade al catálogo, se agota, se retira.
  
Una Tienda??? La Tienda *existe*: es el contexto en el que todo ocurre, no un participante con comportamiento.

Una entidad se justifica escalar a clase si:

<div align=center>

||||
|-|-|-|
Tiene ciclo de vida propio|Puede existir en múltiples instancias|Acumula responsabilidades que le son exclusivas.

</div>

Tienda no cumple ninguna de las tres condiciones en este sistema: no se crea ni se destruye, solo hay una y sus supuestas responsabilidades pertenecen al sistema en su conjunto.

Recordar: *El cliente de una estructura no forma parte de ella.*

### DiseñoOO != DiseñoBBDD

<div align=center>

|Diseño BBDD|DiseñoOO|
|-|-|
|*¿Cómo almaceno esto eficientemente?*|*¿Quién es responsable de qué?*
|Las decisiones las gobiernan normalización, índices, integridad referencial, rendimiento de consultas.|Las decisiones las gobiernan cohesión, acoplamiento, ciclo de vida de los objetos.
|El resultado es una estructura optimizada para persistencia.|El resultado es una estructura optimizada para comportamiento.

</div>

"Code smell" en esta fase:

- Clases solo con atributos y ningún método: eso es una tabla con nombre de clase... Una clase sin comportamiento no tiene responsabilidades y por tanto no tiene razón para existir como clase.
- Modelado de la clave foránea *explícitamente* como atributo (Ej.: **clienteId: int** en Pedido) en lugar de una C/Ag/A/U (**cliente: Cliente**)... Eso es pensar en filas/columnas y no en objetos colaborando.

Cuando tenemos un atributo como objeto, se relaciona mediante un método (sea constructor o método clásico)

|||
|-|-|
Con un **clienteId: int** "no se puede hacer nada" sin salir buscar la fila correspondiente.|Con una referencia al objeto, podemos ***hablar*** con él directamente.

El mecanismo que usemos para "conectar" las clases comunica la naturaleza de la relación:

|Constructor|Setter / método de negocio|Factory / builder|
|-|-|-|
|**LineaPedido(Producto producto, int cantidad)**|**pedido.asignarCliente(cliente)**|Inicialización del sistem completo y primeras conexiones|
|El objeto no puede existir sin su colaborador. Refuerza composición.|La relación se establece en otro momento del ciclo de vida.|La construcción del grafo de objetos es suficientemente compleja como para merecer su propio responsable.

- En los tres casos el objeto receptor **conoce** al colaborador como objeto: puede llamar a sus métodos, puede delegarle responsabilidades.
- Con un **clienteId: int** no puede hacer nada sin salir del modelo a buscar la fila correspondiente.

Cuantos más intermediarios necesitemos para llegar a la información que nos hace falta, más frágil es el diseño.

Entonces, recordemos: una tabla almacena datos. Un objeto almacena datos y sabe hacer cosas con ellos. Si tenemos clases únicamente con atributos, entonces estamos diseñado una BBDD y no un modelo de objetos.

### ¿Atributo o clase?

||¿Tiene estructura interna propia?|¿Es compartido por múltiples instancias?|¿Aparece en más de un contexto del modelo?|
|-|-|-|-|
||¿Necesita más de un primitivo para representarse?|¿Puede este dato cambiar independientemente de los objetos que lo contienen?|¿El mismo concepto aparece en varios lugares del modelo?|
|**Recordemos**|El tipo primitivo no protege las reglas del concepto.|La actualización de un atributo disperso exige tocar cada instancia.|Modelarlo como atributo duplica estructura y dispersa las reglas de validación.|
|**Entonces**|*Probablemente* merece ser clase.|*Es candidato* a clase.|La duplicación es la señal.|
|**Ej.**|`Dinero` necesita cantidad + moneda. `Direccion` necesita calle + ciudad + código postal.|Si `Categoria` es un `String` en `Producto`, renombrar "Electrónica" exige actualizar cada producto. Si es una clase, se actualiza en un único lugar.|`Direccion` aparece en `Cliente` (domicilio), `Pedido` (envío) y `Factura` (facturación). Como atributo, las reglas de validación se repiten tres veces. Como clase, viven en un único lugar.|

Un atributo representa un dato simple que el objeto posee. 

Una clase representa un concepto que tiene sus propias reglas, su propia estructura o su propia existencia más allá del objeto que lo contiene.

### CLASES, Clases y clases

||Acciones como clases|Atributos como clases|Roles como clases|
|-|-|-|-|
|**¿Son clases?**|`Pago`, `Envio`, `Busqueda`|`Direccion`, `Telefono`|`Administrador`, `Gestor`, `Sistema`|
|**#2Think:**|Son operaciones o estados de otra entidad.|Más clases no significa mejor diseño: introduce colaboración, ciclo de vida y responsabilidad donde no los hay.|Existen como contexto, no como participante con comportamiento.|
|**Pregunta**|¿Tiene atributos propios o solo es un verbo sustantivado?|¿Tiene comportamiento, ciclo de vida o aparece en múltiples contextos?|¿Se crea, se modifica, se destruye — o simplemente *existe*?|
|**Entonces**|`Pago` es clase si tiene estado propio: importe, fecha, método, resultado de autorización.|`Direccion` es clase si aparece en `Cliente`, `Pedido` y `Factura`, o si necesita validación propia.|`Administrador` es clase si tiene atributos y comportamiento distintos de `Cliente`.|

### Magnitud, dirección y sentido

||**Dirección de la asociación**|**Multiplicidad**|
|-|-|-|
||Bidireccionalidad irreflexiva o dirección invertida.|Líneas sin multiplicidad o `1..1` en todo por rellenar.|
|**#2Think:**|Una asociación dirigida **codifica dependencia**: el origen necesita al destino para cumplir su responsabilidad. La bidireccionalidad introduce acoplamiento en ambos sentidos: solo se justifica si ambos lados realmente necesitan navegar la relación (y aún así, yo la cuestiono!!!).|La multiplicidad codifica reglas de negocio. `0..*` significa que un `Cliente` puede existir sin pedidos. `1..*` significa que un `Pedido` sin líneas no es un pedido válido.|
|**Pregunta**|¿Quién necesita a quién para cumplir su responsabilidad?|¿Puede existir sin el otro? ¿Cuántos puede tener como mínimo y como máximo?|
|**Entonces**|`Pedido` conoce a `Cliente` porque necesita sus datos para calcular descuentos y enviar confirmaciones. `Cliente` no necesita conocer a `Pedido` para existir.|`Cliente` `0..*` `Pedido`: un cliente puede no haber pedido nada aún. `Pedido` `1..*` `LineaPedido`: un pedido vacío no es un pedido.|

### l'Atributte

||**Atributos calculados como almacenados**|**Ausencia de tipos**|
|-|-|-|
|**La duda**|`total: double` en `Pedido` en lugar de `calcularTotal()`.|Atributos sin tipo o todo `String`.|
|**#2Think:**|Un valor derivado de otros datos del mismo objeto no se almacena: se calcula. Almacenarlo exige sincronizarlo manualmente con cada cambio y es fuente garantizada de inconsistencia.|El tipo no es burocracia: codifica qué operaciones tienen sentido sobre el dato. `String precio` permite concatenar "100" con "IVA". `double precio` no.|
|**Pregunta**|¿Este valor se puede obtener a partir de otros atributos del objeto?|¿Qué operaciones tienen sentido sobre este dato? ¿Qué operaciones deben ser imposibles?|
|**Entonces**|`calcularTotal()` en `Pedido` recorre sus `LineaPedido` y agrega. Si cambia una línea, el total es siempre correcto sin intervención manual.|`precio: double`, `cantidad: int`, `email: String`, `fecha: LocalDate`. Cada tipo comunica intención y el compilador custodia las reglas.|

> ***calcularTotal()*** devuelve algo. En cuanto se analiza qué devuelve exactamente, volvemos al problema de antes: ¿es un double o es Dinero?
> 
> Y Dinero necesita cantidad + moneda (dos primitivos). Entonces, por el criterio de estructura interna, merece ser clase.
> 
> O sea: en el momento en que se decide no poner **total: double** como atributo almacenado sino usar **calcularTotal()** se ha de pensar en el tipo de retorno... y esto lleva directamente a pensar si ese tipo merece su propia clase: cada decisión expone la siguiente.

### Adelanta[2]

||**Mezcla de niveles**|
|-|-|
|**La duda**|`EmailSender`, `PDFGenerator`, `ConexionBBDD` en el diagrama de dominio.|
|**#2Think:**|El enunciado describe *qué* debe hacer el sistema. La tecnología describe *cómo*. Mezclarlos en el mismo diagrama acopla el dominio a decisiones de implementación que pueden cambiar.|
|**Pregunta**|¿Este concepto aparece en el enunciado del problema o es parte de la solución técnica que elegida para resolverlo? / ¿Puedo hablar "en genérico"? / ¿Mantengo la semántica de lo pedido?|
|**Entonces**|`notificarConfirmacion()` pertenece al dominio. `SMTPClient` no. Los separa una abstracción.

## Propuesta Matizada

<div align=center>

|![](/images/disenoBuenoBasico.svg)
|-


|![](/images/disenoBueno.svg)
|-

</div>
