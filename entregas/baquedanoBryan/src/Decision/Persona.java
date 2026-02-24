public class Persona {
    
    private String nombre;
    private Conciencia conciencia;
    private Capacidades capacidades;

    public Persona(String nombre, double nivelConcienciaInicial, Capacidades capacidades) {
        this.nombre = nombre;
        this.conciencia = new Conciencia(nivelConcienciaInicial);
        this.capacidades = capacidades;
    }

    public String getNombre() {
        return nombre;
    }

    public Conciencia getConciencia() {
        return conciencia;
    }

    public Capacidades getCapacidades() {
        return capacidades;
    }
}
