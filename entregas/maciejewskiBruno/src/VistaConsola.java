import java.util.Scanner;

class VistaConsola implements Vista {

  @Override
  public void mostrarTablero(Tablero tablero) {
    char[][] casillas = tablero.getCasillas();
    cleanScreen();
    for (int i = 0; i < casillas.length; i++) {
      for (int j = 0; j < casillas[i].length; j++) {
        System.out.print(" " + casillas[i][j]);
      }
      System.out.println();
    }
  }

  @Override
  public Coordenada pedirCoordenada() {
    Coordenada coordenada;
    do {
      System.out.print("> Fila? [1..3] ");
      int fila = new Scanner(System.in).nextInt();
      System.out.print("> Columna? [1..3] ");
      int columna = new Scanner(System.in).nextInt();
      coordenada = new Coordenada(fila, columna);
    } while (!coordenada.esValida());
    return coordenada;
  }

  @Override
  public void celebrarVictoria(char color) {
    System.out.println("Hemos ganado los " + color);
  }

  static void cleanScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
