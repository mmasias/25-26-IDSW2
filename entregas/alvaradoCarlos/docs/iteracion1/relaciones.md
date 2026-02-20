# Justificación de Relaciones Escogidas

### Cuestionamiento y Alternativa

#### Agregación

Se justifica como **agregación** para permitir que una misma alternativa (ej. "Estudiar") pueda ser parte de diferentes cuestionamientos sin quedar ligada exclusivamente a uno solo.

Este controla el ciclo de vida de las alternativas, ya que si no existe una "duda" que hacer, no existirán alternativas cuales escoger. 

Esta relación es permanente, pero se escoge **agregación** debido a que es muy versátil y puede que en cierto tiempo del cuestionamiento se retiren alternativa, por lo que tiene una temporalidad baja.

### Elección y Alternativa

#### Asociación

Se utiliza **asociación** porque la elección referencia a la alternativa seleccionada. 

Esta relación es unidireccional para permitir que la elección sepa qué opción la originó, manteniendo la trazabilidad sin obligar a la alternativa a conocer quién la eligió.

Yo puedo tomar una elección (o decisión) independientemente de que alternativas tenga. Y es probable que en una decisión podria no tener elección y simplemente escoger la alternativa obligadamente.

Esto también modela muy bien el "elegir la nada".

### Elección y Consecuencia

#### Agregación

La elección es la entidad responsable de gestionar sus efectos. Se utiliza **agregación** porque las consecuencias reales son parte integrante del éxito o fracaso de esa elección específica. La elección controla el ciclo de vida de las consecuencias que tiene.

### Alternativa y Consecuencia

#### Asociación

Se utiliza **asociación** porque es una relación de conocimiento: la alternativa sabe qué efectos podría tener, pero no los controla.

Puede tener consecuencias a lo largo del tiempo pero no significa que siempre sean las mismas consecuencias, y las alternativas van a existir tengan o no tengan consecuencias de cualquier índole.

### Conciencia y Cuestionamiento

#### Uso

Se justifica la relación **uso** ya que la conciencia no "posee" el cuestionamiento de forma permanente; lo invoca como un servicio para evaluar el panorama de opciones. Es una relación de dependencia puntual que permite mantener el desacoplamiento entre el observador y el problema.

### Conciencia y Elección

#### Asociación

Se utiliza **asociación** una vez más ya que la conciencia navega hacia la elección para ejecutar la voluntad. La relación es independiente para garantizar que la elección persista como un registro histórico (un hecho consumado) independientemente de que la conciencia se desvíe hacia nuevos procesos.

Mi conciencia puede tomar una elección en cierto punto en el tiempo manteniendose en el mismo, pero también puede cambiar de elección y tomar otra diferente, y luego regresar a la misma, por lo que no es continua esa temporalidad.