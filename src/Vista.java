public interface Vista {
    void mostrarTablero(char[][] casillas);
    Coordenada pedirCoordenada();
    void mostrarGanador(char color);
    void mostrarMensaje(String msg);
}
