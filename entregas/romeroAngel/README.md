# Legibilidad — Justificaciones

Ejemplos extraídos de repositorios propios que ilustran buenas y malas prácticas de legibilidad en código Java, junto con los PRs de corrección correspondientes.

| Categoría | | Justificación | |
|-|-|-|-|
| **Nombrado** | Ejemplo + | `sellPrice`, `paid`, `change` — nombres descriptivos que revelan claramente su intención | [🔗](https://github.com/aeRomeroz/23-24-prg1/blob/abd4c7df06f8c289b345676dcdd2f23464c4b604/entregas/romeroAngel/reto-003/ScannerMoneyCalculationsv2.java#L8-L11) |
| | Ejemplo - | `bil`, `bilQnt`, `mensaje` — abreviaciones que no revelan su intención | [PR #1](https://github.com/aeRomeroz/23-24-prg1/pull/1) |
| | Ejemplo - | `dig1`, `dig2`, `dig3`, `deconNum` — abreviaciones sin contexto | [PR #3](https://github.com/aeRomeroz/23-24-prg1/pull/3) |
| **Comentarios** | Ejemplo + | Dado que se priorizó no hacer uso de comentarios, no he podido brindar un ejemplo de dicha practica | |
| | Ejemplo - | `//Añadí 'int index'` — comentario que registra un cambio, información que pertenece al historial de git | [PR #1](https://github.com/aeRomeroz/23-24-prg2-ep/pull/1) |
| | Ejemplo - | | |
| **Formato** | Ejemplo + | Código bien indentado y agrupado lógicamente | [🔗](https://github.com/aeRomeroz/23-24-prg1/blob/3ece9752d89fc9e11d89e8fbfed91be5d5583e95/entregas/romeroAngel/reto-005/DetermineGreater.java#L1-L14) |
| | Ejemplo - | | |
| | Ejemplo - | | |
| **Estándares** | Ejemplo + | Constantes en `UPPER_SNAKE_CASE`, métodos en `camelCase`, clase en `PascalCase` — convenciones Java respetadas | [🔗](https://github.com/aeRomeroz/23-24-prg2/blob/190860b1cd0fb9959b741036f64d789f57332a89/entregas/romeroAngel/reto-001/reto-001.java#L8-L11) |
| | Ejemplo - | Métodos de acceso con prefijo `show` en lugar del estándar `get` de Java | [PR #2](https://github.com/aeRomeroz/23-24-prg2-ep/pull/2) |
| | Ejemplo - | | |
| **Consistencia** | Ejemplo + | Todas las llamadas a `printDenominationChange` siguen exactamente el mismo patrón | [🔗](https://github.com/aeRomeroz/23-24-prg1/blob/3ece9752d89fc9e11d89e8fbfed91be5d5583e95/entregas/romeroAngel/reto-003/ScannerMoneyCalculationsv2.java#L26-L32) |
| | Ejemplo - | Mezcla de prefijos `show` y `get` en métodos de acceso dentro de las mismas clases | [PR #2](https://github.com/aeRomeroz/23-24-prg2-ep/pull/2) |
| | Ejemplo - | | |
| **Código muerto** | Ejemplo + | Código sin variables ni métodos sin usar | [🔗](https://github.com/aeRomeroz/23-24-prg1/blob/3ece9752d89fc9e11d89e8fbfed91be5d5583e95/entregas/romeroAngel/reto-005/DetermineGreater.java#L1-L14) |
| | Ejemplo - | `clientArrived` — variable declarada e inicializada pero nunca utilizada | [PR #1](https://github.com/aeRomeroz/23-24-prg2/pull/1) |
| **DRY** | Ejemplo + | `printDenominationChange` — lógica extraída a método reutilizable | [🔗](https://github.com/aeRomeroz/23-24-prg1/blob/abd4c7df06f8c289b345676dcdd2f23464c4b604/entregas/romeroAngel/reto-003/ScannerMoneyCalculationsv2.java#L39-L45) |
| | Ejemplo - | Bloque de cálculo de denominaciones repetido 7 veces | [PR #2](https://github.com/aeRomeroz/23-24-prg1/pull/2) |
| **YAGNI** | Ejemplo + | Solo implementa exactamente lo necesario, sin nada extra | [🔗](https://github.com/aeRomeroz/23-24-prg1/blob/3ece9752d89fc9e11d89e8fbfed91be5d5583e95/entregas/romeroAngel/reto-005/DetermineGreater.java#L1-L14) |
| | Ejemplo - | | |

> Aquí se adentra más sobre los principios de legibilidad, [legibilidad.md](docs/legibilidad.md)