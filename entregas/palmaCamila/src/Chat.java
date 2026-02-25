import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<String> historial = new ArrayList<>();
    
    public String delegaPeticion(String mensaje) {
        historial.add("Usuario: " + mensaje);
        System.out.println("Chat: Delegando a Orquestador...");
        return mensaje;
    }
    
    public void recibirRespuesta(String respuesta) {
        historial.add("Sistema: " + respuesta);
        System.out.println("Chat: " + respuesta);
    }
}
