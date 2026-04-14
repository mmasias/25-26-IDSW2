package tresEnRaya.modelo;

public class Jugador {

    private final char color;

    public Jugador(char color) {
        this.color = color;
    }

    public void ponerFicha(Tablero tablero, Coordenada coordenada) {
        tablero.ponerFicha(coordenada, color);
    }

    public void sacarFicha(Tablero tablero, Coordenada coordenada) {
        tablero.sacarFicha(coordenada);
    }

    public void celebrar() {
        System.out.println("Hemos ganado los " + color);
    }

    public char color() {
        return color;
    }

}
