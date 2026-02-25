public class ResultadoV2 {

    private OpcionV2 opcionElegida;
    private ExperienciaV2 experiencia;

    
    public ResultadoV2(OpcionV2 opcionElegida) {
        this.opcionElegida = opcionElegida;
        this.experiencia = generarExperiencia();
    }

    
    private ExperienciaV2 generarExperiencia() {
        return new ExperienciaV2("Aprendido de la opción: " + opcionElegida.getNombre());
    }

    public OpcionV2 getOpcionElegida() {
        return opcionElegida;
    }

    public ExperienciaV2 getExperiencia() {
        return experiencia;
    }
}