public class Tablero {

    public static final char VACIO = '_';

    private final int dimension;
    private final char[][] casillas;

    public Tablero(int dimension) {
        if (dimension <= 0) {
            throw new IllegalArgumentException("La dimensión debe ser positiva.");
        }
        this.dimension = dimension;
        this.casillas = new char[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                casillas[i][j] = VACIO;
            }
        }
    }

    public int dimension() {
        return dimension;
    }

    public char valorEn(Coordenada c) {
        validarDentro(c);
        return casillas[c.fila() - 1][c.columna() - 1];
    }

    public boolean estaOcupada(Coordenada c) {
        return valorEn(c) != VACIO;
    }

    public boolean estaVacia(Coordenada c) {
        return !estaOcupada(c);
    }

    public boolean contiene(Coordenada c, char ficha) {
        return valorEn(c) == ficha;
    }

    public void ponerFicha(Coordenada c, char ficha) {
        validarDentro(c);
        if (estaOcupada(c)) {
            throw new IllegalArgumentException("Casilla ocupada.");
        }
        casillas[c.fila() - 1][c.columna() - 1] = ficha;
    }

    public void sacarFicha(Coordenada c) {
        validarDentro(c);
        if (estaVacia(c)) {
            throw new IllegalArgumentException("No hay ficha que sacar.");
        }
        casillas[c.fila() - 1][c.columna() - 1] = VACIO;
    }

    public int contarFichas(char ficha) {
        int conteo = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (casillas[i][j] == ficha) {
                    conteo++;
                }
            }
        }
        return conteo;
    }

    private void validarDentro(Coordenada c) {
        if (c == null) {
            throw new IllegalArgumentException("Coordenada nula.");
        }
        if (!c.esValidaPara(dimension)) {
            throw new IllegalArgumentException("Coordenada fuera del tablero.");
        }
    }
}