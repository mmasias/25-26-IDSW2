# Justificación de Clasificación

## Primera Iteración

Se utilizó un enfoque *cognitivo* como forma de separar cada caso abstracto del proceso de toma de decisiones en entidades individuales, las cuales cumplen una responsabilidad concreta en el modelo.

A continuación se detalla la naturaleza de cada entidad escogida:

### Cuestionamiento

El cuestionamiento funciona como un entorno o "slot" donde se depositan diversas opciones para ser analizadas. Se pensó como la *"pregunta"* **neutral** que se hace cualquier persona al momento de decidir algo

> Ej: "Debería hacer tarea o jugar un videojuego?

### Alternativa

Es toda aquella opción que un cuestionamiento me genera. Es la entidad más clara, ya que al momento de tomar una decisión, **todo gira alrededor de las alternativas que tenemos**.

> Ej: Tarea, Jugar un videojuego, Dormir, Descansar

### Elección

Es un poco mas compleja de entender, ya que sobre el papel tiene exactamente la misma naturaleza que una **alternativa**, pero cumple un rol diferente. Ya que la elección es como tal la representación de la *resolución* de la duda. Y esta ya genera un efecto por si misma, no como las alternativas, que **existen independientemente si se toma una decisión o no**.

> Ej: Escogí tarea, pero eso lleva consigo...

### Consecuencia

Es el efecto que genera una elección. Es lo que las personas sufren de tener que tomar una decisión. Existen tanto positivas como negativas.

> Ej: Hacer tarea me hizo usar 2 horas de mi tarde, que podría haber usado en jugar videojuegos (**Parte negativa**). Pero me hizo aprender acerca de un trinomio cuadrado perfecto (**Parte positiva**)

### Conciencia

Es la encargada de reflexionar las decisiones que tomamos. Es como un "agente" que opera cada cuestionamiento y cambie o se mantenga con las elecciones que va tomando en el transcurso de la decisión.

> Ej: No quiero hacer tarea pero mi **conciencia** me dice que puedo jugar únicamente si la hago, así que escogeré la tarea para tener la vía libre para jugar.

## Segunda Iteración

Se añadieron 2 nuevas entidades considerando una abstracción mas amplía y *humana* de la toma de decisiones.

### Sentimiento

Antes, con la entidad **neutral** de **Cuestionamiento** únicamente estabamos tomando en cuenta que la vida nos arrojaba una pregunta neutral que debiamos considerar "porqué si". Pero la realidad es que existe un generador crucial a la hora de tener un cuestionamiento concreto, siendo un **Sentimiento**. Este justifica la génesis del **Cuestionamiento**. Permite entender que múltiples cuestionamientos no son eventos aislados, si no ramas de un mismo estado anímico.

> Ej: Me siento cansado (**Sentimiento**), debería descansar o seguir trabajando? (**Cuestionamiento**)

### Emoción

Es necesaria para procesar el output de la decisión. Una **Consecuencia** en términos físicos es solo un dato; la **Emocion** es la entidad que traduce ese dato en una señal de valor (placer, dolor, sorpresa). Nos da lo necesario para construir sentimientos los cuales luego se reflejaran en cuestionamientos, por lo que introduce el famoso **circulo vicioso** de decisiones, no importando si es positivo o negativo.

> Ej: Hice tarea y ya es de noche y la consecuencia fue que no pude jugar en todo el día. Me siento triste, enfadado e impaciente. Esto me genera frustración, así que ahora voy a jugar toda la madrugada para reponer esas horas que perdí por decidir de esa forma.
(Esta situación en concreto se refiere a la muy concurrida **Procrastinación por Venganza**)