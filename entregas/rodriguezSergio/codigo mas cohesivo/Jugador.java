public class Jugador {

    private char color;

    public Jugador(char color) {
        this.color = color;
    }

    public void ponerFicha(Tablero tablero) {
        Coordenada coordenada = new Coordenada();
        do {
            coordenada.pedir();
        } while(!coordenada.esValida() || tablero.estaOcupado(coordenada));
        tablero.ponerFicha(coordenada, color);
    }

    public void moverFicha(Tablero tablero) {
        GestorIO io = GestorIO.getInstancia();
        Coordenada coordenada = new Coordenada();
        
        io.mostrarln("Juega " + color + " - Elige la ficha a retirar:");
        do {
            coordenada.pedir();
        } while(!coordenada.esValida() || tablero.estaVacio(coordenada));
        tablero.sacarFicha(coordenada);
        
        io.mostrarln("Juega " + color + " - Elige dónde poner la ficha:");
        this.ponerFicha(tablero);
    }

    public void celebrar() {
        GestorIO.getInstancia().mostrarln("Hemos ganado los " + color);
    }

    public char color() {
        return color;
    }
}