# Explicación del Código Corregido

### Códigos Nuevos

Actualmente, las clases de dominio (Tablero, Coordenada y Jugador) tienen baja cohesión y alto acoplamiento.

* Tienen baja cohesión porque mezclan la lógica de negocio (las reglas del tres en raya) con la lógica de presentación y entrada de datos (el uso directo de System.out y new Scanner(System.in)).

* Tienen alto acoplamiento porque dependen directamente de la consola de Java. Si mañana quisieras hacer este juego en una ventana gráfica o en una web, tendrías que modificar profundamente todas las clases.

Por ello, veo conveniente crear una clase intermedia (indirección) llamada GestorIO utilizando el patrón Singleton. Esta clase será la única responsable de hablar con la consola. El resto de las clases le pedirán favores a GestorIO en lugar de imprimir o escanear por sí mismas.

### Códigos que NO Cambian

En este caso, podemos observar las clases Juego.java, TresEnRaya.java y Turno.java no requieren cambios porque, por suerte, ya estaban bien diseñadas y no hacían uso de llamadas a la entrada y salida de datos (I/O).
