class Concierto {
    private String ciudad;

    public Concierto(String ciudad) {
        this.ciudad = ciudad;
    }

    public void trasladarEvento(String nuevaCiudad) {
        this.ciudad = nuevaCiudad;
    }
}