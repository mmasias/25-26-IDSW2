# Tic Tac Toe (MVC)

Implementación del Tres en Raya aplicando principios de diseño modular (GRASP, Patrones de Indirección) y arquitectura Modelo-Vista-Controlador (MVC). 

Incluye la variante de límite de fichas: cada jugador dispone de un máximo de 3 fichas. Una vez colocadas, deben mover las fichas existentes en el tablero para alinear tres.

## Arquitectura

### 1. Modelo de Dominio (`ModeloTresEnRaya.java` y entidades)
Encapsula la estructura de datos y la lógica de negocio:
* **`ModeloTresEnRaya`**: Actúa como fachada (Facade) para el acceso desde el controlador.
* **`Tablero`**: Gestiona el estado de la matriz 3x3 y la comprobación del "Tres en Raya".
* **`Jugador`**: Representa a los participantes ('x', 'o') y las acciones de poner o sacar fichas.
* **`Coordenada`**: Representa y valida posiciones espaciales (filas y columnas).
* **`Turno`**: Gestiona la alternancia y el jugador inicial.

### 2. Vista (`VistaTresEnRayaConsola.java`)
Aísla la entrada/salida de la aplicación.
* **`VistaTresEnRaya`** (Interfaz): Define el contrato de interacción (mostrar tablero, mostrar mensajes, pedir coordenadas).
* **`VistaTresEnRayaConsola`**: Implementa la interfaz usando `Scanner` y secuencias ANSI. Recoge entrada de usuario y renderiza el estado sin evaluar lógica de dominio.

### 3. Controlador (`ControladorTresEnRaya.java`)
Coordina el flujo de ejecución.
* Ejecuta el bucle principal (`iniciarJuego`).
* Evalúa el estado del modelo y solicita a la Vista las interacciones correspondientes (colocar o mover).
* Gestiona la lógica de reintentos (casillas ocupadas o coordenadas inválidas).
* Su dependencia exclusiva de la interfaz de la Vista permite sustituir la capa de presentación sin alterar el Modelo ni el Controlador.

### 4. Ensamblaje (`ConstructorJuego.java`)
Aplica el patrón **Builder** para la inicialización.
* Instancia el Modelo y la Vista.
* Valida la inyección de dependencias antes de construir y devolver el `ControladorTresEnRaya`.