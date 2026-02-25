package iteracion5;

import java.util.ArrayList;
import java.util.List;

public class SistemaRecomendacion {
    private List<Cancion> recomendaciones;

    public SistemaRecomendacion() {
        this.recomendaciones = new ArrayList<>();
    }

    public void generarRecomendacion(Cancion c) {
        recomendaciones.add(c);
    }
}