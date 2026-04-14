package com.TicTacToe.presentacion;

import com.TicTacToe.dominio.Coordenada;

public interface IVistaJugador {
    Coordenada recogerCoordenada();
    void mostrarMensaje(String mensaje);
    void mostrarError(String mensaje);
    void celebrar(char color);
}