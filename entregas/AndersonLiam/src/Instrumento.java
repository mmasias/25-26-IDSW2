public class Instrumento {
    private String tipo;

    public Instrumento(String tipo) {
        this.tipo = tipo;
    }

    public void emitirNota() {
        System.out.println("Sonando " + tipo);
    }
}