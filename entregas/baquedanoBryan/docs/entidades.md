
# Modelo de Dominio: Decisión

## Entidades

- **Persona**: Sujeto que toma decisiones.
- **Conciencia**: Parte inherente de la persona, relacionada con la capacidad de decidir.
- **Contexto**: Variables internas y externas que rodean a la persona.
- **Capacidades**: Habilidades o atributos que posee la persona.
- **Situación**: Circunstancia en la que se debe tomar una decisión.
- **Opción**: Alternativas disponibles en una situación.
- **Análisis**: Proceso lógico que evalúa opciones y genera decisiones.
- **Motivación**: Motor o razón que impulsa la decisión.
- **Decisión**: Elección final realizada por la persona.
- **Consecuencia**: Efecto real posterior a la decisión.

## Relaciones

- **Composición**:
   - Persona *-- Conciencia: La conciencia es parte inherente de la persona.
   - Situación *-- Opción: Las opciones son parte de la situación.

- **Agregación**:
   - Persona o-- Capacidades: La persona posee capacidades.
   - Persona o-- Contexto: La persona está inmersa en un contexto.

- **Dependencia (Uso)**:
   - Análisis ..> Persona: El análisis consulta a la persona.
   - Análisis ..> Situación: El análisis evalúa la situación.
   - Análisis ..> Decisión: El análisis genera la decisión.

- **Asociación**:
   - Decisión --> Motivación: La decisión está basada en la motivación.
   - Decisión --> Consecuencia: La decisión provoca consecuencias.
   - Decisión --> Opción: La decisión elige una opción.

