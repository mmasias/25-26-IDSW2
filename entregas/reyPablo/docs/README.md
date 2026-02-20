## 1. IDENTIFICACIÓN DE CLASES
Para la segunda iteración he identificado estas clases principales:
- Letra
- Canción
- Artista
- Album
- Género
- Playlist
- Reproductor
- Suscripción
- Usuario


## 2. RELACIONES ENTRE CLASES Y JUSTIFICACIÓN

### Ecosistema Musical: Modelado de Relaciones (Iteración Final)

| Tipo de Relación | Clases Involucradas | Justificación|
| :--- | :--- | :--- |
| **COMPOSICIÓN** | **Canción** y **Letra** | • La letra no puede existir sin la canción y su ciclo de vida está ligado a ella. |
|| **Usuario** y **Suscripcion** | • La suscripción es intrínseca a la cuenta del usuario. Si el usuario se elimina, su suscripción (estado de cuenta) desaparece con él.|
| **AGREGACIÓN** | **Playlist** y **Canción** | • Las canciones existen independientemente de las playlists.<br>• La playlist solo agrupa referencias a canciones que ya están en el sistema. |
|| **Album** y **Cancion** | • Las canciones pueden existir como singles sin pertenecer a ese álbum. El álbum agrega las canciones|
| **ASOCIACIÓN** | **Usuario** y **Playlist** | • El usuario gestiona sus propias listas.<br>• El usuario mantiene una lista de referencias a sus playlists creadas. |
|| **Artista** y **Album** | • El artista es el autor de los álbumes. |
|| **Cancion** y **Genero** | • Ambos existen de forma independiente (el "Jazz" existe sin la canción X), la canción mantiene una referencia al género para su clasificación. |
|| **Reproductor** y **Cancion** | • El reproductor utiliza la canción temporalmente para la salida de audio.