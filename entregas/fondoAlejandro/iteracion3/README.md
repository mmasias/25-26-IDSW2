# Ecosistema de la Música Actual
## Iteración 3

## Objetivo
Extender el modelo incorporando conceptos propios de las plataformas de streaming:
- Plataformas musicales
- Suscripciones
- Géneros musicales
- Historial de reproducción

Esta iteración refuerza el enfoque del ecosistema moderno de consumo musical.

---

## Nuevas funcionalidades
- Acceso a música mediante una plataforma
- Gestión de suscripciones de usuarios
- Clasificación de canciones por género
- Registro de reproducciones realizadas por los usuarios

---

## Relaciones UML

| Relación | Clases involucradas | Justificación |
|--------|-------------------|---------------|
| Composición | Canción – Audio | El audio depende completamente de la canción. |
| Agregación | Playlist – Canción | La playlist agrupa canciones existentes. |
| Agregación | Álbum – Canción | Las canciones pueden existir fuera del álbum. |
| Asociación | Artista – Canción | El artista crea canciones. |
| Asociación | Usuario – Playlist | El usuario administra playlists. |
| Asociación | Canción – Género | Una canción pertenece a un género musical. |
| Asociación | PlataformaMusical – Usuario | La plataforma gestiona usuarios registrados. |
| Asociación | Usuario – Suscripción | El usuario posee una suscripción. |
| Agregación | Usuario – HistorialReproducción | El historial registra reproducciones del usuario. |
| Uso | Reproductor – Canción | El reproductor usa canciones temporalmente. |

---

## Clases incorporadas en esta iteración

### PlataformaMusical
Representa un servicio de streaming musical que ofrece contenido a los usuarios.

### Suscripción
Define el tipo de acceso del usuario a la plataforma (gratuita, premium, etc.).

### Género
Clasifica canciones según su estilo musical.

### HistorialReproducción
Registra las canciones reproducidas por un usuario.

---
