
public class Jugador {

    private char color;
    private Console console;

    public Jugador(char color) {
        assert color == 'x' || color == 'o' : "Mal!!!";
        this.color = color;
        console = new Console();
    }

    public void ponerFicha(Tablero tablero) {
        Coordenada coordenada = new Coordenada();
        do {
            coordenada.pedir();
        } while (!coordenada.esValida() || tablero.estaOcupado(coordenada)); 
        tablero.ponerFicha(coordenada,color);
    }

    public void moverFicha(Tablero tablero) {
        Coordenada coordenada = new Coordenada();
        do {
            coordenada.pedir();
        }while(!coordenada.esValida() || tablero.estaVacio(coordenada) || tablero.verificarColorFicha(coordenada, color));
        tablero.sacarFicha(coordenada);
        this.ponerFicha(tablero);
    }

    public void celebrar() {
        console.writeln("Los " + color + " somos unos cracks!!!!");
    }

    public char color() {
        return this.color;
    }
}
