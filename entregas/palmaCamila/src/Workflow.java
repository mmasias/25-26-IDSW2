public class Workflow {
    public String evaluarReglas(String riesgo) {
        if ("alto".equals(riesgo)) {
            return "riesgo alto: priorizar Opción 1";
        }
        return "OK todas las opciones";
    }
}
