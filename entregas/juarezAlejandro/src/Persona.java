class Persona {

    private Identidad identidad;
    private Edad edad;
    private ExperienciaVivida experiencia;

    public Persona(int anios, String descripcionExperiencia, String momento, String contextoDescripcion,
            Cultura cultura, Familia familia, RelacionSocial relacionSocial, Creencia creencia, RasgoPersonalidad rasgo,
            Rol rol) {

        this.edad = new Edad(anios);
        this.experiencia = new ExperienciaVivida(descripcionExperiencia);
        this.identidad = new Identidad(cultura, familia, relacionSocial, creencia, rasgo);
    }
}