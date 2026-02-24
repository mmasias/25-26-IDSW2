public class ExperienciaV3 {

    private String descripcionExperiencia;
    private int impacto;

    public ExperienciaV3(String descripcionExperiencia, int impacto) {
        this.descripcionExperiencia = descripcionExperiencia;
        this.impacto = impacto;
    }

    public String getDescripcion() {
        return descripcionExperiencia;
    }

    public int getImpacto() {
        return impacto;
    }

    public void ajustarCriterio(CriterioV3 criterio) {
        int nuevoPeso = criterio.getPeso() + impacto;
        criterio.setPeso(nuevoPeso);
    }
}