public class TresEnRayaBuilder {

    private Vista vista;

    public TresEnRayaBuilder conVista(Vista vista) {
        this.vista = vista;
        return this;
    }

    public TresEnRaya construir() {
        if (vista == null)
            throw new IllegalStateException("TresEnRaya necesita una Vista");
        return new TresEnRaya(vista);
    }
}
