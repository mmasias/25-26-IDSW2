class SelectorCoordenadaConsola implements SelectorCoordenada {

    private final InterfazUsuario interfazUsuario;

    SelectorCoordenadaConsola(InterfazUsuario interfazUsuario) {
        this.interfazUsuario = interfazUsuario;
    }

    @Override
    public Coordenada solicitar(String contexto, Tablero tablero, char colorObjetivo) {
        interfazUsuario.mostrarLinea(contexto);

        Coordenada coordenada;
        do {
            int fila = interfazUsuario.leerEntero("> Fila? [1.." + Tablero.TAMANIO + "]");
            int columna = interfazUsuario.leerEntero("> Columna? [1.." + Tablero.TAMANIO + "]");
            coordenada = new Coordenada(fila, columna);
            boolean coordenadaValida = coordenada.esValida(Tablero.TAMANIO);

            boolean coincideConObjetivo;
            if (colorObjetivo == Tablero.CASILLA_VACIA) {
                coincideConObjetivo = tablero.estaVacio(coordenada);
            } else {
                coincideConObjetivo = tablero.estaOcupadoPor(coordenada, colorObjetivo);
            }

            if (!coordenadaValida || !coincideConObjetivo) {
                interfazUsuario.mostrarLinea("Coordenada no valida para esta jugada. Intenta de nuevo.");
            }

            if (coordenadaValida && coincideConObjetivo) {
                return coordenada;
            }
        } while (true);
    }
}
