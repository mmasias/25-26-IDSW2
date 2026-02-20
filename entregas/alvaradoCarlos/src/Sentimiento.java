import java.util.ArrayList;
import java.util.List;

public class Sentimiento {
    private String nombre;
    private List<Emocion> emociones;
    private List<Cuestionamiento> cuestionamientos;

    public Sentimiento(String nombre) {
        this.nombre = nombre;
        this.emociones = new ArrayList<>();
        this.cuestionamientos = new ArrayList<>();
    }

    public String nombre() {
        return nombre;
    }

    public void agregarEmocion(String tipo, int intensidad) {
        this.emociones.add(new Emocion(tipo, intensidad));
    }

    public void dispararCuestionamiento(Cuestionamiento cuestionamiento) {
        this.cuestionamientos.add(cuestionamiento);
    }
}