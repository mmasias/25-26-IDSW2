public class Coordenada {

    private final int fila;
    private final int columna;

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int fila() {
        return fila;
    }

    public int columna() {
        return columna;
    }

    public boolean esValidaPara(int dimension) {
        return fila >= 1 && fila <= dimension && columna >= 1 && columna <= dimension;
    }
}