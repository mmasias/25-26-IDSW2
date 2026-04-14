# TicTacToe - Refactorización Modular

Este proyecto es una implementación en Java del clásico juego Tres en Raya. La estructura actual es el resultado de una refactorización profunda donde se han aplicado principios de Diseño Modular y patrones de indirección para conseguir un código más cohesivo y mantenible.

---

## Objetivo de la Refactorización

El problema principal de la versión inicial era la mezcla de responsabilidades: las clases que definían las reglas del juego (Tablero, Jugador, Coordenada) también se encargaban de la presentación y la lectura de datos (System.out y Scanner).

La refactorización ha separado la lógica de dominio (el modelo del juego) de la lógica de presentación (la interfaz de usuario por consola), siguiendo el principio de separación de intereses.

---

## Principios de Diseño Aplicados

1. Patrón de Indirección: Se han introducido clases intermedias (Consola, VistaTablero, VistaJugador) para desacoplar el núcleo del juego de la terminal. El modelo ya no conoce los detalles de cómo se muestra la información al usuario.
2. Alta Cohesión: Cada clase tiene ahora una responsabilidad única. Las clases de dominio se centran en las reglas del juego, mientras que las clases de vista se centran en la interacción.
3. Bajo Acoplamiento: Al reducir las dependencias directas entre la lógica y la interfaz, el sistema es más flexible. Cambiar la consola por una interfaz gráfica no requeriría modificar las clases de lógica interna.

---

## Arquitectura del Sistema

El código se organiza en tres capas lógicas claras:

### Capa de Presentación (Vistas)
Se encarga exclusivamente de la interacción con el usuario.
* Consola: Clase que envuelve el uso de Scanner y System.out, centralizando toda la entrada y salida de datos.
* VistaTablero: Responsable de extraer el estado del Tablero y dibujarlo de forma legible.
* VistaJugador: Gestiona la solicitud de coordenadas y comunica eventos como turnos o victorias.

### Capa de Dominio (Modelo)
Contiene las reglas y entidades puras del juego, sin dependencias de entrada/salida.
* Coordenada: Representa una posición y valida sus límites matemáticos.
* Tablero: Gestiona el estado de las casillas y evalúa las condiciones de victoria.
* Jugador: Entidad que posee un color y ejecuta acciones sobre el tablero, delegando la obtención de datos a la capa de vista.
* Turno: Controla la lógica de alternancia entre los jugadores.

### Controlador
* TresEnRaya: Es la clase orquestadora que dirige el flujo de la partida, conectando el Modelo con las Vistas según el estado del juego.
* Juego: Punto de entrada que contiene el método main.

---

## Detalle de los Cambios Realizados

Los cambios se estructuraron en bloques lógicos para asegurar la integridad del sistema:

1. Centralización de I/O: Creación de la clase Consola para eliminar la dispersión de System.out y Scanner en el código.
2. Purificación de Coordenada y Jugador: Se eliminó la lógica de interacción de estas clases para que sean puramente representativas y funcionales dentro del dominio.
3. Separación Visual del Tablero: La lógica de impresión se movió a VistaTablero, permitiendo que el Tablero sea un componente de datos puro.
4. Refuerzo de la Lógica de Control: El controlador TresEnRaya ahora gestiona el ciclo completo de vida del juego, incluyendo una validación mejorada para asegurar que los jugadores solo muevan sus propias fichas.