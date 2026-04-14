class TresEnRaya {

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
            if (!tablero.estaCompleto(jugadores[turno.toca()])) {
                jugadores[turno.toca()].ponerFicha(tablero);
            } else {
                jugadores[turno.toca()].moverFicha(tablero);
            }
            turno.cambiar();
        } while(!tablero.hayTresEnRaya());

        tablero.mostrar();
        jugadores[turno.noLeToca()].celebrar();
    }
}
