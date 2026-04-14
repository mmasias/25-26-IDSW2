public class TresEnRaya {

    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;
    private Vista vista; 

    public TresEnRaya(Vista vista){
        this.vista = vista;
        this.tablero = new Tablero();
        this.jugadores = new Jugador[2];
        this.jugadores[0] = new Jugador('x');
        this.jugadores[1] = new Jugador('o');
        this.turno = new Turno();
    }

    public void jugar() {
        do {
            vista.mostrarTablero(tablero);
            Jugador jugadorActual = jugadores[turno.leToca()];

            if (!tablero.estaCompleto(jugadorActual)){
                realizarPuesta(jugadorActual);
            } else {
                realizarMovimiento(jugadorActual);
            }
            turno.cambiar();
            
        } while(!tablero.hayTresEnRaya());
        
        vista.mostrarTablero(tablero); 
        vista.mostrarVictoria(jugadores[turno.noLeToca()].color());
    }

    private void realizarPuesta(Jugador jugador) {
        Coordenada c;
        boolean valida = false;
        while (!valida) {
            c = vista.pedirCoordenada("> Turno de " + jugador.color() + " (Poner ficha)");
            if (c.esValida() && tablero.estaVacio(c)) {
                jugador.ponerFicha(tablero, c);
                valida = true;
            } else {
                vista.mostrarError("Coordenada inválida o casilla ocupada.");
            }
        }
    }

    private void realizarMovimiento(Jugador jugador) {
        Coordenada origen;
        boolean origenValido = false;
        while (!origenValido) {
            origen = vista.pedirCoordenada("> Turno de " + jugador.color() + " (Quitar ficha)");
            if (origen.esValida() && !tablero.estaVacio(origen)) {
                jugador.sacarFicha(tablero, origen);
                origenValido = true;
            } else {
                vista.mostrarError("No puedes quitar ficha de ahí.");
            }
        }

        realizarPuesta(jugador); 
    }
}