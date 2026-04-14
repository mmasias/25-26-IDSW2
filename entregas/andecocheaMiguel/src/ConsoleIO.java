package src;
import java.util.Scanner;

public class ConsoleIO {
    private Scanner scanner = new Scanner(System.in);

    public void escribir(String mensaje) {
        System.out.print(mensaje);
    }

    public void escribirLinea(String mensaje) {
        System.out.println(mensaje);
    }

    public int leerEntero(String etiqueta) {
        escribir(etiqueta);
        while (!scanner.hasNextInt()) {
            scanner.next();
            escribir("Error: Debe ser un número. " + etiqueta);
        }
        return scanner.nextInt();
    }
}