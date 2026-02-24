import java.util.ArrayList;
import java.util.List;

public class MainEcosistema {
    public static void main(String[] args) {
        
        Instrumento guitarra = new Instrumento("Guitarra Eléctrica");
        Letra letra = new Letra("Let it be, let it be...");
        Partitura partitura = new Partitura("Do Mayor");
        GeneroMusical rock = new GeneroMusical("Rock Clásico");
        Compositor paul = new Compositor("Paul McCartney");
        Productor george = new Productor("George Martin");
        Reproductor appMusica = new Reproductor();

     
        Artista vocalista = new Artista("Paul");
        vocalista.tocar(guitarra);

        
        List<Artista> miembros = new ArrayList<>();
        miembros.add(vocalista);
        Banda theBeatles = new Banda("The Beatles", miembros);

       
        Cancion letItBe = new Cancion("Let It Be", letra, partitura, rock, paul, george);

        
        List<Cancion> cancionesAlbum = new ArrayList<>();
        cancionesAlbum.add(letItBe);
        Album albumLetItBe = new Album("Let It Be Album", cancionesAlbum);

       
        Oyente juan = new Oyente("JuanRock99"); 
        juan.getMiPlaylist().añadirCancion(letItBe); 
        
        System.out.println("--- Acción del usuario ---");
        juan.escuchar(letItBe, appMusica); 
    }
}