import java.util.Scanner;

public class VistaConsola implements Vista {

  private Scanner scanner = new Scanner(System.in);

  public void mostrarTablero(Tablero tablero) {
    System.out.println("\n--- TRES EN RAYA ---");
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        System.out.print(" " + tablero.getFicha(i, j));
      }
      System.out.println();
    }
    System.out.println("--------------------");
  }

  public Coordenada pedirCoordenada(String mensaje) {
    System.out.println(mensaje);
    System.out.print("> Fila? [1..3]: ");
    int fila = scanner.nextInt();
    System.out.print("> Columna? [1..3]: ");
    int columna = scanner.nextInt();
    return new Coordenada(fila, columna);
  }

  public void mostrarError(String mensaje) {
    System.out.println("[ERROR] " + mensaje);
  }

  public void mostrarVictoria(char color) {
    System.out.println("¡ENHORABUENA! Han ganado los " + color);
  }
}
