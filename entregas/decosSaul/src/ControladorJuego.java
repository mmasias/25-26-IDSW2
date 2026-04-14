public class ControladorJuego {

  private Tablero tablero;
  private Jugador[] jugadores;
  private Turno turno;
  private Vista vista;

  public ControladorJuego(Tablero tablero, Jugador[] jugadores, Turno turno, Vista vista) {
    this.tablero = tablero;
    this.jugadores = jugadores;
    this.turno = turno;
    this.vista = vista;
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

    vista.mostrarTablero(tablero);
    vista.mostrarVictoria(jugadores[turno.noLeToca()].color());
  }

  private void ponerFicha(Jugador jugador) {
    Coordenada coordenada;
    do {
      coordenada = vista.pedirCoordenada("Turno de " + jugador.color() + " - Pon ficha:");

      if (!tablero.esCoordenadaValida(coordenada)) {
        vista.mostrarError("Coordenada fuera de límites.");
      } else if (tablero.estaOcupado(coordenada)) {
        vista.mostrarError("La casilla ya está ocupada.");
      }
    } while (!tablero.esCoordenadaValida(coordenada) || tablero.estaOcupado(coordenada));

    tablero.ponerFicha(coordenada, jugador.color());
  }

  private void moverFicha(Jugador jugador) {
    Coordenada origen;
    do {
      origen = vista.pedirCoordenada("Turno de " + jugador.color() + " - Mueve ficha. Origen:");
      if (!tablero.esCoordenadaValida(origen)) {
        vista.mostrarError("Coordenada fuera de límites.");
      } else if (tablero.estaVacio(origen)) {
        vista.mostrarError("La casilla está vacía.");
      }
    } while (!tablero.esCoordenadaValida(origen) || tablero.estaVacio(origen));

    tablero.sacarFicha(origen);
    ponerFicha(jugador);
  }
}
