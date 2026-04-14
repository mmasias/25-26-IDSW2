
public class TresEnRaya {

    private final Tablero tablero;
    private final Jugador[] jugadores;
    private final Turno turno;
    private final InterfazUsuario interfazUsuario;
    private final TableroVista tableroVista;

    public TresEnRaya(){
        this.interfazUsuario = new ConsolaUsuario();
        SelectorCoordenada selectorCoordenada = new SelectorCoordenadaConsola(interfazUsuario);

        this.tablero = new Tablero();
        this.tableroVista = new TableroVista(interfazUsuario);
        this.jugadores = new Jugador[2];
        this.jugadores[0] = new Jugador('x', selectorCoordenada);
        this.jugadores[1] = new Jugador('o', selectorCoordenada);
        this.turno = new Turno();
    }

    public void jugar() {
        do {
            this.ejecutarTurno();
        } while (!tablero.hayTresEnRaya());

        this.mostrarFinalYCelebrar();
    }

    private void ejecutarTurno() {
        interfazUsuario.limpiarPantalla();
        tableroVista.mostrar(tablero);

        Jugador jugadorActual = jugadores[turno.leToca()];
        if (!tablero.estaCompleto(jugadorActual.color())) {
            jugadorActual.ponerFicha(tablero);
        } else {
            jugadorActual.moverFicha(tablero);
        }
        turno.cambiar();
    }

    private void mostrarFinalYCelebrar() {
        interfazUsuario.limpiarPantalla();
        tableroVista.mostrar(tablero);
        jugadores[turno.noLeToca()].celebrar(interfazUsuario);
    }
}
