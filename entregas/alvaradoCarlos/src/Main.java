public class Main {
    public static void main(String[] args) {
        Sentimiento ambicion = new Sentimiento("Ambición Académica");
        ambicion.agregarEmocion("Entusiasmo", 8);
        
        Cuestionamiento duda = new Cuestionamiento("¿Debo estudiar este fin de semana?", new Alternativa[2]);
        ambicion.dispararCuestionamiento(duda);

        Alternativa estudiar = new Alternativa();
        Consecuencia exito = new Consecuencia("Aprobar el examen");
        Consecuencia NoSocializar = new Consecuencia("No salir con amigos");
        estudiar.añadirConsecuenciaProbable(exito);
        estudiar.añadirConsecuenciaProbable(NoSocializar);

        duda.añadirAlternativa(estudiar);

        Conciencia miConciencia = new Conciencia();
        Eleccion eleccion = new Eleccion();
        eleccion.seleccionarAlternativa(estudiar);

        miConciencia.añadirEleccion(eleccion);

        eleccion.añadirConsecuenciaReal(exito);
        eleccion.añadirConsecuenciaReal(NoSocializar);

        eleccion.mostrarEfectosReales();

        Emocion satisfaccion = exito.generarRespuestaEmocional("Satisfacción", 10);
        Emocion arrepentimiento = NoSocializar.generarRespuestaEmocional("Arrepentimiento", 5);

        System.out.println("Estado final: " + ambicion.nombre() + 
                           " procesado con emoción de: " + satisfaccion.tipo() + 
                           " y con emoción secundaria de: " + arrepentimiento.tipo());

    }
}
