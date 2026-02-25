package iteracion3;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Playlist> playlists;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.playlists = new ArrayList<>();
    }

    public void crearPlaylist(Playlist p) {
        playlists.add(p);
    }
}