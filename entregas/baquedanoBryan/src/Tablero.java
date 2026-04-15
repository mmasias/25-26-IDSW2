public interface Tablero {

    char getFicha(int fila, int columna);
    boolean hayTresEnRaya();
    boolean estaCompleto(Jugador jugador);
    boolean estaOcupado(Coordenada coordenada);
    boolean estaVacio(Coordenada coordenada);
    boolean verificarColorFicha(Coordenada coordenada, char color);


    void ponerFicha(Coordenada coordenada, char color);
    void sacarFicha(Coordenada coordenada);
}