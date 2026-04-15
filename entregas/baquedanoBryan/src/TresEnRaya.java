class TresEnRaya {

    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;
    private VistaTablero vista;

    public TresEnRaya(VistaTablero vista, Tablero tablero, Turno turno) {
        this.tablero = tablero;
        jugadores = new Jugador[2];
        jugadores[0] = new Jugador('x');
        jugadores[1] = new Jugador('o');
        this.turno = turno;
        this.vista = vista;
    }

    public void jugar() {
        do {
            vista.mostrar(tablero);
            if (!tablero.estaCompleto(jugadores[turno.toca()])) {
                jugadores[turno.toca()].ponerFicha(tablero, this.vista);
            } else {
                jugadores[turno.toca()].moverFicha(tablero, this.vista);
            }
            turno.cambiar();
        } while(!tablero.hayTresEnRaya());

        vista.mostrar(tablero);
        jugadores[turno.noLeToca()].celebrar(this.vista);
    }
}
