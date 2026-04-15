
public class Coordenada {

    private final int fila;
    private final int columna;

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public boolean esValida() {
        return this.fila >= 1 && this.fila <= Tablero.DIMENSION
                && this.columna >= 1 && this.columna <= Tablero.DIMENSION;
    }

    public int getFila() {
        return this.fila;
    }

    public int getColumna() {
        return this.columna;
    }
}
