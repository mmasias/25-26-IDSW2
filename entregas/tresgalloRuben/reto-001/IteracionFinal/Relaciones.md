- Participante -- Conversacion (Asociación):
Un Participante "toma parte" en una Conversacion. No hay dependencia existencial fuerte: un participante existe aunque no esté en una conversación en este momento, y una conversación es el evento que reúne a los participantes.
- Conversacion *-- Interaccion (Composición):
La Conversacion es el contenedor esencial y el "todo". Cada Interaccion (una frase dicha, un gesto, un turno de palabra) pertenece intrínsecamente a esa conversación específica. Si conceptualmente destruyes la conversación, sus interacciones pierden su contexto y dejan de tener sentido.
- Participante --> Interaccion (Asociación):
Indica la autoría. El Participante es el sujeto que genera o realiza la Interaccion. La dirección marca quién es el creador de ese turno o acto comunicativo.
- Conversacion -- Contexto (Asociación):
Una Conversacion ocurre siempre dentro de un Contexto determinado (un lugar físico, un canal virtual, una situación temporal). Son entidades separadas que se vinculan durante la duración del evento.
- Conversacion o-- Tema (Agregación):
Una conversación trata sobre un Tema y lo "agrega" para darle propósito. Sin embargo, el Tema es un concepto abstracto (ej. "Presupuesto anual") que existe independientemente de esta conversación en particular y puede ser abordado en otras distintas.
Interaccion <|-- Silencio (Herencia/Generalización):
Esto modela conceptualmente que el silencio no es la nada, sino un acto comunicativo válido dentro de la conversación, al mismo nivel que una frase hablada o un gesto.
- Conversacion *-- Turno (Composición):
La conversación se estructura fundamentalmente como una secuencia de Turnos. 
- Participante --> Turno (Asociación):
Participante tiene la palabra o el control del flujo comunicativo en ese Turno específico.
- Turno o-- Interaccion (Agregación):
Un Turno es un contenedor temporal que agrupa una o varias Interacciones.
- Conversacion -- Medio (Asociación):
Una Conversacion tiene lugar a través de un Medio. Son entidades independientes que se asocian. Un mismo medio (ej. "Español escrito") se utiliza en incontables conversaciones diferentes.
- Conversacion --> Resultado (Asociación):
La Conversacion genera o conduce a un Resultado. El resultado es la consecuencia de que la conversación haya tenido lugar.
- Interaccion o-- Intencion (Agregación):
Una Interaccion "lleva cargada" una Intencion. La intención (ej. "Preguntar") es un concepto abstracto que existe fuera de esta frase concreta, pero esta frase la utiliza.
- Conversacion -- Estado (Asociación):
Una Conversacion tiene un Estado actual en un momento dado. Son entidades distintas que se relacionan para indicar la situación global del evento.