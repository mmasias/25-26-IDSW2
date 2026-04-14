class Turno {

    private int indiceActual;

    public Turno() {
        indiceActual = (int) (Math.random() * 2);
    }

    public int leToca() {
        return indiceActual;
    }

    public int noLeToca() {
        return (indiceActual + 1) % 2;
    }

    public void cambiar() {
        indiceActual = this.noLeToca();
    }
}
