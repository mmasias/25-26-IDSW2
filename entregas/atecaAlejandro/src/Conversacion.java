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

    public void registrarMensaje(String texto) {
        Contenido contenido = new Palabras(texto);
        Mensaje nuevoMsj = new Mensaje(contenido, this.medioActual);
        this.historial.add(nuevoMsj);
    }
}