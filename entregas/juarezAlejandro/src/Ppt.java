public class Ppt {
    public static void main(String[] args) {
        Juego juego = new Juego("Bill Gates", "Steve Jobs");
        Vista vista = new VistaConsola();
        Controlador controlador = new Controlador(juego, vista);

        while (true) {
            controlador.ejecutarRonda();
        }
    }
}