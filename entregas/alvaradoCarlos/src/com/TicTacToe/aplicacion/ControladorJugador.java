package com.TicTacToe.aplicacion;

import com.TicTacToe.dominio.Jugador;
import com.TicTacToe.dominio.Tablero;
import com.TicTacToe.dominio.Coordenada;
import com.TicTacToe.presentacion.IVistaJugador;

public class ControladorJugador {
    
    private Jugador jugador;
    private IVistaJugador vista;

    public ControladorJugador(Jugador jugador, IVistaJugador vista) {
        this.jugador = jugador;
        this.vista = vista;
    }

    public char color() {
        return jugador.color();
    } 

    public void ejecutarTurnoPoner(Tablero tablero) {
        Coordenada coordenada;
        boolean turnoValido = false;

        do {
            coordenada = vista.recogerCoordenada();

            if (tablero.estaOcupado(coordenada)) {
                vista.mostrarError("La casilla ya está ocupada.");
            } else {
                turnoValido = true;
            }
            
        } while (!turnoValido);

        jugador.ponerFicha(tablero, coordenada);
    }

    public void ejecutarTurnoMover(Tablero tablero) {
        Coordenada origen;
        Coordenada destino;
        boolean origenValido = false;
        boolean destinoValido = false;

        vista.mostrarMensaje("Turno de mover ficha para las " + color() + ". Elige la ficha a sacar:");

        do {
            origen = vista.recogerCoordenada();
            
            if (tablero.estaVacio(origen)) {
                vista.mostrarError("La casilla de origen está vacía.");
            } else if (!tablero.estaOcupadoPor(origen, color())) {
                vista.mostrarError("¡Oye! Esa ficha es del rival, no puedes moverla.");
            } else {
                origenValido = true;
            }

        } while (!origenValido);

        vista.mostrarMensaje("Elige el nuevo destino:");

        do {
            destino = vista.recogerCoordenada();

            if (destino.getFila() == origen.getFila() && destino.getColumna() == origen.getColumna()) {
                vista.mostrarError("No puedes mover la ficha al mismo lugar donde ya estaba.");
            } else if (tablero.estaOcupado(destino)) {
                vista.mostrarError("La casilla de destino está ocupada.");
            } else {
                destinoValido = true;
            }

        } while (!destinoValido);

        jugador.moverFicha(tablero, origen, destino);
    }

    public void gestionarVictoria() {
        vista.celebrar(jugador.color());
    }
}