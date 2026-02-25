import java.util.List;

public class Artista {
    public Artista(String nombreArtistico, Integer oyentesMensuales, EstiloMusical estiloPrincipal) { ... }

    public String getNombreArtistico() { ... }
    public void setNombreArtistico(String nombreArtistico) { ... }

    public Integer getOyentesMensuales() { ... }
    public void setOyentesMensuales(Integer oyentesMensuales) { ... }

    public EstiloMusical getEstiloPrincipal() { ... }
    public void setEstiloPrincipal(EstiloMusical estiloPrincipal) { ... }

    public List<Instrumento> getInstrumentosHabituales() { ... }
    public void agregarInstrumento(Instrumento instrumento) { ... }
    public void eliminarInstrumento(Instrumento instrumento) { ... }
}