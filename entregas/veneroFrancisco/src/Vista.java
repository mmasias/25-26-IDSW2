import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarTablero(Tablero tablero) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tablero.getCasilla(i, j));
            }
            System.out.println();
        }
    }

    public Coordenada pedirCoordenada(String mensaje) {
        System.out.println(mensaje);
        System.out.print("> Fila? [1..3] ");
        int fila = scanner.nextInt();
        System.out.print("> Columna? [1..3] ");
        int columna = scanner.nextInt();
        return new Coordenada(fila, columna);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

    public void mostrarVictoria(char color) {
        System.out.println("Ha ganado los " + color + "!");
    }
}