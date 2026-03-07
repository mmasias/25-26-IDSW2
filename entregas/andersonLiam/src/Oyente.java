public class Oyente {
    private String username;
    private Playlist miPlaylist; 

    public Oyente(String username) {
        this.username = username;
      
        this.miPlaylist = new Playlist("Favoritos de " + username);
    }

    public Playlist getMiPlaylist() {
        return miPlaylist;
    }

    
    public void generarReproduccion(Cancion cancion, Reproductor reproductor) {
        System.out.println(username + " ha pulsado PLAY.");
        Reproduccion evento = new Reproduccion(); 
        evento.procesar(cancion);
        reproductor.emitirAudio();
    }
}