## 1. IDENTIFICACIÓN DE CLASES
Para la primera iteración he identificado estas clases principales:
- Canción
- Letra
- Playlist
- Usuario
- Reproductor

## 2. RELACIONES ENTRE CLASES Y JUSTIFICACIÓN

| Tipo de Relación | Clases Involucradas | Justificación del Modelo |
| :--- | :--- | :--- |
| **COMPOSICIÓN** | **Cancion** y **Letra** | • La letra no puede existir sin la canción y su ciclo de vida está ligado a ella.|
| **AGREGACIÓN** | **Playlist** y **Cancion** | • Las canciones pueden existir independientemente de la playlist (en el catálogo general).|
| **ASOCIACIÓN** | **Usuario** y **Playlist** | • Relación duradera donde el usuario gestiona o es dueño de sus listas específicas.|
| **USO** | **Reproductor** y **Cancion** | • El reproductor utiliza temporalmente la canción solo para ejecutar la acción de sonar.|