public class Disco {
    // COMPOSICIÓN: El Disco controla la creación de sus canciones.
    public Disco(String titulo) { }

    // Al ser composición, el Disco instancia la Canción internamente.
    // Si el Disco se destruye, la Canción (como parte del álbum) también.
    public void crearPista(String nombreCancion, int duracion) { 
        // Internamente: new Cancion(nombreCancion, duracion);
    }
}