public class Consecuencia {
    private Entorno entornoAfectado;
    private String descripcion;

    public Consecuencia(String descripcion, Entorno entornoAfectado) {
        this.descripcion = descripcion;
        this.entornoAfectado = entornoAfectado;
    }

    public void aplicarEfectoEnEntorno(String nuevoEstadoEntorno) {
        if (entornoAfectado != null) {
            System.out.println("Efecto de la consecuencia: " + descripcion);
            entornoAfectado.actualizarEstado(nuevoEstadoEntorno);
        }
    }

    public String descripcion() {
        return descripcion;
    }

    public Emocion generarRespuestaEmocional(String tipo, int intensidad) {
        System.out.println("La consecuencia '" + descripcion + "' ha disparado la emoción: " + tipo);
        return new Emocion(tipo, intensidad);
    }
}
