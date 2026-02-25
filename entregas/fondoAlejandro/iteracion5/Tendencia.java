package iteracion5;

import java.util.ArrayList;
import java.util.List;

public class Tendencia {
    private String nombre;
    private List<Cancion> cancionesPopulares;

    public Tendencia(String nombre) {
        this.nombre = nombre;
        this.cancionesPopulares = new ArrayList<>();
    }

    public void agregarCancion(Cancion c) {
        cancionesPopulares.add(c);
    }
}