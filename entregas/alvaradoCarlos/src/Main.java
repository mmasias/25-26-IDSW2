public class Main {
    public static void main(String[] args) {

        Entorno contextoAcademico = new Entorno("Académico", "Temporada de Exámenes Finales");
        Entorno contextoSocial = new Entorno("Social", "Círculo de amigos activo");

        Sentimiento ambicion = new Sentimiento("Ambición Académica");
        ambicion.agregarEmocion("Entusiasmo", 8);
        
        Cuestionamiento duda = new Cuestionamiento("¿Debo estudiar este fin de semana?", new Alternativa[2]);
        contextoAcademico.dispararCuestionamiento(duda); 
        ambicion.dispararCuestionamiento(duda);

        Alternativa estudiar = new Alternativa();
        Consecuencia exito = new Consecuencia("Aprobar el examen", contextoAcademico);
        Consecuencia noSocializar = new Consecuencia("No salir con amigos", contextoSocial);
        
        estudiar.añadirConsecuenciaProbable(exito);
        estudiar.añadirConsecuenciaProbable(noSocializar);
        duda.añadirAlternativa(estudiar);

        if (contextoAcademico.esViable(estudiar)) {
            
            Conciencia miConciencia = new Conciencia();
            Eleccion eleccion = new Eleccion();
            eleccion.seleccionarAlternativa(estudiar);
            miConciencia.añadirEleccion(eleccion);

            eleccion.añadirConsecuenciaReal(exito);
            eleccion.añadirConsecuenciaReal(noSocializar);
            
            System.out.println("--- Reporte de la Elección ---");
            eleccion.mostrarEfectosReales();

            exito.aplicarEfectoEnEntorno("Materia Dominada / Promedio Alto");
            noSocializar.aplicarEfectoEnEntorno("Aislamiento social temporal");

            Emocion satisfaccion = exito.generarRespuestaEmocional("Satisfacción", 10);
            Emocion arrepentimiento = noSocializar.generarRespuestaEmocional("Arrepentimiento", 5);

            System.out.println("\n--- Resumen de Estado Final ---");
            System.out.println("Sentimiento: " + ambicion.nombre());
            System.out.println("Impacto Emocional: " + satisfaccion.tipo() + " y " + arrepentimiento.tipo());
            System.out.println("Estado Final del Entorno Académico: " + contextoAcademico.estadoActual());
            
        } else {
            System.out.println("BLOQUEO CRÍTICO: El entorno actual no permite ejecutar la alternativa seleccionada.");
        }
    }
}