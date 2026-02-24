public class Conciencia {
    
    private double nivelConciencia;

    public Conciencia(double nivelInicial) {
        this.nivelConciencia = nivelInicial;
    }

    public double getNivelConciencia() {
        return nivelConciencia;
    }

    public void ajusteNivelConciencia(double ajuste) {
        this.nivelConciencia += ajuste;
        
        if (this.nivelConciencia < 0.0) {
            this.nivelConciencia = 0.0;
        } else if (this.nivelConciencia > 1.00) {
            this.nivelConciencia = 1.00;
        }
    }


}