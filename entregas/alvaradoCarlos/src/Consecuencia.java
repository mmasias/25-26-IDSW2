public class Consecuencia {
    
    private String descripcion;

    public Consecuencia(String descripcion) {
        this.descripcion = descripcion;
    }

    public String descripcion() {
        return descripcion;
    }

    public Emocion generarRespuestaEmocional(String tipo, int intensidad) {
        System.out.println("La consecuencia '" + descripcion + "' ha disparado la emoción: " + tipo);
        return new Emocion(tipo, intensidad);
    }
}
