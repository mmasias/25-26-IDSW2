import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private Suscripcion suscripcion; // COMPOSICIÓN
    private List<Playlist> misPlaylists = new ArrayList<>(); // AGREGACIÓN
    private List<Artista> artistasSeguidos = new ArrayList<>(); // ASOCIACIÓN: Usuario --> Artista

    public Usuario(String nombre, String tipoPlan) {
        this.nombre = nombre;
        // COMPOSICIÓN: El usuario crea su suscripción
        this.suscripcion = new Suscripcion(tipoPlan);
    }

    public void añadirPlaylist(Playlist playlist) { misPlaylists.add(playlist); }
    
    public void seguirArtista(Artista a) { artistasSeguidos.add(a); } // NUEVO

    // USO: Usuario ..> Reproductor
    public void usarReproductorCancion(Reproductor r, Cancion c) {
        System.out.println(nombre + " da orden de reproducir single.");
        r.reproducirCancion(c);
    }

    // USO: Usuario ..> Reproductor
    public void usarReproductorPlaylist(Reproductor r, Playlist p) {
        System.out.println(nombre + " da orden de reproducir lista.");
        r.reproducirPlaylist(p);
    }
}