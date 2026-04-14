class Tablero {

    public static final int TAMANIO = 3;
    public static final char CASILLA_VACIA = '_';

    private final char[][] casillas;

    public Tablero() {
        casillas = new char[TAMANIO][TAMANIO];

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = CASILLA_VACIA;
            }
        }
    }

    public boolean estaCompleto(char color) {
        int conteoFichas = 0;
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (casillas[i][j] == color) {
                    conteoFichas++;
                }
            }
        }
        return conteoFichas == TAMANIO;
    }

    public boolean hayTresEnRaya() {
        return this.hayTresEnRaya('x') || this.hayTresEnRaya('o');
    }

    private boolean hayTresEnRaya(char color) {
        int[] filas = new int[TAMANIO];
        int[] columnas = new int[TAMANIO];
        int diagonal = 0;
        int secundaria = 0;
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if (color == casillas[i][j]) {
                    filas[i]++;
                    columnas[j]++;
                    diagonal = diagonal + ((i == j) ? 1 : 0);
                    secundaria = secundaria + ((i + j == TAMANIO - 1) ? 1 : 0);

                    if (filas[i] == TAMANIO || columnas[j] == TAMANIO || diagonal == TAMANIO || secundaria == TAMANIO) {
                        return true;
                    }

                }
            }
        }
        return false;
    }

    public boolean estaOcupado(Coordenada coordenada) {
        return casillas[coordenada.getFila() - 1][coordenada.getColumna() - 1] != CASILLA_VACIA;
    }

    public boolean estaOcupadoPor(Coordenada coordenada, char color) {
        return casillas[coordenada.getFila() - 1][coordenada.getColumna() - 1] == color;
    }

    public void ponerFicha(Coordenada coordenada, char color) {
        casillas[coordenada.getFila() - 1][coordenada.getColumna() - 1] = color;
    }

    public boolean estaVacio(Coordenada coordenada) {
        return !estaOcupado(coordenada);
    }

    public void sacarFicha(Coordenada coordenada) {
        casillas[coordenada.getFila() - 1][coordenada.getColumna() - 1] = CASILLA_VACIA;
    }

    public char fichaEn(int fila, int columna) {
        return casillas[fila][columna];
    }

}
