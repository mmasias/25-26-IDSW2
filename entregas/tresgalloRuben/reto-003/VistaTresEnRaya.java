public interface VistaTresEnRaya {

    void limpiarPantalla();

    void mostrarTablero(Tablero tablero);

    void mostrarTurno(Jugador jugador, boolean debeMover);

    Coordenada pedirCoordenada(String mensaje, int dimension);

    void mostrarError(String mensaje);

    void mostrarGanador(Jugador jugador);
}