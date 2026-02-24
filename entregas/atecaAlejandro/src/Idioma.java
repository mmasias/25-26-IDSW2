public class Idioma {
    private String nombre;

    public Idioma(String nombre) {
        this.nombre = nombre;
    }

    public String procesar(String texto) {
        return "[Idioma: " + nombre + "] " + texto;
    }
}