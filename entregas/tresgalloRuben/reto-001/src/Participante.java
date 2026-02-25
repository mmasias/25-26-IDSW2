import java.util.ArrayList;
import java.util.List;

public class Participante {
    private List<Conversacion> conversaciones;

    public Participante() {
        this.conversaciones = new ArrayList<>();
    }

    public void agregarConversacionAsociada(Conversacion c) {
        this.conversaciones.add(c);
    }

    public List<Conversacion> getConversaciones() {
        return this.conversaciones;
    }
}