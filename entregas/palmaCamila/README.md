# Índice General

## Documentación

- [Cómo surgió todo](./docs/investigación.md)
- [Glosario](./docs/glosario.md)
- [Justificación – Versión 1](./docs/version-1.md)
- [Justificación – Versión 2](./docs/version-2.md)

## Código Fuente

- [Código – Versión Final](./src/)

---

# Descripción del Proyecto

Este proyecto simula el funcionamiento básico de un **LLM (Large Language Model)** implementado en Java de forma simplificada.  
El sistema reproduce de manera conceptual componentes típicos como:
- Mediador
- Orquestador
- Motor de decisión (simulación de logits y probabilidades)
- Recuperación de información (documentos/embedding)
- Workflow basado en reglas
---

# Ejemplo de Output del Programa

```text
Mediador: ¿Opción 1 o 2?
Chat: Delegando a Orquestador...
MotorDecision: logits=[2.3, 1.1]
MotorDecision: probs=[0.77, 0.23]
Datos: [edad=35, riesgo=alto, presupuesto=medio]
Docs:
  - Opción 1: más cobertura...
  - Opción 2: más barata...
Workflow: riesgo alto → priorizar Opción 1
Chat: **Opción 1** (78% confianza)