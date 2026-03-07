# Informe de Auditoría de Legibilidad - CentroComercial

## Tabla de Hallazgos y Justificaciones

| Categoría | Escenario | Justificación (Principio + Código + Efecto) | Enlace |
| :--- | :--- | :--- | :--- |
| **Nombrado** | (+) | **Revelar Intención:** El nombre `minutosEnUnDia` es explícito y evita el uso de un "número mágico". | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **Nombrado** | (-) 1 | **Falta de Descriptividad:** La variable `activa` no indica qué controla. Se cambió por `esCajaExtraHabilitada`. | [Enlace al PR/Rama]() |
| **Nombrado** | (-) 2 | **Evitar Desinformación:** El nombre `items` sugería productos, pero era tiempo. Se cambió por `tiempoAtencionRestante`. | [Enlace al PR/Rama]() |
| **Comentarios** | (+) | **Código Autodocumentado:** El bloque principal no tiene comentarios obvios, dejando que el código hable por sí solo. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **Comentarios** | (-) 1 | **Documentar el "Porqué":** El valor 40 es un "número mágico". Se explicó la regla de negocio de llegada de clientes. | [Enlace al PR/Rama]() |
| **Comentarios** | (-) 2 | **Lógica Opaca:** La fórmula `% 11 + 5` era difícil de entender. Se explicó el rango de tiempo (5-15 min). | [Enlace al PR/Rama]() |
| **Formato** | (+) | **Estructura Visual:** Uso consistente de llaves y sangría que facilita la lectura jerárquica del código. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **Formato** | (-) 1 | **Densidad Horizontal:** Línea de impresión de cajas demasiado larga, provocando scroll horizontal innecesario. | [Enlace al PR/Rama]() |
| **Formato** | (-) 2 | **Agrupación Deficiente:** Saltos de línea erráticos que separaban lógicas que deberían ir juntas. | [Enlace al PR/Rama]() |
| **Estándares** | (+) | **Convenciones de Lenguaje:** Uso correcto de `camelCase` para variables según el estándar de la comunidad Java. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **Estándares** | (-) 1 | **Responsabilidad Única (SRP):** Todo en el `main`. Se extrajo la impresión a métodos privados para modularizar. | [Enlace al PR/Rama]() |
| **Estándares** | (-) 2 | **Mantenibilidad de Salida:** Se cambió concatenación manual por `printf` para un formato más profesional. | [Enlace al PR/Rama]() |
| **Consistencia** | (+) | **Uniformidad de Datos:** Uso de arrays de tamaño 5 para todas las métricas de cajas, manteniendo simetría. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **Consistencia** | (-) 1 | **Mínima Sorpresa:** La caja 5 se trataba como una excepción. Se normalizó su flujo para ser predecible. | [Enlace al PR/Rama]() |
| **Consistencia** | (-) 2 | **Estandarización de Interfaz:** El reporte final era irregular. Se aplicó un estándar de `Etiqueta: Valor`. | [Enlace al PR/Rama]() |
| **Código Muerto**| (+) | **Uso de Variables:** La variable `minutosSinCola` se declara, incrementa y muestra, teniendo un propósito claro. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **Código Muerto**| (-) | **Eliminar Ruido:** Variable `numeroDeClientes` declarada pero nunca utilizada. Se eliminó para limpiar el código. | [Enlace al PR/Rama]() |
| **DRY** | (+) | **Cálculo Final:** El uso de un bucle `for` para sumar el total de clientes evita repetir la suma manualmente. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **DRY** | (-) | **Don't Repeat Yourself:** 5 bloques `if` idénticos para las cajas. Se sustituyeron por un bucle centralizado. | [Enlace al PR/Rama]() |
| **YAGNI** | (+) | **Simplicidad:** El programa resuelve el problema con tipos básicos sin crear clases complejas innecesarias. | [Enlace al código](https://github.com/liamanderson873/23-24-prg2/blob/main/entregas/andersonLiam/reto-001/CentroComercial.java) |
| **YAGNI** | (-) | **You Ain't Gonna Need It:** Se importaba `java.util.Random` sin usarse. Se eliminó por ser una dependencia huérfana. | [Enlace al PR/Rama]() |