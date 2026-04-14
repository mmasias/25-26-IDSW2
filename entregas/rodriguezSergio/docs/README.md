# Explicación del Código Corregido

## Principios de Diseño Aplicados

1. Indirección (Patrón GRASP)
Se ha introducido una clase intermedia, GestorIO, que actúa como mediadora entre las clases de lógica de juego (Tablero, Jugador, Coordenada) y la interfaz de usuario (consola).

Beneficio: Si en el futuro se desea cambiar la consola por una interfaz gráfica (Swing, JavaFX) o una API Web, solo será necesario modificar GestorIO, dejando intacta la lógica del juego.

2. Alta Cohesión
Antes, la clase Coordenada o Jugador tenían la "responsabilidad" de saber cómo imprimir mensajes y cómo leer enteros. Ahora, su única responsabilidad es gestionar los datos del juego. La responsabilidad de la Entrada/Salida (I/O) ha sido delegada.

3. Patrón Singleton
La clase GestorIO se ha implementado como un Singleton. Esto garantiza que en toda la ejecución del programa solo exista una instancia encargada de gestionar los recursos de entrada (Scanner) y salida, centralizando el flujo de datos.

### Códigos Nuevos

Actualmente, las clases de dominio (Tablero, Coordenada y Jugador) tienen baja cohesión y alto acoplamiento.

* Tienen baja cohesión porque mezclan la lógica de negocio (las reglas del tres en raya) con la lógica de presentación y entrada de datos (el uso directo de System.out y new Scanner(System.in)).

* Tienen alto acoplamiento porque dependen directamente de la consola de Java. Si mañana quisieras hacer este juego en una ventana gráfica o en una web, tendrías que modificar profundamente todas las clases.

Por ello, veo conveniente crear una clase intermedia (indirección) llamada GestorIO utilizando el patrón Singleton. Esta clase será la única responsable de hablar con la consola. El resto de las clases le pedirán favores a GestorIO en lugar de imprimir o escanear por sí mismas.

### Códigos que NO Cambian

En este caso, podemos observar que las clases Juego.java, TresEnRaya.java y Turno.java no requieren cambios porque, por suerte, ya estaban bien diseñadas y no hacían uso de llamadas a la entrada y salida de datos (I/O).
