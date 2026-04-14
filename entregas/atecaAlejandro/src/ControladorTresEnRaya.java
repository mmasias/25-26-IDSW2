class ControladorTresEnRaya {

  private ModeloTresEnRaya modelo;
  private VistaTresEnRaya vista;

  public ControladorTresEnRaya(ModeloTresEnRaya modelo, VistaTresEnRaya vista) {
    this.modelo = modelo;
    this.vista = vista;
  }

  public void iniciarJuego() {
    do {
      vista.mostrarTablero(modelo.getTablero());
      Jugador actual = modelo.getJugadorActual();
      Tablero tablero = modelo.getTablero();

      if (!tablero.estaCompleto(actual)) {
        Coordenada c;
        do {
          c = vista.pedirCoordenadas(actual.color(), "poner ficha");
        } while (!c.esValida() || tablero.estaOcupado(c));
        actual.ponerFicha(tablero, c);
      } else {
        Coordenada origen;
        do {
          origen = vista.pedirCoordenadas(actual.color(), "quitar ficha");
        } while (!origen.esValida() || tablero.estaVacio(origen));
        actual.sacarFicha(tablero, origen);

        Coordenada destino;
        do {
          destino = vista.pedirCoordenadas(actual.color(), "poner ficha");
        } while (!destino.esValida() || tablero.estaOcupado(destino));
        actual.ponerFicha(tablero, destino);
      }
      modelo.cambiarTurno();
    } while (!modelo.hayTresEnRaya());

    vista.mostrarTablero(modelo.getTablero());
    vista.mostrarMensaje("Hemos ganado los " + modelo.getGanador().color());
  }
}
