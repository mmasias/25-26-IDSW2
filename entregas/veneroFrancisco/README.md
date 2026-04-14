# Refactorización: Tres en Raya (TicTacToe)

## Arquitectura

El código se ha dividido en las siguientes capas para separar responsabilidades:

* **Modelo:** Clases como `Tablero`, `Jugador`, `Turno` y `Coordenada`. Se han limpiado de cualquier interacción con la consola (sin `Scanner` ni `System.out`). Ahora solo se encargan de las reglas del juego.
* **Vista (La Interfaz):** Una clase dedicada exclusivamente a comunicarse con el usuario. Es la única responsable de pintar el tablero, pedir coordenadas y mostrar mensajes.
* **Controlador (El Coordinador):** La clase `TresEnRaya` actúa como intermediario. Conecta la lógica del Modelo con la entrada/salida de la Vista y controla el bucle principal.
* **Ensamblaje:** Se ha utilizado una clase `ConstructorJuego` para instanciar y conectar todas estas piezas de forma limpia antes de arrancar el juego en el archivo principal (`main`).