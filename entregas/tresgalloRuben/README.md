[Enlace al codigo TicTacToe](https://github.com/rubentresgallob/25-26-IDSW2/tree/reto-003/entregas/tresgalloRuben/src)

# Refactorización del Tres en Raya — Patrones de indirección

El objetivo de esta refactorización es reducir el acoplamiento entre componentes aplicando patrones de indirección, introduciendo intermediarios con responsabilidades claras que desacoplen el dominio de la presentación y el control.

El problema principal del código original era que el modelo conocía demasiado: `Tablero` imprimía por consola, `Coordenada` leía del teclado con `Scanner`, y `Jugador` coordinaba toda la interacción del turno. Cualquier cambio en la interfaz obligaba a tocar el dominio.

---

## Vista separada (MVC)

Se extrae toda la presentación a una interfaz `VistaTresEnRaya` con su implementación `VistaTresEnRayaConsola`. Ahora `Tablero` ya no imprime ni limpia la pantalla, y `Coordenada` deja de usar `Scanner`: se convierte en un *value object* inmutable que solo contiene datos (`fila`, `columna`) y los valida con `esValidaPara(int dimension)`. La vista es quien pide coordenadas al usuario. Esto permite sustituir la consola por cualquier otra interfaz sin tocar el dominio.

---

## Controlador

Se crea `ControladorTresEnRaya`, que coordina la interacción entre el modelo y la vista: muestra el tablero, indica de quién es el turno, pide coordenadas, ejecuta las acciones y gestiona errores. El bucle principal del juego, que antes vivía en `TresEnRaya.jugar()`, pasa al controlador. El modelo ya solo expone operaciones de dominio (`colocarFicha`, `moverFicha`, `hayGanador`, `pasarTurno`), sin saber nada de cómo se presenta ni cómo se introduce la información.

---

## Invención pura

Se crea `ReglasTresEnRaya`, una clase que no representa ninguna entidad del dominio real sino que encapsula las reglas del juego: la dimensión del tablero, el máximo de fichas por jugador y la detección del tres en raya. Antes esa lógica estaba repartida entre `Tablero` y `TresEnRaya`. Al centralizarla en una clase de servicio, cambiar cualquier regla (dimensión, condición de victoria, número de fichas) afecta únicamente a esta clase.

---

## Creador (composition root)

`Juego.main` asume el rol de creador: construye y ensambla todas las dependencias (`ReglasTresEnRaya`, `Tablero`, `Jugador[]`, `Turno`, `TresEnRaya`, `VistaTresEnRayaConsola`, `ControladorTresEnRaya`). Antes el dominio se auto-instanciaba con dependencias concretas; ahora la construcción está centralizada y el dominio recibe lo que necesita por constructor.

---

## Otras correcciones

`Jugador` queda reducido a entidad mínima: solo guarda su ficha. Los métodos `ponerFicha`, `moverFicha` y `celebrar` desaparecen porque esa responsabilidad pertenece al controlador y a la vista respectivamente. `Turno` deja de tener el número de jugadores hardcodeado y lo recibe por parámetro. Además se corrige un bug del código original: en `moverFicha` no se comprobaba que la ficha a mover fuese del jugador actual, por lo que era posible retirar fichas del rival. Ahora el modelo valida explícitamente que el origen contenga una ficha propia antes de ejecutar el movimiento.
