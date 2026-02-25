public class ExperienciaV1 {

    private String descripcion;

    public ExperienciaV1(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void ajustarCriterio(CriterioV1 criterio, int nuevoPeso) {
        criterio.setPeso(nuevoPeso);
    }
}