import java.util.ArrayList;
import java.util.List;

public class Partitura {
    private Compas compas; 
    private List<Nota> notas = new ArrayList<>(); 
    private List<Acorde> acordes = new ArrayList<>(); 
    public Partitura(Compas compas) {
        this.compas = compas;
    }

    public void añadirNota(String tono) { notas.add(new Nota(tono)); }
    public void añadirAcorde(Acorde acorde) { acordes.add(acorde); }
}
