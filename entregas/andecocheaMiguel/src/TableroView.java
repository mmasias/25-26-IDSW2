package src;

public class TableroView {
    private ConsoleIO io;

    public TableroView(ConsoleIO io) {
        this.io = io;
    }

    public void mostrar(Tablero tablero) {
        this.limpiarPantalla();
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                io.escribir(" " + tablero.getColorEn(new Coordenada(i, j)));
            }
            io.escribirLinea("");
        }
    }

    private void limpiarPantalla() {
        io.escribir("\033[H\033[2J"); // Código de escape ANSI para limpiar
    }
}