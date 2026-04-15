
public class Partida {

    private final Tablero tablero;
    private final Jugador[] jugadores;
    private final Turno turno;
    private final Arbitro arbitro;
    private final VistaConsola vista;

    public Partida() {
        this.tablero = new Tablero();
        this.jugadores = new Jugador[]{
            new Jugador('x'),
            new Jugador('o')
        };
        this.turno = new Turno();
        this.arbitro = new Arbitro();
        this.vista = new VistaConsola();
    }

    public void iniciar() {
        while (!this.estaTerminada()) {
            this.vista.mostrarTablero(this.tablero);
            this.arbitro.ejecutarTurno(this);

            if (!this.estaTerminada()) {
                this.turno.siguiente();
            }
        }

        this.vista.mostrarTablero(this.tablero);
        this.vista.mostrarGanador(this.obtenerGanador());
    }

    public boolean estaTerminada() {
        return this.arbitro.hayGanador(this.tablero);
    }

    public Jugador obtenerJugadorActual() {
        return this.jugadores[this.turno.actual()];
    }

    public Jugador obtenerGanador() {
        for (Jugador jugador : this.jugadores) {
            if (this.tablero.hayTresEnRaya(jugador.color())) {
                return jugador;
            }
        }
        return null;
    }

    public Tablero getTablero() {
        return this.tablero;
    }

    public Jugador[] getJugadores() {
        return this.jugadores;
    }

    public Turno getTurno() {
        return this.turno;
    }

    public Arbitro getArbitro() {
        return this.arbitro;
    }

    public VistaConsola getVista() {
        return this.vista;
    }
}
