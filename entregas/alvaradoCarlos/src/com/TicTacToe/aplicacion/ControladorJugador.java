package com.TicTacToe.aplicacion.jugador;

import com.TicTacToe.dominio.Jugador;
import com.TicTacToe.dominio.Tablero;
import com.TicTacToe.dominio.Coordenada;
import com.TicTacToe.presentacion.VistaJugador;

public class ControladorJugador {
    
    private Jugador jugador;
    private VistaJugador vista;

    public ControladorJugador(Jugador jugador, VistaJugador vista) {
        this.jugador = jugador;
        this.vista = vista;
    }

    public void ejecutarTurno(Tablero tablero) {
        Coordenada coordenada;

        boolean turnoValido = false;

        do {
            coordenada = vista.recogerCoordenada();

            if (!coordenada.esValida()) {
                vista.mostrarError("Coordenada fuera del tablero");
            } else if (tablero.estaOcupado(coordenada)) {
                vista.mostrarError("La casilla ya está ocupada.");
            } else {
                turnoValido = true;
            }
        } while (!turnoValido);

        jugador.ponerFicha(tablero, coordenada);
    }

    public void gestionarVictoria() {
        vista.celebrar(jugador.color);
    }

}