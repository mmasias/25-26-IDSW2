import java.util.ArrayList;
import java.util.List;

public class DecisionV2 {

    private List<OpcionV2> opciones;       
    private List<CriterioV2> criterios;    
    private ContextoV2 contexto;           
    private ResultadoV2 resultado;         

    public DecisionV2(List<CriterioV2> criterios, ContextoV2 contexto) {
        this.opciones = new ArrayList<>();
        this.criterios = criterios;
        this.contexto = contexto;
    }

    public void agregarOpcion(String nombre) {
        opciones.add(new OpcionV2(nombre));
    }

    public void mostrarOpciones() {
        System.out.println("Opciones disponibles:");
        for (OpcionV2 opcion : opciones) {
            System.out.println("- " + opcion.getNombre());
        }
    }

    public ResultadoV2 tomarDecision(EventoV2 evento) {
        System.out.println("Evento recibido: " + evento.getDescripcionEvento());

        EvaluacionV2 evaluacion = new EvaluacionV2();
        OpcionV2 elegida = evaluacion.evaluar(opciones, criterios, contexto);

        resultado = new ResultadoV2(elegida);
        return resultado;
    }

    public ResultadoV2 getResultado() {
        return resultado;
    }
}