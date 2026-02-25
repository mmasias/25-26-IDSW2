public class CriterioV3 {

    private String descripcionCriterio;
    private int pesoCriterio;

    public CriterioV3(String descripcionCriterio, int pesoCriterio) {
        this.descripcionCriterio = descripcionCriterio;
        this.pesoCriterio = pesoCriterio;
    }

    public String getDescripcion() {
        return descripcionCriterio;
    }

    public int getPeso() {
        return pesoCriterio;
    }

    public void setPeso(int pesoCriterio) {
        this.pesoCriterio = pesoCriterio;
    }

    public void ajustarSegunExperiencia(ExperienciaV3 experiencia) {
        int nuevoPeso = this.pesoCriterio + experiencia.getImpacto();
        this.pesoCriterio = nuevoPeso;
    }
}