public class VistaTableroConsola implements VistaTablero{

    private Console console = new Console();

    @Override
    public void mostrar(Tablero tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                console.write(" " + tablero.getFicha(i, j));
            }
            console.writeln();
        }
    }

    @Override
    public void celebrar(char color) {
        console.writeln("Los " + color + " somos unos cracks!!!!");
    }

    @Override
    public Coordenada recibirCoordenada() { 
        int fila = console.readInt("Fila: ");
        int columna = console.readInt("Columna: ");
        return new Coordenada(fila, columna);
    }

    
}   