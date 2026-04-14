public class Main {
  public static void main(String[] args) {
    Tablero tablero = new Tablero();
    Jugador[] jugadores = { new Jugador('X'), new Jugador('O') };
    Turno turno = new Turno();

    VistaConsola vista = new VistaConsola();

    ControladorJuego controlador = new ControladorJuego(tablero, jugadores, turno, vista);

    controlador.jugar();
  }
}
