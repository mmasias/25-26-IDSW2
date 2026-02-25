package iteracion3;
import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nombre;
    private List<Cancion> canciones;

    public Artista(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }
}