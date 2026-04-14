import java.util.Scanner;

public class Gestor {
    private Scanner scanner = new Scanner(System.in);

    public int leerInt(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Error. Introduce un número: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public void escribirLinea(String mensaje) {
        System.out.println(mensaje);
    }

    public void escribir(String mensaje) {
        System.out.print(mensaje);
    }
}