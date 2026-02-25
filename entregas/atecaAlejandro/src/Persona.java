public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }


    public Contenido emitirMensaje(String idea, Idioma idioma) {
        if (idea == null || idea.isEmpty()) {
            return new Silencio(5);
        }
        String textoTraducido = idioma.procesar(idea);
        return new Palabras(textoTraducido);
    }
}