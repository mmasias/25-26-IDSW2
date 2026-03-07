import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private String nombre;
    
   
    private Estadistica estadisticas;
    private List<Oyente> usuarios;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.estadisticas = new Estadistica();
        this.usuarios = new ArrayList<>();
    }


    public Oyente registrarOyente(String username) {
        Oyente nuevoOyente = new Oyente(username);
        this.usuarios.add(nuevoOyente);
        return nuevoOyente;
    }

    public Estadistica getEstadisticas() {
        return estadisticas;
    }
}