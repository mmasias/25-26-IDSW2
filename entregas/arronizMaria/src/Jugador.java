public class Jugador implements IJugador {

    private final char color;
    private final java.util.Scanner scanner = new java.util.Scanner(System.in);

    public Jugador(char color) {
        this.color = color;
    }

    @Override
    public Coordenada elegirCoordenada(ITablero tablero) {
        Coordenada c;
        do {
            int fila = leerEntero("> Fila? [1..3] ");
            int col  = leerEntero("> Columna? [1..3] ");
            if (!Coordenada.esValida(fila, col)) {
                System.out.println("Coordenada fuera de rango, repite.");
                continue;
            }
            c = new Coordenada(fila, col);
            if (tablero.estaOcupado(c))
                System.out.println("Casilla ocupada, elige otra.");
            else
                return c;
        } while (true);
    }

    @Override
    public char color() { return color; }

    private int leerEntero(String prompt) {
        System.out.print(prompt);
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}