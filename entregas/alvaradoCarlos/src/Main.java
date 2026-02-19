public class Main {
    public static void main(String[] args) {
        Cuestionamiento cuestionamiento = new Cuestionamiento("¿Qué prefieres hacer en las tardes, dormir o estudiar?", new Alternativa[2]);
        Alternativa dormir = new Alternativa();
        Alternativa estudiar = new Alternativa();
        cuestionamiento.añadirAlternativa(dormir);
        cuestionamiento.añadirAlternativa(estudiar);
        Consecuencia descansar = new Consecuencia("Descansar");
        Consecuencia aprender = new Consecuencia("Aprender cosas nuevas");
        Consecuencia aburrirse = new Consecuencia("Aburrirse");
        Consecuencia cansarse = new Consecuencia("Cansarse");
        dormir.añadirConsecuenciaProbable(descansar);
        estudiar.añadirConsecuenciaProbable(aburrirse);
        estudiar.añadirConsecuenciaProbable(cansarse);
        estudiar.añadirConsecuenciaProbable(aprender);
        Conciencia conciencia = new Conciencia();
        Eleccion eleccion = new Eleccion();
        conciencia.añadirEleccion(eleccion);
        eleccion.seleccionarAlternativa(estudiar);
        eleccion.añadirConsecuenciaReal(aprender);
        eleccion.añadirConsecuenciaReal(cansarse);
        eleccion.añadirConsecuenciaReal(aburrirse);
        eleccion.mostrarEfectosReales();

    }
}
