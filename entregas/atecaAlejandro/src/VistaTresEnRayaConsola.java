import java.util.Scanner;

class VistaTresEnRayaConsola implements VistaTresEnRaya {

  private Scanner scanner;

  public VistaTresEnRayaConsola() {
    this.scanner = new Scanner(System.in);
  }

  @Override
  public void mostrarTablero(Tablero tablero) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    char[][] casillas = tablero.getCasillas();
    for (int i = 0; i < casillas.length; i++) {
      for (int j = 0; j < casillas[i].length; j++) {
        System.out.print(" " + casillas[i][j]);
      }
      System.out.println();
    }
  }

  @Override
  public void mostrarMensaje(String mensaje) {
    System.out.println(mensaje);
  }

  @Override
  public Coordenada pedirCoordenadas(char jugador, String accion) {
    System.out.println("> Turno de " + jugador + " (" + accion + ")");
    System.out.print("> Fila? [1..3] ");
    int fila = scanner.nextInt();
    System.out.print("> Columna? [1..3] ");
    int col = scanner.nextInt();
    return new Coordenada(fila, col);
  }
}
