# Iteración #3

Al implementar en código lo descrito en el UML de la iteración anterior se observaban serios problemas que quizá al ver el diagrama no parecían errores, pero al verlos en código a mi parecer no son prácticas correctas.

Por ejemplo en la clase [Sujeto](../../src/v2/Sujeto.java) se ve como se guardan los atributos de Medio y Lenguaje, lo cual está mal.

Al no querer regirme por una sola estructura que gobierna todo como lo era [Interacción](../../src/v2/Interaccion.java), al menos en esta iteración he decidido hacer un modelo más lineal, de manera que cada parte genera la siguiente y por tanto sigue el flujo natural secuencial y no dividido por "bloques" (al menos directamente).

Ya dejaré a contemplación de mi yo del futuro valorar de nuevo las implicaciones de esta aproximación, la cual admito que es algo peculiar.
