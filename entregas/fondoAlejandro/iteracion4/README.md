# Ecosistema de la Música Actual
## Iteración 4

## Objetivo
Ampliar el ecosistema musical incorporando aspectos clave del mercado actual:
- Monetización de la música
- Pagos por suscripción
- Rankings de popularidad
- Colaboraciones entre artistas

Esta iteración acerca el modelo a un escenario real de negocio y consumo musical.

---

## Nuevas funcionalidades
- Registro de pagos realizados por los usuarios
- Gestión de rankings basados en popularidad
- Colaboraciones entre artistas en canciones
- Asociación de monetización a la plataforma

---

## Relaciones UML

| Relación | Clases involucradas | Justificación |
|--------|-------------------|---------------|
| Composición | Canción – Audio | El audio depende totalmente de la canción. |
| Agregación | Playlist – Canción | La playlist agrupa canciones existentes. |
| Agregación | Álbum – Canción | El álbum agrupa canciones publicadas. |
| Asociación | Artista – Canción | El artista crea o colabora en canciones. |
| Asociación | Artista – Artista | Los artistas pueden colaborar entre sí. |
| Asociación | Usuario – Playlist | El usuario gestiona playlists. |
| Asociación | Usuario – Suscripción | El usuario posee una suscripción. |
| Agregación | Usuario – HistorialReproducción | El historial registra reproducciones del usuario. |
| Asociación | PlataformaMusical – Monetización | La plataforma gestiona la monetización. |
| Asociación | Ranking – Canción | El ranking clasifica canciones por popularidad. |
| Uso | Reproductor – Canción | El reproductor usa canciones temporalmente. |

---

## Clases incorporadas en esta iteración

### Monetizacion
Gestiona los pagos y beneficios económicos de la plataforma.

### Pago
Representa una transacción realizada por un usuario.

### Ranking
Clasifica canciones según su popularidad.

---
