package iteracion4;

import java.util.ArrayList;
import java.util.List;

public class Ranking {
    private List<Cancion> cancionesPopulares;

    public Ranking() {
        this.cancionesPopulares = new ArrayList<>();
    }

    public void agregarCancion(Cancion c) {
        cancionesPopulares.add(c);
    }
}