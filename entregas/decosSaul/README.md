# Tic Tac Toe usando diseño modular

## Archivos

### Modelo

- Coordenada.java: almacena fila y columna
- Jugador.java: representa al jugador ('X'/'O')
- Tablero.java: gestiona el tablero 3x3 y las reglas del juego/validaciones de limites
- Turno.java: gestiona los turnos

### Vista

- Vista.java: interfaz de la vista
- VistaConsola.java: representa el juego mediante salida por consola y pide datos al usuario

### Controlador

- ControladorJuego.java: dirige la partida
- Main.java: instancia los objetos e inicia el controlador del juego
