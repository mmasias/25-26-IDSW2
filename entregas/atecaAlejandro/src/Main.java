public class Main {

  public static void main(String[] args) {
    ControladorTresEnRaya juego = new ConstructorJuego()
      .conModeloDefault()
      .conVistaConsola()
      .construir();

    juego.iniciarJuego();
  }
}
