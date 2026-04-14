public class Juego {

    public static void main(String[] args) {
       
        ConstructorJuego constructor = new ConstructorJuego();

        TresEnRaya tresEnRaya = constructor
                .conVistaConsola()
                .construir();

        tresEnRaya.jugar();
    }
}