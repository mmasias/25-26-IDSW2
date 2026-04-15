# Reto 003: Refactorización del Tres en Raya (Diseño Modular)

## Objetivo de la entrega
El objetivo de esta entrega es refactorizar la implementación base del juego "Tres en Raya" para aplicar principios de diseño modular, mejorando la **cohesión** de las clases y reduciendo el **acoplamiento**, separando estrictamente la lógica de dominio (reglas del juego) de la lógica de presentación (interacción por consola).

## Explicación de la Solución y Arquitectura

Para lograr un adecuado reparto de responsabilidades (Principio de Responsabilidad Única - SRP), he realizado los siguientes cambios:

1. **Aplicación de Indirección (GestorIO):**
   - Creé la clase `GestorIO` para centralizar toda la entrada y salida de datos por consola (`Scanner` y `System.out`). 
   - Ninguna clase del dominio conoce cómo se imprimen los datos ni cómo se leen, lo que permite que el juego sea independiente de la interfaz de usuario.

2. **Cohesión en el Dominio:**
   - **`Coordenada`**: Eliminé su método `pedir()`. Ahora es una clase puramente de datos que solo almacena e indica si una posición matemática es válida.
   - **`Tablero`**: Eliminé su método `mostrar()`. Su única responsabilidad ahora es gestionar el estado de la matriz de casillas. Se añadió `getFicha()` para permitir lecturas externas sin romper el encapsulamiento. Además, se desacopló de la clase `Jugador` recibiendo únicamente caracteres (`char`).

3. **Inyección de Dependencias:**
   - La clase `TresEnRaya` ahora actúa como orquestador principal, instanciando `GestorIO` y pasándolo por parámetro a los métodos de `Jugador` (`ponerFicha`, `moverFicha`, `celebrar`). 
   - `TresEnRaya` asume la responsabilidad de pintar el tablero apoyándose en `GestorIO` y `Tablero`.