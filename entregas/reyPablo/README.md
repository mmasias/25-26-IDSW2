## RETO-003 // PABLO REY 
[Enlace al codigo TicTacToe](https://github.com/Pareyor/25-26-IDSW2/tree/reto-003/entregas/reyPablo/src)

## Explicación de los cambios
---
1. Se ha extraído toda la lógica de entrada/salida (Scanner y System.out) a una clase dedicada (Gestor). Esto permite que, si en el futuro queremos pasar de una consola a una interfaz gráfica, no tengamos que tocar la lógica de Coordenada o Tablero.
- Coordenada ahora solo representa un punto en el espacio. Antes era responsable de pedirse a sí misma por consola.
- Tablero solo gestiona el estado de la cuadrícula. Se eliminaron métodos como cleanScreen que pertenecen a la gestión de la terminal.

2. El Tablero ahora tiene un método esFichaDe(coordenada, color). En la versión anterior, el Jugador tenía que conocer cómo estaba implementada la matriz interna del tablero para saber si una ficha era suya, lo cual rompía el encapsulamiento.

3. Se han simplificado los bucles de validación y la lógica de victoria para que el código se documente a sí mismo, evitando números mágicos y estructuras anidadas complejas.
---

