public class ResultadoV1 {

    private OpcionV1 opcionElegida;
    private ExperienciaV1 experiencia;

    public ResultadoV1(OpcionV1 opcionElegida) {
        this.opcionElegida = opcionElegida;
        this.experiencia = new ExperienciaV1("Resultado basado en: " + opcionElegida.getNombre());
    }

    public OpcionV1 getOpcionElegida() {
        return opcionElegida;
    }

    public ExperienciaV1 getExperiencia() {
        return experiencia;
    }
}