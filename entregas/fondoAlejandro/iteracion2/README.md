# Ecosistema de la Música Actual
## Iteración 2

## Objetivo
Ampliar el modelo del ecosistema musical incorporando nuevos actores y estructuras:
- Álbumes como agrupadores oficiales de canciones
- Usuarios como consumidores y organizadores de contenido

Esta iteración mantiene intacto el modelo anterior y agrega nuevas relaciones.

---

## Nuevas funcionalidades
- Organización de canciones en álbumes
- Creación y gestión de playlists por parte de usuarios

---

## Relaciones UML

| Relación | Clases involucradas | Justificación |
|--------|-------------------|---------------|
| Composición | Canción – Audio | El audio depende completamente de la canción. |
| Agregación | Playlist – Canción | La playlist solo agrupa canciones existentes. |
| Agregación | Álbum – Canción | Las canciones pueden existir fuera del álbum. |
| Asociación | Artista – Canción | El artista mantiene relación con sus canciones. |
| Asociación | Usuario – Playlist | El usuario crea y administra playlists. |
| Uso | Reproductor – Canción | El reproductor usa canciones solo durante la ejecución. |

---

## Clases incorporadas en esta iteración

### Álbum
Representa una colección oficial de canciones publicadas dentro del ecosistema musical.

### Usuario
Representa al oyente del sistema, encargado de crear y administrar playlists.

---

## Clases existentes
Las siguientes clases provienen de la iteración anterior y no se modifican:
- Canción
- Audio
- Artista
- Playlist
- Reproductor

---
