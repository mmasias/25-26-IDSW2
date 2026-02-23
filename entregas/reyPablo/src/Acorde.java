import java.util.ArrayList;
import java.util.List;

public class Acorde {
    private List<Nota> notas = new ArrayList<>();
    public void agregarNota(String tono) {
        notas.add(new Nota(tono));
    }
}
