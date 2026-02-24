public class Consecuencia {
    private String efecto;
    private double impactoLucidez;

    public Consecuencia(String efecto, double impactoLucidez) {
        this.efecto = efecto;
        this.impactoLucidez = impactoLucidez;
    }

    public String getEfecto() {
        return efecto;
    }

    public double getImpactoLucidez() {
        return impactoLucidez;
    }
}