import java.util.ArrayList;
import java.util.Date;
import java.util.List;

enum TipoSuscripcion {
    GRATUITA, PREMIUM
}

enum EstadoSuscripcion {
    ACTIVA, INACTIVA
}

class PistaAudio {
    private String formato;
    private int bitrate;
    private int duracionSegundos;

    public PistaAudio(String formato, int bitrate, int duracionSegundos) {
        this.formato = formato;
        this.bitrate = bitrate;
        this.duracionSegundos = duracionSegundos;
    }
}

class Cancion {
    private String id;
    private String titulo;
    private PistaAudio pista; 
    
    public Cancion(String id, String titulo, String formatoPista, int bitrate, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.pista = new PistaAudio(formatoPista, bitrate, duracion); 
    }
}

class Album {
    private String titulo;
    private Date fechaLanzamiento;
    private List<Cancion> canciones;
    
    public Album(String titulo, Date fechaLanzamiento) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.canciones = new ArrayList<>();
    }
 
    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }
}

class Artista {
    private String nombre;
    private String biografia;
    private List<Album> albumesPublicados;
    private List<Cancion> sencillos;
    
    public Artista(String nombre, String biografia) {
        this.nombre = nombre;
        this.biografia = biografia;
        this.albumesPublicados = new ArrayList<>();
        this.sencillos = new ArrayList<>();
    }
    
    public void publicarAlbum(Album album) {
        albumesPublicados.add(album);
    }

    public void publicarSencillo(Cancion cancion) {
        sencillos.add(cancion);
    }
}

class Playlist {
    private String nombre;
    private String descripcion;
    private List<Cancion> canciones;
    
    public Playlist(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.canciones = new ArrayList<>();
    }
    
    public void anadirCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void quitarCancion(Cancion cancion) {
        canciones.remove(cancion);
    }
}

class Suscripcion {
    private TipoSuscripcion tipo;
    private EstadoSuscripcion estado;
    private Date fechaInicio;
    
    public Suscripcion(TipoSuscripcion tipo) {
        this.tipo = tipo;
        this.estado = EstadoSuscripcion.ACTIVA;
        this.fechaInicio = new Date();
    }
    
    public void cancelar() {
        this.estado = EstadoSuscripcion.INACTIVA;
    }
}

class Usuario {
    private String nombreUsuario;
    private String email;
    private Suscripcion suscripcion;
    private List<Playlist> playlistsCreadas;
    private List<Playlist> playlistsGuardadas;
    private List<Artista> artistasSeguidos;
    private List<Cancion> cancionesFavoritas;
    
    public Usuario(String nombreUsuario, String email, TipoSuscripcion tipoSuscripcion) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.suscripcion = new Suscripcion(tipoSuscripcion); 
        this.playlistsCreadas = new ArrayList<>();
        this.playlistsGuardadas = new ArrayList<>();
        this.artistasSeguidos = new ArrayList<>();
        this.cancionesFavoritas = new ArrayList<>();
    }

    public Playlist crearPlaylist(String nombre, String descripcion) {
        Playlist nuevaPlaylist = new Playlist(nombre, descripcion);
        playlistsCreadas.add(nuevaPlaylist);
        return nuevaPlaylist;
    }
    
    public void guardarPlaylistExterna(Playlist playlist) {
        if (!playlistsGuardadas.contains(playlist)) {
            playlistsGuardadas.add(playlist);
        }
    }
    
    public void marcarCancionFavorita(Cancion cancion) {
        if (!cancionesFavoritas.contains(cancion)) {
            cancionesFavoritas.add(cancion);
        }
    }

    public void seguirArtista(Artista artista) {
        if (!artistasSeguidos.contains(artista)) {
            artistasSeguidos.add(artista);
        }
    }
}