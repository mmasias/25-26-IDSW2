## Tabla v1

| Clases | Tipo UML | Por qué esa relación |
|--------|----------|---------------------|
| `MotorDecision → Datos` | `*--` **Composición** | Motor **CREA** embeddings para RAG |
| `MotorDecision → Documentos` | `*--` **Composición** | Motor **PROCESA** chunks internamente |
| `MotorDecision → Workflow` | `*--` **Composición** | Motor **EJECUTA** su propio workflow |
| `Orquestador → Datos` | `o--` **Agregación** | Orquestador **CONSULTA** datos externos |
| `Chat → Orquestador` | `..>` **Uso** | Chat **USA** Orquestador temporalmente |