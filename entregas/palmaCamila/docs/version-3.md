## Tabla v3

| **Relación** | **Clases** | **Tipo UML** | **Significado** | **Ejemplo concreto** |
|--------------|------------|--------------|-----------------|---------------------|
| `..>` **Uso** | `Usuario → Chat` | **Uso** | Usuario usa Chat temporalmente | Usuario llama `inicia diálogo()` |
| `..>` **Uso** | `Chat → Orquestador` | **Uso** | Chat delega temporalmente | Chat llama `delega petición()` |
| `*--` **Composición** | `Orquestador → MotorDecision` | **Composición** | Orquestador **CREA** MotorDecision | Orquestador instancia Motor matemático |
| **`..>` Uso** | **`MotorDecision → Explicador`** | **Uso** | Motor pide **UNA VEZ** explicación | `solicita explicación()` |
| `o--` **Agregación** | `MotorDecision → Datos` | **Agregación** | Motor consulta datos externos | Consulta `[edad=35, riesgo=alto]` |
| `o--` **Agregación** | `MotorDecision → Documentos` | **Agregación** | Motor analiza documentos RAG | Busca chunks "Opción 1 vs 2" |
| **`*--` Composición** | **`MotorDecision → Workflow`** | **Composición** | Motor **EJECUTA** workflow **interno** | `riesgo=alto → descartar Op2` |
