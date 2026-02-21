## 1. IDENTIFICACIÓN DE CLASES
Para la tercera iteración no se han identificado nuevas clases pricipales, solo se han refinado las clases ya existentes :
- Letra
- Canción
- Artista
- Album
- Género
- Playlist
- Reproductor
- Suscripción
- Usuario
---

## 2. RELACIONES ENTRE CLASES Y JUSTIFICACIÓN

| Tipo de Relación | Clases Involucradas | Justificación del Modelo |
| :--- | :--- | :--- |
| **COMPOSICIÓN** | **Cancion** y **Letra** | • La letra es parte esencial de la canción. Si se borra la canción, la letra se destruye. |
| | **Usuario** y **Suscripcion** | • La suscripción no existe sin un usuario. Su ciclo de vida depende totalmente de la cuenta. |
| **AGREGACIÓN** | **Playlist** y **Cancion** | • La playlist referencia canciones. Si borras la lista, las canciones siguen en el catálogo. |
| | **Album** y **Cancion** | • El álbum agrupa canciones. Las canciones pueden existir fuera del álbum (como singles). |
| | **Usuario** y **Playlist** | • El usuario accede a listas de reproducción pero si eliminas el usuario, las listas permanecen vivas. |
| **ASOCIACIÓN**| **Artista** y **Album** | • Vínculo de autoría entre el artista y su discografía oficial completa. |
| | **Artista** y **Cancion** | • Permite al artista gestionar "Singles" (canciones que no pertenecen a un álbum). |
| | **Cancion** y **Genero** | • Clasificación duradera. La canción conoce su género (Rock, Pop, etc.). |
| **USO** | **Usuario** y **Reproductor** | • El usuario elige una canción sin usar una playlist que reproduce mediente el uso del reproductor |
| | **Reproductor** y **Playlist**| • El reproductor usa la playlist que contiene unas canciones y las carga.
| | **Reproductor** y **Cancion** | • El reproductor carga la canción temporalmente para procesar el sonido. |
---

## 3. MODELADO DEL ECOSISTEMA MUSICAL
<strong> Versión final del modelo uml del ecosistema musical </strong><br><br>
<img src="/entregas/reyPablo/images/iteracionFinal/modeloEcosistemaMusical.svg"><br><br>
<a href="/entregas/reyPablo/modelosUml/iteracionFinal/modeloEcosistemaMusical.puml">Enlace al codigo</a>
<br><br>
<strong> Iteraciones previas al modelo final</strong><br>
| Iteración | Modelo UML | Enlace al código |
|--------|---------------|---------------|
| 1      |<img src="/entregas/reyPablo/images/primeraIteracion/modeloEcosistemaMusical.svg"> | <a href="/entregas/reyPablo/modelosUml/primeraIteracion/modeloEcosistemaMusical.puml"> Enlace primera iteración</a>|
| 2      |<img src="/entregas/reyPablo/images/segundaIteracion/modeloEcosistemaMusical.svg"> | <a href="/entregas/reyPablo/modelosUml/segundaIteracion/modeloEcosistemaMusical.puml"> Enlace segunda iteración</a> |
| 3      | <img src="/entregas/reyPablo/images/terceraIteracion/modeloEcosistemaMusical.svg">| <a href="/entregas/reyPablo/modelosUml/terceraIteracion/modeloEcosistemaMusical.puml">Enlace tercera iteración</a> |  
