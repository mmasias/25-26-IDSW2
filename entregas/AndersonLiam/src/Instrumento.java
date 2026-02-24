public class Instrumento {
    private String tipo;

    public Instrumento(String tipo) {
        this.tipo = tipo;
    }
    public void sonar() {
        System.out.println("Sonando el instrumento: " + tipo);
    }
}