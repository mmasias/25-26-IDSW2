class Identidad {

    private Cultura cultura;
    private Familia familia;
    private RelacionSocial relacionSocial;
    private Creencia creencia;

    public Identidad(Cultura cultura, Familia familia,
            RelacionSocial relacionSocial, Creencia creencia) {

        this.cultura = cultura;
        this.familia = familia;
        this.relacionSocial = relacionSocial;
        this.creencia = creencia;
    }

    public void experimentarEmocion(Emocion emocion) {
        System.out.println("Experimentando emoción: " + emocion);
    }
}