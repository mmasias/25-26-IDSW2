public class TresEnRaya {
    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;
    private Consola consola;

    public TresEnRaya() {
        tablero = new Tablero();
        consola = new Consola();
        jugadores = new Jugador[2];
        jugadores[0] = new Jugador('x', consola);
        jugadores[1] = new Jugador('o', consola);
        turno = new Turno();
    }

    public void jugar() {
        do {
            consola.mostrarTablero(tablero.getCasillas());
            Jugador jugadorActual = jugadores[turno.leToca()];
            
            if (!tablero.estaCompleto(jugadorActual.getColor())) {
                realizarPuesta(jugadorActual);
            } else {
                realizarMovimiento(jugadorActual);
            }
            
            turno.cambiar();
        } while (!tablero.hayTresEnRaya());
        
        consola.mostrarTablero(tablero.getCasillas());
        consola.mostrarVictoria(jugadores[turno.noLeToca()].getColor());
    }

    private void realizarPuesta(Jugador jugador) {
        Coordenada coordenada;
        do {
            coordenada = jugador.elegirCasilla();
        } while (tablero.estaOcupado(coordenada));
        
        tablero.ponerFicha(coordenada, jugador.getColor());
    }

    private void realizarMovimiento(Jugador jugador) {
        Coordenada origen;
        do {
            origen = jugador.elegirCasilla();
        } while (!tablero.estaOcupado(origen)); 
        
        tablero.sacarFicha(origen);
        
        Coordenada destino;
        do {
            destino = jugador.elegirCasilla();
        } while (tablero.estaOcupado(destino));
        
        tablero.ponerFicha(destino, jugador.getColor());
    }
}