class Mensaje {
    private Interaccion interaccion;
    private Sujeto autor;

    public Mensaje(Sujeto autor) {
        this.autor = autor;
        Contexto contexto = new Contexto(this);
        this.interaccion = new Interaccion(contexto);
    }

    public Interaccion getInteraccion() {
        return interaccion;
    }

    public Sujeto getAutor() {
        return autor;
    }
}