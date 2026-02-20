public class CriterioV1 {

    private String nombre;
    private int peso;

    public CriterioV1(String nombre) {
        this.nombre = nombre;
        this.peso = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}