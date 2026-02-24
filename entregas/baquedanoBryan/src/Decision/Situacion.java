import java.util.ArrayList;
import java.util.List;

public class Situacion {

    private String descripcion;
    private List<Opcion> opciones;

    public Situacion(String descripcion) {
        this.descripcion = descripcion;
        this.opciones = new ArrayList<>();
    }

    public void agregarOpcion(Opcion opcion) {
        opciones.add(opcion);
    }

    public List<Opcion> getOpciones() {
        return opciones;
    }

    public String getDescripcion() {
        return descripcion;
    }


}