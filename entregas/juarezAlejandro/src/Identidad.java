class Identidad {

    private Cultura cultura;
    private Familia familia;
    private RelacionSocial relacionSocial;
    private Creencia creencia;
    private RasgoPersonalidad rasgo;

    public Identidad(Cultura cultura, Familia familia, RelacionSocial relacionSocial, Creencia creencia,
            RasgoPersonalidad rasgo) {

        this.cultura = cultura;
        this.familia = familia;
        this.relacionSocial = relacionSocial;
        this.creencia = creencia;
        this.rasgo = rasgo;
    }

    public void experimentarEmocion(Emocion emocion) {
        System.out.println("Experimentando emoción: " + emocion);
    }
}