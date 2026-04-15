
public class Tablero {

    public static final int DIMENSION = 3;
    private static final char CASILLA_VACIA = '_';

    private final char[][] casillas;

    public Tablero() {
        this.casillas = new char[DIMENSION][DIMENSION];
        this.inicializarCasillas();
    }

    public boolean estaOcupado(Coordenada coordenada) {
        return this.obtenerColor(coordenada) != CASILLA_VACIA;
    }

    public boolean estaVacio(Coordenada coordenada) {
        return !this.estaOcupado(coordenada);
    }

    public void ponerFicha(Coordenada coordenada, char color) {
        this.casillas[this.indiceFila(coordenada)][this.indiceColumna(coordenada)] = color;
    }

    public void sacarFicha(Coordenada coordenada) {
        this.casillas[this.indiceFila(coordenada)][this.indiceColumna(coordenada)] = CASILLA_VACIA;
    }

    public boolean estaCompleto(Jugador jugador) {
        return this.contarFichas(jugador.color()) == DIMENSION;
    }

    public boolean hayTresEnRaya(char color) {
        return this.hayLineaHorizontal(color)
                || this.hayLineaVertical(color)
                || this.hayDiagonalPrincipal(color)
                || this.hayDiagonalSecundaria(color);
    }

    public char obtenerColor(Coordenada coordenada) {
        return this.casillas[this.indiceFila(coordenada)][this.indiceColumna(coordenada)];
    }

    private void inicializarCasillas() {
        for (int fila = 0; fila < DIMENSION; fila++) {
            for (int columna = 0; columna < DIMENSION; columna++) {
                this.casillas[fila][columna] = CASILLA_VACIA;
            }
        }
    }

    private int contarFichas(char color) {
        int cantidad = 0;

        for (int fila = 0; fila < DIMENSION; fila++) {
            for (int columna = 0; columna < DIMENSION; columna++) {
                if (this.casillas[fila][columna] == color) {
                    cantidad++;
                }
            }
        }

        return cantidad;
    }

    private boolean hayLineaHorizontal(char color) {
        for (int fila = 0; fila < DIMENSION; fila++) {
            boolean lineaCompleta = true;

            for (int columna = 0; columna < DIMENSION; columna++) {
                if (this.casillas[fila][columna] != color) {
                    lineaCompleta = false;
                }
            }

            if (lineaCompleta) {
                return true;
            }
        }

        return false;
    }

    private boolean hayLineaVertical(char color) {
        for (int columna = 0; columna < DIMENSION; columna++) {
            boolean lineaCompleta = true;

            for (int fila = 0; fila < DIMENSION; fila++) {
                if (this.casillas[fila][columna] != color) {
                    lineaCompleta = false;
                }
            }

            if (lineaCompleta) {
                return true;
            }
        }

        return false;
    }

    private boolean hayDiagonalPrincipal(char color) {
        for (int i = 0; i < DIMENSION; i++) {
            if (this.casillas[i][i] != color) {
                return false;
            }
        }
        return true;
    }

    private boolean hayDiagonalSecundaria(char color) {
        for (int i = 0; i < DIMENSION; i++) {
            if (this.casillas[i][DIMENSION - 1 - i] != color) {
                return false;
            }
        }
        return true;
    }

    private int indiceFila(Coordenada coordenada) {
        return coordenada.getFila() - 1;
    }

    private int indiceColumna(Coordenada coordenada) {
        return coordenada.getColumna() - 1;
    }
}
