import java.util.List;

public class Usuario {
    // Constructor público que exige los datos iniciales
    public Usuario(String nickname, String email, Boolean esPremium) { ... }

    // Getters y Setters para los atributos básicos
    public String getNickname() { ... }
    public void setNickname(String nickname) { ... }

    public String getEmail() { ... }
    public void setEmail(String email) { ... }

    public Boolean getEsPremium() { ... }
    public void setEsPremium(Boolean esPremium) { ... }

    // Vista pública de las relaciones
    public Suscripcion getSuscripcion() { ... }
    // (No hay setSuscripcion público para proteger la Composición)

    public List<Usuario> getAmigos() { ... }
    public void agregarAmigo(Usuario amigo) { ... }
    public void eliminarAmigo(Usuario amigo) { ... }

    public List<Artista> getArtistasSeguidos() { ... }
    public void seguirArtista(Artista artista) { ... }
    public void dejarDeSeguirArtista(Artista artista) { ... }

    // Método de Uso
    public void interactuarConReproductor(Reproductor reproductor, String accion) { ... }
}