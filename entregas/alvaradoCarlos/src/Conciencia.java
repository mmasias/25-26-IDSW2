import java.util.ArrayList;
import java.util.List;

public class Conciencia {
    private List<Eleccion> eleccionesTomadas;

    public Conciencia() {
        this.eleccionesTomadas = new ArrayList<>();
    }

    public void añadirEleccion(Eleccion eleccion){
        eleccionesTomadas.add(eleccion);
    }

    public void eliminarEleccion(Eleccion eleccion){
        eleccionesTomadas.remove(eleccion);
    }

    public void cuestionarEleccion(Eleccion eleccion, Cuestionamiento cuestionamiento){
        System.out.println("Cuestionando la elección: " + eleccion + " con el cuestionamiento: " + cuestionamiento);
    }
}