public class Coordenada {
    private int fila;
    private int columna;

    public Coordenada(int fila, int columna) {ç
        assert fila >= 1 && fila <= 3 : "Fila fuera de rango";
        assert columna >= 1 && columna <= 3 : "Columna fuera de rango";
        this.fila = fila;
        this.columna = columna;
    }

    public static boolean esValida(int fila, int columna) {
        return fila >= 1 && fila <= 3 && columna >= 1 && columna <= 3;
    }

    public int getFila() { return fila;}

    public int getColumna() { return columna; }
}
