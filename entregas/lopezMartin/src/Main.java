import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        Persona padre = new Persona();
        Persona madre = new Persona();

        ArrayList<Persona> familiares = new ArrayList<Persona>();
        familiares.add(padre);
        familiares.add(madre);

        RasgoFisico rasgo1 = new RasgoFisico("Ojos marrones");
        ArrayList<RasgoFisico> rasgosHijo = new ArrayList<RasgoFisico>();
        rasgosHijo.add(rasgo1);

        Nacion argentina = new Nacion("Argentina");
        Nacion italia = new Nacion("Italia");
        ArrayList<Nacion> nacionalidadesHijo = new ArrayList<Nacion>();
        nacionalidadesHijo.add(argentina);
        nacionalidadesHijo.add(italia);

        Idioma espanol = new Idioma("Español");
        Idioma italiano = new Idioma("Italiano");
        ArrayList<Idioma> idiomasHijo = new ArrayList<Idioma>();

        ArrayList<EducacionAcademica> titulosHijo = new ArrayList<EducacionAcademica>();

        Persona hijo = new Persona("Gracioso y tímido", rasgosHijo, new Genero("Masculino"), new Nombre("Juan"), new Apellido("Pérez"), nacionalidadesHijo, idiomasHijo, titulosHijo, familiares);

        hijo.cumplirAños();
        hijo.cambiarPersonalidad("Extrovertido y gracioso");
        hijo.añadirIdioma(espanol);
        hijo.añadirIdioma(italiano);
        RasgoFisico rasgo2 = new RasgoFisico("Alto");
        hijo.añadirRasgoFisico(rasgo2);
        hijo.cambiarGenero("Femenino");
        hijo.cambiarNombre("Pepe");
        hijo.cambiarApellido("López");
        Nacion españa = new Nacion("España");
        hijo.añadirNacionalidad(españa);
        EducacionAcademica titulo1 = new EducacionAcademica("Grado en Informática");
        EducacionAcademica titulo2 = new EducacionAcademica("Máster en Inteligencia Artificial");
        hijo.añadirTituloAcademico(titulo1); 
        hijo.añadirTituloAcademico(titulo2); 
        
        Persona esposa = new Persona();
        hijo.añadirFamiliar(esposa);

        hijo.convertir("Cristianismo");
        hijo.abjurar();

        hijo.conseguirTrabajo("Programador");
        hijo.irAlParo();

        Persona amigo = new Persona();
        hijo.añadirAmigo(amigo);

        Idioma ruso = new Idioma("Ruso");

        hijo.añadirIdioma(ruso);

        Gusto futbol = new Gusto("Fútbol");
        hijo.consumir(futbol);

        Dni dni = new Dni("12345678A");
        hijo.identificar(dni);
    
    }
}
