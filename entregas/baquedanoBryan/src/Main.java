public class Main {
    public static void main(String[] args) {
        
        Capacidades habilidades = new Capacidades();
        habilidades.aprender("Manejo de armas");
        habilidades.aprender("Caminar bajo el sol");

        Persona meursault = new Persona("Meursault", 1.0, habilidades);

        Contexto playaArgel = new Contexto("Playa soleada a mediodía", -0.7);


        Situacion encuentro = new Situacion("Encuentro con el árabe en la orilla");

        Motivacion motivacionIgnorar = new Motivacion("Análisis lógico y preservación del orden", 0.1);
        Consecuencia consecuenciaIgnorar = new Consecuencia("Mantenimiento de la estabilidad", 0.1);
        Opcion opcionIgnorar = new Opcion("Ignorar y caminar", 0.9, motivacionIgnorar, consecuenciaIgnorar);
        encuentro.agregarOpcion(opcionIgnorar);

        Motivacion motivacionDisparar = new Motivacion("Reacción impulsiva por colapso sensorial", -0.1);
        Consecuencia consecuenciaDisparar = new Consecuencia("Tragedia: El acto se ejecuta con precisión letal.", -0.1);
        Opcion opcionDisparar = new Opcion("Disparar el revólver", 0.2, motivacionDisparar, consecuenciaDisparar);
        encuentro.agregarOpcion(opcionDisparar);

        System.out.println("Iniciando simulación de análisis...");
        try {
            Thread.sleep(1000);
            System.out.println("Cargando análisis de situación...");
            Thread.sleep(1000);
            System.out.println("Evaluando opciones disponibles...");
            Thread.sleep(1000);
            System.out.println("Determinando decisión final...");
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        Decision resultado = Analisis.procesar(meursault, encuentro, playaArgel);

        System.out.println();
        System.out.println("SIMULACIÓN DE MODELO DE DOMINIO");
        System.out.println("=================================");
        System.out.println("Sujeto: " + meursault.getNombre());
        System.out.println("Contexto: " + playaArgel.getDescripcion());
        System.out.println("Estado final de conciencia: " + meursault.getConciencia().getNivelConciencia());
        System.out.println("---------------------------------");
        resultado.mostrarResultado();
    }
}