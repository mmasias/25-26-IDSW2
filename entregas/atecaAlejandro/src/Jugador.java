public class Jugador {

    private char color;

    public Jugador(char color) {
        this.color = color;
    }

    public void ponerFicha(Tablero tablero, Coordenada coordenada) {
        tablero.ponerFicha(coordenada, color);
    }

    public void sacarFicha(Tablero tablero, Coordenada coordenada) {
        tablero.sacarFicha(coordenada);
    }

    public char color() {
        return color;
    }

}