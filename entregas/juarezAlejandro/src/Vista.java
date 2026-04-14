public interface Vista {
    int pedirOpcion(String nombreJugador);

    void mostrarElecciones(String nombre1, int opcion1, String nombre2, int opcion2);

    void mostrarResultadoRonda(Resultado resultado, String nombre1, String nombre2);

    void mostrarMarcador(String nombre1, int victorias1, String nombre2, int victorias2, int empates);

    void mostrarError(String mensaje);
}