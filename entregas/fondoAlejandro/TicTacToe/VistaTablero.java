public class VistaTablero {
    public static void mostrar(Tablero tablero) {
        Consola.limpiarPantalla();
        char[][] casillas = tablero.getCasillas();
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                Consola.imprimir(" " + casillas[i][j]);
            }
            Consola.imprimirLinea("");
        }
    }
}