# Proyecto: Ecosistema Musical



### 1. Tabla de Relaciones

| Relación | Clases | Justificación |
| :--- | :--- | :--- |
| **COMPOSICIÓN** | `Cancion` y `ArchivoAudio` | El archivo de audio no puede existir sin la canción y su ciclo de vida está ligado a ella. Si se elimina la canción, el archivo se destruye. |
| **AGREGACIÓN** | `Album` y `Cancion` | Las canciones pueden existir independientemente del álbum (ej. como *singles*). El álbum no crea las canciones, solo las agrupa/agrega. |
| **ASOCIACIÓN** | `Artista` e `Instrumento` | Relación duradera donde el artista toca instrumentos específicos. El artista mantiene una referencia estructural al instrumento que domina o está tocando. |
| **USO** | `Entorno` y `Cancion` | El Entorno (ej. Spotify, Apple Music) utiliza temporalmente la canción solo para reproducirla mediante un método. No mantiene una referencia permanente a la canción después de la reproducción. |

---

### 2. Implementación en Código (Java)


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

