#  Diagrama de clases de una decisión

## Descripción general
Este diagrama representa un modelo para la toma de decisiones, donde diferentes elementos interactúan para producir un **resultado** basado en **criterios**, **opciones**, **experiencias** y el **contexto** en que ocurre la decisión. Además, las **eventos** pueden desencadenar decisiones.

---

## Clases principales

### 1. Decisión
- Representa una decisión concreta que debe tomarse.
- **Relaciones:**
  - **Tiene** → Opción: una decisión cuenta con varias opciones posibles.
  - **Usa** → Criterio: los criterios se utilizan para evaluar las opciones.
  - **Produce** → Resultado: al tomar la decisión se obtiene un resultado.
  - **Depende de** → Contexto: el contexto influye en cómo se toma la decisión.

### 2. Opción
- Representa una alternativa concreta dentro de una decisión.
- Cada decisión puede tener múltiples opciones.

### 3. Criterio
- Define los parámetros o reglas para evaluar las opciones.
- **Relaciones:**
  - **Ajustado por** → Experiencia: las experiencias previas pueden modificar la importancia o la valoración de un criterio.

### 4. Resultado
- Representa el resultado de una decisión.
- **Relaciones:**
  - **Genera** → Experiencia: un resultado contribuye a generar experiencia para decisiones futuras.

### 5. Experiencia
- Acumula conocimiento o aprendizaje derivado de decisiones pasadas.
- Permite ajustar criterios para decisiones posteriores.

### 6. Contexto
- Representa las circunstancias o condiciones en las que se toma la decisión.
- Es un factor que influye directamente en la decisión y está ligado a eventos.

### 7. Evento
- Representa algo que ocurre y que puede **desencadenar** una decisión.
- **Relaciones:**
  - **Desencadena** → Decisión
  - **Ocurre en** → Contexto

---



