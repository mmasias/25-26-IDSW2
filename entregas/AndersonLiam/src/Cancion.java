public class Cancion {
    private String titulo;
    private Letra letra;
    private Partitura partitura;
    private GeneroMusical genero;
    private Compositor compositor;
    private Productor productor;

    
    public Cancion(String titulo, Letra letra, Partitura partitura, 
                   GeneroMusical genero, Compositor compositor, Productor productor) {
        this.titulo = titulo;
        this.letra = letra;
        this.partitura = partitura;
        this.genero = genero;
        this.compositor = compositor;
        this.productor = productor;
    }

    public String getTitulo() { return titulo; }
}