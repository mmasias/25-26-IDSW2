public class Usuario {
    private String nombre;
    
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    public String iniciaDialogo(String mensaje) {
        System.out.println(nombre + ": " + mensaje);
        return mensaje;
    }
}
