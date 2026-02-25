import java.util.ArrayList;
import java.util.List;

public class Conversacion {
    private List<Persona> participantes;
    private List<Mensaje> historial;
    private Medio medioActual;

    public Conversacion(List<Persona> participantes, Medio medio) {
        this.participantes = new ArrayList<>(participantes);
        this.medioActual = medio;
        this.historial = new ArrayList<>();
    }

    public void realizarIntercambio(Persona emisor, String idea, Idioma idioma) {
        Contenido contenido = emisor.emitirMensaje(idea, idioma);
        
        Mensaje nuevoMsj = new Mensaje(contenido, this.medioActual);
        this.historial.add(nuevoMsj);
    }
}