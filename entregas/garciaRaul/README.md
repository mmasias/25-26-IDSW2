# 🕹️ Tres en Raya (Tic-Tac-Toe) - Java OOP

Esta es una implementación en **Java** del clásico juego de mesa **Tres en Raya**. 

A diferencia del juego convencional, esta versión incluye una mecánica avanzada: **cada jugador solo dispone de 3 fichas**. Si no hay un ganador después de colocarlas, el jugador debe mover una de sus fichas en el tablero.

---

## Estructura del Proyecto

El código se divide en las siguientes clases:

| Clase | Descripción |
| :--- | :--- |
| `Coordenada` | Encapsula la posición (fila/columna) y valida el rango de entrada. |
| `Tablero` | Gestiona la matriz de 3x3, comprueba victorias y ocupación de casillas. |
| `Jugador` | Define el color ('x' u 'o') de cada participante. |
| `Turno` | Controla a quién le toca jugar y permite el cambio de turno. |
| `TresEnRaya` | El controlador principal que dirige el flujo de la partida (`jugar`). |
| `VistaConsola` | Implementación de la interfaz `Vista` para jugar a través de la terminal. |

---

##  Lógica de Victoria

El tablero utiliza un algoritmo eficiente para detectar el **Tres en Raya** analizando:
1.  **Filas:** Suma de fichas iguales en el eje horizontal.
2.  **Columnas:** Suma de fichas iguales en el eje vertical.
3.  **Diagonal Principal:** Donde `fila == columna`.
4.  **Diagonal Secundaria:** Donde `fila + columna == 2` (basado en índice 0).

---

## Reglas del Juego

1.  El juego comienza con un tablero vacío `_`.
2.  Los jugadores colocan sus fichas por turnos indicando **Fila** y **Columna**.
3.  Si un jugador ya tiene **3 fichas** en el tablero y no ha ganado:
    * Debe seleccionar una de sus fichas actuales para **sacarla**.
    * Luego, debe elegir una nueva posición vacía para **colocarla**.
4.  El primer jugador en alinear 3 fichas (horizontal, vertical o diagonal) gana la partida.

