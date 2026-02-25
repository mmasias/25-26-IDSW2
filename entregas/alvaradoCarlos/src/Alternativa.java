import java.util.ArrayList;
import java.util.List;

public class Alternativa {

    private List<Consecuencia> consecuenciasProbables;

    public Alternativa() {
        this.consecuenciasProbables = new ArrayList<>();
    }

    public void añadirConsecuenciaProbable(Consecuencia consecuencia){
        consecuenciasProbables.add(consecuencia);
    }
}
