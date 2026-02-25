class Interaccion {
    private Retroalimentacion retroalimentacion;
    private Tema tema;

    public Interaccion(Contexto contexto) {
        this.tema = new Tema(contexto);
        this.retroalimentacion = new Retroalimentacion(null);
    }

    public void setMensajeARetroalimentar(Mensaje m) {
        this.retroalimentacion = new Retroalimentacion(m);
    }

    public Tema getTema() {
        return tema;
    }

    public Retroalimentacion getRetroalimentacion() {
        return retroalimentacion;
    }
}