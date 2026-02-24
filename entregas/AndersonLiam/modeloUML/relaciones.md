# Diseño - Relaciones por colaboración

A continuación se justifican las decisiones de diseño basándonos en los criterios de ciclo de vida, temporalidad y exclusividad, eligiendo siempre la relación más débil posible:

| Clase A (Todo/Origen) | Clase B (Parte/Destino) | Relación | Justificación (¿Por qué es esta relación?) |
| :--- | :--- | :--- | :--- |
| **Oyente** | **Reproductor** | **Uso** | El oyente solo interactúa con el reproductor de forma **puntual** para escuchar música. No lo posee como atributo. |
| **Oyente** | **Cancion** | **Uso** | Interacción **puntual** y compartida. El oyente consume la canción, pero esta sigue existiendo independientemente en el catálogo. |
| **Reproductor** | **Cancion** | **Uso** | El reproductor necesita la canción de forma **puntual** para procesar el audio y emitirlo. |
| **Artista** | **Instrumento** | **Uso** | El artista necesita el instrumento para interpretar la música (se usa en un método `tocar()`), pero si el instrumento se rompe, el artista sigue existiendo. |
| **Banda** | **Artista** | **Agregación** | Relación "todo-parte" independiente. Si la banda se disuelve, los artistas no desaparecen y continúan sus carreras individualmente. |
| **Album** | **Cancion** | **Agregación** | Relación "todo-parte" independiente. Si el álbum se retira del mercado, las canciones sobreviven de forma individual (ej. como sencillos). |
| **Playlist** | **Cancion** | **Agregación** | Relación "todo-parte" independiente. Si una playlist se borra, las canciones siguen intactas en la base de datos general. |
| **Cancion** | **Letra** | **Agregación** | Están unidas de forma permanente, pero la letra puede existir por sí sola (ej. publicada como un poema o registrada por un letrista aparte). |
| **Cancion** | **Partitura** | **Agregación** | La partitura representa la canción, pero se puede editar o vender de forma independiente al archivo de audio. |
| **Cancion** | **GeneroMusical** | **Agregación** | La canción pertenece a un género, pero el género musical existe por sí solo en el sistema aunque se borre la canción. |
| **Cancion** | **Compositor** | **Agregación** | El compositor forma parte de los créditos fijos de la obra, pero tiene un ciclo de vida independiente (no muere si la canción es censurada o eliminada). |
| **Cancion** | **Productor** | **Agregación** | El productor es parte fundamental de la creación de la pista, pero sigue existiendo en el sistema de forma independiente a esta canción en concreto. |
| **Oyente** | **Playlist** | **Composición** | Relación "todo-parte" dependiente. La playlist personal nace y muere con su creador; si el oyente elimina su cuenta, la playlist se destruye con él. |