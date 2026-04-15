class TableroClasico implements Tablero {

    private char[][] casillas;
    final private int DIMENSION = 3;
    final private char VACIO = '_';

    public TableroClasico() {
        casillas = new char[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                casillas[i][j] = VACIO;
            }
        }
        
    }

    public char getFicha(int fila, int columna) {
        return this.casillas[fila][columna];

    }



    public boolean hayTresEnRaya() {
        return this.hayTresEnRaya('x') || this.hayTresEnRaya('o');
    }

    private boolean hayTresEnRaya(char color) {
        int[] filas = new int[DIMENSION];
        int[] columnas = new int[DIMENSION];
        int diagonal = 0;
        int secundaria = 0;

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (casillas[i][j] == color) {
                    filas[i]++;
                    columnas[j]++;
                    diagonal = diagonal + ((i == j) ? 1 : 0);
                    secundaria = secundaria + ((i + j == 2) ? 1 : 0);

                    if (filas[i] == DIMENSION || columnas[j] == DIMENSION || diagonal == DIMENSION || secundaria == DIMENSION) {
                        return true;
                    }

                }
            }
        }
        return false;

    }

    public boolean estaCompleto(Jugador jugador) {
        assert jugador != null;
        int conteoFichas = 0;
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (casillas[i][j] == jugador.color()) {
                    conteoFichas++;
                }
            }
        }
        return conteoFichas == 3;
    }

    public boolean estaOcupado(Coordenada coordenada) {
        return !this.verificarColorFicha(coordenada, VACIO);
    }

    public void ponerFicha(Coordenada coordenada, char color) {
        int fila = coordenada.getFila();
        int columna = coordenada.getColumna();
        casillas[fila][columna] = color;
    }

    public boolean estaVacio(Coordenada coordenada) {
        return !this.estaOcupado(coordenada);
    }

    public boolean verificarColorFicha(Coordenada coordenada, char color) {
        int fila = coordenada.getFila();
        int columna = coordenada.getColumna();
        return casillas[fila][columna] == color;
    }

    public void sacarFicha(Coordenada coordenada) {
        int fila = coordenada.getFila();
        int columna = coordenada.getColumna();
        casillas[fila][columna] = VACIO;
    }
}
