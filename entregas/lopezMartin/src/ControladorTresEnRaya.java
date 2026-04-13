class ControladorTresEnRaya {
    private ModeloTresEnRaya modelo;
    private VistaTresEnRaya vista;

    public ControladorTresEnRaya(ModeloTresEnRaya modelo, VistaTresEnRaya vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarJuego() {
        while (modelo.getEstado().equals("Jugando")) {
            vista.mostrarTablero(modelo.getTablero());
            boolean movimientoValido = false;

            while (!movimientoValido) {
                int[] coords = vista.pedirCoordenadas(modelo.getJugadorActual());
                movimientoValido = modelo.registrarMovimiento(coords[0], coords[1]);
                if (!movimientoValido) {
                    vista.mostrarMensaje("Movimiento inválido. Intenta de nuevo.");
                }
            }
        }

        vista.mostrarTablero(modelo.getTablero());
        if (modelo.getEstado().equals("Victoria")) {
            vista.mostrarMensaje("El jugador " + modelo.getJugadorActual() + " ha ganado");
        } else {
            vista.mostrarMensaje("El juego ha terminado en empate");
        }
    }
}