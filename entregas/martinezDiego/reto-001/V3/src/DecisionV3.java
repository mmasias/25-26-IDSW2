import java.util.LinkedList;

public class DecisionV3 {

    private LinkedList<OpcionV3> opciones;
    private LinkedList<CriterioV3> criterios;
    private ContextoV3 contexto;
    private ResultadoV3 resultado;

    public DecisionV3(LinkedList<CriterioV3> criterios, ContextoV3 contexto) {
        this.opciones = new LinkedList<>();
        this.criterios = criterios;
        this.contexto = contexto;
    }

    public void agregarOpcion(String descripcionOpcion) {
        opciones.add(new OpcionV3(descripcionOpcion));
    }

    public void mostrarOpciones() {
        System.out.println("Opciones disponibles:");
        for (OpcionV3 opcion : opciones) {
            System.out.println("- " + opcion.getDescripcion());
        }
    }

    public ResultadoV3 tomarDecision(EventoV3 evento) {
        System.out.println("Evento recibido: " + evento.getDescripcion());
        System.out.println("Contexto de la decisión: " + contexto.getDescripcion());

        CriterioV3 criterioElegido = criterios.getFirst();
        OpcionV3 opcionElegida = opciones.getFirst();

        System.out.println("Criterio elegido: " + criterioElegido.getDescripcion());
        System.out.println("Opción elegida: " + opcionElegida.getDescripcion());

        resultado = new ResultadoV3(opcionElegida, criterioElegido, evento, contexto);
        resultado.aplicarExperiencia(criterios);

        return resultado;
    }

    public LinkedList<CriterioV3> getCriterios() {
        return criterios;
    }
}