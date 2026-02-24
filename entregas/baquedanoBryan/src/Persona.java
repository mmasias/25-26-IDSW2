public class Persona {
    
    private String nombre;
    private Conciencia conciencia;

    public Persona(String nombre, double nivelConcienciaInicial) {
        this.nombre = nombre;
        this.conciencia = new Conciencia(nivelConcienciaInicial);
    }

    public String getNombre() {
        return nombre;
    }

    public Conciencia getConciencia() {
        return conciencia;
    }

}
