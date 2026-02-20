import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nombre;
    private List<Album> albumes; 

    public Artista(String nombre) {
        this.nombre = nombre;
        this.albumes = new ArrayList<>();
    }

    public void publicarAlbum(Album a) {
        albumes.add(a);
    }
}
