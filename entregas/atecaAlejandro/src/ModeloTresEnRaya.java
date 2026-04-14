public class ModeloTresEnRaya {

  private Tablero tablero;
  private Jugador[] jugadores;
  private Turno turno;

  public ModeloTresEnRaya() {
    tablero = new Tablero();
    jugadores = new Jugador[2];
    jugadores[0] = new Jugador('x');
    jugadores[1] = new Jugador('o');
    turno = new Turno();
  }

  public Tablero getTablero() {
    return tablero;
  }

  public Jugador getJugadorActual() {
    return jugadores[turno.leToca()];
  }

  public Jugador getGanador() {
    return jugadores[turno.noLeToca()];
  }

  public boolean hayTresEnRaya() {
    return tablero.hayTresEnRaya();
  }

  public void cambiarTurno() {
    turno.cambiar();
  }
}
