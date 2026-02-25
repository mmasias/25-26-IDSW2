import java.util.List;

public class EvaluacionV2 {

    public OpcionV2 evaluar(List<OpcionV2> opciones, List<CriterioV2> criterios, ContextoV2 contexto) {
       

        if (opciones == null || opciones.isEmpty()) {
            return null;
        }

       
        return opciones.get(0);
    }
}