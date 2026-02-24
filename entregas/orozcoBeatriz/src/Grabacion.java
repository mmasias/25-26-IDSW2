public class Grabacion {
    private String estudio;
    private Cancion cancion;

    public Grabacion(String estudio, Cancion cancion) {
        this.estudio = estudio;
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void utilizarInstrumento(Instrumento instrumento) {
    }

    public String getEstudio() {
        return estudio;
    }
}