import java.util.Scanner;

public class Consola {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void imprimir(String mensaje) {
        System.out.print(mensaje);
    }

    public static void imprimirLinea(String mensaje) {
        System.out.println(mensaje);
    }

    public static int leerEntero() {
        while (!scanner.hasNextInt()) {
            scanner.next();
            imprimir("Entrada inválida. Introduce un número: ");
        }
        return scanner.nextInt();
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}