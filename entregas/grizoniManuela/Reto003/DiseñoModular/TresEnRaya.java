public class TresEnRaya {

    private Tablero tablero;
    private Jugador[] jugadores;
    private Turno turno;

    public TresEnRaya(){
        tablero = new Tablero();
        jugadores = new Jugador[2];
        jugadores[0] = new Jugador('x');
        jugadores[1] = new Jugador('o');
        turno = new Turno();
    }

    public Tablero getTablero() {
        return tablero;
    }
    
    public Jugador getJugadorActual() {
        return jugadores[turno.leToca()];
    }
    
    public Jugador getJugadorGanador() {
         return jugadores[turno.noLeToca()];
    }
    
    public boolean hayGanador() {
        return tablero.hayTresEnRaya();
    }
    
    public void cambiarTurno() {
        turno.cambiar();
    }
    
    public boolean puedePonerFicha(Coordenada coordenada) {
        return coordenada.esValida() && !tablero.estaOcupado(coordenada);
    }
    
    public void ponerFicha(Coordenada coordenada) {
        tablero.ponerFicha(coordenada, getJugadorActual().color());
    }

    public boolean puedeMoverFicha(Coordenada origen, Coordenada destino) {
        return origen.esValida() && destino.esValida() && 
               !tablero.estaVacio(origen) && tablero.getCasilla(origen.getFila()-1, origen.getColumna()-1) == getJugadorActual().color() &&
               !tablero.estaOcupado(destino);
    }

    public void moverFicha(Coordenada origen, Coordenada destino) {
        tablero.sacarFicha(origen);
        ponerFicha(destino);
    }
    
    public boolean jugadorActualDebeMoverFicha() {
        return tablero.estaCompleto(getJugadorActual());
    }
}
