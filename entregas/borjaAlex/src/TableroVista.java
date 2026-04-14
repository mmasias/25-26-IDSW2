class TableroVista {

    private final InterfazUsuario interfazUsuario;

    TableroVista(InterfazUsuario interfazUsuario) {
        this.interfazUsuario = interfazUsuario;
    }

    void mostrar(Tablero tablero) {
        for (int fila = 0; fila < Tablero.TAMANIO; fila++) {
            StringBuilder linea = new StringBuilder();
            for (int columna = 0; columna < Tablero.TAMANIO; columna++) {
                linea.append(' ').append(tablero.fichaEn(fila, columna));
            }
            interfazUsuario.mostrarLinea(linea.toString());
        }
    }
}
