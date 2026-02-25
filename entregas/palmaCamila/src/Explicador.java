public class Explicador {
    public String generarExplicacion(String decision) {
        double confianza = 0.78;
        return "**" + decision + "** (" + String.format("%.0f", confianza*100) + "% confianza)";
    }
}
