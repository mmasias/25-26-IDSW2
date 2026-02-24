### Ejemplo: Ecosistema Musical

<div align=center>

| Relación | Clases | Justificación |
|---|---|---|
| COMPOSICIÓN | Cancion y ArchivoAudio | El archivo de audio no puede existir sin la canción y su ciclo de vida está ligado a la canción |
| AGREGACIÓN | Album y Cancion | Las canciones pueden existir independientemente del álbum |
| | | El álbum no crea las canciones, solo las agrega |
| ASOCIACIÓN | Artista e Instrumento | Relación duradera donde el artista toca instrumentos específicos |
| | | El artista mantiene una referencia al instrumento que está tocando |
| USO | Entorno y Cancion | El Entorno utiliza temporalmente la canción solo para reproducirla |
| | | Utiliza la canción solo durante la ejecución de este método |
| | | No mantiene una referencia a la canción después de la reproducción |

</div>

```java

class Cancion {
    private String titulo;
    private ArchivoAudio pista;
    private Estilo estilo; 
    
    public Cancion(String titulo, Estilo estilo, byte[] datosAudio) {
        this.titulo = titulo;
        this.estilo = estilo;
        this.pista = new ArchivoAudio(datosAudio); 
    }
    
    public String getTitulo() {
        return titulo;
    }
}

class ArchivoAudio {
    private byte[] datos;
    
    public ArchivoAudio(byte[] datos) {
        this.datos = datos;
    }
}

class Album {
    private String titulo;
    private List<Cancion> canciones;
    
    public Album(String titulo) {
        this.titulo = titulo;
        this.canciones = new ArrayList<>();
    }
 
    public void agregarCancion(Cancion pista) {
        canciones.add(pista);
    }
    
    public void quitarCancion(Cancion pista) {
        canciones.remove(pista);
    }
}

class Artista {
    private String nombre;
    private List<Instrumento> instrumentos;
    
    public Artista(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }
    
    public void asignarInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }
}

class Instrumento {
    private String tipo;
    
    public Instrumento(String tipo) {
        this.tipo = tipo;
    }
}

class Estilo {
    private String nombreGenero;
    
    public Estilo(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }
}

class Entorno {
    private String nombrePlataforma; 
    
    public Entorno(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    public void reproducirStream(Cancion cancion) {
        System.out.println(nombrePlataforma + " está reproduciendo temporalmente: " + cancion.getTitulo());
    }
}
```
#### Diagrama de  Relaciones de Clases

```mermaid
classDiagram
    %% COMPOSICIÓN
    Cancion *-- ArchivoAudio

    %% AGREGACIÓN
    Album o-- Cancion

    %% ASOCIACIÓN
    Artista --> Instrumento

    %% USO (Dependencia)
    Entorno ..> Cancion

    %% Clases
    class Cancion
    class ArchivoAudio
    class Album
    class Artista
    class Instrumento
    class Entorno

