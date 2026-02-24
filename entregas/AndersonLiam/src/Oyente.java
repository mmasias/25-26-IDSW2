public class Oyente {
    private String username;
    private Playlist miPlaylist; // COMPOSICIÓN

    public Oyente(String username) {
        this.username = username;
        this.miPlaylist = new Playlist("Favoritos de " + username);
    }

    public Playlist getMiPlaylist() {
        return miPlaylist;
    }

   
    public void escuchar(Cancion cancion, Reproductor reproductor) {
        System.out.println(username + " ha pulsado play.");
        reproductor.reproducir(cancion);
    }
}