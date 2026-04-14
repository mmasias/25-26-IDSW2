# Refactorización 

## Qué se ha hecho

Se ha refactorizado el código original aplicando principios de diseño modular para mejorar la cohesión y reducir el acoplamiento.

## Cambios principales

- Se ha eliminado el uso de `Scanner` y `System.out` del modelo.
- Se ha creado una interfaz `VistaJuego` y su implementación `VistaConsola` para separar la interacción con el usuario.
- `Coordenada` ahora solo representa datos, no pide entrada.
- `Jugador` obtiene coordenadas a través de la vista.
- `Tablero` delega la visualización en la vista.
- `TresEnRaya` coordina el juego sin depender de detalles de entrada o salida.

