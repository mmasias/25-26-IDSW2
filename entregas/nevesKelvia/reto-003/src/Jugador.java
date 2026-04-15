public class Jugador {

    private char color;

    public Jugador(char color) {
        this.color = color;
    }

    public void ponerFicha(Tablero tablero, GestorIO io) {
        Coordenada coordenada;
        do {
            int fila = io.leerEntero("> Fila? [1..3] ");
            int columna = io.leerEntero("> Columna? [1..3] ");
            coordenada = new Coordenada(fila, columna);
            
            if (!coordenada.esValida() || tablero.estaOcupado(coordenada)) {
                io.mostrarLinea("Error: Coordenada inválida o casilla ya ocupada. Inténtalo de nuevo.");
            }
        } while(!coordenada.esValida() || tablero.estaOcupado(coordenada));
        
        tablero.ponerFicha(coordenada, color);
    }

    public void moverFicha(Tablero tablero, GestorIO io) {
        io.mostrarLinea("Jugador " + color + ", ¿Qué ficha deseas mover?");
        Coordenada coordenada;
        do {
            int fila = io.leerEntero("> Fila a retirar? [1..3] ");
            int columna = io.leerEntero("> Columna a retirar? [1..3] ");
            coordenada = new Coordenada(fila, columna);
            
            if (!coordenada.esValida() || tablero.estaVacio(coordenada)) {
                io.mostrarLinea("Error: Coordenada inválida o casilla vacía. Inténtalo de nuevo.");
            }
        } while(!coordenada.esValida() || tablero.estaVacio(coordenada));
        
        tablero.sacarFicha(coordenada);
        
        io.mostrarLinea("¿Dónde deseas colocar la ficha?");
        this.ponerFicha(tablero, io);
    }

    public void celebrar(GestorIO io) {
        io.mostrarLinea("Hemos ganado los " + color);
    }

    public char color() {
        return color;
    }

}