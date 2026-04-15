
public class TresEnRaya {

  private Tablero tablero;
  private Jugador[] jugadores;
  private Turno turno;
  private Vista vista;

  public TresEnRaya() {
    tablero = new Tablero();
    jugadores = new Jugador[2];
    jugadores[0] = new Jugador('x');
    jugadores[1] = new Jugador('o');
    turno = new Turno();
    vista = new VistaConsola();
  }

  public void jugar() {

    do {
      vista.mostrarTablero(tablero);
      Jugador jugadorActual = jugadores[turno.leToca()];

      if (!tablero.estaCompleto(jugadorActual)) {
        ponerFicha(jugadorActual);
      } else {
        moverFicha(jugadorActual);
      }
      turno.cambiar();
    } while (!tablero.hayTresEnRaya());
    vista.celebrarVictoria(jugadores[turno.noLeToca()].color());
  }

  private void ponerFicha(Jugador jugadorActual) {
    Coordenada coordenada;
    do {
      coordenada = vista.pedirCoordenada();
    } while (!coordenada.esValida() || tablero.estaOcupado(coordenada));
    tablero.ponerFicha(coordenada, jugadorActual.color());
  }

  private void moverFicha(Jugador jugadorActual) {
    Coordenada coordenada;
    do {
      coordenada = vista.pedirCoordenada();
    } while (!coordenada.esValida() || tablero.estaVacio(coordenada)
        || tablero.verFicha(coordenada) != jugadorActual.color());
    tablero.sacarFicha(coordenada);
    ponerFicha(jugadorActual);
  }
}