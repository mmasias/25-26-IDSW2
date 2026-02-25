public class Sujeto {
    private Medio medio;
    private Lenguaje lenguaje;

    public Sujeto() {}

    public void comunicarse(Medio medio, Lenguaje lenguaje) {
        this.medio = medio;
        this.lenguaje = lenguaje;
    }

    public void enviarMensaje(Sujeto receptor, String[] palabras) {
        Mensaje mensaje = new Mensaje(this);
        mensaje.getInteraccion().setMensajeARetroalimentar(mensaje);

        System.out.println(this + " envía mensaje:");
        for (String palabra : palabras) {
            System.out.println("- " + palabra);
        }

        receptor.recibirMensaje(mensaje);
    }

    public void recibirMensaje(Mensaje mensaje) {
        System.out.println(this + " recibe mensaje de " + mensaje.getAutor());
        System.out.println("Retroalimentación: " + mensaje.getInteraccion().getRetroalimentacion());
    }

    @Override
    public String toString() {
        return "Sujeto@" + Integer.toHexString(hashCode());
    }
}