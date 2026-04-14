public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private int empates;

    private static final int[][] RESULTADOS = {
            { 0, 2, 1, 1, 2 },
            { 1, 0, 2, 2, 1 },
            { 2, 1, 0, 1, 2 },
            { 2, 1, 2, 0, 1 },
            { 1, 2, 1, 2, 0 }
    };

    public Juego(String nombreJugador1, String nombreJugador2) {
        jugador1 = new Jugador(nombreJugador1);
        jugador2 = new Jugador(nombreJugador2);
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public int getEmpates() {
        return empates;
    }

    public Resultado determinarGanador() {
        int r = RESULTADOS[jugador1.getOpcion() - 1][jugador2.getOpcion() - 1];
        if (r == 0) {
            empates++;
            return Resultado.EMPATE;
        } else if (r == 1) {
            jugador1.incrementarVictorias();
            return Resultado.GANA_JUGADOR1;
        } else {
            jugador2.incrementarVictorias();
            return Resultado.GANA_JUGADOR2;
        }
    }
}