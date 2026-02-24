import java.util.ArrayList;
import java.util.List;

public class Concierto {
    private String nombre;
    private List<Entrada> entradas;
    private List<Artista> artistas;

    public Concierto(String nombre) {
        this.nombre = nombre;
        this.entradas = new ArrayList<>();
        this.artistas = new ArrayList<>();
    }

    public Entrada emitirEntrada(String codigo) {
        Entrada e = new Entrada(codigo);
        entradas.add(e);
        return e;
    }

    public void incluirArtista(Artista artista) {
        artistas.add(artista);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }
}