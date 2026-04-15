
public class JugadorHumano implements Jugador {

    private char color;

    public JugadorHumano(char color) {
        assert color == 'x' || color == 'o' : "Mal!!!";
        this.color = color;
        
    }

    @Override
    public void ponerFicha(Tablero tablero, VistaTablero vista) {
        boolean movimientoValido = false;

        do {
            Coordenada coordenada = vista.recibirCoordenada();
            try {
                tablero.ponerFicha(coordenada, this.color);
                movimientoValido = true; 

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Por favor, elige otra coordenada.");
            }

        } while (!movimientoValido);
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
