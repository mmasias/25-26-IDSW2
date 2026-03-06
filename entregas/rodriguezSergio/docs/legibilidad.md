# Reto 002: Legibilidad y Deuda Técnica

A continuación se presenta el análisis de legibilidad del código propio, confrontando diversos scripts contra los principios teóricos de Clean Code para identificar aciertos y deudas técnicas, midiendo su impacto en la mantenibilidad del software.

### Justificaciones

| Categoría | Tipo | Ejemplo (Enlace al Código) | Justificación | PR corrección |
| :--- | :--- | :--- | :--- | :--- |
| **Nombrado** | Ejemplo + | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto006/Reto006.java#L15) (Variable `numeroPorAdivinar` en `Reto006`) | **Principio:** Elegir nombres descriptivos que revelen su intención.<br>**Efecto:** Mejora la mantenibilidad correctiva al saber exactamente para qué sirve el acumulador sin tener que descifrar el algoritmo. |  |
| | Ejemplo - | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/main/entregas/rodr%C3%ADguezSergio/Reto004/reto004_Sergio_Rodriguez.java) (Clase `reto004_Sergio_Rodriguez`) | **Principio:** No revela intención, es un "nombre en serie" y usa codificación (autor).<br>**Efecto:** Dificulta la mantenibilidad adaptativa; obliga a abrir el archivo para entender qué hace. | [[ENLACE_PR]](https://github.com/Sergiorl2/23-24-prg1/pull/1) |
| | Ejemplo - | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto004/reto004_Sergio_Rodriguez.java#L17-L21) (Variables `número1`, `digito2_1` en `reto004`) | **Principio:** Evitar "nombres en serie".<br>**Efecto:** Reduce la legibilidad y dificulta la mantenibilidad al no aclarar el propósito de cada variable en la deconstrucción. | [[ENLACE_PR]](https://github.com/Sergiorl2/23-24-prg1/pull/1) |
| **Comentarios** | Ejemplo + | | |  |
| | Ejemplo - | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto006/Reto006.java#L35) (Ausencia de comentario en algoritmo de `Reto006`) | **Principio:** Los comentarios deben explicar el "por qué" (la regla de negocio/matemática) en código complejo.<br>**Efecto:** Pésima mantenibilidad adaptativa; sin saber que usa potencias de base 2, es casi imposible escalar el código. | [[ENLACE_PR]](https://github.com/Sergiorl2/23-24-prg1/pull/2) |
| | Ejemplo - | | | |
| **Formato** | Ejemplo + | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto004/reto004_Sergio_Rodriguez.java#L9) (Declaración de `número1`, `número2` en `reto004`) | **Principio:** Declarar variables tan cerca como sea posible de su uso (minimizar intervalo de vida).<br>**Efecto:** Mejora la mantenibilidad perfectiva al hacer el flujo de lectura lineal. |  |
| | Ejemplo - | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto004/reto004_Sergio_Rodriguez.java#L17-L18) (Condiciones `número1>=100` vs `número3>= 100` en `reto004`) | **Principio:** Consistencia en el espaciado. Si haces algo de cierta manera, hazlo siempre igual.<br>**Efecto:** La irregularidad visual rompe el ritmo de lectura (mantenibilidad perfectiva). | [[ENLACE_PR]](https://github.com/Sergiorl2/23-24-prg1/pull/1) |
| | Ejemplo - | | | |
| **Estándares** | Ejemplo + | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto006/Reto006.java#L9) (Constante `LINEA_SEPARACION...` en `Reto006`) | **Principio:** Usar nomenclatura estándar (UPPER_SNAKE_CASE para constantes en Java).<br>**Efecto:** Facilita la comprensión instantánea del alcance inmutable de la variable (mantenibilidad perfectiva). |  |
| | Ejemplo - | | | |
| | Ejemplo - | | | |
| **Consistencia**| Ejemplo + | | |  |
| | Ejemplo - | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto006/Reto006.java#L54) (`println` en tarjeta 1 vs `print` en tarjeta 2) | **Principio:** Hacer todas las cosas similares de la misma forma.<br>**Efecto:** Disminuye la calidad de la experiencia del usuario y ensucia el código sin motivo lógico (mantenibilidad perfectiva). | [[ENLACE_PR]](https://github.com/Sergiorl2/23-24-prg1/pull/2) |
| | Ejemplo - | | | |
| **Código Muerto**| Ejemplo + | | |  |
| | Ejemplo - | | | |
| **DRY** | Ejemplo + | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto006/Reto006.java#L11) (Constantes `PREGUNTA` y `LINEA...` en `Reto006`) | **Principio:** Don't Repeat Yourself. Extracción de literales repetitivos.<br>**Efecto:** Excelente mantenibilidad perfectiva; cambiar el diseño requiere tocar una sola línea. |  |
| | Ejemplo - | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto004/reto004_Sergio_Rodriguez.java#L17-L18) (Condición `número>=100 && número<=999` en `reto004`) | **Principio:** Evitar re-codificar soluciones y repetir lógica.<br>**Efecto:** Riesgo en mantenibilidad adaptativa; si los requisitos cambian, hay que modificar el código en 3 lugares distintos. | [[ENLACE_PR]](https://github.com/Sergiorl2/23-24-prg1/pull/1) |
| **YAGNI** | Ejemplo + | | |  |
| | Ejemplo - | | | |