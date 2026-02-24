public class Main {
    public static void main(String[] args) {
        
        Capacidades habilidades = new Capacidades();
        habilidades.aprender("Manejo de armas");
        habilidades.aprender("Caminar bajo el sol");

        Persona meursault = new Persona("Meursault", 1.0, habilidades);

        Contexto playaArgel = new Contexto("Playa soleada a mediodía", -0.7);

        Situacion encuentro = new Situacion("Encuentro con el árabe en la orilla");
        encuentro.agregarOpcion(new Opcion("Ignorar y caminar"));   
        encuentro.agregarOpcion(new Opcion("Disparar el revólver")); 

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