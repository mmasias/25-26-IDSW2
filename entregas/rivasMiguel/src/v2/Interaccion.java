public class Interaccion {
    private Sujeto fulanito;
    private Sujeto menganito;

    private Tema tema;
    private Mensaje mensaje;
    private Retroalimentacion retroalimentacion;

    public Interaccion(Sujeto fulanito, Sujeto menganito) {
        this.fulanito = fulanito;
        this.menganito = menganito;
        
        this.tema = new Tema();
        this.mensaje = new Mensaje();
        this.retroalimentacion = new Retroalimentacion();
    }
}