# Iteración #4

En esta iteración no cambié demasiado lo establecido en lo anterior.

Llegado a este punto ví conveniente hacer una breve investigación en busca de alguna referencia para elementos y refinar más el modelo. Tras no mucho buscar, hallé el **Contexto**.

**Contexto** es una entidad que no considero indispensable en el modelo de v3, aún así agregarlo resulta dar un juego muy interesante, dota de una capa más de profundidad el alcance del modelo al condicionar mediante *agregación* un relativo dinamismo del **Tema**.

A primera vista no parecería un añadido demasiado relevante, sin embargo analizando el UML de [v3](../../modelosUML/v3/plantUML.png) con respecto al de [v4](../../modelosUML/v4/plantUML.png) se puede identificar que v3 representaba una conversación con un tema *inmutable* no dependiente del curso de la conversación, cosa qeu ahora se permite con **Contexto**.

**Nota**: no sé por qué pero hay algo en retroalimentación que me chirría.
