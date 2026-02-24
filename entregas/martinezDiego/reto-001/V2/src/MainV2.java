import java.util.ArrayList;
import java.util.List;

public class MainV2 {
    public static void main(String[] args) {

        List<CriterioV2> criterios = new ArrayList<>();
        criterios.add(new CriterioV2("Respeto"));
        criterios.add(new CriterioV2("Evitar conflictos"));

        ContextoV2 contexto = new ContextoV2("El que habla mal es tu jefe");

        DecisionV2 decision = new DecisionV2(criterios, contexto);

        decision.agregarOpcion("Callar");
        decision.agregarOpcion("Responder educadamente");
        decision.agregarOpcion("Responder agresivamente");

        decision.mostrarOpciones();

        EventoV2 evento = new EventoV2("Alguien te habla mal");

        ResultadoV2 resultado = decision.tomarDecision(evento);

        System.out.println("");

        System.out.println("Resultado:");
        System.out.println("Opción elegida: " + resultado.getOpcionElegida().getNombre());
        System.out.println("Experiencia: " + resultado.getExperiencia());
    }
}