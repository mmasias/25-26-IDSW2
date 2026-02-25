public class IngenieroDeSonido {
    public IngenieroDeSonido(String nombre) { }

    // USO: Interactúa con el instrumento solo para la ecualización.
    public void ecualizar(Instrumento i) {
        i.sonar();
    }
}