public class ControladorJuego {
    private final Tablero tablero;
    private final Jugador[] jugadores;
    private final Turno turno;
    private final Vista vista;

    public ControladorJuego(Vista vista) {
        this.vista = vista;
        this.tablero = new Tablero();
        this.jugadores = new Jugador[]{new Jugador('x'), new Jugador('o')};
        this.turno = new Turno();
    }

    public void iniciar() {
        do {
            vista.mostrarTablero(tablero.getEstado());
            Jugador actual = jugadores[turno.leToca()];
            vista.mostrarMensaje("Turno del jugador: " + actual.getColor());

            if (!tablero.estaCompleto(actual)) {
                ejecutarPuesta(actual);
            } else {
                ejecutarMovimiento(actual);
            }
            
            if (!tablero.hayTresEnRaya()) {
                turno.cambiar();
            }
        } while (!tablero.hayTresEnRaya());

        vista.mostrarTablero(tablero.getEstado());
        vista.mostrarMensaje("¡Hemos ganado los " + jugadores[turno.leToca()].getColor() + "!");
    }

    private void ejecutarPuesta(Jugador actual) {
        Coordenada c;
        do {
            c = vista.pedirCoordenada("Indica dónde poner tu ficha:");
            if (!c.esValida() || tablero.estaOcupado(c)) {
                vista.mostrarMensaje("Coordenada inválida u ocupada. Intenta de nuevo.");
            }
        } while (!c.esValida() || tablero.estaOcupado(c));
        tablero.ponerFicha(c, actual.getColor());
    }

    private void ejecutarMovimiento(Jugador actual) {
        Coordenada origen;
        do {
            origen = vista.pedirCoordenada("Indica qué ficha tuya quieres mover (origen):");
        } while (!origen.esValida() || !tablero.estaOcupado(origen)); 
        
        tablero.sacarFicha(origen);

        ejecutarPuesta(actual);
    }
}