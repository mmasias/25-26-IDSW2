| **Entidad** | **Responsabilidad principal** | **Rol en decisión LLM** | **Ejemplo decisión** |
|-------------|-------------------------------|-------------------------|---------------------|
| **Usuario** | `inicia diálogo()` | Input humano | `"¿Opción 1 o 2?"` |
| **Chat** | `delega petición()` | Interfaz conversacional | Pasa query → Orquestador |
| **Orquestador** | `contiene lógica de decisión` | Router inteligente | **CREA** → MotorDecision |
| **MotorDecision** | `decide()` | **Núcleo matemático** | `logits=[2.3,1.1] → "Opción 1" (78%)` |
| **Explicador** | `solicita explicación` | XAI legible humana | `"**Opción 1** (78% confianza)"` |
| **Datos** | `consulta datos` | Contexto numérico | `[edad=35, presupuesto=medio]` |
| **Documentos** | `analiza documentos` | Contexto textual RAG | `"Opción 1: más cobertura"` |
| **Workflow** | `evalúa reglas` | Restricciones lógicas | `if(riesgo=alto) descartar Op2` |
