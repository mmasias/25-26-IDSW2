# Reto 002: Legibilidad y Deuda Técnica

A continuación se presenta el análisis de legibilidad del código propio, confrontando diversos scripts contra los principios teóricos de Clean Code para identificar aciertos y deudas técnicas, midiendo su impacto en la mantenibilidad del software.

### Justificaciones

| Categoría | Tipo | Ejemplo (Enlace al Código) | Justificación | PR corrección |
| :--- | :--- | :--- | :--- | :--- |
| **Nombrado** | Ejemplo + | | |  |
| | Ejemplo - | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/main/entregas/rodr%C3%ADguezSergio/Reto004/reto004_Sergio_Rodriguez.java) (Clase `reto004_Sergio_Rodriguez`) | **Principio:** No revela intención, es un "nombre en serie" y usa codificación (autor).<br>**Efecto:** Dificulta la mantenibilidad adaptativa; obliga a abrir el archivo para entender qué hace. | [[ENLACE_PR]](https://github.com/Sergiorl2/23-24-prg1/pull/1) |
| | Ejemplo - | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto004/reto004_Sergio_Rodriguez.java#L17-L21) (Variables `número1`, `digito2_1` en `reto004`) | **Principio:** Evitar "nombres en serie".<br>**Efecto:** Reduce la legibilidad y dificulta la mantenibilidad al no aclarar el propósito de cada variable en la deconstrucción. | [[ENLACE_PR]](https://github.com/Sergiorl2/23-24-prg1/pull/1) |
| **Comentarios** | Ejemplo + | | |  |
| | Ejemplo - | | | |
| | Ejemplo - | | | |
| **Formato** | Ejemplo + | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto004/reto004_Sergio_Rodriguez.java#L9) (Declaración de `número1`, `número2` en `reto004`) | **Principio:** Declarar variables tan cerca como sea posible de su uso (minimizar intervalo de vida).<br>**Efecto:** Mejora la mantenibilidad perfectiva al hacer el flujo de lectura lineal. |  |
| | Ejemplo - | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto004/reto004_Sergio_Rodriguez.java#L17-L18) (Condiciones `número1>=100` vs `número3>= 100` en `reto004`) | **Principio:** Consistencia en el espaciado. Si haces algo de cierta manera, hazlo siempre igual.<br>**Efecto:** La irregularidad visual rompe el ritmo de lectura (mantenibilidad perfectiva). | [[ENLACE_PR]](https://github.com/Sergiorl2/23-24-prg1/pull/1) |
| | Ejemplo - | | | |
| **Estándares** | Ejemplo + | | |  |
| | Ejemplo - | | | |
| | Ejemplo - | | | |
| **Consistencia**| Ejemplo + | | |  |
| | Ejemplo - | | | |
| | Ejemplo - | | | |
| **Código Muerto**| Ejemplo + | | |  |
| | Ejemplo - | | | |
| **DRY** | Ejemplo + | | |  |
| | Ejemplo - | [[ENLACE_REPO]](https://github.com/Sergiorl2/23-24-prg1/blob/edefbebcfe844cd70558dfc8a0ccdbd2193e1b04/entregas/rodr%C3%ADguezSergio/Reto004/reto004_Sergio_Rodriguez.java#L17-L18) (Condición `número>=100 && número<=999` en `reto004`) | **Principio:** Evitar re-codificar soluciones y repetir lógica.<br>**Efecto:** Riesgo en mantenibilidad adaptativa; si los requisitos cambian, hay que modificar el código en 3 lugares distintos. | [[ENLACE_PR]](https://github.com/Sergiorl2/23-24-prg1/pull/1) |
| **YAGNI** | Ejemplo + | | |  |
| | Ejemplo - | | | |