public class Estadistica {
    private int reproduccionesTotales;

    public Estadistica() {
        this.reproduccionesTotales = 0;
    }

    public void registrarEscucha() {
        this.reproduccionesTotales++;
    }
}