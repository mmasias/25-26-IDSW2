import java.util.List;

public class EvaluacionV1 {

    public OpcionV1 evaluar(List<OpcionV1> opciones, List<CriterioV1> criterios) {
        if (opciones == null || opciones.isEmpty()) {
            return null;
        }
        return opciones.get(0);
    }
}