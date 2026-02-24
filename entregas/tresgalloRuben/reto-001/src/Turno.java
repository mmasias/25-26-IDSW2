import java.util.ArrayList;
import java.util.List;

public class Turno {
    private Participante participanteActivo;
    private List<Interaccion> interacciones;

    public Turno() {
        this.interacciones = new ArrayList<>();
    }

    public void setParticipanteActivo(Participante p) { this.participanteActivo = p; }
    public void agregarInteraccion(Interaccion i) { this.interacciones.add(i); }

    public Participante getParticipanteActivo() { return participanteActivo; }
    public List<Interaccion> getInteracciones() { return interacciones; }
}