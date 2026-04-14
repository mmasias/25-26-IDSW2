public interface ITablero {
    void ponerFicha(Coordenada coordenada, char color);
    void sacarFicha(Coordenada coordenada);
    boolean estaOcupado(Coordenada coordenada);
    boolean hayTresEnRaya();
    boolean estaCompleto(char color);
    char[][] getCasillas();
}