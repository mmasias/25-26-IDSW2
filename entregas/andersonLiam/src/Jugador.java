public class Jugador {

    private char color;

    public Jugador(char color) {
        this.color = color;
    }

    public void ponerFicha(Tablero tablero) {
        Coordenada coordenada;
        do {
            coordenada = Consola.pedirCoordenada();
        } while (tablero.estaOcupado(coordenada));
        tablero.ponerFicha(coordenada, color);
    }

    public void moverFicha(Tablero tablero) {
        Coordenada coordenada;
        do {
            coordenada = Consola.pedirCoordenada();
        } while (tablero.estaVacio(coordenada));
        tablero.sacarFicha(coordenada);
        ponerFicha(tablero);
    }

    public void celebrar() {
        Consola.mostrarMensaje("¡Han ganado los " + color + "!");
    }

    public char color() {
        return color;
    }
}