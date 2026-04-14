public class TresEnRaya {

    private final Tablero tablero;
    private final Jugador[] jugadores;
    private final Turno turno;
    private final ReglasTresEnRaya reglas;

    public TresEnRaya(Tablero tablero, Jugador[] jugadores, Turno turno, ReglasTresEnRaya reglas) {
        this.tablero = tablero;
        this.jugadores = jugadores;
        this.turno = turno;
        this.reglas = reglas;
    }

    public Tablero tablero() {
        return tablero;
    }

    public Jugador jugadorActual() {
        return jugadores[turno.indiceActual()];
    }

    public boolean debeMover(Jugador jugador) {
        return reglas.debeMover(tablero, jugador.ficha());
    }

    public void colocarFicha(Jugador jugador, Coordenada destino) {
        if (debeMover(jugador)) {
            throw new IllegalStateException("No puedes colocar: ya tienes el máximo de fichas. Debes mover.");
        }
        tablero.ponerFicha(destino, jugador.ficha());
    }

    public void moverFicha(Jugador jugador, Coordenada origen, Coordenada destino) {
        if (!debeMover(jugador)) {
            throw new IllegalStateException("No puedes mover todavía: aún puedes colocar fichas.");
        }
        if (!tablero.contiene(origen, jugador.ficha())) {
            throw new IllegalArgumentException("El origen no contiene una ficha del jugador actual.");
        }
        if (origen.fila() == destino.fila() && origen.columna() == destino.columna()) {
            throw new IllegalArgumentException("Origen y destino no pueden ser la misma casilla.");
        }

        tablero.sacarFicha(origen);
        tablero.ponerFicha(destino, jugador.ficha());
    }

    public boolean hayGanador(Jugador jugador) {
        return reglas.hayTresEnRaya(tablero, jugador.ficha());
    }

    public void pasarTurno() {
        turno.cambiar();
    }

    public int dimension() {
        return reglas.dimension();
    }
} 