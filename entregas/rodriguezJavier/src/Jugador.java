public class Jugador {
    private char color;
    private Consola consola;

    public Jugador(char color, Consola consola) {
        this.color = color;
        this.consola = consola;
    }

    public Coordenada elegirCasilla() {
        return consola.pedirCoordenada();
    }

    public char getColor() {
        return color;
    }
}