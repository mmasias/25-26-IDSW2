import java.util.ArrayList;
import java.util.List;

public class Conversacion {
    private List<Persona> participantes;

    public Conversacion(List<Persona> participantesIniciales) {
        this.participantes = new ArrayList<>(participantesIniciales);
    }

    public void agregarPersona(Persona personas) {
        if (personas != null && !this.participantes.contains(personas)) {
            this.participantes.add(personas);
        }
    }
    
    public List<Persona> getParticipantes() {
        return this.participantes;
    }
}