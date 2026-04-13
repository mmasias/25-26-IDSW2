import java.util.Scanner;

public class VistaConsola implements Vista {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarTablero(char[][] casillas) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                System.out.print(" " + casillas[i][j]);
            }
            System.out.println();
        }
    }

    public Coordenada pedirCoordenada() {
        System.out.print("> Fila? [1..3] ");
        int fila = scanner.nextInt();
        System.out.print("> Columna? [1..3] ");
        int columna = scanner.nextInt();
        return new Coordenada(fila, columna);
    }

    public void mostrarGanador(char color) {
        System.out.println("Hemos ganado los " + color);
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
