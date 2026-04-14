import java.util.Scanner;

public class Consola {

    private static final Scanner scanner = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static Coordenada pedirCoordenada() {
        Coordenada coordenada;
        do {
            int fila    = leerEntero("> Fila? [1..3]: ");
            int columna = leerEntero("> Columna? [1..3]: ");
            coordenada  = new Coordenada(fila, columna);
        } while (!coordenada.esValida());
        return coordenada;
    }
}