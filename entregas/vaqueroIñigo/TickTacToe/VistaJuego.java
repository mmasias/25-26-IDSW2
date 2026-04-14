public interface VistaJuego {

    Coordenada pedirCoordenada();

    void mostrarTablero(char[][] casillas);

    void mostrarGanador(char color);
}