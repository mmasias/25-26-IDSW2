package com.TicTacToe;

import com.TicTacToe.aplicacion.ControladorPartida;
import com.TicTacToe.aplicacion.PartidaBuilder;
import com.TicTacToe.presentacion.VistaConsolaJugador;
import com.TicTacToe.presentacion.VistaConsolaTablero;

public class Juego {

    public static void main(String[] args) {

        ControladorPartida partida = new PartidaBuilder()
                .conVistaTablero(new VistaConsolaTablero())
                .conVistaJugador(new VistaConsolaJugador())
                .conJugador('x')
                .conJugador('o')
                .construir();

        partida.jugar();
    }
}