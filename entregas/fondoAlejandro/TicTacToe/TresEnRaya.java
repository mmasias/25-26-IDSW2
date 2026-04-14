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
            VistaTablero.mostrar(tablero);
            Jugador jugadorActual = jugadores[turno.leToca()];
            
            if (!tablero.estaCompleto(jugadorActual)){
                jugadorActual.ponerFicha(tablero);
            } else {
                jugadorActual.moverFicha(tablero);
            }
            turno.cambiar();
        } while(!tablero.hayTresEnRaya());
        
        VistaTablero.mostrar(tablero); // Mostrar el tablero final
        VistaJugador.celebrar(jugadores[turno.noLeToca()].getColor());
    }
}