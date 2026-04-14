public class Coordenada {

    private int fila;
    private int columna;

    public void pedir() {
        GestorIO io = GestorIO.getInstancia();
        do {
            this.fila = io.leerEntero("> Fila? [1..3] ");
            this.columna = io.leerEntero("> Columna? [1..3] ");
        } while (!this.esValida());
    }

    public boolean esValida() {
        return (fila >= 1 && fila <= 3 && columna >= 1 && columna <= 3);
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
}