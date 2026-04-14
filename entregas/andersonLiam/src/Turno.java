public class Turno {

    private int valor;
    private Jugador[] jugadores;

    public Turno(Jugador[] jugadores) {
        this.jugadores = jugadores;
        this.valor = (int) (Math.random() * 2);
    }

    public Jugador jugadorActual() {
        return jugadores[valor];
    }

    public Jugador jugadorAnterior() {
        return jugadores[(valor + 1) % 2];
    }

    public void cambiar() {
        valor = (valor + 1) % 2;
    }
}