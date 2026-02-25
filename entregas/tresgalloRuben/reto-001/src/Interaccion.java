import java.util.ArrayList;
import java.util.List;

public abstract class Interaccion {
    protected Participante emisor;
    protected List<Participante> receptores;
    protected Intencion intencion;

    public Interaccion() {
        this.receptores = new ArrayList<>();
    }

    public void setEmisor(Participante p) { this.emisor = p; }
    public void agregarReceptor(Participante p) { this.receptores.add(p); }
    public void setIntencion(Intencion i) { this.intencion = i; }

    public Participante getEmisor() { return emisor; }
    public List<Participante> getReceptores() { return receptores; }
    public Intencion getIntencion() { return intencion; }
}