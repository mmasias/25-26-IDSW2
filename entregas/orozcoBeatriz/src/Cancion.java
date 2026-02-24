import java.util.ArrayList;
import java.util.List;

public class Cancion {
    private String titulo;
    private List<Letra> letras;
    private List<Genero> generos;

    public Cancion(String titulo) {
        this.titulo = titulo;
        this.letras = new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void addLetra(Letra letra) {
        letras.add(letra);
    }

    public void addGenero(Genero genero) {
        generos.add(genero);
    }

    public List<Letra> getLetras() {
        return letras;
    }
    public List<Genero> getGeneros() {
        return generos;
    }
}