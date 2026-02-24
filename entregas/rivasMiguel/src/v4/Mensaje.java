class Mensaje {
    private Interaccion interaccion;
    private Sujeto autor;

    public Mensaje(Sujeto autor) {
        this.autor = autor;
        this.interaccion = new Interaccion();
    }
}