## Justificaciones

| Categoría | | Justificación | |
| :--- | :--- | :--- | :--- |
| **Nombrado** | + | `toggleShuffle()`: **Principio: Nombres Reveladores.** El uso del verbo *toggle* es semánticamente preciso para una acción de conmutación booleana, eliminando la necesidad de comentarios. | N/A |
| | - | `setPlayerList()`: **Principio: Evitar Desinformación.** El prefijo *set* sugiere un setter simple de atributo, pero el método realiza una carga de datos fija (seeding). Confunde al auditor sobre el flujo de datos real. | N/A |
| | - | `getChoice()` / `getMainMenuChoice()`: **Principio: Nombres Consistentes.** Ambos métodos ejecutan la misma lógica pero tienen nombres distintos en clases hermanas, rompiendo la predictibilidad del sistema. | N/A |
| **Comentarios** | + | Ausencia de comentarios obvios: El código confía en nombres de métodos claros como `displayHistory()`, lo cual es preferible a comentar "Muestra el historial". | N/A |
| **Formato** | + | Indentación consistente: El uso de 3 o 4 espacios en los bloques `switch` y `if` se mantiene uniforme en todo el archivo, facilitando la lectura de la jerarquía. | N/A |
| **Estándares** | + | `@Override toString()`: Se sigue la convención de Java para la representación de objetos (`Song`), permitiendo una impresión limpia y estandarizada en consola. | N/A |
| **Consistencia** | + | Estructura de menús: Tanto el menú principal como el de reproducción usan la misma lógica de `while(true)` y `switch`, lo que crea un modelo mental predecible para el auditor. | N/A |
| **Código muerto** | + | `appRunning = false`: Gestión limpia del ciclo de vida de la aplicación. No hay procesos huérfanos ni variables de control que queden activas tras salir. | N/A |
| | - | `boolean repeat`: **Principio: YAGNI.** El atributo existe, se inicializa y se conmuta, pero no afecta a ninguna lógica de reproducción. Es código que debe ser leído pero no hace nada. | [PR corrección](https://github.com/alex-borja/24-25-EDA1/pull/1/changes/21160214ae10aa720d4fcba5d18cb2447ba21ac3) |
| **DRY** | + | `displayCurrentSong()`: Centraliza la lógica de visualización, evitando repetir la validación de `null` en cada método que necesita mostrar la canción activa. | N/A |
| | - | Validación de entrada: El bloque `try-catch` y la lógica de `Integer.parseInt` están duplicados exactamente en dos clases. Un cambio en la validación exige doble mantenimiento. | [PR corrección](https://github.com/alex-borja/24-25-EDA1/pull/1/changes/e7d1dca3792b7d7c48f966e13e663b3cd0e65b72) |
| **YAGNI** | + | `SpotifyLibrary`: La clase se instancia porque se necesita para la funcionalidad de biblioteca actual, cumpliendo con el requerimiento mínimo funcional. | N/A |
| | - | `new Stack(10)`: Se define una capacidad inicial mágica (10) sin una regla de negocio que limite el historial. Es una optimización prematura que añade complejidad innecesaria. | [PR corrección](https://github.com/alex-borja/24-25-EDA1/pull/1/changes/8c75af932ff997ad0de311e908f54a1cf1b370c4) |