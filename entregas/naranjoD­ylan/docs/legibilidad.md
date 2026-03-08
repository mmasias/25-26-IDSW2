# Reto 002 - Legibilidad

## ¿Por qué?

Código que no se relee críticamente acumula deuda de legibilidad invisible. El desarrollador que lo escribió es el menos preparado para detectarla, precisamente porque entiende su propia intención sin necesidad de leerla.

## ¿Qué?

|Releer código propio con ojos de auditor y más conocimiento|Identificar aciertos y errores relacionados con la legibilidad|Corregir con fundamento|
|:-:|:-:|:-:|

El objetivo no es encontrar ejemplos. Es **confrontar el propio código** contra principios de legibilidad y ser capaz de argumentar, con referencia teórica y consecuencia práctica, por qué algo funciona o falla como comunicación.

No se evalúa la cantidad de ejemplos encontrados (aunque son imprescindibles): se evalúa la calidad de la justificación: un argumento que conecte principio, código y efecto en mantenibilidad vale más que cuatro ejemplos con justificaciones genéricas.

## ¿Para qué?

Ver cómo en la distancia entre "sé lo que hace" y "se lee lo que hace" es donde vive la deuda técnica. Releer con ojos de auditor — no de autor — es la competencia que separa código que funciona de código que sobrevive.

## ¿Cómo?

A partir del documento de legibilidad, se pide:

- Por cada sección
  - Un ejemplo de aplicación correcta.
  - Dos ejemplos de aplicación incorrecta (uno en las secciones Código muerto, DRY y YAGNI).
  - Un argumento por cada ejemplo, que justifique por qué dicha clasificación. Cada argumento debe referenciar explícitamente un principio del documento de legibilidad y comentar el efecto concreto en mantenibilidad.
  - La corrección -sobre su propio repositorio- de los ejemplos incorrectos.
- Añada una sección final breve — 3-5 líneas — donde indique en cuál de las 8 categorías le resultó más difícil de encontrar en su propio código y por qué.
- Los ejemplos deben ser propios, públicos y existentes en sus propios repo.
- La entrega debe realizarse en un archivo creado a partir del documento legibilidad.md, colocado en la carpeta de documentos de su carpeta de entregas, incluyendo completa la tabla que está indicada debajo.
- No se deben entregar más archivos: solo el README.md en la raíz de su carpeta personal y el archivo legibilidad.md en la carpeta docs.
- Complete la tabla con enlaces a las líneas exactas del archivo en el repositorio en el que identificó el escenario positivo o negativo.
- Agregue (en la columna de justificación) el argumento que justifique dicha elección. Se valorará ampliamente una justificación que combine teoría y práctica.
- Asimismo, para los casos de aplicación incorrecta, la corrección debe realizarse en una rama de su repo original, y debe concluir con un pull request a usted mismo, que incluya la justificación de la corrección que ha propuesto.

### Justificaciones

