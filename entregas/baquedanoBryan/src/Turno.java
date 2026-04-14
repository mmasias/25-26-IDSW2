
public class Turno {

    private int valor;

    public Turno() {
        valor = (int) (Math.random() * 2);
    }

    public int toca() {
        return valor;
    }

    public void cambiar() {
        valor = this.noLeToca();
    }

    public int noLeToca() {
        return (valor + 1) % 2;
    }
    public static void main(String[] args) {
        Turno turno = new Turno();
        System.out.println(turno.toca());
        turno.cambiar(); System.out.println(turno.toca());
        turno.cambiar(); System.out.println(turno.toca());
        turno.cambiar(); System.out.println(turno.toca());
        turno.cambiar(); System.out.println(turno.toca());

    }
}
