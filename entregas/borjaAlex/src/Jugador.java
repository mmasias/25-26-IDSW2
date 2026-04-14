
public class Jugador {

    private final char color;
    private final SelectorCoordenada selectorCoordenada;

    public Jugador(char color, SelectorCoordenada selectorCoordenada) {
        this.color = color;
        this.selectorCoordenada = selectorCoordenada;
    }

    public void ponerFicha(Tablero tablero) {
        Coordenada coordenada = this.selectorCoordenada.solicitar(
            "Turno de " + color + ": elige una casilla libre", tablero, Tablero.CASILLA_VACIA);
        tablero.ponerFicha(coordenada, color);
    }

    public void moverFicha(Tablero tablero) {
        Coordenada coordenada = this.selectorCoordenada.solicitar(
            "Turno de " + color + ": elige una ficha propia para mover", tablero, color);
        tablero.sacarFicha(coordenada);
        this.ponerFicha(tablero);
    }

    public void celebrar(InterfazUsuario interfazUsuario) {
        interfazUsuario.mostrarLinea("Hemos ganado los " + color);
    }

    public char color() {
        return color;
    }

}
