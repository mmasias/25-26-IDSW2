class Contrato {
    private String clausulas;

    public Contrato(String clausulas) {
        this.clausulas = clausulas;
    }

    public void renegociar(String nuevasClausulas) {
        this.clausulas = nuevasClausulas;
    }
}