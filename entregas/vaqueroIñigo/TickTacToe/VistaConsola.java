import java.util.Scanner;

public class VistaConsola implements VistaJuego {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public Coordenada pedirCoordenada() {
        int fila, columna;

        do {
            System.out.print("> Fila [1..3]: ");
            fila = scanner.nextInt();
            System.out.print("> Columna [1..3]: ");
            columna = scanner.nextInt();
        } while (fila < 1 || fila > 3 || columna < 1 || columna > 3);

        return new Coordenada(fila, columna);
    }

    @Override
    public void mostrarTablero(char[][] casillas) {
        System.out.println();
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                System.out.print(" " + casillas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void mostrarGanador(char color) {
        System.out.println("Hemos ganado los " + color);
    }
}