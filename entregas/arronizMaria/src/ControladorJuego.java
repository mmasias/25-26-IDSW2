public class ControladorJuego {
    private final ITablero tablero;
    private final IVista vista;
    private final IJugador[] jugadores;
    private final Turno turno;

    public ControladorJuego(ITablero tablero, IVista vista, IJugador... jugadores) {
        assert tablero != null   : "Precondición: tablero no nulo";
        assert vista != null     : "Precondición: vista no nula";
        assert jugadores.length == 2 : "Precondición: exactamente 2 jugadores";
        this.tablero   = tablero;
        this.vista     = vista;
        this.jugadores = jugadores;
        this.turno     = new Turno();
    }

    public void jugar() {
        do {
            vista.mostrarTablero(tablero.getCasillas());
            IJugador actual = jugadores[turno.leToca()];
            if (!tablero.estaCompleto(actual.color())) {
                Coordenada c = actual.elegirCoordenada(tablero);
                tablero.ponerFicha(c, actual.color());
            } else {
                Coordenada origen = actual.elegirCoordenada(tablero);
                tablero.sacarFicha(origen);
                Coordenada destino = actual.elegirCoordenada(tablero);
                tablero.ponerFicha(destino, actual.color());
            }
            turno.cambiar();
        } while (!tablero.hayTresEnRaya());

        vista.mostrarTablero(tablero.getCasillas());
        vista.mostrarGanador(jugadores[turno.leToca()].color());
    }
}