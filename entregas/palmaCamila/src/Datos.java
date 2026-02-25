public class Datos {
    private int edad = 35;
    private String riesgo = "alto";
    private String presupuesto = "medio";
    
    public String getContexto() {
        return String.format("[edad=%d, riesgo=%s, presupuesto=%s]", edad, riesgo, presupuesto);
    }
}
