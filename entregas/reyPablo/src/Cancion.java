public class Cancion {
    private String titulo;
    private Letra letra;

    public Cancion(String titulo, String textoLetra) {
        this.titulo = titulo;
        this.letra = new Letra(textoLetra);
    }
}