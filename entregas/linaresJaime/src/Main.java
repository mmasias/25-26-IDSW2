public class Main {
    public static void main(String[] args) {
        Vista vista = new VistaConsola();
        ControladorJuego juego = new ControladorJuego(vista);
        juego.iniciar();
    }
}