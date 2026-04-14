package src;
class Turno {
    private int valor;

    public Turno() {
        valor = (int) (Math.random() * 2); // Inicio aleatorio
    }

    public int leToca() { return valor; }

    public int noLeToca() { return (valor + 1) % 2; }

    public void cambiar() { valor = noLeToca(); }
}