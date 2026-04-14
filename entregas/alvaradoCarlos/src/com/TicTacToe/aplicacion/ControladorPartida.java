package com.TicTacToe.aplicacion;

import com.TicTacToe.dominio.Tablero;
import com.TicTacToe.dominio.Turno;
import com.TicTacToe.aplicacion.jugador.ControladorJugador;
import com.TicTacToe.presentacion.VistaTablero;

public class ControladorPartida {

    private final Tablero tablero;
    private final Turno turno;
    private final ControladorJugador[] jugadores;
    private final VistaTablero vistaTablero;

    public ControladorPartida(Tablero tablero, Turno turno, ControladorJugador[] jugadores, VistaTablero vistaTablero) {
        this.tablero = tablero;
        this.turno = turno;
        this.jugadores = jugadores;
        this.vistaTablero = vistaTablero;
    }

    public void jugar() {
        do {
            vistaTablero.mostrar(tablero);

            ControladorJugador jugadorActual = jugadores[turno.leToca()];

            if (!tablero.estaCompleto(jugadorActual.color())) {
                jugadorActual.ejecutarTurnoPoner(tablero);
            } else {
                jugadorActual.ejecutarTurnoMover(tablero);
            }

            if (!tablero.hayTresEnRaya()) {
                turno.cambiar();
            }

        } while (!tablero.hayTresEnRaya());

        vistaTablero.mostrar(tablero);
        
        jugadores[turno.leToca()].gestionarVictoria();
    }
}