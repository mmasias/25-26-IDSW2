import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Playlist> misPlaylists;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.misPlaylists = new ArrayList<>();
    }

    public void añadirPlaylist(Playlist playlist) {
        misPlaylists.add(playlist);
    }
}
