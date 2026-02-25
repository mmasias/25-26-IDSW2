package iteracion4;
public class Cancion {
    private Audio audio;
    private String titulo;

    public Cancion(String titulo, String archivoAudio) {
        this.titulo = titulo;
        this.audio = new Audio(archivoAudio);
    }

    public String getTitulo() {
        return titulo;
    }

    public Audio getAudio() {
        return audio;
    }
}