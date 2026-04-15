class Juego {

    public static void main(String[] args) {

        VistaTablero vista = new VistaTableroConsola();
        Tablero tablero = new TableroClasico();
        Turno turno = new TurnoClasico();
        Jugador[] jugadores = new Jugador [2];
        jugadores[0] = new JugadorHumano('x');
        jugadores[1] = new JugadorHumano('o');


        TresEnRaya tresEnRaya = new TresEnRaya(vista, tablero, turno, jugadores);
        tresEnRaya.jugar();

    }
}
