public class VistaJugador {
    
    public static Coordenada pedirCoordenada(char color) {
        Consola.imprimirLinea("Turno del jugador " + color);
        int fila, columna;
        Coordenada coordenada;
        do {
            Consola.imprimir("> Fila? [1..3] ");
            fila = Consola.leerEntero();
            Consola.imprimir("> Columna? [1..3] ");
            columna = Consola.leerEntero();
            coordenada = new Coordenada(fila, columna);
            
            if (!coordenada.esValida()) {
                Consola.imprimirLinea("Coordenada fuera de límites. Intenta de nuevo.");
            }
        } while (!coordenada.esValida());
        
        return coordenada;
    }

    public static void celebrar(char color) {
        Consola.imprimirLinea("¡Hemos ganado los " + color + "!");
    }
}