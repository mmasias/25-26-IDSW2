import java.util.List;

public class Playlist {
    public Playlist(String nombre, Boolean esPublica) { ... }

    public String getNombre() { ... }
    public void setNombre(String nombre) { ... }

    public Boolean getEsPublica() { ... }
    public void setEsPublica(Boolean esPublica) { ... }

    public List<Cancion> getCanciones() { ... }
    
    // Gestión de Agregación
    public void agregarCancion(Cancion cancion) { ... }
    public void quitarCancion(Cancion cancion) { ... }
}