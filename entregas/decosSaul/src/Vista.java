public interface Vista {
  void mostrarTablero(Tablero tablero);

  Coordenada pedirCoordenada(String mensaje);

  void mostrarError(String mensaje);

  void mostrarVictoria(char color);
}
