public interface Contenido {
}

class Palabras implements Contenido {
    private String texto;
    public Palabras(String texto) { this.texto = texto; }
}

class Silencio implements Contenido {
    private int duracion;
    public Silencio(int duracion) { this.duracion = duracion; }
}