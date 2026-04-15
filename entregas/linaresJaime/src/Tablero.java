public class Tablero {
    private final char[][] casillas;

    public Tablero() {
        casillas = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) casillas[i][j] = '_';
        }
    }

    public char[][] getEstado() {
        char[][] copia = new char[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(casillas[i], 0, copia[i], 0, 3);
        }
        return copia;
    }

    public boolean estaCompleto(Jugador jugador) {
        int conteo = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (casillas[i][j] == jugador.getColor()) conteo++;
            }
        }
        return conteo == 3;
    }

    public boolean hayTresEnRaya() {
        return hayTresEnRaya('x') || hayTresEnRaya('o');
    }

    private boolean hayTresEnRaya(char color) {
        int[] filas = new int[3];
        int[] columnas = new int[3];
        int diagonal = 0, secundaria = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (color == casillas[i][j]) {
                    filas[i]++;
                    columnas[j]++;
                    if (i == j) diagonal++;
                    if (i + j == 2) secundaria++;
                    if (filas[i] == 3 || columnas[j] == 3 || diagonal == 3 || secundaria == 3) return true;
                }
            }
        }
        return false;
    }

    public boolean estaOcupado(Coordenada c) {
        return casillas[c.getFila() - 1][c.getColumna() - 1] != '_';
    }

    public void ponerFicha(Coordenada c, char color) {
        casillas[c.getFila() - 1][c.getColumna() - 1] = color;
    }

    public void sacarFicha(Coordenada c) {
        casillas[c.getFila() - 1][c.getColumna() - 1] = '_';
    }
}