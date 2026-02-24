public class Opcion {

    private String descripcion;
    private double nivelRacionalidad;

    public Opcion(String descripcion) {
        this.descripcion = descripcion;
        this.nivelRacionalidad = 0.5; 
    }

    public Opcion(String descripcion, double nivelRacionalidad) {
        this.descripcion = descripcion;
        this.nivelRacionalidad = nivelRacionalidad;
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

}
