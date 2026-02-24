import java.util.ArrayList;
import java.util.List;
class Gira {
    private String nombre;
    private List<Concierto> conciertos; 

    public Gira(String nombre, String[] ciudadesDestino) {
        this.nombre = nombre;
        this.conciertos = new ArrayList<>();
        for (String ciudad : ciudadesDestino) {
            this.conciertos.add(new Concierto(ciudad)); 
        }
    }
    public String getNombre() { return nombre; }
}