public class Main {
    public static void main(String[] args) {
        System.out.println("ECOSISTEMA MUSICAL");
        System.out.println("==================");

        Instrumento guitarra = new Instrumento("Guitarra");
        Artista queen = new Artista("Queen");
        Artista linkinPark = new Artista("Linkin Park");

        queen.componer(guitarra);
        Cancion bohemianRhapsody = new Cancion("Bohemian Rhapsody");
        Cancion numb = new Cancion("Numb");
        
        queen.registrarCancion(bohemianRhapsody);
        linkinPark.registrarCancion(numb);

        Album nightAtTheOpera = new Album("A Night at the Opera");
        nightAtTheOpera.agregarCancion(bohemianRhapsody);
        
        Album meteora = new Album("Meteora");
        meteora.agregarCancion(numb); 
        
        EdicionDisco remaster2011 = new EdicionDisco("A Night at the Opera (Remaster)", 2011);
        remaster2011.agregarCancion(bohemianRhapsody);

        queen.publicarAlbum(nightAtTheOpera);

        String[] ciudadesTour = {"Londres", "París", "Madrid"};
        Gira magicTour = new Gira("Magic Tour", ciudadesTour);
        queen.agendarGira(magicTour);

        Aplicacion spotify = new Aplicacion("Spotify");
        
        Playlist exitos70s = new Playlist("Éxitos de los 70s");
        exitos70s.agregarCancion(bohemianRhapsody);
        spotify.alojarPlaylist(exitos70s);

        Usuario saul = new Usuario("Saul", spotify);
        saul.escuchar();
        
        System.out.println("SIMULACIÓN FINALIZADA");
    }
}