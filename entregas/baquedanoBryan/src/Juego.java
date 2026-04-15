class Juego {

    public static void main(String[] args) {

        VistaTablero vista = new VistaTableroConsola();

        TresEnRaya tresEnRaya = new TresEnRaya(vista);
        tresEnRaya.jugar();

    }
}
