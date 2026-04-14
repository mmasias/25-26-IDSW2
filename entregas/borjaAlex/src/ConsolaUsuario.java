import java.util.Scanner;

class ConsolaUsuario implements InterfazUsuario {

    private final Scanner scanner;

    ConsolaUsuario() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int leerEntero(String mensaje) {
        mostrarLinea(mensaje);
        return scanner.nextInt();
    }

    @Override
    public void mostrarLinea(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
