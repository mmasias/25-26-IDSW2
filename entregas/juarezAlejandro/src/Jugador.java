public class Jugador {
    private String nombre;
    private int opcion;
    private int victorias;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getOpcion() {
        return opcion;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public void incrementarVictorias() {
        victorias++;
    }
}