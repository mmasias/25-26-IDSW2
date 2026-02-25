public class Mensaje {
    private Contenido cargaUtil;
    private Medio canal;

    Mensaje(Contenido contenido, Medio medio) {
        this.cargaUtil = contenido;
        this.canal = medio;
    }
}