package src;

public class TresEnRaya {
    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;
    private TableroView tableroView;
    private ConsoleIO io;

    public TresEnRaya() {
        this.io = new ConsoleIO();
        this.tablero = new Tablero();
        this.tableroView = new TableroView(this.io);
        this.jugadores = new Jugador[]{ new Jugador('x', io), new Jugador('o', io) };
        this.turno = new Turno();
    }

    public void jugar() {
        do {
            tableroView.mostrar(tablero);
            Jugador actual = jugadores[turno.leToca()];
            
            if (!tablero.estaCompleto(actual.getColor())) {
                ponerFicha(actual);
            } else {
                moverFicha(actual);
            }
            
            if (!tablero.hayTresEnRaya()) turno.cambiar();
        } while (!tablero.hayTresEnRaya());

        tableroView.mostrar(tablero);
        jugadores[turno.leToca()].celebrar();
    }

    private void ponerFicha(Jugador j) {
        Coordenada c;
        do {
            c = j.pedirCoordenada("Turno de " + j.getColor() + ": Poner");
        } while (!c.esValida() || tablero.estaOcupado(c));
        tablero.ponerFicha(c, j.getColor());
    }

    private void moverFicha(Jugador j) {
        Coordenada origen;
        do {
            origen = j.pedirCoordenada("Turno de " + j.getColor() + ": Origen a mover");
        } while (!origen.esValida() || tablero.getColorEn(origen) != j.getColor());
        
        tablero.sacarFicha(origen);
        ponerFicha(j);
    }
}