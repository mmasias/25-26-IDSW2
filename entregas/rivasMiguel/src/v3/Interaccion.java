class Interaccion {
    private Retroalimentacion retroalimentacion;
    private Tema tema;

    public Interaccion() {
        this.tema = new Tema();
        this.retroalimentacion = new Retroalimentacion(null); 
    }
    
    public void setMensajeARetroalimentar(Mensaje m) {
        this.retroalimentacion = new Retroalimentacion(m);
    }
}