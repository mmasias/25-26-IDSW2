import java.util.ArrayList;
import java.util.List;
class Album {
    protected String titulo;
    protected List<Cancion> canciones; 

    public Album(String titulo) {
        this.titulo = titulo;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion c) {
        this.canciones.add(c);
    }
    public String getTitulo() { return titulo; }
}