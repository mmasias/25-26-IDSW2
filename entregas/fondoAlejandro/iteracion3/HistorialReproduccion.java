package iteracion3;

import java.util.ArrayList;
import java.util.List;

public class HistorialReproduccion {
    private List<Cancion> cancionesReproducidas;

    public HistorialReproduccion() {
        this.cancionesReproducidas = new ArrayList<>();
    }

    public void registrarReproduccion(Cancion c) {
        cancionesReproducidas.add(c);
    }
}