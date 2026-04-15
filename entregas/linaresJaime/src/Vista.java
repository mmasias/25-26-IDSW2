public interface Vista {
    void mostrarTablero(char[][] casillas);
    void mostrarMensaje(String mensaje);
    Coordenada pedirCoordenada(String mensajeAclaratorio);
}
