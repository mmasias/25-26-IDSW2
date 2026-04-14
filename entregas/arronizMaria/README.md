# RETO-003

## Cambios propuestos

### Abstracción de interfaz

- **`ITablero`**: contrato mínimo y primitivo para el tablero
- **`IVista`**: separa toda la presentación del dominio
- **`IJugador`**: interfaz con lo esencial
- La lógica de I/O se concentra en `Jugador`, que es la única clase que conoce el `Scanner`. El jugador interactúa con el tablero a través de `ITablero` no con la consola directamente desde el controlador.

### Diseño por contrato

- **`Coordenada`** solo puede crearse con valores válidos (asserts) - la validación previa a la construcción lo hace `Jugador` mediante `Coordenada.esValida(fila, col)`.
- **Precondiciones internas** con `assert` en métodos como `ponerFicha` (casilla libre) y `sacarFicha` (casilla ocupada).
- **`ControladorJuego`**: precondición en el constructor (`assert tablero != null`, `assert jugadores.length == 2`).

### Patrón de indirección

- **`ControladorJuego`** (invención pura / controlador MVC): extrae el flujo de juego de `TresEnRaya`. Coordina modelo, vista y jugadores sin pertenecer al dominio. Depende de las interfaces `ITablero`, `IVista` e `IJugador`, no de implementaciones concretas.
- **`VistaConsola`** (vista separada): `Tablero` ya no llama a `System.out`. Toda la presentación pasa por `IVista`. El tablero es ahora un modelo de datos puro.
- **`Juego`** (punto de entrada): construye las dependencias concretas (`Tablero`, `VistaConsola`, `JugadorHumano`) y las inyecta en `ControladorJuego`.