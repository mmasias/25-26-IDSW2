import java.util.ArrayList;
import java.util.List;

public class Estudio {
    private String nombre;
    private List<Instrumento> instrumentosDisponibles = new ArrayList<>();
    public Estudio(String nombre) { this.nombre = nombre; }
    public void prepararSesion() { System.out.println("Estudio listo para grabar."); }
    public void proporcionarInstrumento(Instrumento instrumento) {
        instrumentosDisponibles.add(instrumento);
    }
}
