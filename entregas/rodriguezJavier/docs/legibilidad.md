|Categoría||Justificación||
|-|-|-|-|
|**Nombrado**|
|Ejemplo +|jugadaUsuario y jugadaComputadora son dos buenos ejemplos de nombrado ya que son autoconclusivos y sabes lo que contiene al instante|<a href="https://github.com/jerdier/24-25-PRG1/blob/main/entregas/rodriguezJavier/Reto-002/PiedraPapelTijera.java">Archivo</a>|
|Ejemplo -|opciones es un nombre muy débil ya que puede significar muchas cosas en este contexto, elementosDisponibles reduce mucho las posibilidades de lo que puede ser y define mucho mejor lo que contiene|<a href="https://github.com/jerdier/24-25-PRG1/pull/1/changes">PR corrección</a>|
|Ejemplo -|Commit con un nombre muy confuso, a día de hoy no se lo que quise decir con EscalaAcorde++, si fuera una versión mejorada debería ser EscalaAcordesMejora o v2|<a href="https://github.com/jerdier/24-25-PRG2/commit/7b3194fc62df582032c5fc075ee93f6531b6cf89">PR corrección</a>|
|**Comentarios**|
|Ejemplo +|No tengo practicamente ningún código con comentarios y los que he encontrado tienen comentarios muy repetitivos o que no aportan nada de información||
|Ejemplo -|Eliminé todos los comentarios que explicaban código que se entendía a simple vista y no aportaba nada y mejoré un comentario sobre el bucle del tiempo para decir algo mas concreto y simplificado|<a href="https://github.com/jerdier/23-24-prg2/pull/1">PR corrección</a>|
|Ejemplo -|No he encontrado mas códigos con comentarios en varios de mis forks incluidas otras asignaturas|PR corrección|
|**Formato**|
|Ejemplo +|Indentación correcta en el código|<a href="https://github.com/jerdier/23-24-prg2/blob/main/entregas/RodriguezJavier/Reto-001/Cajeros.java">Archivo</a>|
|Ejemplo -|Las variables están declaradas lejos de su uso por ejemplo, boolean nuevoCliente = false; se declara en la línea 8, pero solo tiene sentido dentro de la iteración de cada minuto. Al declararla tan arriba, su "intervalo de vida" es todo el programa, cuando debería "morir" y "nacer" en cada iteración del bucle for.|<a href="https://github.com/jerdier/23-24-prg2/pull/1">PR corrección</a>|
|Ejemplo -|Dentro del bloque del for la lógica de "generar cliente", "atender en caja" y "restar objetos" está un poco apretada. He separado sub-bloques para un formato que permita una lectura mas dinámica.|<a href="https://github.com/jerdier/23-24-prg2/pull/1">PR corrección</a>|
|**Estándares**|
|Ejemplo +|Buen uso de la nomenclatura de variables camelCase en casos como clientesAtendidos o nuevoCliente|<a href="https://github.ntcom/jerdier/23-24-prg2/blob/main/entregas/RodriguezJavier/Reto-001/Cajeros.java">Archivo</a>|
|Ejemplo -|Mal uso del nombre de variables en minutosEnUnDia, debería ser MINUTOS_EN_UN_DIA al estándar de nomenclatura de variables constantes.|<a href="https://github.com/jerdier/23-24-prg2/pull/1">PR corrección</a>|
|Ejemplo -|No encontré ejemplos distintos sobre estándares que estuvieran mal.||
|**Consistencia**|
|Ejemplo +|Sigo durante todo el código una buena consistencia en el nombramiento de clases y variables.|<a href="https://github.ntcom/jerdier/23-24-prg2/blob/main/entregas/RodriguezJavier/Reto-001/Cajeros.java">Archivo</a>|
|Ejemplo -|Utilizo un numero 4 para los cajeros en vez de un .length y sin embargo, al final para los clientes utilizo un .length|<a href="https://github.com/jerdier/23-24-prg2/pull/1">PR corrección</a>|
|Ejemplo -|No encuentro mas errores de consistencia, no estoy seguro de si puede haber más como el anterior||
|**Código muerto**|
|Ejemplo +|No hay Código muerto, código limpio y buena lógica del ganar/perder del juego.|<a href="https://github.com/jerdier/buscaminas/blob/correccion/src/rodriguezJavier/Juego.java">Archivo</a>|
|Ejemplo -|No he encontrado código muerto en ningún trabajo de años pasados.||
|**DRY**|
|Ejemplo +|Aquí tengo un buen ejemplo de no usar DRY porque he agrupado las tres condiciones de victoria en un solo bloque sin repetirme.|<a href="https://github.com/jerdier/24-25-PRG1/blob/correccion/entregas/rodriguezJavier/Reto-002/PiedraPapelTijera.java">Archivo</a>|
|Ejemplo -|He eliminado la repetición manual de las palabras 'piedra', 'papel' y 'tijera' en los mensajes y validaciones para evitar el DRY en el código. Ahora si en el futuro necesito añadir una nueva jugada, solo tendré que modificar esa lista en un único lugar, facilitando su mantenimiento.|<a href="https://github.com/jerdier/24-25-PRG1/pull/1">PR corrección</a>|
|**YAGNI**|
|Ejemplo +|En este código pido la jugada, la máquina elige la suya, comparo y digo quién gana. No he escrito código "por si acaso", evitando la "hinchazón de código".|<a href="https://github.com/jerdier/24-25-PRG1/blob/correccion/entregas/rodriguezJavier/Reto-002/PiedraPapelTijera.java">Archivo</a>|
|Ejemplo -|No encontré ejemplo de YAGNI en ningún código con varios vistazos a varios códigos del pasado.||