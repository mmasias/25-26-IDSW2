import java.util.ArrayList;
import java.util.List;

public class Partitura {
    private String tonalidad;
    private List<Nota> notas; 

    public Partitura(String tonalidad) {
        this.tonalidad = tonalidad;
        this.notas = new ArrayList<>();
    }

    // Composición: La partitura crea y destruye sus propias notas
    public void escribirNota(String tono) {
        this.notas.add(new Nota(tono));
    }
}