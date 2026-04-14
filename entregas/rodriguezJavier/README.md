# AUMENTO DE COHESIÓN

### Para aumentar la cohesión, apliqué el principio de que cada clase debe hacer una sola cosa, separando las reglas del juego de la interfaz de usuario:

- Consola: Centraliza toda la lectura del teclado y la impresión en pantalla.

- Coordenada: Ahora es un simple contenedor de datos (fila y columna).

- Tablero: Gestiona únicamente las reglas lógicas y la matriz, sin saber nada de la pantalla.

- Jugador: Solo elige dónde jugar, sin modificar el tablero directamente.

- TresEnRaya (Indirección/Mediador): Controla el flujo del juego. Conecta a los jugadores, el tablero y la consola para que trabajen juntos sin mezclarse.