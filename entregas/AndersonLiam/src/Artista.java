public class Artista {
    private String nombre;

    public Artista(String nombre) {
        this.nombre = nombre;
    }


    public void tocar(Instrumento instrumento) {
        System.out.print(nombre + " está tocando... ");
        instrumento.sonar();
    }
    
    public String getNombre() { return nombre; }
}