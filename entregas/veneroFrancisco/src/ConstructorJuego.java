public class ConstructorJuego {

    private Vista vista;

    public ConstructorJuego conVistaConsola() {
        this.vista = new Vista();
        return this;
    }

    public TresEnRaya construir() {
        if (vista == null) {
            throw new IllegalStateException("El juego necesita una vista para interactuar con el usuario.");
        }
        return new TresEnRaya(vista);
    }
}