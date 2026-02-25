public class Cantante {
    public Cantante(String nombre) { }

    public void vincularDisco(Disco disco) { }

    public void gestionarPlaylist(Playlist playlist) { 
        playlist.ejecutar();
    }

    // Uso: El cantante toma un instrumento, lo toca y lo suelta
    public void usarInstrumento(Instrumento instrumento) {
        instrumento.sonar();
    }
}