public class TresEnRaya {

    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;

    public TresEnRaya() {
        tablero   = new Tablero();
        jugadores = new Jugador[]{ new Jugador('x'), new Jugador('o') };
        turno     = new Turno(jugadores);
    }

    public void jugar() {
        do {
            tablero.mostrar();
            Jugador actual = turno.jugadorActual();
            if (!tablero.estaCompleto(actual.color())) {
                actual.ponerFicha(tablero);
            } else {
                actual.moverFicha(tablero);
            }
            turno.cambiar();
        } while (!tablero.hayTresEnRaya());

        turno.jugadorAnterior().celebrar();
    }
}