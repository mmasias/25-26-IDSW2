package Vista;

import Dominio.Coordenada;
import Dominio.Jugador;
import Dominio.Tablero;
import java.util.Scanner;

public class ConsolaVista {
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarTablero(Tablero tablero) {
        limpiarPantalla();
        char[][] c = tablero.getCasillas();
        for (char[] fila : c) {
            for (char celda : fila)
                System.out.print(" " + celda);
            System.out.println();
        }
    }

    public Coordenada pedirCoordenada() {
        int fila, columna;
        Coordenada coordenada;
        do {
            System.out.print("> Fila? [1..3] ");
            fila = scanner.nextInt();
            System.out.print("> Columna? [1..3] ");
            columna = scanner.nextInt();
            coordenada = new Coordenada(fila, columna);
            if (!coordenada.esValida())
                System.out.println("Coordenada fuera de rango, repite.");
        } while (!coordenada.esValida());
        return coordenada;
    }

    public void mostrarCeldaOcupada() {
        System.out.println("Esa casilla está ocupada, elige otra.");
    }

    public void mostrarCeldaVacia() {
        System.out.println("Esa casilla está vacía, elige una con tu ficha.");
    }

    public void mostrarGanador(Jugador jugador) {
        System.out.println("Han ganado los '" + jugador.getColor() + "'!");
    }

    private void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}