import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Playlist> misPlaylists;
    private Suscripcion suscripcion;

    public Usuario(String nombre,String tipoPlan) {
        this.nombre = nombre;
        this.misPlaylists = new ArrayList<>();
        this.suscripcion = new Suscripcion(tipoPlan);
    }

    public void añadirPlaylist(Playlist playlist) {
        misPlaylists.add(playlist);
    }
}
