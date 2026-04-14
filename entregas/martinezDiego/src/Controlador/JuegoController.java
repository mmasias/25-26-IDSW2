package Controlador;

import Dominio.*;
import Servicio.JuegoServicio;
import Vista.ConsolaVista;

public class JuegoController {
    private final Tablero tablero = new Tablero();
    private final JuegoServicio servicio = new JuegoServicio();
    private final ConsolaVista vista = new ConsolaVista();
    private final Turno turno = new Turno();
    private final Jugador[] jugadores = {
            new Jugador('x'),
            new Jugador('o')
    };

    public void iniciar() {
        do {
            vista.mostrarTablero(tablero);
            Jugador actual = jugadores[turno.leToca()];

            if (!tablero.estaCompleto(actual)) {
                ponerFicha(actual);
            } else {
                moverFicha(actual);
            }

            turno.cambiar();
        } while (!servicio.hayTresEnRaya(tablero));

        vista.mostrarTablero(tablero);
        vista.mostrarGanador(jugadores[turno.noLeToca()]);
    }

    private void ponerFicha(Jugador jugador) {
        Coordenada coordenada;
        do {
            coordenada = vista.pedirCoordenada();
            if (tablero.estaOcupado(coordenada))
                vista.mostrarCeldaOcupada();
        } while (tablero.estaOcupado(coordenada));
        tablero.ponerFicha(coordenada, jugador.getColor());
    }

    private void moverFicha(Jugador jugador) {
        Coordenada origen;
        do {
            System.out.println("Elige una ficha tuya para mover:");
            origen = vista.pedirCoordenada();
            if (tablero.estaVacio(origen))
                vista.mostrarCeldaVacia();
        } while (tablero.estaVacio(origen));

        tablero.sacarFicha(origen);
        ponerFicha(jugador);
    }
}