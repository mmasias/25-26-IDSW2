import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Playlist> misPlaylists= new ArrayList<>();
    private Suscripcion suscripcion;

    public Usuario(String nombre,String tipoPlan) {
        this.nombre = nombre;
        this.suscripcion = new Suscripcion(tipoPlan);
    }

    public void añadirPlaylist(Playlist playlist) {
        misPlaylists.add(playlist);
    }
    public void usarReproductorCancion(Reproductor r, Cancion c) {
        System.out.println(nombre + " da orden de reproducir single.");
        r.reproducirCancion(c);
    }

    public void usarReproductorPlaylist(Reproductor r, Playlist p) {
        System.out.println(nombre + " da orden de reproducir lista.");
        r.reproducirPlaylist(p);
    }
}
