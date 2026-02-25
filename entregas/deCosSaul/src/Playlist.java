import java.util.ArrayList;
import java.util.List;
class Playlist {
    private String nombre;
    private List<Cancion> canciones;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion c) {
        this.canciones.add(c);
    }
    public String getNombre() { return nombre; }
}