public class Artista {
    private String nombre;

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    // USO: Pasa el instrumento por parámetro de forma puntual
    public void tocar(Instrumento instrumento) {
        System.out.print(nombre + " se prepara para tocar. ");
        instrumento.sonar();
    }
}