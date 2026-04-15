
public class Turno {

    private static final int CANTIDAD_JUGADORES = 2;
    private int valor;

    public Turno() {
        this.valor = (int) (Math.random() * CANTIDAD_JUGADORES);
    }

    public int actual() {
        return this.valor;
    }

    public void siguiente() {
        this.valor = this.opuesto();
    }

    public int opuesto() {
        return (this.valor + 1) % CANTIDAD_JUGADORES;
    }
}
