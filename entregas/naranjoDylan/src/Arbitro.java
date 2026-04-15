
public class Arbitro {

    public void ejecutarTurno(Partida partida) {
        Tablero tablero = partida.getTablero();
        Jugador jugador = partida.obtenerJugadorActual();
        VistaConsola vista = partida.getVista();

        if (this.esMovimientoInicial(tablero, jugador)) {
            this.colocarFicha(tablero, jugador, vista);
        } else {
            this.moverFicha(tablero, jugador, vista);
        }
    }

    public boolean esMovimientoInicial(Tablero tablero, Jugador jugador) {
        return !tablero.estaCompleto(jugador);
    }

    public boolean hayGanador(Tablero tablero) {
        return tablero.hayTresEnRaya('x') || tablero.hayTresEnRaya('o');
    }

    public boolean validarOrigen(Tablero tablero, Coordenada coordenada, Jugador jugador) {
        return coordenada.esValida() && tablero.obtenerColor(coordenada) == jugador.color();
    }

    public boolean validarDestino(Tablero tablero, Coordenada coordenada) {
        return coordenada.esValida() && tablero.estaVacio(coordenada);
    }

    private void colocarFicha(Tablero tablero, Jugador jugador, VistaConsola vista) {
        Coordenada destino = this.pedirDestinoValido(tablero, jugador, vista);
        tablero.ponerFicha(destino, jugador.color());
    }

    private void moverFicha(Tablero tablero, Jugador jugador, VistaConsola vista) {
        Coordenada origen = this.pedirOrigenValido(tablero, jugador, vista);
        tablero.sacarFicha(origen);

        Coordenada destino = this.pedirDestinoValido(tablero, jugador, vista);
        tablero.ponerFicha(destino, jugador.color());
    }

    private Coordenada pedirOrigenValido(Tablero tablero, Jugador jugador, VistaConsola vista) {
        Coordenada origen;

        do {
            origen = vista.pedirCoordenada(
                    "Jugador " + jugador.color() + " - Introduzca la ficha que desea mover"
            );

            if (!this.validarOrigen(tablero, origen, jugador)) {
                vista.mostrarError("Debe seleccionar una ficha propia y valida.");
            }
        } while (!this.validarOrigen(tablero, origen, jugador));

        return origen;
    }

    private Coordenada pedirDestinoValido(Tablero tablero, Jugador jugador, VistaConsola vista) {
        Coordenada destino;

        do {
            destino = vista.pedirCoordenada(
                    "Jugador " + jugador.color() + " - Introduzca la posicion destino"
            );

            if (!this.validarDestino(tablero, destino)) {
                vista.mostrarError("La coordenada no es valida o la casilla esta ocupada.");
            }
        } while (!this.validarDestino(tablero, destino));

        return destino;
    }
}
