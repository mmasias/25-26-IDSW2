public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Administrador");
        Chat chat = new Chat();
        String query = usuario.iniciaDialogo("¿Opción 1 o 2?");
        String peticion = chat.delegaPeticion(query);
        Orquestador orquestador = new Orquestador();
        
        String decision = orquestador.procesarPeticion(peticion);
        Explicador explicador = new Explicador();
        String explicacion = explicador.generarExplicacion(decision);

        Datos datos = new Datos();
        Documentos docs = new Documentos();
        Workflow workflow = new Workflow();
        System.out.println("Datos: " + datos.getContexto());
        System.out.println("Docs: " + docs.analizarDocumentos());
        System.out.println("Workflow: " + workflow.evaluarReglas("alto"));

        chat.recibirRespuesta(explicacion);
    }
}
