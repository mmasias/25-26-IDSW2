class EdicionDisco extends Album {
    private int anoRemasterizacion;

    public EdicionDisco(String titulo, int anoRemasterizacion) {
        super(titulo); 
        this.anoRemasterizacion = anoRemasterizacion;
    }
}