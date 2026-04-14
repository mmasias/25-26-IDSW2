public class Turno {

    private final int numJugadores;
    private int indiceActual;

    public Turno(int numJugadores) {
        if (numJugadores < 2) {
            throw new IllegalArgumentException("Debe haber al menos 2 jugadores.");
        }
        this.numJugadores = numJugadores;
        this.indiceActual = (int) (Math.random() * numJugadores);
    }

    public int indiceActual() {
        return indiceActual;
    }

    public void cambiar() {
        indiceActual = (indiceActual + 1) % numJugadores;
    }
}