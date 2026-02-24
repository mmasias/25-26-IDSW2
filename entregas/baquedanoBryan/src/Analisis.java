public class Analisis {
    public static Decision procesar(Persona persona, Situacion situacion, Contexto contexto) {
        
        double impactoDelEntorno = contexto.getImpacto();
        persona.getConciencia().ajusteNivelConciencia(impactoDelEntorno);
        
        double lucidezFinal = persona.getConciencia().getNivelConciencia();
        
        Opcion seleccionada;
        Motivacion motivo;
        Consecuencia efecto;


        if (lucidezFinal < 0.4) {
            seleccionada = situacion.getOpciones().get(situacion.getOpciones().size() - 1);
            motivo = new Motivacion("Reacción impulsiva por colapso sensorial");

            if (persona.getCapacidades().tieneHabilidad("Manejo de armas")) {
                efecto = new Consecuencia("Tragedia: El acto se ejecuta con precisión letal.");
            } else {
                efecto = new Consecuencia("Accidente: El acto es torpe y el resultado es incierto.");
            }
            
        } else {
            seleccionada = situacion.getOpciones().get(0);
            motivo = new Motivacion("Análisis lógico y preservación del orden");
            efecto = new Consecuencia("Mantenimiento de la estabilidad");
        }

        return new Decision(seleccionada, motivo, efecto);
    }
}