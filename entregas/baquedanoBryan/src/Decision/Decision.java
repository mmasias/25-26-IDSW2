public class Decision {
    private Opcion opcionElegida; 
    private Motivacion motivacion;     
    private Consecuencia consecuencia;  

    public Decision(Opcion opcion, Motivacion motivacion, Consecuencia consecuencia) {
        this.opcionElegida = opcion;
        this.motivacion = motivacion;
        this.consecuencia = consecuencia;
    }

    public void mostrarResultado() {
        System.out.println("--- RESULTADO DE LA DECISIÓN ---");
        System.out.println("Acción: " + opcionElegida.getDescripcion());
        System.out.println("Motivo: " + motivacion.getCausa());
        System.out.println("Impacto final: " + consecuencia.getEfecto());
    }
}