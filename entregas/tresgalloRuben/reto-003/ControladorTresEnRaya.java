public class ControladorTresEnRaya {

    private final TresEnRaya juego;
    private final VistaTresEnRaya vista;

    public ControladorTresEnRaya(TresEnRaya juego, VistaTresEnRaya vista) {
        this.juego = juego;
        this.vista = vista;
    }

    public void iniciar() {
        while (true) {
            vista.limpiarPantalla();
            vista.mostrarTablero(juego.tablero());

            Jugador actual = juego.jugadorActual();
            boolean debeMover = juego.debeMover(actual);
            vista.mostrarTurno(actual, debeMover);

            if (!debeMover) {
                ejecutarColocacion(actual);
            } else {
                ejecutarMovimiento(actual);
            }

            if (juego.hayGanador(actual)) {
                vista.limpiarPantalla();
                vista.mostrarTablero(juego.tablero());
                vista.mostrarGanador(actual);
                return;
            }

            juego.pasarTurno();
        }
    }

    private void ejecutarColocacion(Jugador jugador) {
        while (true) {
            try {
                Coordenada destino = vista.pedirCoordenada("¿Dónde quieres colocar?", juego.dimension());
                juego.colocarFicha(jugador, destino);
                return;
            } catch (RuntimeException e) {
                vista.mostrarError(e.getMessage());
            }
        }
    }

    private void ejecutarMovimiento(Jugador jugador) {
        while (true) {
            try {
                Coordenada origen = vista.pedirCoordenada("¿Qué ficha quieres mover? (origen)", juego.dimension());
                Coordenada destino = vista.pedirCoordenada("¿A dónde la mueves? (destino)", juego.dimension());
                juego.moverFicha(jugador, origen, destino);
                return;
            } catch (RuntimeException e) {
                vista.mostrarError(e.getMessage());
            }
        }
    }
}