class Tablero {
    private char[][] casillas;
    private static final int DIM = 3;

    public Tablero() {
        casillas = new char[DIM][DIM];
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) casillas[i][j] = '_';
        }
    }

    public void mostrar() {
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                System.out.print(" " + casillas[i][j]);
            }
            System.out.println();
        }
    }

    public boolean estaCompleto(Jugador jugador) {
        int conteo = 0;
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                if (casillas[i][j] == jugador.color()) conteo++;
            }
        }
        return conteo == 3;
    }

    public boolean hayTresEnRaya() {
        return hayTresEnRaya('x') || hayTresEnRaya('o');
    }

    private boolean hayTresEnRaya(char c) {
        // Filas y Columnas
        for (int i = 0; i < DIM; i++) {
            if (casillas[i][0] == c && casillas[i][1] == c && casillas[i][2] == c) return true;
            if (casillas[0][i] == c && casillas[1][i] == c && casillas[2][i] == c) return true;
        }
        // Diagonales
        if (casillas[0][0] == c && casillas[1][1] == c && casillas[2][2] == c) return true;
        if (casillas[0][2] == c && casillas[1][1] == c && casillas[2][0] == c) return true;
        
        return false;
    }

    public boolean estaOcupado(Coordenada c) {
        return casillas[c.getFila() - 1][c.getColumna() - 1] != '_';
    }

    public boolean estaVacio(Coordenada c) { return !estaOcupado(c); }

    public boolean esFichaDe(Coordenada c, char color) {
        return casillas[c.getFila() - 1][c.getColumna() - 1] == color;
    }

    public void ponerFicha(Coordenada c, char color) {
        casillas[c.getFila() - 1][c.getColumna() - 1] = color;
    }

    public void sacarFicha(Coordenada c) {
        casillas[c.getFila() - 1][c.getColumna() - 1] = '_';
    }
}