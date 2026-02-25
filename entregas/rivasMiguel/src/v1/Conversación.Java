class Conversacion {
    private SujetoA sujetoA;
    private SujetoB sujetoB;

    private TemaDeConversacion temaDeConversacion;

    public Conversacion(SujetoA sujetoA, SujetoB sujetoB) {
        this.sujetoA = sujetoA;
        this.sujetoB = sujetoB;
        
        this.temaDeConversacion = new TemaDeConversacion();
    }
}