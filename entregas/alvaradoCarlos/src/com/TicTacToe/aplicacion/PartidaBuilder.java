package com.TicTacToe.aplicacion;

import com.TicTacToe.dominio.Jugador;
import com.TicTacToe.dominio.Tablero;
import com.TicTacToe.dominio.Turno;
import com.TicTacToe.aplicacion.ControladorJugador;
import com.TicTacToe.presentacion.IVistaTablero;
import com.TicTacToe.presentacion.IVistaJugador;

public class PartidaBuilder {

    private IVistaTablero vistaTablero;
    private IVistaJugador vistaJugador;
    private Jugador jugador1;
    private Jugador jugador2;

    public PartidaBuilder conVistaTablero(IVistaTablero vista) {
        this.vistaTablero = vista;
        return this;
    }

    public PartidaBuilder conVistaJugador(IVistaJugador vista) {
        this.vistaJugador = vista;
        return this;
    }

    public PartidaBuilder conJugador(char color) {
        this.jugador1 = new Jugador(color);
        this.jugador2 = new Jugador(color);
        return this;
    }

    public ControladorPartida construir() {
        if (vistaTablero == null || vistaJugador == null) {
            throw new IllegalStateException("Error: Las vistas son obligatorias.");
        }
        if (jugador1 == null || jugador2 == null) {
            throw new IllegalStateException("Error: Se requieren exactamente dos jugadores.");
        }

        Tablero tablero = new Tablero();
        Turno turno = new Turno();

        ControladorJugador jugador1 = new ControladorJugador(this.jugador1, vistaJugador);
        ControladorJugador jugador2 = new ControladorJugador(this.jugador2, vistaJugador);
        ControladorJugador[] jugadores = { jugador1, jugador2 };

        return new ControladorPartida(tablero, turno, jugadores, vistaTablero);
    }
}