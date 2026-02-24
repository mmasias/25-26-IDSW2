## 1. IDENTIFICACIÓN DE CLASES
Para la cuarta iteración se han identificado nuevas clases principales, que junto con las anteriores quedaría así:
- Letra
- Nota
- Acorde
- Compás
- Partitura
- Instrumento
- Canción
- Artista
- Estudio
- Productor
- Álbum
- Género
- Playlist
- Reproductor
- Suscripción
- Usuario

---

## 2. RELACIONES ENTRE CLASES Y JUSTIFICACIÓN

| Tipo de Relación | Clases Involucradas | Justificación del Modelo |
| :--- | :--- | :--- |
| **COMPOSICIÓN** | **Cancion** y **Letra** | • La letra es parte esencial de la canción. Si se borra la canción, la letra se destruye. |
| | **Usuario** y **Suscripcion** | • La suscripción no existe sin un usuario. Su ciclo de vida depende totalmente de la cuenta. |
| | **Cancion** y **Partitura** | • La partitura no puede existir sin la canción y su ciclo de vida está ligado a ella. |
| | **Partitura** y **Nota** | • La nota es la unidad básica que compone la partitura; si esta se destruye, las notas desaparecen. |
| | **Partitura** y **Acorde** | • El acorde es una estructura interna de la partitura; su existencia depende totalmente de ella. |
| | **Acorde** y **Nota** | • Las notas de un acorde son partes integrales del mismo; si el acorde se borra, sus notas también. |
| **AGREGACIÓN** | **Playlist** y **Cancion** | • La playlist referencia canciones. Si borras la lista, las canciones siguen en el catálogo. |
| | **Album** y **Cancion** | • El álbum agrupa canciones. Las canciones pueden existir fuera del álbum (como singles). |
| | **Usuario** y **Playlist** | • El usuario accede a listas de reproducción pero si eliminas al usuario, las listas permanecen vivas. |
| | **Cancion** e **Instrumento** | • Los instrumentos pueden existir independientemente de la canción. La canción solo los agrega. |
| **ASOCIACIÓN**| **Artista** y **Album** | • Vínculo de autoría entre el artista y su discografía oficial completa. |
| | **Artista** y **Cancion** | • Permite al artista gestionar "Singles" (canciones que no pertenecen a un álbum). |
| | **Cancion** y **Genero** | • Clasificación duradera. La canción conoce su género (Rock, Pop, etc.). |
| | **Productor** y **Cancion** | • Relación duradera donde el productor supervisa y dirige la creación de canciones específicas. |
| | **Cancion** y **Estudio** | • Relación de registro donde la canción mantiene una referencia histórica al estudio donde fue grabada. |
| | **Partitura** y **Compás** | • El compás es una referencia métrica externa que la partitura mantiene para definir su ritmo. |
| | **Productor** y **Artista** | • Relación profesional donde el productor gestiona y mantiene referencia a los artistas que dirige. |
| **USO** | **Usuario** y **Reproductor** | • El usuario elige una canción sin usar una playlist que reproduce mediante el uso del reproductor. |
| | **Reproductor** y **Playlist**| • El reproductor usa la playlist que contiene unas canciones y las carga. |
| | **Reproductor** y **Cancion** | • El reproductor carga la canción temporalmente para procesar el sonido. |
| | **Artista** y **Estudio** | • El artista utiliza temporalmente el estudio solo durante la ejecución de las tomas de grabación. |

---

## 3. MODELADO DEL ECOSISTEMA MUSICAL

<strong> Versión final del modelo UML del ecosistema musical </strong><br><br>
<img src="/entregas/gutierrezMarcos/reto-001/diagramas/diagrama.svg"><br><br>
<a href="/entregas/gutierrezMarcos/reto-001/modelosUML/diagrama.puml">Enlace al código final</a>