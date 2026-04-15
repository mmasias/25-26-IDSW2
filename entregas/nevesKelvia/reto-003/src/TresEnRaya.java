public class TresEnRaya {

    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;
    private GestorIO io; 
    public TresEnRaya() {
        tablero = new Tablero();
        jugadores = new Jugador[2];
        jugadores[0] = new Jugador('x');
        jugadores[1] = new Jugador('o');
        turno = new Turno();
        io = new GestorIO(); 
    }

    public void jugar() {
        do {
            this.mostrarTablero(); 
            
            if (!tablero.estaCompleto(jugadores[turno.leToca()].color())) {
                io.mostrarLinea("Turno de poner ficha para: " + jugadores[turno.leToca()].color());
                jugadores[turno.leToca()].ponerFicha(tablero, io); 
            } else {
                io.mostrarLinea("Turno de mover ficha para: " + jugadores[turno.leToca()].color());
                jugadores[turno.leToca()].moverFicha(tablero, io); 
            }
            turno.cambiar();
        } while(!tablero.hayTresEnRaya());
        
        this.mostrarTablero(); 
        jugadores[turno.noLeToca()].celebrar(io); 
    }

    private void mostrarTablero() {
        io.limpiarPantalla();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                io.mostrarMensaje(" " + tablero.getFicha(i, j)); 
            }
            io.mostrarLinea("");
        }
    }
}