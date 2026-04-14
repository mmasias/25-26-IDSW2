package tresEnRaya.vista;

import java.util.Scanner;
import tresEnRaya.modelo.Coordenada;
import tresEnRaya.modelo.Jugador;
import tresEnRaya.modelo.Tablero;

public class Consola {

    private static final Scanner scanner = new Scanner(System.in);

    public static Coordenada pedirCoordenada() {
        System.out.print("> Fila? [1..3]: ");
        int fila = scanner.nextInt();
        System.out.print("> Columna? [1..3]: ");
        int columna = scanner.nextInt();
        return new Coordenada(fila, columna);
    }

    public static void mostrarTablero(Tablero tablero) {
        limpiarPantalla();
        tablero.mostrar();
    }

    public static void mostrarGanador(Jugador jugador) {
        jugador.celebrar();
    }

    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
