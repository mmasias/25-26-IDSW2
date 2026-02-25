import java.util.ArrayList;
import java.util.List;

public class DecisionV1 {

    private List<OpcionV1> opciones;
    private List<CriterioV1> criterios;
    private ContextoV1 contexto;
    private ResultadoV1 resultado;

    public DecisionV1(List<CriterioV1> criterios, ContextoV1 contexto) {
        this.opciones = new ArrayList<>();
        this.criterios = criterios;
        this.contexto = contexto;
    }

    public void addOpcion(String nombre) {
        opciones.add(new OpcionV1(nombre));
    }

    public void tomarDecision() {
        EvaluacionV1 evaluacion = new EvaluacionV1();
        OpcionV1 elegida = evaluacion.evaluar(opciones, criterios);
        resultado = new ResultadoV1(elegida);
    }

    public ResultadoV1 getResultado() {
        return resultado;
    }
}