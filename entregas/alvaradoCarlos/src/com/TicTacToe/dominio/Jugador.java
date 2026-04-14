package com.TicTacToe.dominio;

public class Jugador {

    private char color;

    public Jugador(char color) {
        this.color = color;
    }

    public void ponerFicha(Tablero tablero, Coordenada coordenada) {

        assert coordenada.esValida() : "Coordenada inválida";
        assert !tablero.estaOcupado(coordenada) : "Casilla ocupada";

        tablero.ponerFicha(coordenada, color);
    }

    public void moverFicha(Tablero tablero, Coordenada origen, Coordenada destino) {
        
        assert !tablero.estaVacio(origen) : "No hay ficha en el origen";
        assert !tablero.estaOcupado(destino) : "El destino está ocupado";

        tablero.sacarFicha(origen);
        this.ponerFicha(tablero, destino);
    }

    public char color() {
        return color;
    }
}