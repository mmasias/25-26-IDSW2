# Reto 003 - Refactorización modular de TicTacToe

## Autor
Tu Nombre y Apellido

## Objetivo
A partir de la implementación del TicTacToe realizada previamente, se aplica diseño modular para mejorar la cohesión del sistema y reducir el acoplamiento entre clases, haciendo especial énfasis en los patrones de indirección.

## Estructura de la entrega

- [`/src`](./src): código fuente Java del sistema refactorizado.
- [`/modelosUML`](./modelosUML): código fuente de los diagramas en PlantUML.
- [`/images`](./images): imágenes exportadas de los diagramas UML.

## Solución propuesta

La implementación original mezclaba responsabilidades de dominio, interacción por consola y control del flujo del juego.

En esta nueva solución se separan dichas responsabilidades:

- **`Tablero`**: mantiene el estado del juego.
- **`Jugador`**: representa al jugador y su ficha.
- **`Coordenada`**: encapsula una posición del tablero.
- **`Turno`**: administra el turno actual.
- **`VistaConsola`**: se encarga exclusivamente de la interacción con el usuario.
- **`Arbitro`**: concentra las reglas del juego y actúa como intermediario.
- **`Partida`**: coordina los componentes principales.
- **`TresEnRaya`**: arranca la ejecución del juego.

## Mejora principal

Se introduce **indirección** mediante la clase `Arbitro`, evitando que las clases del dominio dependan directamente de la consola o de la lógica de control. Esto mejora la cohesión y facilita futuras extensiones.

## Artefactos incluidos

- [Código fuente](./src)
- [Diagrama UML](./modelosUML/diagramaClases.puml)