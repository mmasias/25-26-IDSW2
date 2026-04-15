
public class TurnoClasico implements Turno {

    private int valor;
    private final int NUM_JUGADORES = 2;

    public TurnoClasico() {
        this.valor = (int) (Math.random() * 2);
    }

    public TurnoClasico(int inicio) {
        this.valor = inicio;
    }

    @Override
    public int toca() {
        return valor;
    }


    @Override
    public void cambiar() {
        valor = this.noLeToca();
    }

    @Override
    public int noLeToca() {
        return (this.valor + 1) % NUM_JUGADORES;
    }



}
