public class Entorno {
    private String tipo;
    private String estadoActual;

    public Entorno(String tipo, String estadoActual) {
        this.tipo = tipo;
        this.estadoActual = estadoActual;
    }

    public void dispararCuestionamiento(Cuestionamiento cuestionamiento) {
        System.out.println("[ENTORNO " + tipo + "] Debido a: " + estadoActual + 
                           ", se genera el cuestionamiento: " + cuestionamiento.pregunta());
    }

    public String estadoActual() {
        return estadoActual;
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estadoActual = nuevoEstado;
        System.out.println("[ENTORNO] El estado ha cambiado a: " + nuevoEstado);
    }

    public boolean esViable(Alternativa alternativa) {
        System.out.println("Evaluando viabilidad en entorno " + tipo + "...");
        return true;
    }
}