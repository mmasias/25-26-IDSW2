# Diseño - Relaciones por colaboración



| Origen| Destino | Relación | Justificación  |
| :--- | :--- | :--- | :--- |
| **Oyente** | **Reproductor** | **Uso** | El oyente interactúa con el reproductor de forma puntual para escuchar música. No lo posee lógicamente. |
| **Oyente** | **Reproduccion** | **Uso** | El oyente genera un evento de reproducción de forma puntual. Es una acción temporal. |
| **Reproduccion** | **Cancion** | **Uso** | El evento de reproducción procesa la canción en ese instante exacto. |
| **Artista** | **Instrumento** | **Uso** | El artista necesita el instrumento para interpretar en un momento dado (`tocar()`), pero tienen vidas independientes. |
| **Banda** | **Artista** | **Agregación** | Relación "todo-parte" independiente. Si la banda se disuelve, los artistas continúan sus carreras individualmente. |
| **Album** | **Cancion** | **Agregación** | Relación "todo-parte" independiente. Si el álbum se retira del mercado, las canciones sobreviven de forma individual. |
| **Playlist** | **Cancion** | **Agregación** | Relación "todo-parte" independiente. Si una playlist se borra, las canciones siguen intactas en el catálogo general. |
| **Cancion** | **Letra** / **GeneroMusical** / **Productor** / **Partitura** / **Artista** | **Agregación** | Son componentes de la canción que se inyectan en su creación, pero existen por sí solos en el sistema aunque se elimine el archivo de audio. |
| **Oyente** | **Playlist** | **Composición** | Relación "todo-parte" dependiente. La playlist personal nace y muere con su creador. |
| **Partitura** | **Nota** | **Composición** | La partitura está formada por notas escritas en ella. Si destruyes la partitura, esas notas escritas desaparecen con ella. |
| **Plataforma** | **Estadistica** | **Composición** | Las métricas son internas. Si la plataforma desaparece, sus estadísticas también. |
| **Plataforma** | **Oyente** | **Composición** | La plataforma posee las cuentas de usuario. Si la plataforma cierra, los usuarios registrados se destruyen con ella. |