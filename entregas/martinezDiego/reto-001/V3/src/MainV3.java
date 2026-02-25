import java.util.LinkedList;

public class MainV3 {

    public static void main(String[] args) {

        LinkedList<CriterioV3> criterios = new LinkedList<>();
        criterios.add(new CriterioV3("Responder rápido", 4));
        criterios.add(new CriterioV3("Mantener la calma", 5));
        criterios.add(new CriterioV3("Analizar la situación", 3));

        ContextoV3 contexto = new ContextoV3("Reunión de trabajo");

        DecisionV3 decision = new DecisionV3(criterios, contexto);

        decision.agregarOpcion("Responder con enfado");
        decision.agregarOpcion("Ignorar el comentario");
        decision.agregarOpcion("Responder de manera calmada");

        decision.mostrarOpciones();

        System.out.println("");

        EventoV3 evento = new EventoV3("Me hablan mal", contexto);

        System.out.println("");
        

        ResultadoV3 resultado = decision.tomarDecision(evento);

        System.out.println("");

        System.out.println("RESULTADO ---");
        System.out.println("Opción seleccionada: " + resultado.getOpcion().getDescripcion());
        System.out.println("Criterio usado: " + resultado.getCriterio().getDescripcion());
        System.out.println("Experiencia generada: " + resultado.getExperiencia().getDescripcion());
        System.out.println("Impacto de la experiencia: " + resultado.getExperiencia().getImpacto());

        System.out.println("");

        System.out.println(" CRITERIOS ACTUALIZADOS ---");
        for (CriterioV3 nuevoCriterio : decision.getCriterios()) {
            System.out.println(nuevoCriterio.getDescripcion() + " → peso: " + nuevoCriterio.getPeso());
        }
    }
}