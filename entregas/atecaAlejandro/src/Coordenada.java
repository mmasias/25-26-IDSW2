public class Coordenada {

  private int fila;
  private int columna;

  public Coordenada(int fila, int columna) {
    this.fila = fila;
    this.columna = columna;
  }

  public boolean esValida() {
    return (fila >= 1 && fila <= 3 && columna >= 1 && columna <= 3);
  }

  public int getFila() {
    return fila;
  }

  public int getColumna() {
    return columna;
  }
}
