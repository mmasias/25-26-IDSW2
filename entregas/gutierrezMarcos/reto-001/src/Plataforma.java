public class Plataforma {
    
    public String nombre = "Spotify";

    public Usuario registrarUsuario(String email, String password) {}
    public Usuario iniciarSesion(String email, String password) {}
    public boolean actualizarSuscripcion(Usuario usuario, TipoSuscripcion nuevaSuscripcion) {}

    public List<Cancion> buscarCancion(String palabraClave) {}
    public List<Artista> buscarArtista(String palabraClave) {}
    public List<Album> buscarAlbum(String palabraClave) {}
    public List<Playlist> buscarPlaylistPublica(String palabraClave) {}

    public List<Cancion> obtenerTop50Global() {}
    public List<Cancion> obtenerTop50PorPais(String codigoPais) {}
    public List<Album> obtenerUltimosLanzamientos() {}
    public List<Cancion> generarRadioDeCancion(Cancion cancionBase) {}
    public Playlist generarDescubrimientoSemanal(Usuario usuario) {}

    public void iniciarStreaming(Cancion cancion, Usuario usuario) {}
    public void pausarStreaming(Usuario usuario) {}
    public void registrarReproduccionCompletada(Cancion cancion, Usuario usuario) {} 

    public Artista verificarYRegistrarArtista(String nombre, String selloDiscografico) {}
    public void subirNuevoAlbum(Artista artista, Album nuevoAlbum) {}
    public void reportarProblemaDerechosAutor(Cancion cancion) {}
}