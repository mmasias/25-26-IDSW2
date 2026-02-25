import java.util.ArrayList;
import java.util.List;

public class Discografica {
    private String nombre;
    private List<Album> albums;

    public Discografica(String nombre) {
        this.nombre = nombre;
        this.albums = new ArrayList<>();
    }

    public void publicar(Album album) {
        albums.add(album);
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public String getNombre() {
        return nombre;
    }
}