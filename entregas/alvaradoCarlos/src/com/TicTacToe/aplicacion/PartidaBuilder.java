package com.TicTacToe.aplicacion;

import com.TicTacToe.dominio.Jugador;
import com.TicTacToe.dominio.Tablero;
import com.TicTacToe.dominio.Turno;
import com.TicTacToe.aplicacion.jugador.ControladorJugador;
import com.TicTacToe.presentacion.VistaTablero;
import com.TicTacToe.presentacion.VistaJugador;

public class PartidaBuilder {

    private VistaTablero vistaTablero;
    private VistaJugador vistaJugador;
    private Jugador jugador1;
    private Jugador jugador2;

    public PartidaBuilder conVistaTablero(VistaTablero vista) {
        this.vistaTablero = vista;
        return this;
    }

    public PartidaBuilder conVistaJugador(VistaJugador vista) {
        this.vistaJugador = vista;
        return this;
    }

    public PartidaBuilder conJugador(char color) {
        if (this.jugador1 == null) {
            this.jugador1 = new Jugador(color);
        } else if (this.jugador2 == null) {
            this.jugador2 = new Jugador(color);
        } else {
            throw new IllegalStateException("Configuración inválida: El juego solo admite dos jugadores.");
        }
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