import java.util.ArrayList;
import java.util.List;

public class Eleccion {
    
    private List<Consecuencia> consecuenciasReales;
    private List<Alternativa> alternativasConsideradas;

    public Eleccion() {
        this.alternativasConsideradas = new ArrayList<>();
        this.consecuenciasReales = new ArrayList<>();
    }

    public void añadirConsecuenciaReal(Consecuencia consecuencia){
        consecuenciasReales.add(consecuencia);
    }

    public void eliminarConsecuenciaReal(Consecuencia consecuencia){
        consecuenciasReales.remove(consecuencia);
    }

    public void seleccionarAlternativa(Alternativa alternativa){
        alternativasConsideradas.add(alternativa);
    }

    public void mostrarEfectosReales(){
        System.out.println("Consecuencias reales de la elección:");
        for (Consecuencia consecuencia : consecuenciasReales) {
            System.out.println(consecuencia.descripcion());
        }
    }
}
