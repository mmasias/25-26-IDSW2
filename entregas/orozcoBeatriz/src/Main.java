
public class Main {

    public static void main(String[] args) {

        Genero reggaeton = new Genero("Reggaetón");
        Genero trapLatino = new Genero("Trap latino");
        Instrumento voz = new Instrumento("Voz");
        Instrumento sintetizador = new Instrumento("Sintetizador");

        Discografica sello = new Discografica("Rimas Music");

        Artista badBunny = new Artista("Bad Bunny");
        badBunny.trabajarCon(sello);
        badBunny.especializarEn(reggaeton);
        badBunny.especializarEn(trapLatino);
        badBunny.tocar(voz);

        Cancion cancion = new Cancion("Tití Me Preguntó");
        Letra letra = new Letra("ES", "Tití me preguntó si tengo muchas novias...");
        cancion.addLetra(letra);
        cancion.addGenero(reggaeton);

        Compositor compositor = new Compositor("Benito Antonio Martínez Ocasio");
        compositor.componer(cancion);

        Grabacion grabacion = new Grabacion("Estudio (Puerto Rico)", cancion);
        grabacion.utilizarInstrumento(sintetizador);
        badBunny.grabar(grabacion);

        Album album = new Album("Un Verano Sin Ti");
        album.incluirGrabacion(grabacion);
        sello.publicar(album);

        Concierto concierto = new Concierto("Concierto: Un Verano Sin Ti - Tour");
        concierto.incluirArtista(badBunny);
        concierto.emitirEntrada("BB-ENT-001");
        concierto.emitirEntrada("BB-ENT-002");
        concierto.emitirEntrada("BB-ENT-003");

        System.out.println("BAD BUNNY");
        System.out.println();

        System.out.println("Artista: " + badBunny.getNombre());
        System.out.println("Discográfica: " + badBunny.getDiscografica().getNombre());
        System.out.println("Instrumentos: " + badBunny.getInstrumentos().size());
        System.out.println("Géneros: " + badBunny.getGeneros().size());
        System.out.println("Grabaciones: " + badBunny.getGrabaciones().size());

        System.out.println();
        System.out.println("Álbum: " + album.getTitulo());
        System.out.println("Grabaciones en el álbum: " + album.getGrabaciones().size());

        System.out.println();
        System.out.println("Grabación: " + grabacion.getEstudio());
        System.out.println("Canción grabada: " + grabacion.getCancion().getTitulo());

        System.out.println();
        System.out.println("Canción: " + cancion.getTitulo());
        System.out.println("Letras: " + cancion.getLetras().size());
        System.out.println("Géneros de la canción: " + cancion.getGeneros().size());

        System.out.println();
        System.out.println("Compositor: " + compositor.getNombre());
        System.out.println("Obras del compositor: " + compositor.getObras().size());

        System.out.println();
        System.out.println("Concierto: " + concierto.getNombre());
        System.out.println("Artistas en el concierto: " + concierto.getArtistas().size());
        System.out.println("Entradas emitidas: " + concierto.getEntradas().size());

        System.out.println();
        System.out.println("Discográfica publica álbumes: " + sello.getAlbums().size());
    }
}