import java.util.List;

public class Album {
    private String titulo;
    private List<Cancion> tracklist; // AGREGACIÓN

    public Album(String titulo, List<Cancion> tracklist) {
        this.titulo = titulo;
        this.tracklist = tracklist;
    }
}