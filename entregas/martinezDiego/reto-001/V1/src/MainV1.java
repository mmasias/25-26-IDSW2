import java.util.ArrayList;
import java.util.List;

public class MainV1 {

    public static void main(String[] args) {

        List<CriterioV1> criterios = new ArrayList<>();
        criterios.add(new CriterioV1("Costo"));
        criterios.add(new CriterioV1("Calidad"));
        criterios.add(new CriterioV1("Tiempo"));

        ContextoV1 contexto = new ContextoV1("Elección de portátil para la universidad");

        DecisionV1 decision = new DecisionV1(criterios, contexto);

        decision.addOpcion("Portátil A");
        decision.addOpcion("Portátil B");
        decision.addOpcion("Portátil C");

        decision.tomarDecision();

        ResultadoV1 resultado = decision.getResultado();

        if (resultado != null) {
            System.out.println("Opción elegida: " + resultado.getOpcionElegida().getNombre());
            System.out.println("Experiencia generada: " + resultado.getExperiencia().getDescripcion());
        } else {
            System.out.println("No se pudo tomar una decisión.");
        }
    }
}