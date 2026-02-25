import java.util.Date;
import java.util.List;

public class Album {
    public Album(String titulo, Date fechaLanzamiento) { ... }

    public String getTitulo() { ... }
    public void setTitulo(String titulo) { ... }

    public Date getFechaLanzamiento() { ... }
    public void setFechaLanzamiento(Date fechaLanzamiento) { ... }

    public List<Cancion> getCanciones() { ... }

    // Métodos para gestionar la Composición (crea y destruye la canción internamente)
    public Cancion agregarNuevaCancion(String tituloCancion, Integer duracionSegundos, EstiloMusical estilo) { ... }
    public void eliminarCancion(Cancion cancion) { ... }
}