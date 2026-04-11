import java.util.Scanner;

class VistaTresEnRayaConsola implements VistaTresEnRaya {
    private Scanner scanner;

    public VistaTresEnRayaConsola() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void mostrarTablero(char[][] tablero) {
        System.out.println("\n  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public int[] pedirCoordenadas(char jugador) {
        System.out.print("Jugador " + jugador + ", introduce fila (ej: 1): ");
        int fila = scanner.nextInt();
        System.out.print("Jugador " + jugador + ", introduce columna (ej: 1): ");
        int col = scanner.nextInt();
        return new int[]{fila, col};
    }

}