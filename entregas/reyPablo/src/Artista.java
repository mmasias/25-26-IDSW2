import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nombre;
    private List<Album> discografia= new ArrayList<>(); 
    private List<Cancion> singles = new ArrayList<>();

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    public void publicarAlbum(Album a) { discografia.add(a);}
    public void lanzarSingle(Cancion c) { singles.add(c); }
    public void grabarEnEstudio(Estudio e) {
        System.out.println(nombre + " está en la cabina de grabación.");
        e.prepararSesion();
    }
}
