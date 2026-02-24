import java.util.List;

public class Banda {
    private String nombre;
    private List<Artista> miembros; 

    
    public Banda(String nombre, List<Artista> miembros) {
        this.nombre = nombre;
        this.miembros = miembros; 
    }
}