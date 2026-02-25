
import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nombre;

    private Discografica discografica;
    private List<Grabacion> grabaciones;
    private List<Instrumento> instrumentos;
    private List<Genero> generos;

    public Artista(String nombre) {
        this.nombre = nombre;
        this.grabaciones = new ArrayList<>();
        this.instrumentos = new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public void trabajarCon(Discografica d) {
        this.discografica = d;
    }

    public void grabar(Grabacion g) {
        grabaciones.add(g);
    }

    public void tocar(Instrumento i) {
        instrumentos.add(i);
    }

    public void especializarEn(Genero g) {
        generos.add(g);
    }

    public void colaborarCon(Compositor c) {

    }

    public String getNombre() {
        return nombre;
    }

    public Discografica getDiscografica() {
        return discografica;
    }

    public List<Grabacion> getGrabaciones() {
        return grabaciones;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public List<Genero> getGeneros() {
        return generos;
    }
}