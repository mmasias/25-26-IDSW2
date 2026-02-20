public class Emocion {
    private String tipo;
    private int intensidad;

    public Emocion(String tipo, int intensidad) {
        this.tipo = tipo;
        this.intensidad = intensidad;
    }

    public String tipo() { 
        return tipo; 
    }

    public int intensidad() { 
        return intensidad; 
    }
}