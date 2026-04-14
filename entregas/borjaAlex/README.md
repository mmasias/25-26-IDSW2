# Variaciones alrededor del TicTacToe OO

## Requisitos

El programa a resolver debe permitir a dos usuarios jugar el tic tac toe (tres en raya)

<div align=center>

<table>
  <tr><th>Inicio</th><th>Juego en desarrollo</th><th>Fin del juego</th></tr>
<tr>
<td>

```
_ _ _ 
_ _ _ 
_ _ _ 
> Fila? [1..3]
```
</td>
<td>

```
_ _ o 
x o x 
_ _ o 
> Fila? [1..3]
```
</td>
<td>

```
x _ o 
x o x 
o _ _ 
Hemos ganado los o
```    
</td>
</tr>
</table>

</div>

- Inicialmente el tablero estará vacío.
- Los jugadores pondrán las fichas alternativamente, siendo posible alcanzar las "Tres en Raya" con la quinta puesta.
- En caso contrario, una vez puestas las 6 fichas, se moverán las fichas alternativamente.
- Tanto en las puestas como en los movimientos, se deben requerir las coordenadas a usuario validando la corrección de la puesta/movimiento.
- Se debe detectar automáticamente la finalización del juego al lograrse "Tres en Raya": tras la quinta y sexta puesta y tras cada movimiento.



## Desarrollo

### Primera iteración

- [x] Definir la clase: ***TresEnRaya***
- [x] Definir la interfaz: ***jugar()***
- [x] Definir los atributos que hacen falta para realizar la operación de la clase: jugar()
  - [x] Tablero - 1 tablero
  - [x] Jugador - 2 jugadores
  - [x] Turno - 1 turno
- [x]  Codificar los métodos
  - [x] Mostrar el tablero
  - [x] Que al que le toca ponga una ficha
  - [x] Lo anterior se debe repetir hasta que haya tres en raya
  - [x] Pero además hay que cambiar el turno
  - [x] Y validar que luego de colocar tres veces, lo que debe hacer es mover en lugar de poner
  - [x] Si alguien ha ganado, que celebre

> Creamos las clases, métodos y demás que derivan de estas clases (puede ser durante la construcción o al final de la misma).

Recapitulamos, vemos las clases creadas y elegimos una clase para continuar

### Segunda iteración

- [x] Elegir una clase: ***Tablero***
- [x] Definir la interfaz: en este caso, los métodos ya están dados.
- [x] Definir los atributos necesarios para cumplir con los métodos anteriormente indicados (*mostrar, ver si un jugador ya puso todas sus fichas y ver si hay tres en raya*)
  - [x] Almacenaremos las fichas en un array de caracteres.
  - [x] Inicializamos el array en el constructor
- [x] Codificar los métodos
  - [x] Codificamos el método que muestra el tablero: ***mostrar()***
  - [x] Codificamos el método que devuelve si hay tres en raya
    - [x] Apoyándome de un método privado que valida si hay tres en raya para un jugador.
  - [x] Codificamos el método que indica si el jugador ya puso todas sus fichas.

Recapitulamos, vemos las clases que quedan pendientes y elegimos la que sigue.

---

### Tercera iteración

- [x] Elegir la clase: ***Turno***
- [x] Definimos/leemos la interfaz: a quién le toca, a quién no le toca y cambio de turno.
- [x] Definimos los atributos para cumplir con los métodos anteriormente indicados.
  - [x] Almacenaremos el turno en un entero.
- [x] Codificamos el metodo que devuelve a quién le toca: ***toca()***
- [x] Codificamos el metodo que devuelve a quién no le toca: ***noToca()***
- [x] Codificamos el metodo que cambia el turno: ***cambiar()***

Recapitulamos, vemos la última clase pendiente y empezamos:

### Cuarta iteración

- [x] Elegimos la clase: ***Jugador***
- [x] Definimos/leemos la interfaz: devolver el color, poner ficha, mover ficha y celebrar
- [x] Definimos los atributos para cumplir con los métodos anteriormente indicados.
  - [x] El color de la ficha
- [x] Codificamos los métodos
  - [x] Codificamos el metodo que devuelve el color del jugador
  - [x] Codificamos el metodo que celebra la victoria
  - [x] Codificamos el metodo que permite poner una ficha
  - [x] Codificamos el metodo que permite mover una ficha

> En la siguiente iteración crearemos (y ajustaremos) las clases, métodos y demás que derivan de estas clases (puede ser durante la construcción o al final de la misma). En este caso, la clase Coordenada y los métodos de la clase Tablero.

### Quinta iteración

- [x] Elegimos la clase: Tablero
- [x] Definimos/leemos la interfaz: nuevos métodos derivados de la iteración anterior.
- [x] Definimos los atributos para cumplir con los métodos anteriormente indicados.
  - [x] Ninguno
- [x] Codificamos los métodos
  - [x] Codificamos el método que indica si una casilla está ocupada
  - [x] Codificamos el método que indica si una casilla está vacía
  - [x] Codificamos el método que permite poner una ficha
  - [x] Codificamos el método que permite retirar una ficha

### Sexta iteración

- [x] Elegimos la clase: Coordenada
- [x] Definimos/leemos la interfaz: Recoger datos, indicar si es válida, indicar fila, indicar columna.
- [x] Definimos los atributos para cumplir con los métodos anteriormente indicados.
  - [x] la fila y la columna
- [x] Codificamos los métodos
  - [x] Codificamos el método que recoge los datos de una coordenada
  - [x] Codificamos el método que indica si los datos pertenecen a una coordenada válida
  - [x] Codificamos el método que devuelven la fila
  - [x] Codificamos el método que devuelven la columna

