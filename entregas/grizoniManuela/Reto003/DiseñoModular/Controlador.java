public class Controlador {
    
    private TresEnRaya modelo;
    private Vista vista;

    public Controlador(TresEnRaya modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void jugar() {
        do {
            vista.mostrarTablero(modelo.getTablero());
            
            if (!modelo.jugadorActualDebeMoverFicha()) {
                Coordenada destino;
                do {
                    destino = vista.pedirCoordenada("Turno del jugador " + modelo.getJugadorActual().color() + ": Poner ficha.");
                    if (!modelo.puedePonerFicha(destino)) {
                        vista.mostrarError("La coordenada no es válida o la casilla está ocupada.");
                    }
                } while (!modelo.puedePonerFicha(destino));
                
                modelo.ponerFicha(destino);
            } else {
                Coordenada origen;
                do {
                    origen = vista.pedirCoordenada("Turno del jugador " + modelo.getJugadorActual().color() + ": Origen para mover ficha.");
                    
                    // Comprobación de que es válida, no está vacía y pertenece al jugador actual
                    if (!origen.esValida() || modelo.getTablero().estaVacio(origen) || 
                        modelo.getTablero().getCasilla(origen.getFila() - 1, origen.getColumna() - 1) != modelo.getJugadorActual().color()) {
                         vista.mostrarError("La coordenada de origen no es válida, está vacía o no te pertenece.");
                    }
                } while (!origen.esValida() || modelo.getTablero().estaVacio(origen) ||
                         modelo.getTablero().getCasilla(origen.getFila() - 1, origen.getColumna() - 1) != modelo.getJugadorActual().color());
                
                Coordenada destino;
                do {
                    destino = vista.pedirCoordenada("Turno del jugador " + modelo.getJugadorActual().color() + ": Destino para mover ficha.");
                    if (!modelo.puedePonerFicha(destino)) {
                        vista.mostrarError("La coordenada destino no es válida o la casilla está ocupada.");
                    }
                } while (!modelo.puedePonerFicha(destino));
                
                modelo.moverFicha(origen, destino);
            }
            
            modelo.cambiarTurno();
            
        } while(!modelo.hayGanador());
        
        vista.mostrarTablero(modelo.getTablero());
        vista.celebrarVictoria(modelo.getJugadorGanador());
    }
}
