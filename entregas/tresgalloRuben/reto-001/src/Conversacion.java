import java.util.ArrayList;
import java.util.List;

public class Conversacion {
    private List<Turno> turnos;

    private List<Participante> participantes;
    private List<Tema> temas;
    private Contexto contexto;
    private Medio medio;
    private Estado estado;
    private Resultado resultado;

    public Conversacion() {
        this.turnos = new ArrayList<>();
        this.participantes = new ArrayList<>();
        this.temas = new ArrayList<>();
    }

    public Turno crearNuevoTurnoInterno() {
        Turno nuevoTurno = new Turno();
        this.turnos.add(nuevoTurno);
        return nuevoTurno;
    }

    public void agregarTemaAgregado(Tema t) { this.temas.add(t); }
    public void agregarParticipanteAsociado(Participante p) { this.participantes.add(p); }
    public void setContexto(Contexto c) { this.contexto = c; }
    public void setMedio(Medio m) { this.medio = m; }
    public void setEstado(Estado e) { this.estado = e; }
    public void setResultado(Resultado r) { this.resultado = r; }

    public List<Turno> getTurnos() { return turnos; }
    public List<Participante> getParticipantes() { return participantes; }
    public List<Tema> getTemas() { return temas; }
    public Contexto getContexto() { return contexto; }
    public Medio getMedio() { return medio; }
    public Estado getEstado() { return estado; }
    public Resultado getResultado() { return resultado; }
}