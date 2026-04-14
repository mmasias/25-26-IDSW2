public class VistaTableroConsola implements VistaTablero{

    private Console console = new Console();

    public void mostrar(Tablero tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                console.write(" " + tablero.getFicha(i, j));
            }
            console.writeln();
        }
    }

    
}   