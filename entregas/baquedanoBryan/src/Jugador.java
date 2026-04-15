public interface Jugador {
    void ponerFicha(Tablero tablero, VistaTablero vista);
    void moverFicha(Tablero tablero, VistaTablero vista);
    void celebrar(VistaTablero vista);
    char color();
}