import java.util.ArrayList;
import java.util.List;

public class Album {
    private String titulo;
    private List<Grabacion> grabaciones;

    public Album(String titulo) {
        this.titulo = titulo;
        this.grabaciones = new ArrayList<>();
    }

    public void incluirGrabacion(Grabacion grabacion) {
        grabaciones.add(grabacion);
    }

    public List<Grabacion> getGrabaciones() {
        return grabaciones;
    }

    public String getTitulo() {
        return titulo;
    }
}