public class Motivacion {
    private String causa;
    private double impactoLucidez;

    public Motivacion(String causa, double impactoLucidez) {
        this.causa = causa;
        this.impactoLucidez = impactoLucidez;
    }

    public String getCausa() {
        return causa;
    }

    public double getImpactoLucidez() {
        return impactoLucidez;
    }
}
