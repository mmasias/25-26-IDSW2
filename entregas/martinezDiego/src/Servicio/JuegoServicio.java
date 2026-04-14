package Servicio;

import Dominio.Tablero;

public class JuegoServicio {

    public boolean hayTresEnRaya(Tablero tablero) {
        return hayTresEnRaya(tablero, 'x') || hayTresEnRaya(tablero, 'o');
    }

    private boolean hayTresEnRaya(Tablero tablero, char color) {
        char[][] c = tablero.getCasillas();
        int[] filas = new int[3];
        int[] columnas = new int[3];
        int diagonal = 0, secundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (c[i][j] == color) {
                    filas[i]++;
                    columnas[j]++;
                    if (i == j)
                        diagonal++;
                    if (i + j == 2)
                        secundaria++;
                    if (filas[i] == 3 || columnas[j] == 3
                            || diagonal == 3 || secundaria == 3)
                        return true;
                }
            }
        }
        return false;
    }
}