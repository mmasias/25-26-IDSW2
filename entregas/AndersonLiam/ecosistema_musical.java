class GeneroMusical {
    public GeneroMusical() {}
}

class Instrumento {
    public Instrumento() {}
}

class Manager {
    public Manager() {}
}

class SelloDiscografico {
    public SelloDiscografico() {}
}

class EstudioGrabacion {
    public EstudioGrabacion() {}
}

class Dispositivo {
    public Dispositivo() {}
}

class Productor {
    private EstudioGrabacion estudio;

    public Productor(EstudioGrabacion estudio) {
        this.estudio = estudio;
    }
}

class Artista {
    private Instrumento instrumento;
    private Manager manager;
    private SelloDiscografico sello;

    public Artista(Instrumento instrumento, Manager manager, SelloDiscografico sello) {
        this.instrumento = instrumento;
        this.manager = manager;
        this.sello = sello;
    }
}

class Cancion {
    private Artista artista;
    private Productor productor;
    private GeneroMusical genero;

    public Cancion(Artista artista, Productor productor, GeneroMusical genero) {
        this.artista = artista;
        this.productor = productor;
        this.genero = genero;
    }
}

class Oyente {
    public Oyente() {}

    public void escuchar(Cancion cancion, Dispositivo dispositivo) {
        // Lógica de uso puntual (Dependencia)
    }
}

public class Main {
    public static void main(String[] args) {
        GeneroMusical rock = new GeneroMusical();
        Instrumento guitarra = new Instrumento();
        Manager manager = new Manager();
        SelloDiscografico sello = new SelloDiscografico();
        EstudioGrabacion estudio = new EstudioGrabacion();
        Dispositivo movil = new Dispositivo();

        Productor productor = new Productor(estudio);
        Artista artista = new Artista(guitarra, manager, sello);
        Cancion cancion = new Cancion(artista, productor, rock);
        
        Oyente oyente = new Oyente();
        oyente.escuchar(cancion, movil);
    }
}