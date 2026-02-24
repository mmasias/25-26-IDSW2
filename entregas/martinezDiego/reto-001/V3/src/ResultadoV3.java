import java.util.LinkedList;

public class ResultadoV3 {

    private OpcionV3 opcionElegida;
    private CriterioV3 criterioUsado;
    private EventoV3 eventoRelacionado;
    private ContextoV3 contextoRelacionado;
    private ExperienciaV3 experienciaGenerada;

    public ResultadoV3(OpcionV3 opcionElegida, CriterioV3 criterioUsado, EventoV3 eventoRelacionado, ContextoV3 contextoRelacionado) {
        this.opcionElegida = opcionElegida;
        this.criterioUsado = criterioUsado;
        this.eventoRelacionado = eventoRelacionado;
        this.contextoRelacionado = contextoRelacionado;
        this.experienciaGenerada = generarExperiencia();
    }

    private ExperienciaV3 generarExperiencia() {
        String descripcion = "Experiencia por elegir '" + opcionElegida.getDescripcion() + "' con criterio '" + criterioUsado.getDescripcion() + "'";
        int impacto = (int)(Math.random() * 5 + 1);
        return new ExperienciaV3(descripcion, impacto);
    }

    public ExperienciaV3 getExperiencia() {
        return experienciaGenerada;
    }

    public void aplicarExperiencia(LinkedList<CriterioV3> criterios) {
        for (CriterioV3 nuevoCriterio : criterios) {
            experienciaGenerada.ajustarCriterio(nuevoCriterio);
        }
    }

    public OpcionV3 getOpcion() {
        return opcionElegida;
    }

    public CriterioV3 getCriterio() {
        return criterioUsado;
    }
}