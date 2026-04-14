import java.util.Scanner;

public class VistaTresEnRayaConsola implements VistaTresEnRaya {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    @Override
    public void mostrarTablero(Tablero tablero) {
        for (int i = 1; i <= tablero.dimension(); i++) {
            for (int j = 1; j <= tablero.dimension(); j++) {
                System.out.print(" " + tablero.valorEn(new Coordenada(i, j)));
            }
            System.out.println();
        }
    }

    @Override
    public void mostrarTurno(Jugador jugador, boolean debeMover) {
        System.out.println();
        System.out.println("Turno de: " + jugador.ficha() + " (" + (debeMover ? "mover" : "colocar") + ")");
    }

    @Override
    public Coordenada pedirCoordenada(String mensaje, int dimension) {
        System.out.println(mensaje);
        int fila = pedirEntero("> Fila? [1.." + dimension + "] ");
        int col = pedirEntero("> Columna? [1.." + dimension + "] ");
        return new Coordenada(fila, col);
    }

    @Override
    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
        System.out.println("Pulsa ENTER para continuar...");
        scanner.nextLine();
    }

    @Override
    public void mostrarGanador(Jugador jugador) {
        System.out.println();
        System.out.println("Hemos ganado los " + jugador.ficha());
    }

    private int pedirEntero(String prompt) {
        while (true) {
            System.out.print(prompt);
            String linea = scanner.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número válido.");
            }
        }
    }
}