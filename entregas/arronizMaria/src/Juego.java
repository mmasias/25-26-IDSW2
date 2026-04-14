public class Juego {
    public static void main(String[] args) {
        ITablero tablero = new Tablero();
        IVista   vista   = new VistaConsola();
        IJugador j1 = new Jugador('x');
        IJugador j2 = new Jugador('o');

        new ControladorJuego(tablero, vista, j1, j2).jugar();
    }
}