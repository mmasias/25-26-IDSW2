## Tabla v1

| Clases | Tipo UML | Por qué esa relación | Ejemplo seguros |
|--------|----------|---------------------|-----------------|
| `MotorDecision → Datos` | `*--` **Composición** | Motor **CREA** embeddings para RAG | Motor genera vectores de pólizas |
| `MotorDecision → Documentos` | `*--` **Composición** | Motor **PROCESA** chunks internamente | Motor hace split de PDF póliza |
| `MotorDecision → Workflow` | `*--` **Composición** | Motor **EJECUTA** su propio workflow | Motor evalúa reglas tarificación |
| `Orquestador → Datos` | `o--` **Agregación** | Orquestador **CONSULTA** datos externos | Lee DB clientes (existe sola) |
| `Chat → Orquestador` | `..>` **Uso** | Chat **USA** Orquestador temporalmente | Chat delega 1 query |