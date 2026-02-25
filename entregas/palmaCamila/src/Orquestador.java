public class Orquestador {
    private MotorDecision motorDecision;

    public Orquestador() {
        this.motorDecision = new MotorDecision();
    }

    public String procesarPeticion(String peticion) {
        return motorDecision.decide(peticion);
    }
}
