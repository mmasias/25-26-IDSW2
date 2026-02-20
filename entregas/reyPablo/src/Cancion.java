public class Cancion {
    private String titulo;
    private Letra letra; 
    private Genero genero; 

    public Cancion(String titulo, String textoLetra, Genero genero) {
        this.titulo = titulo;
        this.letra = new Letra(textoLetra); 
        this.genero = genero;
    }
}