import java.util.ArrayList;
import java.util.List;

public class Capacidades {
    private List<String> listaHabilidades;

    public Capacidades() {
        this.listaHabilidades = new ArrayList<>();
    }

    public void aprender(String habilidad) {
        this.listaHabilidades.add(habilidad);
    }

    public boolean tieneHabilidad(String habilidad) {
        return listaHabilidades.contains(habilidad);
    }
}