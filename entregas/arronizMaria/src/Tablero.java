public class Tablero implements ITablero {
    private final char[][] casillas;

    public Tablero() {
        casillas = new char[3][3];
        for (char[] fila : casillas)
            java.util.Arrays.fill(fila, '_');
    }

    @Override
    public void ponerFicha(Coordenada c, char color) {
        assert !estaOcupado(c) : "Precondición: casilla libre";
        casillas[c.getFila() - 1][c.getColumna() - 1] = color;
    }

    @Override
    public void sacarFicha(Coordenada c) {
        assert estaOcupado(c) : "Precondición: casilla ocupada";
        casillas[c.getFila() - 1][c.getColumna() - 1] = '_';
    }

    @Override
    public boolean estaOcupado(Coordenada c) {
        return casillas[c.getFila() - 1][c.getColumna() - 1] != '_';
    }

    @Override
    public boolean estaCompleto(char color) {
        int count = 0;
        for (char[] fila : casillas)
            for (char celda : fila)
                if (celda == color) count++;
        return count == 3;
    }

    @Override
    public boolean hayTresEnRaya() {
        return hayTresEnRaya('x') || hayTresEnRaya('o');
    }

    @Override
    public char[][] getCasillas() {
        char[][] copia = new char[3][3];
        for (int i = 0; i < 3; i++)
            copia[i] = casillas[i].clone();
        return copia;
    }

    private boolean hayTresEnRaya(char color) {
        int[] filas = new int[3], cols = new int[3];
        int diag = 0, sec = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (casillas[i][j] == color) {
                    if (++filas[i] == 3 || ++cols[j] == 3) return true;
                    if (i == j && ++diag == 3) return true;
                    if (i + j == 2 && ++sec == 3) return true;
                }
        return false;
    }
}
