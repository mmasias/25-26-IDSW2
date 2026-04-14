package com.TicTacToe;

import com.TicTacToe.aplicacion.ControladorPartida;
import com.TicTacToe.aplicacion.PartidaBuilder;
import com.TicTacToe.presentacion.VistaJugador;
import com.TicTacToe.presentacion.VistaTablero;

class Juego {
    
    public static void main(String[] args) {
        
        System.out.println("Iniciando Tic-Tac-Toe...");

        try {
            ControladorPartida partida = new PartidaBuilder()
                .conVistaTablero(new VistaTablero())
                .conVistaJugador(new VistaJugador())
                .conJugador('x')
                .conJugador('o')
                .construir();

            partida.jugar();
            
        } catch (IllegalStateException e) {
            System.err.println("No se pudo arrancar el juego. " + e.getMessage());
        }
    }
}