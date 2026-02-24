public class Main {

    public static void main(String[] args) {

        Cultura cultura = new Cultura("Latinoamericana");
        Familia familia = new Familia("Juárez");
        RelacionSocial relacion = new RelacionSocial("Amigos universidad");
        Creencia creencia = new Creencia("Catolicismo");
        Emocion emocion = new Emocion("Alegría");

        Persona persona = new Persona(
                20,
                "Recibiendo la clase de IDSW2",
                cultura,
                familia,
                relacion,
                creencia);

        System.out.println("Situación del dominio creada correctamente.");
    }
}