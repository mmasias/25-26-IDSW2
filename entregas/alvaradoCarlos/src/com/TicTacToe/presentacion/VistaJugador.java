package com.TicTacToe.presentacion;

import com.TicTacToe.dominio.Coordenada;
import java.util.Scanner;

public class VistaJugador {

    private Scanner scanner = new Scanner(System.in);

    public Coordenada recogerCoordenada() {
        Coordenada coordenada;
        
        do {
            System.out.print("> Fila? [1..3]: ");
            int fila = scanner.nextInt();
            
            System.out.print("> Columna? [1..3]: ");
            int columna = scanner.nextInt();
            
            coordenada = new Coordenada(fila, columna);
            
        } while (!coordenada.esValida());

        return coordenada;
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
     
    public void celebrar(char color) {
        System.out.println("¡Hemos ganado los " + color + "!");
    }
}