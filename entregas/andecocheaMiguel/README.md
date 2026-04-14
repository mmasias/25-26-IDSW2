# TicTacToe OO: Refactorización Modular

## Principios de Diseño Aplicados

### 1. Patrón de Indirección
Se ha introducido la clase `ConsoleIO` como un objeto intermedio. 
- **Antes**: Las clases de lógica (`Jugador`, `Coordenada`) dependían directamente de `Scanner` y `System.out`.
- **Ahora**: Existe una capa de indirección. Si se desea cambiar la consola por una interfaz gráfica, solo se debe modificar `ConsoleIO`, manteniendo intacta la lógica del juego.

### 2. Alta Cohesión 
Se ha aplicado el Principio de Responsabilidad Única:
- **Tablero**: Ya no se encarga de imprimirse. Solo gestiona el estado de las fichas y la lógica de victoria.
- **TableroView**: Clase nueva encargada exclusivamente de la representación visual.
- **Coordenada**: Ha pasado de ser una clase con lógica de entrada a un **Value Object** puro.

### 3. Inyección de Dependencias
Las dependencias (como el canal de comunicación `ConsoleIO`) se pasan a través de los constructores. Esto facilita la mantenibilidad y permite realizar pruebas unitarias sin depender de la entrada real por teclado.

---

