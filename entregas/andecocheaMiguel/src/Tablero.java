package src;
class Tablero {
    private char[][] casillas;

    public Tablero() {
        casillas = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j] = '_'; 
            }
        }
    }

    public char getColorEn(Coordenada c) {
        return casillas[c.getFila() - 1][c.getColumna() - 1];
    }

    public void ponerFicha(Coordenada c, char color) {
        casillas[c.getFila() - 1][c.getColumna() - 1] = color;
    }

    public void sacarFicha(Coordenada c) {
        casillas[c.getFila() - 1][c.getColumna() - 1] = '_';
    }

    public boolean estaOcupado(Coordenada c) {
        return getColorEn(c) != '_';
    }

    public boolean estaCompleto(char color) {
        int conteo = 0;
        for (char[] fila : casillas) {
            for (char casilla : fila) {
                if (casilla == color) conteo++;
            }
        }
        return conteo == 3; 
    }

    public boolean hayTresEnRaya() {
        return hayTresEnRaya('x') || hayTresEnRaya('o');
    }

    private boolean hayTresEnRaya(char color) {
       
        for (int i = 0; i < 3; i++) {
            if (casillas[i][0] == color && casillas[i][1] == color && casillas[i][2] == color) return true;
            if (casillas[0][i] == color && casillas[1][i] == color && casillas[2][i] == color) return true;
        }
        return (casillas[0][0] == color && casillas[1][1] == color && casillas[2][2] == color) ||
               (casillas[0][2] == color && casillas[1][1] == color && casillas[2][0] == color);
    }
}