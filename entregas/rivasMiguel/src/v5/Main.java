public class Main {
    public static void main(String[] args) {
        Lenguaje español = new Lenguaje();
        español.palabras = new String[]{"Hola", "¿Cómo estás?", "Bien", "Gracias"};

        Medio telefono = new Medio();
        telefono.setLenguaje(español);

        Sujeto alice = new Sujeto();
        Sujeto bob = new Sujeto();

        alice.comunicarse(telefono, español);
        bob.comunicarse(telefono, español);

        alice.enviarMensaje(bob, new String[]{"Hola", "¿Cómo estás?"});

        bob.enviarMensaje(alice, new String[]{"Bien", "Gracias"});
    }
}