# Modelo de Dominio – Ecosistema musical

Este modelo representa un ecosistema musical basico , centrado en cómo se crea y se organiza la música.

## Clases
- **Usuario**: persona que utiliza la aplicación.
- **Playlist**: lista creada por un usuario para organizar canciones.
- **Cancion**: música en si.
- **Artista**: persona o grupo que crea canciones.
- **Album**: conjunto de canciones publicadas por un artista.

## Relaciones

### Usuario – Playlist (Composición)
Un usuario crea sus playlists.  
La playlist existe porque el usuario la ha creado.

### Album – Cancion (Agregación)
Un álbum incluye canciones.  
Una canción puede existir sin álbum.

### Playlist – Cancion (Asociación)
Una playlist contiene canciones.  
Las canciones no dependen de la playlist para existir.

### Cancion – Artista (Asociación)
Una canción pertenece a uno o varios artistas.  
Un artista puede tener muchas canciones.

### Artista – Album (Asociación)
Un artista publica álbumes.