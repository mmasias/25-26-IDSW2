public class ReglasTresEnRaya {

    private final int dimension = 3;
    private final int maxFichasPorJugador = 3;

    public int dimension() {
        return dimension;
    }

    public int maxFichasPorJugador() {
        return maxFichasPorJugador;
    }

    public boolean debeMover(Tablero tablero, char ficha) {
        return tablero.contarFichas(ficha) >= maxFichasPorJugador;
    }

    public boolean hayTresEnRaya(Tablero tablero, char ficha) {
        // Filas
        for (int i = 1; i <= dimension; i++) {
            boolean completa = true;
            for (int j = 1; j <= dimension; j++) {
                if (tablero.valorEn(new Coordenada(i, j)) != ficha) {
                    completa = false;
                    break;
                }
            }
            if (completa) return true;
        }

        // Columnas
        for (int j = 1; j <= dimension; j++) {
            boolean completa = true;
            for (int i = 1; i <= dimension; i++) {
                if (tablero.valorEn(new Coordenada(i, j)) != ficha) {
                    completa = false;
                    break;
                }
            }
            if (completa) return true;
        }

        // Diagonal principal
        boolean diag1 = true;
        for (int k = 1; k <= dimension; k++) {
            if (tablero.valorEn(new Coordenada(k, k)) != ficha) {
                diag1 = false;
                break;
            }
        }
        if (diag1) return true;

        // Diagonal secundaria
        boolean diag2 = true;
        for (int k = 1; k <= dimension; k++) {
            if (tablero.valorEn(new Coordenada(k, dimension - k + 1)) != ficha) {
                diag2 = false;
                break;
            }
        }
        return diag2;
    }
}