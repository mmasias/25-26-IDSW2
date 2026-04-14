import java.util.Scanner;

public class VistaConsola implements Vista {
    
    private Scanner scanner;

    public VistaConsola() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void mostrarTablero(Tablero tablero) {
        cleanScreen();
        for (int i = 0; i < tablero.getDimension(); i++) {
            for (int j = 0; j < tablero.getDimension(); j++) {
                System.out.print(" " + tablero.getCasilla(i, j));
            }
            System.out.println();
        }
    }

    @Override
    public Coordenada pedirCoordenada(String mensaje) {
        System.out.println(mensaje);
        System.out.print("> Fila? [1..3] ");
        int fila = scanner.nextInt();
        System.out.print("> Columna? [1..3] ");
        int columna = scanner.nextInt();
        return new Coordenada(fila, columna);
    }

    @Override
    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

    @Override
    public void celebrarVictoria(Jugador jugador) {
        System.out.println("Hemos ganado los " + jugador.color());
    }
    
    private void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
