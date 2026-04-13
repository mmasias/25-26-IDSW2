class Juego {
    public static void main(String[] args) {
        TresEnRaya tresEnRaya = new TresEnRayaBuilder()
            .conVista(new VistaConsola())
            .construir();
        tresEnRaya.jugar();
    }
}