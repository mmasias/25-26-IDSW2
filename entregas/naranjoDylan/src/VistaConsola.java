
import java.util.Scanner;

public class VistaConsola {

    private final Scanner scanner;

    public VistaConsola() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarTablero(Tablero tablero) {
        this.limpiarPantalla();

        for (int fila = 1; fila <= Tablero.DIMENSION; fila++) {
            for (int columna = 1; columna <= Tablero.DIMENSION; columna++) {
                Coordenada coordenada = new Coordenada(fila, columna);
                System.out.print(" " + tablero.obtenerColor(coordenada));
            }
            System.out.println();
        }
    }

    public Coordenada pedirCoordenada(String mensaje) {
        System.out.println(mensaje);
        int fila = this.pedirEntero("> Fila? [1..3] ");
        int columna = this.pedirEntero("> Columna? [1..3] ");
        return new Coordenada(fila, columna);
    }

    public void mostrarGanador(Jugador jugador) {
        if (jugador != null) {
            System.out.println("Hemos ganado los " + jugador.color());
        }
    }

    public void mostrarError(String mensaje) {
        System.out.println(mensaje);
    }

    private int pedirEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);

            if (this.scanner.hasNextInt()) {
                return this.scanner.nextInt();
            }

            System.out.println("Debe introducir un numero entero.");
            this.scanner.next();
        }
    }

    private void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
