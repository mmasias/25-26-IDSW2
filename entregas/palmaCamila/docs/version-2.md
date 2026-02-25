## Tabla v2

| **Relación** | **Clases** | **Tipo UML** | **Significado** | **Ejemplo concreto** |
|--------------|------------|--------------|-----------------|---------------------|
| `..>` **Uso** | `Usuario → Chat` | **Uso (dashed)** | Usuario usa Chat temporalmente | Usuario llama `inicia diálogo()` |
| `..>` **Uso** | `Chat → Orquestador` | **Uso (dashed)** | Chat delega temporalmente | Chat llama `delega petición()` |
| `*--` **Composición** | `Orquestador → MotorDecision` | **Composición** | Orquestador **CREA** MotorDecision | Orquestador instancia Motor matemático |
| `-->` **Asociación** | `MotorDecision → Explicador` | **Asociación** | Motor solicita permanentemente | `solicita explicación()` |
| `o--` **Agregación** | `MotorDecision → Datos` | **Agregación** | Motor consulta datos externos | Consulta `[edad=35, riesgo=alto]` |
| `o--` **Agregación** | `MotorDecision → Documentos` | **Agregación** | Motor analiza documentos RAG | Busca chunks "Opción 1 vs 2" |
| `o--` **Agregación** | `MotorDecision → Workflow` | **Agregación** | Motor evalúa reglas externas | Verifica `riesgo=alto → descartar Op2` |