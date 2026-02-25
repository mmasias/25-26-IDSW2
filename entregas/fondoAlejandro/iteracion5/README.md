# Ecosistema de la Música Actual
## Iteración 5

## Objetivo
Completar el ecosistema musical incorporando mecanismos inteligentes de análisis y recomendación:
- Sistema de recomendaciones personalizadas
- Análisis de comportamiento de usuarios
- Tendencias musicales basadas en reproducciones

Esta iteración representa el nivel más avanzado del modelo.

---

## Nuevas funcionalidades
- Recomendación de canciones según historial de reproducción
- Análisis de datos de consumo musical
- Detección de tendencias musicales globales
- Relación entre usuarios y recomendaciones generadas

---

## Relaciones UML

| Relación | Clases involucradas | Justificación |
|--------|-------------------|---------------|
| Composición | Canción – Audio | El audio depende completamente de la canción. |
| Agregación | Playlist – Canción | La playlist agrupa canciones existentes. |
| Agregación | Álbum – Canción | El álbum agrupa canciones publicadas. |
| Asociación | Artista – Canción | El artista crea o colabora en canciones. |
| Asociación | Usuario – Playlist | El usuario gestiona playlists. |
| Asociación | Usuario – Suscripción | El usuario posee una suscripción. |
| Agregación | Usuario – HistorialReproducción | El historial almacena reproducciones del usuario. |
| Asociación | PlataformaMusical – Monetización | La plataforma gestiona pagos. |
| Asociación | PlataformaMusical – SistemaRecomendacion | La plataforma genera recomendaciones. |
| Asociación | SistemaRecomendacion – Usuario | El sistema analiza usuarios. |
| Asociación | SistemaRecomendacion – Canción | El sistema recomienda canciones. |
| Asociación | Tendencia – Canción | Las tendencias agrupan canciones populares. |
| Uso | Reproductor – Canción | El reproductor usa canciones temporalmente. |

---

## Clases incorporadas en esta iteración

### SistemaRecomendacion
Analiza el comportamiento del usuario y genera recomendaciones personalizadas.

### AnalisisDatos
Procesa información estadística sobre reproducciones y popularidad.

### Tendencia
Representa una tendencia musical basada en consumo global.

---
