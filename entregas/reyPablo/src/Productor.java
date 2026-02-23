import java.util.ArrayList;
import java.util.List;

public class Productor {
    private String nombre;
    private List<Artista> artistasDirigidos = new ArrayList<>();
    private List<Cancion> cancionesSupervisadas = new ArrayList<>();

    public Productor(String nombre) { this.nombre = nombre; }
    public void dirigirArtista(Artista a) { artistasDirigidos.add(a); }
    public void supervisarCancion(Cancion c) { cancionesSupervisadas.add(c); }
}
