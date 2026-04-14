package Dominio;

public class Tablero {
    private char[][] casillas;

    public Tablero() {
        casillas = new char[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                casillas[i][j] = '_';
    }

    public boolean estaOcupado(Coordenada c) {
        return casillas[c.getFila() - 1][c.getColumna() - 1] != '_';
    }

    public boolean estaVacio(Coordenada c) {
        return !estaOcupado(c);
    }

    public void ponerFicha(Coordenada c, char color) {
        casillas[c.getFila() - 1][c.getColumna() - 1] = color;
    }

    public void sacarFicha(Coordenada c) {
        casillas[c.getFila() - 1][c.getColumna() - 1] = '_';
    }

    public boolean estaCompleto(Jugador jugador) {
        int count = 0;
        for (char[] fila : casillas)
            for (char celda : fila)
                if (celda == jugador.getColor())
                    count++;
        return count == 3;
    }

    public char[][] getCasillas() {
        return casillas;
    }
}