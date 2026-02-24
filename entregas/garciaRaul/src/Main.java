public class Main {
    public static void main(String[] args) {
        
        Genero trap = new Genero("Trap");
        Artista duki = new Artista("Duki", trap);

        duki.unirseABanda(new Miembro("Productor"));
        
        Album modoDiablo = new Album("Modo Diablo");
        modoDiablo.añadirTrack(new Cancion("Quavo", 240));
        duki.lanzarAlbum(modoDiablo);

        Discografica selloGlobal = new Discografica("SSJ Records");
        duki.firmar(selloGlobal);

        Gira giraEspaña = new Gira("A.D.A Tour");
        giraEspaña.añadirFecha(new Concierto("Madrid"));
        giraEspaña.añadirFecha(new Concierto("Barcelona"));
        duki.realizarTour(giraEspaña);

        Instrumento micro = new Instrumento("Micrófono");
        duki.ensayar(micro);

        System.out.println(duki.getEstado());
        System.out.println("Gira activa con " + giraEspaña.totalFechas() + " fechas.");
    }
}