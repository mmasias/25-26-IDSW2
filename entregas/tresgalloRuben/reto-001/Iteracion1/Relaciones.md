Participante -- Conversacion (Asociación):
Un Participante "toma parte" en una Conversacion. No hay dependencia existencial fuerte: un participante existe aunque no esté en una conversación en este momento, y una conversación es el evento que reúne a los participantes.
Conversacion *-- Interaccion (Composición):
La Conversacion es el contenedor esencial y el "todo". Cada Interaccion (una frase dicha, un gesto, un turno de palabra) pertenece intrínsecamente a esa conversación específica. Si conceptualmente destruyes la conversación, sus interacciones pierden su contexto y dejan de tener sentido.
Participante --> Interaccion (Asociación):
Indica la autoría. El Participante es el sujeto que genera o realiza la Interaccion. La dirección marca quién es el creador de ese turno o acto comunicativo.
Conversacion -- Contexto (Asociación):
Una Conversacion ocurre siempre dentro de un Contexto determinado (un lugar físico, un canal virtual, una situación temporal). Son entidades separadas que se vinculan durante la duración del evento.
Conversacion o-- Tema (Agregación):
Una conversación trata sobre un Tema y lo "agrega" para darle propósito. Sin embargo, el Tema es un concepto abstracto (ej. "Presupuesto anual") que existe independientemente de esta conversación en particular y puede ser abordado en otras distintas.