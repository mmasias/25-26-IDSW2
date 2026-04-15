class TresEnRaya {

    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;
    private VistaTablero vista;

    public TresEnRaya(VistaTablero vista, Tablero tablero, Turno turno, Jugador[] jugadores) {
        this.tablero = tablero;
        this.jugadores = jugadores;
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
