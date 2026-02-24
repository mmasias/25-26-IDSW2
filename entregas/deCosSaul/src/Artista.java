import java.util.ArrayList;
import java.util.List;
class Artista {
    private String nombreArtistico;
    private List<Cancion> discografia;
    private List<Album> albumes;
    private List<Gira> giras;

    public Artista(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
        this.discografia = new ArrayList<>();
        this.albumes = new ArrayList<>();
        this.giras = new ArrayList<>();
    }

    public void registrarCancion(Cancion c) { this.discografia.add(c); }
    public void publicarAlbum(Album a) { this.albumes.add(a); }
    public void agendarGira(Gira g) { this.giras.add(g); }

    public void componer(Instrumento instrumentoTemporal) {
        System.out.println(this.nombreArtistico + " está componiendo usando " + instrumentoTemporal.getNombre());
    }
}