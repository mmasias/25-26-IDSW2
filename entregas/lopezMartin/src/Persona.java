import java.util.ArrayList;
import java.util.List;

class Persona{

    private Nombre nombre; 
    private Apellido apellido; 
    private Edad tiempoDeVida; 
    private List<Persona> familiares; 
    private List<Persona> amigos; 
    private Caracter caracter; 
    private List<RasgoFisico> rasgosFisicos; 
    private Profesion profesion; 
    private Religion religion; 
    private List<EducacionAcademica> titulosAcademicos;
    private List<Idioma> idiomas; 
    private List<Nacion> nacionalidad; 
    private Genero genero; 
    private List<Gusto> gustos; 
    private Dni documentacion; 

    public Persona(String descripciónDeCaracter, List<RasgoFisico> rasgosFisicos, Genero genero, Nombre nombre, Apellido apellido, List<Nacion> nacionalidad, List<Idioma> idiomas, List<EducacionAcademica> titulosAcademicos, List<Persona> familiares){
        this.tiempoDeVida = new Edad();
        this.caracter = new Caracter(descripciónDeCaracter);
        this.rasgosFisicos = rasgosFisicos;
        this.genero = genero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.idiomas = idiomas;
        this.titulosAcademicos = titulosAcademicos;
        this.familiares = familiares;
        this.religion = null;
        this.profesion = null;
        this.amigos = new ArrayList<Persona>();
    } 

    public Persona(){

    }

    public void cumplirAños(){
        this.tiempoDeVida.aumentar();
    }

    public void cambiarPersonalidad(String descNuevaPersonalidad){
        this.caracter.modificar(descNuevaPersonalidad);
    }

    public void añadirRasgoFisico(RasgoFisico nuevoRasgo){
        this.rasgosFisicos.add(nuevoRasgo);
    }
    
    public void cambiarGenero(String nuevoGenero){
        this.genero.cambiar(nuevoGenero);
    }

    public void cambiarNombre(String nuevoNombre){
        this.nombre.cambiar(nuevoNombre);
    }

    public void cambiarApellido(String nuevoApellido){
        this.apellido.cambiar(nuevoApellido);
    }

    public void añadirNacionalidad(Nacion nuevaNacion){
        this.nacionalidad.add(nuevaNacion);
    }

    public void quitarNacionalidad(Nacion nacion){
        this.nacionalidad.remove(nacion);
    }

    public void añadirTituloAcademico(EducacionAcademica nuevoTitulo){
        this.titulosAcademicos.add(nuevoTitulo);
    }

    public void añadirFamiliar(Persona nuevoFamiliar){
        this.familiares.add(nuevoFamiliar);
    }

    public void convertir(String religion){
        this.religion = new Religion(religion);
    }

    public void abjurar(){
        this.religion = null;
    }

    public void conseguirTrabajo(String trabajo){
        this.profesion = new Profesion(trabajo);
    }

    public void irAlParo(){
        this.profesion = null;
    }

    public void añadirAmigo(Persona persona){
        this.amigos.add(persona);
    }

    public void quitarAmigo(Persona persona){
        this.amigos.remove(persona);
    }

    public void añadirIdioma(Idioma nuevoIdioma){
        this.idiomas.add(nuevoIdioma);
    }

    public void quitarIdioma(Idioma idioma){
        this.idiomas.remove(idioma);
    }
}