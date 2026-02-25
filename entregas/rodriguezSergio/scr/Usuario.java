import java.util.List;

public class Usuario {
    private String nickname;
    private String email;
    private Boolean esPremium;
    
    // COMPOSICIÓN
    private Suscripcion suscripcion; 
    
    // ASOCIACIÓN
    private List<Usuario> amigos;
    private List<Artista> artistasSeguidos;
}