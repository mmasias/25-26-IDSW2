
public class JugadorHumano implements Jugador {

    private char color;

    public JugadorHumano(char color) {
        assert color == 'x' || color == 'o' : "Mal!!!";
        this.color = color;
        
    }

    @Override
    public void ponerFicha(Tablero tablero, VistaTablero vista) {
        Coordenada coordenada;
        do {
            coordenada = vista.recibirCoordenada();
        } while (!coordenada.esValida() || tablero.estaOcupado(coordenada)); 
        tablero.ponerFicha(coordenada,color);
    }

    @Override
    public void moverFicha(Tablero tablero, VistaTablero vista) {
        Coordenada coordenada;
        do {
            coordenada = vista.recibirCoordenada();
        }while(!coordenada.esValida() || tablero.estaVacio(coordenada) || tablero.verificarColorFicha(coordenada, color));
        tablero.sacarFicha(coordenada);
        this.ponerFicha(tablero, vista);
    }

    @Override
    public void celebrar(VistaTablero vista) {
        vista.celebrar(color);
    }

    @Override
    public char color() {
        return this.color;
    }
}
