import java.util.ArrayList;
import java.util.List;
class Usuario {
    private String nickname;
    private Aplicacion appPrincipal; 
    
    public Usuario(String nickname, Aplicacion appPrincipal) {
        this.nickname = nickname;
        this.appPrincipal = appPrincipal;
    }

    public void escuchar() {
        System.out.println(nickname + " está escuchando música en " + appPrincipal.getNombre());
    }
}