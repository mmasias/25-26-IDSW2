public class Main {

    public static void main(String[] args) {

        Cultura cultura = new Cultura("Latinoamericana");
        Familia familia = new Familia("Juárez");
        RelacionSocial relacion = new RelacionSocial("Amigos universidad");
        Creencia creencia = new Creencia("Catolicismo");
        Emocion emocion = new Emocion("Alegría");
        RasgoPersonalidad rasgo = new RasgoPersonalidad("Responsable");
        Rol rol = new Rol("Estudiante");

        Persona persona = new Persona(20, "Recibiendo la clase de IDSW2", "2025", "Universidad", cultura, familia,
                relacion, creencia, rasgo, rol);

        System.out.println("Situación del dominio creada correctamente.");
    }
}