
public class TurnoClasico implements Turno {

    private int valor;
    private final int NUM_JUGADORES = 2;

    public TurnoClasico() {
        valor = 0;
    }

    public TurnoClasico(int inicio) {
        this.valor = inicio;
    }

    public int toca() {
        return valor;
    }

    public void cambiar() {
        valor = this.noLeToca();
    }

    public int noLeToca() {
        return (this.valor + 1) % NUM_JUGADORES;
    }

}
