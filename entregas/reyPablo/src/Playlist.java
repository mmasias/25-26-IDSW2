import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nombre;
    private List<Cancion> canciones = new ArrayList<>();

    public Playlist(String nombre) { this.nombre = nombre; }
    public void agregarCancion(Cancion c) { canciones.add(c); }
}
