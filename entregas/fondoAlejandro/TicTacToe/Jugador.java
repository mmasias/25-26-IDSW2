public class Jugador {

    private char color;

    public Jugador(char color) {
        this.color = color;
    }

    public void ponerFicha(Tablero tablero) {
        Coordenada coordenada;
        do {
            coordenada = VistaJugador.pedirCoordenada(color);
            if (tablero.estaOcupado(coordenada)) {
                Consola.imprimirLinea("La casilla está ocupada.");
            }
        } while (tablero.estaOcupado(coordenada));
        
        tablero.ponerFicha(coordenada, color);
    }

    public void moverFicha(Tablero tablero) {
        Consola.imprimirLinea("Fase de movimiento. Selecciona ficha a mover:");
        Coordenada origen;
        do {
            origen = VistaJugador.pedirCoordenada(color);
            if (tablero.estaVacio(origen)) {
                Consola.imprimirLinea("No hay una ficha en esa coordenada.");
            }
        } while (tablero.estaVacio(origen));
        
        tablero.sacarFicha(origen);
        
        Consola.imprimirLinea("Selecciona destino:");
        this.ponerFicha(tablero);
    }

    public void celebrar() {
        VistaJugador.celebrar(color);
    }

    public char color() {
        return color;
    }
}