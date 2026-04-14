import java.util.Scanner;

public class GestorIO {
    
    private static GestorIO instancia = null;
    private Scanner scanner;

    // Constructor privado (Patrón Singleton)
    private GestorIO() {
        scanner = new Scanner(System.in);
    }

    // Punto de acceso global a la única instancia
    public static GestorIO getInstancia() {
        if (instancia == null) {
            instancia = new GestorIO();
        }
        return instancia;
    }

    public int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public void mostrar(String texto) {
        System.out.print(texto);
    }

    public void mostrarln(String texto) {
        System.out.println(texto);
    }

    public void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}