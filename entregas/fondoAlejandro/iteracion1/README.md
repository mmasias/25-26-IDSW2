# Ecosistema de la Música Actual
## Iteración 1

## Objetivo
Modelar el ecosistema básico de la música actual utilizando un diseño orientado a objetos y relaciones UML clásicas.  
Esta primera iteración establece las entidades fundamentales del sistema y sirve como base para futuras ampliaciones.

---

## Descripción general
El sistema representa cómo:
- Una canción contiene su audio
- Los artistas crean canciones
- Las playlists agrupan canciones
- Un reproductor utiliza canciones de manera temporal

---

## Relaciones UML

| Relación | Clases involucradas | Justificación |
|--------|-------------------|---------------|
| Composición | Canción – Audio | El audio no puede existir sin la canción y depende de su ciclo de vida. |
| Agregación | Playlist – Canción | Las canciones existen independientemente de la playlist. |
| Asociación | Artista – Canción | El artista mantiene una relación duradera con sus canciones. |
| Uso | Reproductor – Canción | El reproductor utiliza la canción solo durante la reproducción. |

---

## Clases del sistema

### Canción
Entidad central del sistema. Contiene un objeto Audio mediante una relación de composición.

### Audio
Representa el archivo de sonido de la canción. No puede existir de forma independiente.

### Artista
Representa al creador de canciones y mantiene una lista de ellas.

### Playlist
Agrupa canciones sin ser responsable de su creación.

### Reproductor
Utiliza canciones temporalmente para reproducirlas.

---
