
public class TresEnRaya {

    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;
    private Vista vista;

    public TresEnRaya(Vista vista) {
        this.vista = vista;
        tablero = new Tablero();
        jugadores = new Jugador[2];
        jugadores[0] = new Jugador('x');
        jugadores[1] = new Jugador('o');
        turno = new Turno();
    }

    public void jugar() {
        do {
            vista.mostrarTablero(tablero.getCasillas());
            Jugador jugadorActual = jugadores[turno.leToca()];

            if (!tablero.estaCompleto(jugadorActual)) {
                Coordenada coordenada;
                do {
                    coordenada = vista.pedirCoordenada();
                } while (!coordenada.esValida() || tablero.estaOcupado(coordenada));
                tablero.ponerFicha(coordenada, jugadorActual.color());
            } else {
                Coordenada origen;
                do {
                    vista.mostrarMensaje("Elige la ficha a mover:");
                    origen = vista.pedirCoordenada();
                } while (!origen.esValida() || tablero.estaVacio(origen));
                tablero.sacarFicha(origen);

                Coordenada destino;
                do {
                    vista.mostrarMensaje("Elige donde moverla:");
                    destino = vista.pedirCoordenada();
                } while (!destino.esValida() || tablero.estaOcupado(destino));
                tablero.ponerFicha(destino, jugadorActual.color());
            }

            turno.cambiar();
        } while (!tablero.hayTresEnRaya());

        vista.mostrarTablero(tablero.getCasillas());
        vista.mostrarGanador(jugadores[turno.noLeToca()].color());
    }
}
