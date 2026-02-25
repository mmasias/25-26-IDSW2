import java.util.List;

public class Plataforma {
    public Plataforma(String nombre, String version) { ... }

    public String getNombre() { ... }
    public void setNombre(String nombre) { ... }

    public String getVersion() { ... }
    public void setVersion(String version) { ... }

    // Gestión de Agregaciones (recibe objetos ya existentes)
    public List<Album> getAlbumes() { ... }
    public void agregarAlbum(Album album) { ... }
    public void eliminarAlbum(Album album) { ... }

    public List<Playlist> getPlaylists() { ... }
    public void agregarPlaylist(Playlist playlist) { ... }
    public void eliminarPlaylist(Playlist playlist) { ... }

    public List<Idioma> getIdiomasDisponibles() { ... }
    public void agregarIdioma(Idioma idioma) { ... }
    public void eliminarIdioma(Idioma idioma) { ... }
}