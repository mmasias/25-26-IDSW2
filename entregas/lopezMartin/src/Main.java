import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        Persona padre = new Persona();
        Persona madre = new Persona();

        ArrayList<Persona> familiares = new ArrayList<Persona>();
        familiares.add(padre);
        familiares.add(madre);

        RasgoFisico rasgo1 = new RasgoFisico("Moreno");
        RasgoFisico rasgo2 = new RasgoFisico("Alto");
        ArrayList<RasgoFisico> rasgosHijo = new ArrayList<RasgoFisico>();
        rasgosHijo.add(rasgo1);
        rasgosHijo.add(rasgo2);

        Nacion argentina = new Nacion("Argentina");
        Nacion italia = new Nacion("Italia");
        ArrayList<Nacion> nacionalidadesHijo = new ArrayList<Nacion>();
        nacionalidadesHijo.add(argentina);
        nacionalidadesHijo.add(italia);

        Idioma espanol = new Idioma("Español");
        Idioma italiano = new Idioma("Italiano");
        ArrayList<Idioma> idiomasHijo = new ArrayList<Idioma>();
        idiomasHijo.add(espanol);
        idiomasHijo.add(italiano);

        EducacionAcademica titulo1 = new EducacionAcademica("Grado en Informática");
        EducacionAcademica titulo2 = new EducacionAcademica("Máster en Inteligencia Artificial");
        ArrayList<EducacionAcademica> titulosHijo = new ArrayList<EducacionAcademica>();
        titulosHijo.add(titulo1);
        titulosHijo.add(titulo2);

        Persona hijo = new Persona("Gracioso y tímido", rasgosHijo, new Genero("Masculino"), new Nombre("Juan"), new Apellido("Pérez"), nacionalidadesHijo, idiomasHijo, titulosHijo, familiares);

        hijo.cumplirAños();
        hijo.cambiarPersonalidad("Extrovertido y gracioso");
        hijo.añadirRasgoFisico(new RasgoFisico("Tatuaje en el brazo derecho"));
        hijo.cambiarGenero("Femenino");
        hijo.cambiarNombre("Pepe");
        hijo.cambiarApellido("López");
        hijo.añadirNacionalidad(new Nacion("España"));
        hijo.quitarNacionalidad(argentina);
        hijo.añadirTituloAcademico(new EducacionAcademica("Master en Big Data")); 
        
        Persona novia = new Persona();
        hijo.añadirFamiliar(novia);

        hijo.convertir("Cristianismo");
        hijo.abjurar();
        hijo.conseguirTrabajo("Programador");
        hijo.irAlParo();

        Persona amigo = new Persona();
        hijo.añadirAmigo(amigo);
        hijo.quitarAmigo(amigo);

        Idioma ruso = new Idioma("Ruso");

        hijo.añadirIdioma(ruso);

        hijo.quitarIdioma(italiano);
    }
}
