public class Tablero {

    private static final char VACIO = '_';
    private char[][] casillas;

    public Tablero() {
        casillas = new char[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                casillas[i][j] = VACIO;
    }

    public void mostrar() {
        Consola.limpiarPantalla();
        for (char[] fila : casillas) {
            for (char c : fila)
                System.out.print(" " + c);
            System.out.println();
        }
    }

    // Ahora recibe char directamente, sin conocer a Jugador
    public boolean estaCompleto(char color) {
        int count = 0;
        for (char[] fila : casillas)
            for (char c : fila)
                if (c == color) count++;
        return count == 3;
    }

    public boolean hayTresEnRaya() {
        return hayTresEnRaya('x') || hayTresEnRaya('o');
    }

    private boolean hayTresEnRaya(char color) {
        int[] filas = new int[3], columnas = new int[3];
        int diagonal = 0, secundaria = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (casillas[i][j] == color) {
                    filas[i]++; columnas[j]++;
                    if (i == j)     diagonal++;
                    if (i + j == 2) secundaria++;
                    if (filas[i]==3 || columnas[j]==3 || diagonal==3 || secundaria==3)
                        return true;
                }
            }
        }
        return false;
    }

    public boolean estaOcupado(Coordenada c) {
        return casillas[c.getFila()-1][c.getColumna()-1] != VACIO;
    }

    public boolean estaVacio(Coordenada c) {
        return !estaOcupado(c);
    }

    public void ponerFicha(Coordenada c, char color) {
        casillas[c.getFila()-1][c.getColumna()-1] = color;
    }

    public void sacarFicha(Coordenada c) {
        casillas[c.getFila()-1][c.getColumna()-1] = VACIO;
    }
}