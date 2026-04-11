public class Main {
    public static void main(String[] args) {
        ControladorTresEnRaya juego = new JuegoBuilder()
                .conModeloDefault()
                .conVistaConsola()
                .construir();

        juego.iniciarJuego();
    }
}