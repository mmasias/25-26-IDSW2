import java.util.ArrayList;
import java.util.List;

public class Cancion {
    private String titulo;
    private Letra letra; 
    private Genero genero; 
    private Partitura partitura;
    private Estudio estudio;
    private List<Instrumento> instrumentos = new ArrayList<>(); 


   public Cancion(String titulo, String textoLetra, Genero genero, Compas c, Estudio e) {
        this.titulo = titulo;
        this.genero = genero;
        this.estudio = e;
        this.letra = new Letra(textoLetra);
        this.partitura = new Partitura(c);
    }
    public void agregarInstrumento(Instrumento i) {
        instrumentos.add(i);
    }
}