class Retroalimentacion {
    private Mensaje mensaje;

    public Retroalimentacion(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        if (mensaje != null) {
            return "Retroalimentacion del mensaje de " + mensaje.getAutor();
        } else {
            return "Retroalimentacion vacía";
        }
    }
}