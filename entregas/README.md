| Relación | Clases | Justificación |
| :--- | :--- | :--- |
| **AGREGACIÓN** | Conversación y Persona (Emisor/Receptor) | Las personas pueden existir en el sistema independientemente de la conversación |
| | | La conversación no crea a las personas, solo las agrupa para que interactúen |
| **COMPOSICIÓN** | Mensaje y Contenido (Palabras/Silencio) | El contenido (palabras o silencio) no puede existir fuera de un mensaje |
| | | Su ciclo de vida está estrictamente ligado al objeto mensaje que lo instancia |
| **COMPOSICIÓN** | Conversación y Mensaje | La conversación es la creadora exclusiva de los mensajes del historial |
| | | Si se elimina el hilo de la conversación, los mensajes desaparecen con ella |
| **ASOCIACIÓN** | Mensaje y Medio | Relación estructural donde el mensaje registra el canal por el que se transmite |
| | | El medio existe de forma autónoma, independientemente de los mensajes |