package iteracion3;

import java.util.ArrayList;
import java.util.List;

public class PlataformaMusical {
    private String nombre;
    private List<Usuario> usuarios;

    public PlataformaMusical(String nombre) {
        this.nombre = nombre;
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario u) {
        usuarios.add(u);
    }
}