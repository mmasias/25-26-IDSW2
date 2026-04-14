class ConstructorJuego {

  private ModeloTresEnRaya modelo;
  private VistaTresEnRaya vista;

  public ConstructorJuego conModeloDefault() {
    this.modelo = new ModeloTresEnRaya();
    return this;
  }

  public ConstructorJuego conVistaConsola() {
    this.vista = new VistaTresEnRayaConsola();
    return this;
  }

  public ControladorTresEnRaya construir() {
    if (modelo == null) {
      throw new IllegalStateException(
        "El juego necesita un modelo para funcionar."
      );
    }
    if (vista == null) {
      throw new IllegalStateException(
        "El juego necesita una vista para interactuar."
      );
    }
    return new ControladorTresEnRaya(modelo, vista);
  }
}
