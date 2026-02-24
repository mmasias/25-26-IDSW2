import java.util.Objects;

public class Genero {
    private String nombre;

    public Genero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genero)) return false;
        Genero g = (Genero) o;
        return Objects.equals(nombre, g.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}