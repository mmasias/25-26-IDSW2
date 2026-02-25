package iteracion4;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String titulo;
    private List<Cancion> canciones;

    public Album(String titulo) {
        this.titulo = titulo;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion c) {
        canciones.add(c);
    }
}