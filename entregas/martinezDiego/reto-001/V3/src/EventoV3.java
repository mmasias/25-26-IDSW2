public class EventoV3 {

    private String descripcion;
    private ContextoV3 contexto;

    public EventoV3(String descripcion, ContextoV3 contexto) {
        this.descripcion = descripcion;
        this.contexto = contexto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ContextoV3 getContexto() {
        return contexto;
    }

    public void setContexto(ContextoV3 contexto) {
        this.contexto = contexto;
    }

}
