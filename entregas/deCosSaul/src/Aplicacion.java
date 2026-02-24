import java.util.ArrayList;
import java.util.List;
class Aplicacion {
    private String nombre;
    private List<Cancion> catalogoCanciones;
    private List<Playlist> playlists;

    public Aplicacion(String nombre) {
        this.nombre = nombre;
        this.catalogoCanciones = new ArrayList<>();
        this.playlists = new ArrayList<>();
    }

    public void subirCancion(Cancion c) { this.catalogoCanciones.add(c); }
    public void alojarPlaylist(Playlist p) { this.playlists.add(p); }
    public String getNombre() { return nombre; }
}