|Categoría||Justificación||
|-|-|-|-|
|**Nombrado**|[Ejemplo +](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Editor.java#L111) | Los nombres de métodos `guardarEstadoPrevio`, `restaurarDocumento` y `clonarDocumento` revelan su intención sin necesidad de comentarios, reduciendo la carga cognitiva al leer el flujo de deshacer/rehacer
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Edlin.java#L6)|La constante `CARPETA_GUARDADO = "guardado"` es demasiado genérica; un nombre como `DIRECTORIO_PERSISTENCIA_EDITORES` comunicaría mejor su propósito específico|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Menu.java#L31)|La variable `opcion` es genérica; en contextos con múltiples tipos de opciones, `comandoMenuPrincipal` haría más explícito su alcance|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
|**Comentarios**|[Ejemplo +](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/docs/reto-006.md#L12) | La documentación en `docs/reto-006.md` explica QUÉ hace cada componente y POR QUÉ existe, sin duplicar código literal, facilitando el onboarding de nuevos desarrolladores
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Editor.java#L14)|Falta JavaDoc explicando la estrategia de snapshots con `ArrayDeque`; un comentario sobre el límite de 100 estados aceleraría la comprensión inicial|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Edlin.java#L7)|No se documenta por qué se usa la extensión `.edin` en lugar de `.txt`; preservar esta decisión de diseño en un comentario ayudaría en futuras integraciones|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
|**Formato**|[Ejemplo +](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Menu.java#L31-L65)| El sangrado uniforme en bloques `switch` permite escaneo visual rápido; la estructura visual refleja la estructura lógica facilitando code review
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Editor.java#L78)|Líneas de `System.out.println` concatenadas exceden 100 caracteres; usar `String.format()` o partir en múltiples líneas mejoraría escaneabilidad|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Menu.java#L20-L28)|La impresión del menú no separa visualmente el título de las opciones; agregar línea en blanco mejoraría la experiencia de usuario en consola|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
|**Estándares**|[Ejemplo +](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/SerializadorEditor.java#L10-L17) | El uso de `try-with-resources` para streams sigue el estándar Java de gestión automática de recursos, garantizando cierre incluso con excepciones
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Edlin.java)|No existen pruebas automatizadas (JUnit) para validar flujos de carga/guardado; implementar `EdlinTest.java` elevaría la calidad y prevención de regresiones|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Menu.java)|La clase `Menu` mezcla responsabilidades de presentación y validación de entrada, violando SRP; separar en `MenuView` y `EntradaValidator` mejoraría mantenibilidad|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
|**Consistencia**|[Ejemplo +](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Edlin.java#L50-L62) | Todos los puntos de lectura usan `entrada.nextLine()` seguido de parseo manual, evitando el bug clásico de mezclar `nextInt()` con `nextLine()` que deja caracteres en buffer
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Edlin.java#L28-L34)|Los mensajes alternan entre interrogativo ("¿Desea guardar...?") y enunciativo sin patrón; estandarizar con formato `[ACCION/INFO] Mensaje` mejoraría UX|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Editor.java#L70-L94)|Los mensajes de éxito usan punto final ("Deshecho.") pero los de error no lo usan consistentemente; unificar puntuación y tono reduce fricción cognitiva|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
|**Código muerto**|[Ejemplo +](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Editor.java)| Tras el refactor de snapshots, no quedan métodos comentados ni ramas de implementación anterior; el código actual es el único código, eliminando confusión
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/docs/reto-006.md)|Si la documentación mantiene secciones de comandos obsoletos (ej: `javac Edlin.java` vs `javac *.java`), se genera documentación muerta que confunde a futuros lectores|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
|**DRY**|[Ejemplo +](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Editor.java#L111-L117)|Las operaciones `editar`, `borrar`, `pegar` e `intercambiarLineas` reutilizan `guardarEstadoPrevio()` centralizando la lógica de snapshots; cualquier cambio se propaga automáticamente
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Editor.java#L52-L73)|Aunque las operaciones comparten el patrón `guardarEstadoPrevio() + modificar documento[]`, cada una duplica esta secuencia; extraer método `modificarLineaActual()` reduciría duplicación|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)
|**YAGNI**|[Ejemplo +](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Editor.java)| El `Editor` implementa exactamente las operaciones requeridas sin features especulativas como buscar/reemplazar o multi-cursor, manteniendo simplicidad y reduciendo superficie de mantenimiento
||[Ejemplo -](https://github.com/DylanNrj/24-25-EDA1/blob/correciones/entregas/naranjoDylan/src/reto-006/Edlin.java#L10-L34)|El flujo pregunta SIEMPRE si cargar/guardar editor, incluso en sesiones de prueba rápida; activar persistencia solo bajo flag `--persist` reduciría fricción en uso casual|[PR corrección](https://github.com/DylanNrj/24-25-EDA1/pull/1)

### Reflexión final

La categoría más difícil de auditar en código propio fue **Consistencia**.
Cuando se lee código escrito por uno mismo, es fácil tolerar cambios de estilo porque la intención ya se conoce.
Al revisar con distancia temporal, las incoherencias en nombres y mensajes generan fricción real para mantenimiento.
Esta revisión confirma que la consistencia no es estética: es comunicación técnica que reduce deuda y errores futuros.
