class Juego {
    public static void main(String[] args) {
        TresEnRaya modelo = new TresEnRaya();
        Vista vista = new VistaConsola();
        Controlador controlador = new Controlador(modelo, vista);
        
        controlador.jugar();
    }
}
