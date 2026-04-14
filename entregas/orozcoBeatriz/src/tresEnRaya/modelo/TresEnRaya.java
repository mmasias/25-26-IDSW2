package tresEnRaya.modelo;

import tresEnRaya.vista.Consola;

public class TresEnRaya {

    private final Tablero tablero;
    private final Jugador[] jugadores;
    private final Turno turno;

    public TresEnRaya() {
        tablero = new Tablero();
        jugadores = new Jugador[2];
        jugadores[0] = new Jugador('x');
        jugadores[1] = new Jugador('o');
        turno = new Turno();
    }

    public void jugar() {
        do {
            Consola.mostrarTablero(tablero);
            Jugador jugadorActual = jugadores[turno.leToca()];

            if (!tablero.estaCompleto(jugadorActual)) {
                Coordenada destino = pedirCoordenadaLibre();
                jugadorActual.ponerFicha(tablero, destino);
            } else {
                Coordenada origen = pedirCoordenadaOcupada();
                jugadorActual.sacarFicha(tablero, origen);
                Coordenada destino = pedirCoordenadaLibre();
                jugadorActual.ponerFicha(tablero, destino);
            }

            turno.cambiar();
        } while (!tablero.hayTresEnRaya());

        Consola.mostrarGanador(jugadores[turno.noLeToca()]);
    }

    private Coordenada pedirCoordenadaLibre() {
        Coordenada coordenada;
        do {
            coordenada = Consola.pedirCoordenada();
        } while (!coordenada.esValida() || tablero.estaOcupado(coordenada));
        return coordenada;
    }

    private Coordenada pedirCoordenadaOcupada() {
        Coordenada coordenada;
        do {
            coordenada = Consola.pedirCoordenada();
        } while (!coordenada.esValida() || tablero.estaVacio(coordenada));
        return coordenada;
    }

}
