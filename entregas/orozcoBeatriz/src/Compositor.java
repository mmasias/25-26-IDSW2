import java.util.ArrayList;
import java.util.List;

public class Compositor {
    private String nombre;
    private List<Cancion> obras;

    public Compositor(String nombre) {
        this.nombre = nombre;
        this.obras = new ArrayList<>();
    }

    public void componer(Cancion cancion) {
        obras.add(cancion);
    }

    public List<Cancion> getObras() {
        return obras;
    }

    String getNombre() {
        return nombre;
    }
}