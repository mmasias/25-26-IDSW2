public class Opcion {

    private String descripcion;
    private double nivelRacionalidad;
    private Motivacion motivacion;
    private Consecuencia consecuencia;

    public Opcion(String descripcion) {
        this.descripcion = descripcion;
        this.nivelRacionalidad = 0.5;
    }

    public Opcion(String descripcion, double nivelRacionalidad) {
        this.descripcion = descripcion;
        this.nivelRacionalidad = nivelRacionalidad;
    }

    public Opcion(String descripcion, double nivelRacionalidad, Motivacion motivacion, Consecuencia consecuencia) {
        this.descripcion = descripcion;
        this.nivelRacionalidad = nivelRacionalidad;
        this.motivacion = motivacion;
        this.consecuencia = consecuencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getNivelRacionalidad() {
        return nivelRacionalidad;
    }

    public void setNivelRacionalidad(double nivelRacionalidad) {
        this.nivelRacionalidad = nivelRacionalidad;
    }

    public Motivacion getMotivacion() {
        return motivacion;
    }

    public void setMotivacion(Motivacion motivacion) {
        this.motivacion = motivacion;
    }

    public Consecuencia getConsecuencia() {
        return consecuencia;
    }

    public void setConsecuencia(Consecuencia consecuencia) {
        this.consecuencia = consecuencia;
    }

}
