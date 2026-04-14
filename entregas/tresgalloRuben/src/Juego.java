public class Juego {
    public static void main(String[] args) {
        ReglasTresEnRaya reglas = new ReglasTresEnRaya();
        Tablero tablero = new Tablero(reglas.dimension());

        Jugador[] jugadores = {
                new Jugador('x'),
                new Jugador('o')
        };

        Turno turno = new Turno(jugadores.length);

        TresEnRaya modelo = new TresEnRaya(tablero, jugadores, turno, reglas);
        VistaTresEnRaya vista = new VistaTresEnRayaConsola();

        ControladorTresEnRaya controlador = new ControladorTresEnRaya(modelo, vista);
        controlador.iniciar();
    }
}