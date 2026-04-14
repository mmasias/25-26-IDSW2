public class VistaConsola implements IVista {
    @Override
    public void mostrarTablero(char[][] casillas) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (char[] fila : casillas) {
            for (char celda : fila)
                System.out.print(" " + celda);
            System.out.println();
        }
    }

    @Override
    public void mostrarGanador(char color) {
        System.out.println("Hemos ganado los " + color);
    }
}
