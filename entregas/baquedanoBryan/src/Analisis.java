public class Analisis {
    public static Decision procesar(Persona persona, Situacion situacion, Contexto contexto) {
        
        double impactoDelEntorno = contexto.getImpacto();
        persona.getConciencia().ajusteNivelConciencia(impactoDelEntorno);
        
        double lucidezFinal = persona.getConciencia().getNivelConciencia();
        
        Opcion seleccionada = null;
        Motivacion motivo;
        Consecuencia efecto;

        if (situacion.getOpciones().isEmpty()) {
            motivo = new Motivacion("Sin opciones disponibles");
            efecto = new Consecuencia("No se pudo tomar decisión");
            return new Decision(null, motivo, efecto);
        }

        if (lucidezFinal < 0.4) {
            double minRacionalidad = Double.MAX_VALUE;
            for (Opcion op : situacion.getOpciones()) {
                if (op.getNivelRacionalidad() < minRacionalidad) {
                    minRacionalidad = op.getNivelRacionalidad();
                    seleccionada = op;
                }
            }
            motivo = new Motivacion("Reacción impulsiva por colapso sensorial");
            if (persona.getCapacidades().tieneHabilidad("Manejo de armas")) {
                efecto = new Consecuencia("Tragedia: El acto se ejecuta con precisión letal.");
            } else {
                efecto = new Consecuencia("Accidente: El acto es torpe y el resultado es incierto.");
            }
        } else {
            double maxRacionalidad = -Double.MAX_VALUE;
            for (Opcion op : situacion.getOpciones()) {
                if (op.getNivelRacionalidad() > maxRacionalidad) {
                    maxRacionalidad = op.getNivelRacionalidad();
                    seleccionada = op;
                }
            }
            motivo = new Motivacion("Análisis lógico y preservación del orden");
            efecto = new Consecuencia("Mantenimiento de la estabilidad");
        }

        return new Decision(seleccionada, motivo, efecto);
    }
}