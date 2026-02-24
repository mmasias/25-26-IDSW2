public class Contexto {
    
    private String descripcion;
    private double impacto;

    public Contexto(String descripcion, double impacto){
        this.descripcion = descripcion;
        this.impacto = impacto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getImpacto() {
        return impacto;
    }


}
