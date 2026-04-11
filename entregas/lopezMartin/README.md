# Tic Tac Toe (MVC)

### 1. Modelo (`ModeloTresEnRaya.java`)
Contiene los datos y las reglas del juego.

Gestiona el estado del tablero (matriz 3x3), el jugador actual ('X' u 'O') y el estado de la partida (Jugando, Victoria, Empate).

Implementa el método `registrarMovimiento` que valida la posición y actualiza el estado, y `comprobarEstadoJuego` que analiza si la partida ha terminado o no.

### 2. Vista (`VistaTresEnRayaConsola.java`)
Es responsable de la representación visual de los datos y de la interacción con el usuario.

Se utiliza una interfaz `VistaTresEnRaya` genérica para definir las operaciones necesarias (mostrar tablero, mensajes y pedir coordenadas).

`VistaTresEnRayaConsola` implementa esta interfaz para interactuar a través de la consola.

### 3. Controlador (`ControladorTresEnRaya.java`)
Actúa como el coordinador entre el Modelo y la Vista.

Contiene el bucle principal del juego (`iniciarJuego`).

Solicita las coordenadas a la Vista, se las envía al Modelo para su procesamiento y, basándose en la respuesta del Modelo, utiliza la Vista para mostrar el resultado o el error.

Al recibir la interfaz `VistaTresEnRaya` por constructor, el controlador puede trabajar con cualquier tipo de clase que la implemente (Consola, GUI, etc.) sin necesidad de cambiar nada.

### Builder (`JuegoBuilder.java`)
Implementa el patrón Builder. Se encarga de la instanciación del modelo y de la vista y además valida que el juego esté correctamente inicializado antes de ejecutarse.
