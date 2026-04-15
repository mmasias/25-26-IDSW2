class Juego {

    public static void main(String[] args) {

        VistaTablero vista = new VistaTableroConsola();
        Tablero tablero = new TableroClasico();
        Turno turno = new TurnoClasico();


        TresEnRaya tresEnRaya = new TresEnRaya(vista, tablero, turno);
        tresEnRaya.jugar();

    }
}
