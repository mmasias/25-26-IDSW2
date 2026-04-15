
public class Jugador {

    private char color;

    public Jugador(char color) {
        assert color == 'x' || color == 'o' : "Mal!!!";
        this.color = color;
        
    }

    public void ponerFicha(Tablero tablero, VistaTablero vista) {
        Coordenada coordenada;
        do {
            coordenada = vista.recibirCoordenada();
        } while (!coordenada.esValida() || tablero.estaOcupado(coordenada)); 
        tablero.ponerFicha(coordenada,color);
    }

    public void moverFicha(Tablero tablero, VistaTablero vista) {
        Coordenada coordenada;
        do {
            coordenada = vista.recibirCoordenada();
        }while(!coordenada.esValida() || tablero.estaVacio(coordenada) || tablero.verificarColorFicha(coordenada, color));
        tablero.sacarFicha(coordenada);
        this.ponerFicha(tablero, vista);
    }

    public void celebrar(VistaTablero vista) {
        vista.celebrar(color);
    }

    public char color() {
        return this.color;
    }
}
