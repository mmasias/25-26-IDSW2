class ModeloTresEnRaya {
    private char[][] tablero;
    private char jugadorActual;
    private String estado;

    public ModeloTresEnRaya() {
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
        jugadorActual = 'X';
        estado = "Jugando";
    }

    public char[][] getTablero() { return tablero; }
    public char getJugadorActual() { return jugadorActual; }
    public String getEstado() { return estado; }

    public boolean registrarMovimiento(int fila, int col) {
        if (fila < 0 || fila > 2 || col < 0 || col > 2) {
            return false;
        }
        if (tablero[fila][col] != '-') {
            return false;
        }

        tablero[fila][col] = jugadorActual;
        comprobarEstadoJuego();

        if (estado.equals("Jugando")) {
            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }

        return true;
    }

    private void comprobarEstadoJuego() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '-' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) estado = "Victoria";
            if (tablero[0][i] != '-' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) estado = "Victoria";
        }
        if (tablero[0][0] != '-' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) estado = "Victoria";
        if (tablero[0][2] != '-' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) estado = "Victoria";

        if (!estado.equals("Victoria")) {
            boolean lleno = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j] == '-') lleno = false;
                }
            }
            if (lleno) estado = "Empate";
        }
    }
}