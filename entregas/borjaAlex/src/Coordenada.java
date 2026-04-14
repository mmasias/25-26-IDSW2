
public class Coordenada {

    private final int fila;
    private final int columna;

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public boolean esValida(int tamanio) {
        return (fila >= 1 && fila <= tamanio && columna >= 1 && columna <= tamanio);
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

}
