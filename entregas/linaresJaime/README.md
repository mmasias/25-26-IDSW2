### Ecosistema Musical

<div align=center>

| Relación | Clases | Justificación |
|---|---|---|
| COMPOSICIÓN | Cancion y PistaAudio | La pista de audio no puede existir sin la canción y su ciclo de vida está ligado a ella |
| COMPOSICIÓN | Usuario y Suscripcion | Si el usuario desaparece del sistema, su registro de suscripción activa se destruye con él |
| COMPOSICIÓN | Usuario y Playlist | **(Listas creadas)** El usuario es el creador y dueño absoluto de la lista |
| | | Si el usuario elimina su cuenta, sus listas personalizadas se destruyen en cascada |
| AGREGACIÓN | Album y Cancion | Las canciones pueden existir independientemente del álbum (ej. lanzamientos como singles) |
| | | El álbum no crea las canciones, solo las agrega a su tracklist |
| AGREGACIÓN | Playlist y Cancion | La playlist simplemente agrupa canciones que ya existen en el catálogo general |
| | | Si se borra la playlist, las canciones siguen existiendo intactas en la plataforma |
| ASOCIACIÓN | Usuario y Playlist | **(Listas guardadas)** El usuario añade a su biblioteca listas creadas por terceros |
| | | Ambos objetos tienen ciclos de vida independientes; si el usuario se da de baja, la lista sobrevive |
| ASOCIACIÓN | Artista y Cancion | Relación directa necesaria para modelar singles o colaboraciones (featurings) |
| | | Permite que el artista se vincule a la canción sin depender obligatoriamente de un álbum |
| ASOCIACIÓN | Usuario y Artista | Representa la acción de "seguir" a un artista |
| | | Es una relación duradera y estructural entre dos entidades con ciclos de vida independientes |

</div>

#### Diagrama de Clases

![Diagrama de clases](./modelosUML/diagramaClases.svg)

```java

```

