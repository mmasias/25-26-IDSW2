import java.util.Scanner;

public class Consola {
    private Scanner scanner;

    public Consola() {
        this.scanner = new Scanner(System.in);
    }

    public Coordenada pedirCoordenada() {
        int fila, columna;
        do {
            System.out.print("> Fila? [1..3] ");
            fila = scanner.nextInt();
            System.out.print("> Columna? [1..3] ");
            columna = scanner.nextInt();
        } while (!esValida(fila, columna));
        
        return new Coordenada(fila, columna);
    }

    private boolean esValida(int fila, int columna) {
        return (fila >= 1 && fila <= 3 && columna >= 1 && columna <= 3);
    }

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

    public void mostrarVictoria(char color) {
        System.out.println("¡Hemos ganado los " + color + "!");
    }
}