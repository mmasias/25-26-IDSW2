import java.util.Scanner;

public class VistaConsola implements Vista {
    private static final String[] OPCIONES = { "Piedra", "Papel", "Tijera", "Lagarto", "Spock" };
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public int pedirOpcion(String nombreJugador) {
        System.out.println(nombreJugador + " elige (1: Piedra, 2: Papel, 3: Tijera, 4: Lagarto, 5: Spock): ");
        int opcion = scanner.nextInt();
        if (opcion >= 1 && opcion <= 5)
            return opcion;
        mostrarError("Opción incorrecta");
        return pedirOpcion(nombreJugador);
    }

    @Override
    public void mostrarElecciones(String nombre1, int opcion1, String nombre2, int opcion2) {
        System.out.println("[" + nombre1 + "] saca [" + OPCIONES[opcion1 - 1] + "] / ["
                + nombre2 + "] saca [" + OPCIONES[opcion2 - 1] + "]");
    }

    @Override
    public void mostrarResultadoRonda(Resultado resultado, String nombre1, String nombre2) {
        switch (resultado) {
            case EMPATE -> System.out.println("¡Empate!");
            case GANA_JUGADOR1 -> System.out.println(nombre1 + " gana!");
            case GANA_JUGADOR2 -> System.out.println(nombre2 + " gana!");
        }
    }

    @Override
    public void mostrarMarcador(String nombre1, int v1, String nombre2, int v2, int empates) {
        System.out.println("Resultados:");
        System.out.println(nombre1 + ": " + v1 + " victorias");
        System.out.println(nombre2 + ": " + v2 + " victorias");
        System.out.println("Empates: " + empates);
        System.out.println("-".repeat(50));
    }

    @Override
    public void mostrarError(String mensaje) {
        System.err.println("Error: " + mensaje);
    }
}