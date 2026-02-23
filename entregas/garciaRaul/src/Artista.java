import java.util.ArrayList;
import java.util.List;

class Artista {
    
    private String nombreArtistico;
    private Genero estilo;
    private Discografica sello;
    private Contrato contratoActual;
    private List<Album> discografia;
    private List<Cancion> repertorio;
    private List<Gira> tours;
    private List<Miembro> banda;
    private List<Artista> colaboradores;

     public Artista(String nombre, Genero genero, List<Miembro> miembros Iniciales, List<Album> albumsExistentes) {
        this.nombreArtistico = nombre;
        this.estilo = genero;
        this.banda = miembros Iniciales;
        this.discografia = albumsExistentes;
        this.repertorio = new ArrayList<Cancion>();
        this.tours = new ArrayList<Gira>();
        this.colaboradores = new ArrayList<Artista>();
        this.sello = null; 
        this.contratoActual = null;
    }

    public Artista() {
    }

    public void cambiarNombreArtistico(String nuevoNombre) {
        this.nombreArtistico = nuevoNombre;
    }

    public void evolucionarGenero(String nuevoEstilo) {
        this.estilo.actualizarEstilo(nuevoEstilo);
    }

    public void publicarAlbum(Album nuevoAlbum) {
        this.discografia.add(nuevoAlbum);
    }

    public void componerCancion(Cancion nuevaCancion) {
        this.repertorio.add(nuevaCancion);
    }

    public void ficharPorDiscografica(Discografica empresa, String clausulas) {
        this.sello = empresa;
        this.contratoActual = new Contrato(clausulas);
    }

    public void rescindirContrato() {
        this.sello = null;
        this.contratoActual = null;
    }

    public void iniciarGira(Gira nuevaGira) {
        this.tours.add(nuevaGira);
    }

    public void finalizarGira(Gira gira) {
        this.tours.remove(gira);
    }

    public void integrarMiembro(Miembro nuevoMiembro) {
        this.banda.add(nuevoMiembro);
    }

    public void expulsarMiembro(Miembro miembro) {
        this.banda.remove(miembro);
    }

    public void registrarColaboracion(Artista colega) {
        this.colaboradores.add(colega);
    }

    public void terminarColaboracion(Artista colega) {
        this.colaboradores.remove(colega);
    }

}