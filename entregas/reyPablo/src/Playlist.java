import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nombre;
    private List<Cancion> canciones;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion); 
    }
}
