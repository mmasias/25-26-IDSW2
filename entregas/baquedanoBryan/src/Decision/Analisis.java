public class Analisis {
    public static Decision procesar(Persona persona, Situacion situacion, Contexto contexto) {
        
        double impactoDelEntorno = contexto.getImpacto();
        persona.getConciencia().ajusteNivelConciencia(impactoDelEntorno);
        
        double lucidezFinal = persona.getConciencia().getNivelConciencia();
        
        Opcion seleccionada = null;

        Motivacion motivacionUsada = null;
        Consecuencia consecuenciaUsada = null;

        if (situacion.getOpciones().isEmpty()) {
            motivacionUsada = new Motivacion("Sin opciones disponibles", 0.0);
            consecuenciaUsada = new Consecuencia("No se pudo tomar decisión", 0.0);
            return new Decision(null, motivacionUsada, consecuenciaUsada);
        }


        if (lucidezFinal < 0.4) {
            double minRacionalidad = Double.MAX_VALUE;
            for (Opcion op : situacion.getOpciones()) {
                if (op.getNivelRacionalidad() < minRacionalidad) {
                    minRacionalidad = op.getNivelRacionalidad();
                    seleccionada = op;
                }
            }
        } else {
            double maxRacionalidad = -Double.MAX_VALUE;
            for (Opcion op : situacion.getOpciones()) {
                if (op.getNivelRacionalidad() > maxRacionalidad) {
                    maxRacionalidad = op.getNivelRacionalidad();
                    seleccionada = op;
                }
            }
        }

        if (seleccionada != null) {
            motivacionUsada = seleccionada.getMotivacion();
            consecuenciaUsada = seleccionada.getConsecuencia();
        }

        double ajuste = 0.0;
        if (motivacionUsada != null) ajuste += motivacionUsada.getImpactoLucidez();
        if (consecuenciaUsada != null) ajuste += consecuenciaUsada.getImpactoLucidez();
        persona.getConciencia().ajusteNivelConciencia(ajuste);

        return new Decision(seleccionada, motivacionUsada, consecuenciaUsada);
    }
}