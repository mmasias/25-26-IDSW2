# Reto 003 - Refactorización de TicTacToe a Principios de Diseño Modular

## Diagrama Propuesto

### Arquitectura

![](/entregas/alvaradoCarlos/images/arquitecturaTicTacToe.svg)

### Dominio

<div align=center>

![](/entregas/alvaradoCarlos/images/dominioTicTacToe.svg)

</div>

## Propuesta

Se refactorizo el proyecto [TicTacToe](https://github.com/carlos-alvarado-25/TicTacToe.git) realizado en la asignatura de Programación II, enfocandonos en los *Principios de Diseño Modular*.

Originalmente, el diseño estaba compuesto de las siguientes clases:

```java
Juego.java
Jugador.java
Tablero.java
TresEnRaya.java
Turno.java
```

Primero definimos el límite (**top-down**) del sistema, y luego iniciamos a implementar desde la capa más baja (**bottom-up**), la jerarquía que decidí es la siguiente:

```java
src/
---/com
------/TicTacToe
---------------/aplicacion
---------------/presentacion
---------------/dominio
------/Juego.java
```

En la parte de TicTacToe tenemos la clase principal `Juego` que funge como punto de entrada, y dentro tenemos la capa más alta que será la de `aplicacion`, la cual alberga las clases intermedias como controladores y los builders de las demás clases. Esta capa se habla tanto con la de `presentacion` que es la encargada de las vistas separadas y con la de `dominio` encargada de la lógica de dominio y de estado.

En el código original cada clase incluía lógica de dominio y de presentación dentro de sus clases con métodos como:

```java
public void mostrar() {
        cleanScreen();
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                System.out.print(" " + casillas[i][j]);
            }
            System.out.println();
        }
    }
```

Por lo que la primera decisión tomada fue aplicar el **Patrón Vista Separada**, y crear las vistas para las clases con lógica de presentación incrustada.

Además, en la clase `Coordenada.java` se encontraba originalmente un método `pedir()` el cual se encargaba de pedir la fila y la columna al usuario y mostrarla por pantalla. Por **Patrón Experto en la Información** sabemos que la coordenada únicacmente conoce su fila y su columna y si está vacía, pero no debería de saber como pedir su propía coordenada, ni mucho menos pedirla por pantalla, por lo que no es del todo *cohesivo* y se puede aprovechar que haremos una vista separada y delegar la lógica de pedir por pantalla a una vista, que es donde debería de ir.

Las clases a separar serían:

- Jugador.java
- Tablero.java

> No separamos `Coordenada` ya que esa clase se limita a saber su fila y su columna, pero no a saber como pedirla así que esa lógica debería ir en el que sabe pedirla, que sería el `Jugador` y ya esa vista se encargaría de instanciar la `Coordenada`.

La decisión siguiente a separar las vistas, fue implementar **Invenciones Puras** como clases intermedias para manejar tanto la lógica de dominio como la de presentación. Se creó un `ControladorJugador` el cuál gestiona el flujo de mover y de poner fichas de jugadores, utilizando la clase de domino y la clase de vista.

Dentro de esa clase se aplicaron validaciones para la capa de presentación (únicamente para mostrar mensajes por pantalla). Esto lo consideré así ya qué no sería programación defensiva al delegarlo a la capa de entrada de los datos.

Y precisamente, la tercer decisión a implementar fue aplicar **Diseño por contrato** para incluir aserciones (`asserts`), como pre condiciones a la hora de que entren acciones a la lógica de dominio. Ya que al tener las validaciones en la capa de presentación nos aseguramos o guiamos al cliente a que introduzca correctamente los datos, y con las aserciones los **garantizamos** antes de ejecutar la operación.

Así mismo, me encontré con la clase `TresEnRaya.java` la cual en el código original era la que controlaba como jugar y era la que contenía el método que se disparaba para ejecutar el juego. Por lo que, como bien se dice *controla* la convertí en el `ControladorPartida`, el se acopla a las clases del dominio, de la vista de tablero y del controlador de jugadores ya encapsulado para ejecutar exactamente la misma lógica, únicamente que ya no existen cruces entre capas como pasaba orignalmente:

#### Clase Original

```java

public class TresEnRaya {

    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;

    public TresEnRaya(){
        tablero = new Tablero();
        jugadores = new Jugador[2];
        jugadores[0] = new Jugador('x');
        jugadores[1] = new Jugador('o');
        turno = new Turno();
    }

    public void jugar() {

        do {
            tablero.mostrar();
            if (!tablero.estaCompleto(jugadores[turno.leToca()])){
                jugadores[turno.leToca()].ponerFicha(tablero);
            } else {
                jugadores[turno.leToca()].moverFicha(tablero);
            }
            turno.cambiar();
        } while(!tablero.hayTresEnRaya());
        jugadores[turno.noLeToca()].celebrar();
    }
}
```

#### Clase ControladorPartida

```java
package com.TicTacToe.aplicacion;

import com.TicTacToe.dominio.Tablero;
import com.TicTacToe.dominio.Turno;
import com.TicTacToe.aplicacion.ControladorJugador;
import com.TicTacToe.presentacion.IVistaTablero;

public class ControladorPartida {

    private final Tablero tablero;
    private final Turno turno;
    private final ControladorJugador[] jugadores;
    private final IVistaTablero vistaTablero;

    public ControladorPartida(Tablero tablero, Turno turno, ControladorJugador[] jugadores, IVistaTablero vistaTablero) {
        this.tablero = tablero;
        this.turno = turno;
        this.jugadores = jugadores;
        this.vistaTablero = vistaTablero;
    }

    public void jugar() {
        do {
            vistaTablero.mostrar(tablero);

            ControladorJugador jugadorActual = jugadores[turno.leToca()];

            if (!tablero.estaCompleto(jugadorActual.color())) {
                jugadorActual.ejecutarTurnoPoner(tablero);
            } else {
                jugadorActual.ejecutarTurnoMover(tablero);
            }

            if (!tablero.hayTresEnRaya()) {
                turno.cambiar();
            }

        } while (!tablero.hayTresEnRaya());

        vistaTablero.mostrar(tablero);
        
        jugadores[turno.leToca()].gestionarVictoria();
    }
}
```

El siguiente paso, ya que obtuvimos la separación concreta, me encontraba en el dilema de, como ensamblar las partes y apliqué el **Patrón Builder**, principalmente ya qué considerando la nueva separación el constructor iba a resultar muy ambiguo teniendo que instanciar:

- 2 Jugadores
- Vista de Jugador
- Vista de Tablero
- Turnos

Y quedaría como esto:

```java
public ControladorPartida() {
        this.tablero = new Tablero();
        this.turno = new Turno();

        this.vistaTablero = new VistaConsolaTablero(); 
        IVistaJugador vistaJugador = new VistaConsolaJugador();

        Jugador j1 = new Jugador('x');
        Jugador j2 = new Jugador('o');

        this.jugadores = new ControladorJugador[] {
            new ControladorJugador(j1, vistaJugador),
            new ControladorJugador(j2, vistaJugador)
        };
    }
```

Acoplando de nuevo todo lo que ya habíamos segmentado.

Por lo qué mi solución se enfoca en aplicar este patrón el cuál su única función es que la construcción no arruine los pasos ya aplicados:

```java
ControladorPartida partida = new PartidaBuilder()
                .conVistaTablero(new VistaConsolaTablero())
                .conVistaJugador(new VistaConsolaJugador())
                .conJugador('x')
                .conJugador('o')
                .construir();
```

Finalmente, considerando que las vistas no solo podrían ser a `Consola`, esto aumentaría el acoplamiento eferente de forma tal que ambos controladores pasarían a estar acoplados a diferentes implementaciones de vistas, por lo que aplicamos la **abstracción de interfaces**, y creamos una interfaz tanto para la vista de tableros, como para la vista de jugadores.

```java
IVistaTablero.java
IVistaJugador.java
```

Esto resuelve el problema del acoplamiento, y provoca que ahora todas las implementaciones de vistas seán estables.

Además se solucionaron problemas de cohesión encontrados en el código original. Uno muy claro es que tuve que aplicar un método de delegación en los controladores para evitar el *encadenamiento de trenes*, y exponer atributos demás a capas que no lo necesitan.

```java
public char color() {
    return jugador.color();
}
``` 