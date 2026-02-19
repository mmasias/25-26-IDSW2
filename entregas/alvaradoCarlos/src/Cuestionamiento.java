public class Cuestionamiento {

    private String pregunta;
    private Alternativa[] alternativas;

    public Cuestionamiento(String pregunta, Alternativa[] alternativas) {
        this.pregunta = pregunta;
        this.alternativas = alternativas;
    }

    public void añadirAlternativa(Alternativa alternativa){
        for (int i = 0; i < alternativas.length; i++) {
            if (alternativas[i] == null) {
                alternativas[i] = alternativa;
            }
        }
    }

    public void eliminarAlternativa(Alternativa alternativa){
        for (int i = 0; i < alternativas.length; i++) {
            if (alternativas[i] == alternativa) {
                alternativas[i] = null;
            }
        }
    }

    public String pregunta() {
        return pregunta;
    }
}