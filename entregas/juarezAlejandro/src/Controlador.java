public class Controlador {
    private final Juego juego;
    private final Vista vista;

    public Controlador(Juego juego, Vista vista) {
        this.juego = juego;
        this.vista = vista;
    }

    public void ejecutarRonda() {
        Jugador j1 = juego.getJugador1();
        Jugador j2 = juego.getJugador2();

        j1.setOpcion(vista.pedirOpcion(j1.getNombre()));
        j2.setOpcion(vista.pedirOpcion(j2.getNombre()));

        Resultado resultado = juego.determinarGanador();

        vista.mostrarElecciones(j1.getNombre(), j1.getOpcion(), j2.getNombre(), j2.getOpcion());
        vista.mostrarResultadoRonda(resultado, j1.getNombre(), j2.getNombre());
        vista.mostrarMarcador(j1.getNombre(), j1.getVictorias(), j2.getNombre(), j2.getVictorias(), juego.getEmpates());
    }
}