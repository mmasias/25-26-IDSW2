package com.TicTacToe.presentacion;

import com.TicTacToe.dominio.Coordenada;
import java.util.Scanner;

public class VistaConsolaJugador implements IVistaJugador {

    private Scanner scanner = new Scanner(System.in);

    public Coordenada recogerCoordenada() {
        Coordenada coordenada;
        
        do {
            System.out.print("> Fila? [1..3]: ");
            int fila = scanner.nextInt();
            
            System.out.print("> Columna? [1..3]: ");
            int columna = scanner.nextInt();
            
            coordenada = new Coordenada(fila, columna);

            if (!coordenada.esValida()) {
                System.out.println("Coordenada inválida. Debe estar entre 1 y 3.");
            }
            
        } while (!coordenada.esValida());

        return coordenada;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
     
    public void celebrar(char color) {
        System.out.println("Han ganado las " + color + "!");
    }
}