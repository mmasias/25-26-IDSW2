package com.TicTacToe.presentacion;

public class VistaTablero {

    public void mostrar(Tablero tablero) {
        cleanScreen();
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(" " + tablero.getFicha(i, j));
            }
            System.out.println();
        }
    }

    private void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}