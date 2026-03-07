public class Cancion {
    private String titulo;
    private Letra letra;
    private Partitura partitura;
    private GeneroMusical genero;
    private Productor productor;
    private Artista interprete;

    
    public Cancion(String titulo, Letra letra, Partitura partitura, 
                   GeneroMusical genero, Productor productor, Artista interprete) {
        this.titulo = titulo;
        this.letra = letra;
        this.partitura = partitura;
        this.genero = genero;
        this.productor = productor;
        this.interprete = interprete;
    }

    public String getTitulo() {
        return titulo;
    }
}