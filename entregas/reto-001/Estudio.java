public class Estudio {
    // USO: El estudio es el escenario donde coinciden los actores.
    // No mantiene referencias permanentes a ninguno.
    public void realizarSesion(Cantante c, Instrumento i, IngenieroDeSonido eng) {
        eng.ecualizar(i);
        c.actuar(i, new Microfono()); 
    }
}