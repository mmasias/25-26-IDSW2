package src;

public class Jugador {
    private char color;
    private ConsoleIO io;

    public Jugador(char color, ConsoleIO io) {
        this.color = color;
        this.io = io;
    }

    public Coordenada pedirCoordenada(String mensaje) {
        io.escribirLinea(mensaje);
        int f = io.leerEntero("> Fila? [1..3] ");
        int c = io.leerEntero("> Columna? [1..3] ");
        return new Coordenada(f, c);
    }

    public void celebrar() {
        io.escribirLinea("Hemos ganado los " + color); 
    }

    public char getColor() { return color; }
}