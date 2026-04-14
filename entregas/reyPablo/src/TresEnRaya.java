public class TresEnRaya {
    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;

    public TresEnRaya() {
        tablero = new Tablero();
        jugadores = new Jugador[]{new Jugador('x'), new Jugador('o')};
        turno = new Turno();
    }

    public void jugar() {
        do {
            tablero.mostrar();
            Jugador actual = jugadores[turno.leToca()];
            if (!tablero.estaCompleto(actual)) {
                actual.ponerFicha(tablero);
            } else {
                actual.moverFicha(tablero);
            }
            if (tablero.hayTresEnRaya()) break;
            turno.cambiar();
        } while (true);
        
        tablero.mostrar();
        jugadores[turno.leToca()].celebrar();
    }
}