import java.util.Scanner;

public class GestorIO {
    private Scanner scanner;

    public GestorIO() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.print(mensaje);
    }

    public void mostrarLinea(String mensaje) {
        System.out.println(mensaje);
    }

    public int leerEntero(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}