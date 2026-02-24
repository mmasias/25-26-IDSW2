class Persona {

    private Identidad identidad;
    private Edad edad;
    private ExperienciaVivida experiencia;

    public Persona(int anios,
            String descripcionExperiencia,
            Cultura cultura,
            Familia familia,
            RelacionSocial relacionSocial,
            Creencia creencia) {

        this.edad = new Edad(anios);
        this.experiencia = new ExperienciaVivida(descripcionExperiencia);
        this.identidad = new Identidad(cultura, familia, relacionSocial, creencia);
    }
}