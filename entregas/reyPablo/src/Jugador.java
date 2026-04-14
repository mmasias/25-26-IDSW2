public class Jugador {
    private char color;
    private Gestor gestor = new Gestor();

    public Jugador(char color) {
        this.color = color;
    }

    public void ponerFicha(Tablero tablero) {
        Coordenada coordenada;
        do {
            coordenada = solicitarCoordenada("Donde poner la ficha?");
        } while (tablero.estaOcupado(coordenada));
        tablero.ponerFicha(coordenada, color);
    

    public void moverFicha(Tablero tablero) {
        Coordenada origen;
        do {
            gestor.escribirLinea("Jugador " + color + ": elija ficha para mover");
            origen = solicitarCoordenada("Origen?");
        } while (tablero.estaVacio(origen) || !tablero.esFichaDe(origen, color));
        
        tablero.sacarFicha(origen);
        this.ponerFicha(tablero);
    }

    private Coordenada solicitarCoordenada(String titulo) {
        int f, c;
        Coordenada coord;
        gestor.escribirLinea(titulo);
        do {
            f = gestor.leerInt("> Fila? [1..3] ");
            c = gestor.leerInt("> Columna? [1..3] ");
            coord = new Coordenada(f, c);
            if (!coord.esValida()) gestor.escribirLinea("Coordenada fuera de rango.");
        } while (!coord.esValida());
        return coord;
    }

    public void celebrar() {
        gestor.escribirLinea("¡Han ganado los " + color + "!");
    }

    public char color() { return color; }
}