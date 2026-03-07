# Informe de Auditoría de Legibilidad - CentroComercial

## Tabla de Hallazgos y Justificaciones

| Categoría | Escenario | Justificación (Principio + Código + Efecto) | Enlace |
| :--- | :--- | :--- | :--- |
| **Nombrado** | (+) | **Revelar Intención:** El nombre `minutosEnUnDia` es explícito y evita el uso de un "número mágico". Facilita la comprensión del dominio del problema sin cálculos adicionales. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **Nombrado** | (-) 1 | **Falta de Descriptividad:** La variable `activa` no indica qué objeto controla. Se cambió por `esCajaExtraHabilitada` para eliminar la ambigüedad y reducir la carga cognitiva. | [Enlace al PR/Rama]() |
| **Nombrado** | (-) 2 | **Evitar Desinformación:** El nombre `items` sugería cantidad de productos, pero almacenaba minutos. Se cambió por `tiempoAtencionRestante` para mapear la realidad del dato. | [Enlace al PR/Rama]() |
| **Comentarios** | (+) | **Código Autodocumentado:** Al evitar comentarios que explican "qué" hace el código, se mantiene la limpieza visual y se confía en la claridad del flujo lógico. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **Comentarios** | (-) 1 | **Documentar el "Porqué":** El valor 40 es un "número mágico" sin contexto. Se añadió un comentario de propósito para explicar la regla de negocio de la tasa de llegada. | [Enlace al PR/Rama]() |
| **Comentarios** | (-) 2 | **Lógica Opaca:** La fórmula `% 11 + 5` no explicaba el rango de tiempo resultante. Se documentó para evitar que el auditor deba descifrar la aritmética manualmente. | [Enlace al PR/Rama]() |
| **Formato** | (+) | **Estructura Visual:** El uso consistente de sangría y llaves permite identificar rápidamente la jerarquía de los bucles, facilitando el escaneo visual del código. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **Formato** | (-) 1 | **Densidad Horizontal:** La línea de impresión de cajas era excesivamente larga. Se refactorizó para evitar el scroll horizontal, mejorando la ergonomía de lectura. | [Enlace al PR/Rama]() |
| **Formato** | (-) 2 | **Agrupación Deficiente:** Había saltos de línea erráticos que rompían la cohesión lógica. Se eliminaron para que las acciones relacionadas aparezcan juntas visualmente. | [Enlace al PR/Rama]() |
| **Estándares** | (+) | **Convenciones de Lenguaje:** El uso de `camelCase` para variables y `PascalCase` para clases respeta los estándares de Java, facilitando la colaboración profesional. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **Estándares** | (-) 1 | **Responsabilidad Única (SRP):** Todo el programa residía en el `main`. Se extrajo la impresión a métodos privados para separar la lógica de negocio de la presentación. | [Enlace al PR/Rama]() |
| **Estándares** | (-) 2 | **Mantenibilidad de Salida:** Se sustituyó la concatenación manual por `printf` para garantizar un formato de salida más profesional y fácil de modificar. | [Enlace al PR/Rama]() |
| **Consistencia** | (+) | **Uniformidad de Datos:** El uso de arrays de tamaño 5 para todas las métricas mantiene una estructura mental coherente sobre la capacidad del sistema de cajas. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **Consistencia** | (-) 1 | **Mínima Sorpresa:** La caja 5 se trataba como una excepción fuera del flujo estándar. Se normalizó su lógica para que el sistema sea simétrico y predecible. | [Enlace al PR/Rama]() |
| **Consistencia** | (-) 2 | **Estandarización de Interfaz:** El reporte final mezclaba formatos. Se aplicó un estándar de `Etiqueta: Valor` para profesionalizar la salida de datos. | [Enlace al PR/Rama]() |
| **Código Muerto** | (-) | **Eliminar Ruido:** Variable `numeroDeClientes` declarada pero nunca utilizada. Su eliminación limpia el espacio mental del auditor y reduce la deuda técnica invisible. | [Enlace al PR/Rama]() |
| **DRY** | (-) | **Don't Repeat Yourself:** La repetición de lógica idéntica para 5 cajas hacía el código frágil. Se sustituyó por bucles `for` para centralizar el comportamiento. | [Enlace al PR/Rama]() |
| **YAGNI** | (-) | **You Ain't Gonna Need It:** Se importaba la clase `Random` sin utilizarla. Eliminar dependencias innecesarias mantiene el proyecto enfocado en lo esencial. | [Enlace al PR/Rama]() |

---

## Reflexión Final

La categoría que más me resultó difícil de identificar en mi propio código fue la de **Consistencia**. Al ser el autor original, mi cerebro aceptaba la excepción de la "Caja 5" y los formatos variables del reporte final como algo natural debido a la evolución orgánica del script. Sin embargo, al realizar la auditoría con una mentalidad externa, comprendí que esas irregularidades rompen la simetría del código, obligando a cualquier otro desarrollador a realizar un esfuerzo cognitivo extra para entender casos especiales que no aportan valor técnico real.