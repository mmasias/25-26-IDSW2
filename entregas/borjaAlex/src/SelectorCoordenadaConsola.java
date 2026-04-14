class SelectorCoordenadaConsola implements SelectorCoordenada {

    private final InterfazUsuario interfazUsuario;

    SelectorCoordenadaConsola(InterfazUsuario interfazUsuario) {
        this.interfazUsuario = interfazUsuario;
    }

    @Override
    public Coordenada solicitar(String contexto, Tablero tablero, char colorObjetivo) {
        interfazUsuario.mostrarLinea(contexto);

        do {
            Coordenada coordenada = this.leerCoordenada();
            if (!this.esCoordenadaValida(coordenada, tablero, colorObjetivo)) {
                interfazUsuario.mostrarLinea("Coordenada no valida para esta jugada. Intenta de nuevo.");
            } else {
                return coordenada;
            }
        } while (true);
    }

    private Coordenada leerCoordenada() {
        int fila = interfazUsuario.leerEntero("> Fila? [1.." + Tablero.TAMANIO + "]");
        int columna = interfazUsuario.leerEntero("> Columna? [1.." + Tablero.TAMANIO + "]");
        return new Coordenada(fila, columna);
    }

    private boolean esCoordenadaValida(Coordenada coordenada, Tablero tablero, char colorObjetivo) {
        boolean coordenadaValida = coordenada.esValida(Tablero.TAMANIO);
        if (!coordenadaValida) {
            return false;
        }

        if (colorObjetivo == Tablero.CASILLA_VACIA) {
            return tablero.estaVacio(coordenada);
        }
        return tablero.estaOcupadoPor(coordenada, colorObjetivo);
    }
}
