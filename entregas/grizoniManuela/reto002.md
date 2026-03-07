# Legibilidad


### Justificaciones

## Nombrado
### Ejemplo negativo

**Enlace al código:**  
[examenParcial.java](https://github.com/ManuelaGrzoni/PRG1-22-23-ExamenParcial.git)

**Justificación:**  
Este fragmento se clasifica como problema de **Nombrado** porque incumple el principio **“los nombres deben revelar su intención”**. Variables como `agujero1`, `agujero2`, `agujero3` y `agujero4` distinguen elementos distintos, pero no comunican qué representa cada valor dentro del problema. Del mismo modo, nombres como `bordeMedio1`, `bordeMedio2` o `bordeMedio3` son nombres en serie que expresan orden, pero no función.  
En mantenibilidad, esto obliga a deducir significado desde el contexto o desde los literales, incrementando la carga cognitiva y dificultando cambios posteriores sin releer toda la lógica.

**Sugerencia de corrección:**  
Sustituir los nombres en serie por identificadores más descriptivos, por ejemplo distinguiendo si representan probabilidades, partes del tablero o líneas de salida.

Yo podría renombrar esas variables usando nombres que expliquen su propósito, por ejemplo `probabilidadAvanceAgujero1`, `escalaDecenas`, `escalaUnidades` o `bordeSeparador`, de forma que el lector entienda el papel de cada dato sin depender del contexto inmediato.

### Ejemplo negativo

**Enlace al código:**  
[examenFinal.java](https://github.com/ManuelaGrzoni/22-23-prg1-examenfinal.git)

**Justificación:**  
Este fragmento se clasifica como problema de **Nombrado** porque incumple el principio **“elige nombres descriptivos”** y también **“los nombres deben revelar su intención”**. Identificadores como `unaMatriz`, `laFila`, `laColumna` o `inputUsuario` expresan parcialmente su naturaleza, pero no comunican con precisión su papel dentro del problema. En particular, `unaMatriz` no revela que representa el mapa o tablero del juego, sino solo su estructura técnica.  
En mantenibilidad, este tipo de nombres obliga al lector a traducir continuamente entre la forma técnica del dato y su significado funcional, lo que dificulta comprender más rápido la lógica del programa y aumenta el esfuerzo necesario para hacer cambios.

**Sugerencia de corrección:**  
Renombrar variables para que expresen su papel dentro del dominio del problema, por ejemplo `mapa`, `filaActual`, `columnaActual` o `comandoUsuario`.

Yo podría sustituir nombres genéricos o demasiado ligados a la estructura técnica por otros que expliquen la función real de cada dato en el juego, de forma que el código se lea más como una descripción del comportamiento y menos como una manipulación abstracta de arrays.




## Comentarios
### Ejemplo negativo

**Enlace al código:**  
[reto001.java](https://github.com/ManuelaGrzoni/23-24-prg2/blob/main/entregas/grizoniManuela/reto001.java)

**Justificación:**  
Este fragmento se clasifica como problema de **Comentarios** porque el texto `"TODO: Calcula esta métrica"` actúa como un comentario incrustado en la salida del programa. El documento advierte que comentarios incompletos, oportunos o no mantenidos pueden convertirse en desinformación. Aquí el `TODO` deja constancia de una intención futura, pero no ayuda a comprender el código ni aporta información estable al sistema; al contrario, expone una carencia interna como si fuese parte del comportamiento final.  
En mantenibilidad, esto es problemático porque mezcla documentación provisional con salida funcional, degradando la claridad del programa y del resultado que ofrece al usuario.

**Sugerencia de corrección:**  
Retirar el `TODO` de la salida final y trasladarlo, si hace falta, a una tarea de desarrollo o a un comentario temporal fuera del flujo visible del programa.

**Qué podría hacer yo:**  
Yo podría quitar ese texto del resumen y dejar solo datos realmente calculados, o implementar la métrica para que el programa no dependa de marcadores provisionales.

## Formato

Repositorio: `prg1-22-23`  
Archivo: `examenParcial.java`

### Ejemplo negativo

**Enlace al código:**  
[examenParcial.java](https://github.com/ManuelaGrzoni/PRG1-22-23-ExamenParcial.git)

**Justificación:**  
Este fragmento se clasifica como un problema de **Formato** porque incumple el principio del documento que indica que **el código es una jerarquía** y que esa jerarquía debe hacerse visible mediante el sangrado y la organización visual de los bloques. En este caso, los `if` aparecen estructurados de una forma que dificulta percibir con claridad qué condiciones pertenecen al mismo nivel lógico y cuáles dependen de otras. Además, el exceso de líneas en blanco rompe la agrupación natural de instrucciones relacionadas.  
En términos de mantenibilidad, esto aumenta el esfuerzo de lectura, dificulta validar el flujo de control y eleva la probabilidad de introducir errores al modificar condiciones o mover bloques.

**Sugerencia de corrección:**  
Reorganizar el bloque condicional para que cada condición tenga una estructura visual homogénea, con una indentación consistente y sin líneas en blanco innecesarias. También convendría reagrupar instrucciones relacionadas para que el flujo se lea de forma secuencial.
  
Yo podría rehacer la indentación completa del método `main`, eliminar espacios vacíos que no aportan significado y reescribir los bloques `if` para que cada caso siga el mismo patrón visual.

### Ejemplo negativo

Repositorio: `22-23-prg1-examenfinal`  
Archivo: `examenFinal.java`

**Enlace al código:**  
[examenFinal.java](https://github.com/ManuelaGrzoni/22-23-prg1-examenfinal.git)

**Justificación:**  
Este fragmento se clasifica como problema de **Formato** porque incumple el principio del documento según el cual **el código es una jerarquía** y esa jerarquía debe hacerse visible mediante la indentación y la agrupación lógica. Aunque la estructura general se entiende, aparecen múltiples líneas en blanco sin función comunicativa y una separación visual irregular entre el bloque que imprime el tablero y el bloque que procesa la entrada del usuario.  
En mantenibilidad, este ruido visual dificulta percibir de un vistazo las fases del algoritmo, obliga a revalidar dónde termina cada bloque lógico y aumenta el coste de lectura cuando se quiere localizar un comportamiento concreto.

**Sugerencia de corrección:**  
Reducir líneas vacías innecesarias, reagrupar instrucciones relacionadas y mantener una separación visual uniforme entre impresión del tablero, lectura de entrada y actualización del personaje.
 
Yo podría limpiar el espaciado del método `main`, dejando solo los saltos de línea que realmente separan bloques funcionales distintos, para que la lectura del flujo sea más directa.



## Estándares
### Ejemplo negativo

 Repositorio: `22-23-prg1-examenfinal`  
Archivo: `examenFinal.java`

**Enlace al código:**  
[examenFinal.java](https://github.com/ManuelaGrzoni/22-23-prg1-examenfinal.git)

**Justificación:**  
Este fragmento se clasifica como problema de **Estándares** porque incumple convenciones habituales del lenguaje Java. El documento indica que deben seguirse **convenciones estándar basadas en normas comunes de la industria**, y en Java los nombres de clase deben escribirse en **CamelCase** comenzando por mayúscula. El nombre `examenFinal` no sigue esa convención; una forma estándar sería `ExamenFinal`.  
En mantenibilidad, romper una convención tan básica reduce la uniformidad del proyecto y hace que el código resulte menos familiar para cualquier lector acostumbrado a Java.

**Sugerencia de corrección:**  
Renombrar la clase a `ExamenFinal` y mantener esa misma convención en el resto de tipos definidos en el proyecto.

Yo podría adaptar los nombres de clases a la convención estándar de Java para que el proyecto mantenga una apariencia homogénea y más fácil de leer para terceros.

### Ejemplo negativo

**Enlace al código:**  
[devolverCambio.java](https://github.com/ManuelaGrzoni/23-24-prg1/blob/main/entregas/grizoniManuela/reto001/devolverCambio.java)

**Justificación:**  
Este fragmento se clasifica como problema de **Estándares** porque incumple una convención estándar del lenguaje Java. El documento indica que deben seguirse **convenciones estándar basadas en normas comunes de la industria**, y entre ellas se encuentra que los nombres de clase deben comenzar en mayúscula y seguir **CamelCase**. En este caso, la clase `devolverCambio` debería nombrarse `DevolverCambio`.  
En mantenibilidad, romper una convención tan básica reduce la uniformidad del proyecto y hace que el código resulte menos familiar para otros desarrolladores, lo que dificulta la lectura rápida y la navegación por el repositorio.

**Sugerencia de corrección:**  
Renombrar la clase a `DevolverCambio` y mantener esa misma convención en el resto de clases del proyecto.

Yo podría adaptar el nombre de la clase a la convención estándar de Java para que el archivo siga el estilo habitual del lenguaje y se integre de forma más consistente con el resto del código.



## Consistencia
### Ejemplo negativo

Repositorio: `22-23-prg1-examenfinal`  
Archivo: `examenFinal.java`

**Enlace al código:**  
[examenFinal.java](https://github.com/ManuelaGrzoni/22-23-prg1-examenfinal.git)

**Justificación:**  
Este fragmento se clasifica como problema de **Consistencia** porque incumple el principio **“si haces algo de cierta manera, haz todas las cosas similares de la misma forma”**. Aunque se definen las constantes `FILA` y `COLUMNA`, después el código sigue accediendo a las posiciones mediante índices literales `0` y `1` en expresiones como `posicionPersonaje[0]` y `posicionPersonaje[1]`. Esto introduce dos maneras distintas de representar la misma idea dentro del mismo archivo.  
En mantenibilidad, esta inconsistencia dificulta la lectura porque el lector no sabe cuál es la convención real del programa y obliga a reinterpretar continuamente si cada acceso usa una abstracción significativa o un índice “mágico”.

**Sugerencia de corrección:**  
Usar de forma consistente `FILA` y `COLUMNA` en todos los accesos a coordenadas, evitando los índices literales `0` y `1`.

Yo podría reemplazar todos los accesos directos por `posicionPersonaje[FILA]`, `posicionPersonaje[COLUMNA]`, `posicionFantasma[FILA]` y `posicionFantasma[COLUMNA]`, de forma que la convención definida al inicio del archivo se mantenga en todo el código.
 
 ### Ejemplo negativo

**Enlace al código:**  
[reto001.java](https://github.com/ManuelaGrzoni/23-24-prg2/blob/main/entregas/grizoniManuela/reto001.java) 

**Justificación:**  
Este fragmento se clasifica como problema de **Consistencia** porque el programa mezcla distintos niveles de detalle y de presentación sin mantener una convención uniforme. Por ejemplo, en la salida por consola se imprime `"MINUTO 1 - Llega 1 persona - En cola:0"` y después `"MINUTO" + minuto + " - ..."`, lo que produce formatos de mensaje distintos, incluso con diferencias de espaciado.  
En mantenibilidad, estas pequeñas inconsistencias obligan al lector a reinterpretar continuamente si las diferencias son deliberadas o accidentales, y dificultan modificar el programa de forma uniforme.

**Sugerencia de corrección:**  
Unificar el formato de todos los mensajes de salida y aplicar un mismo patrón de construcción de texto en todo el archivo.

**Qué podría hacer yo:**  
Yo podría revisar todas las cadenas impresas por consola para asegurar que siguen la misma estructura, el mismo espaciado y el mismo criterio de representación.


## Código muerto
### Ejemplo negativo

**Enlace al código:**  
[reto001.java](https://github.com/ManuelaGrzoni/23-24-prg2/blob/main/entregas/grizoniManuela/reto001.java)

**Justificación:**  
Este fragmento se clasifica como **Código muerto** porque contiene una salida que anuncia una métrica no implementada: `"TODO: Calcula esta métrica"`. Según el documento, el código muerto incluye fragmentos injustificables, obsoletos o incompletos que parecen formar parte del sistema, pero no están realmente integrados en su funcionamiento. Aquí se presenta al usuario una funcionalidad pendiente como si formara parte del resumen final, aunque el programa no la calcula.  
En mantenibilidad, esto es perjudicial porque introduce falsas expectativas sobre el estado real del programa y mezcla comportamiento terminado con comportamiento incompleto, dificultando saber qué partes son fiables y cuáles no.

**Sugerencia de corrección:**  
Eliminar temporalmente esa línea del resumen hasta implementar la métrica, o calcular realmente los artículos vendidos y mostrar el valor resultante en lugar del texto provisional.

**Qué podría hacer yo:**  
Yo podría suprimir esta salida mientras la métrica no exista o implementar un contador acumulado de artículos vendidos para que el resumen final solo muestre información real del sistema.


## DRY
### Ejemplo negativo

**Enlace al código:**  
[devolverCambio.java](https://github.com/ManuelaGrzoni/23-24-prg1/blob/main/entregas/grizoniManuela/reto001/devolverCambio.java)

**Justificación:**  
Este fragmento se clasifica como problema de **DRY** porque incumple el principio **“cada pieza de conocimiento debe tener una única, inequívoca y autoritativa representación en un sistema”**. La lógica para calcular cuántas unidades de cada denominación se devuelven se repite varias veces con el mismo esquema: dividir por el valor de la denominación y actualizar el resto con el operador módulo. Aunque cambian los valores concretos, el conocimiento algorítmico es siempre el mismo y está duplicado línea tras línea.  
En mantenibilidad, esta repetición hace que cualquier cambio en la estrategia de cálculo obligue a modificar varios puntos del código, aumentando el riesgo de inconsistencias y dificultando la evolución del programa.

**Sugerencia de corrección:**  
Extraer la lógica repetida a una estructura común, por ejemplo usando un array con las denominaciones y un bucle que recorra cada valor para calcular cantidades y resto.

**Qué podría hacer yo:**  
Yo podría sustituir la secuencia repetida de divisiones y módulos por un recorrido sobre las denominaciones disponibles, de forma que el algoritmo quede definido una sola vez y sea más fácil de mantener o ampliar.


## YAGNI

### Ejemplo negativo

**Enlace al código:**  
[reto001.java](https://github.com/ManuelaGrzoni/23-24-prg2/blob/main/entregas/grizoniManuela/reto001.java)

**Justificación:**  
Este fragmento se clasifica como problema de **YAGNI** porque incumple el principio de **no agregar funcionalidad hasta que sea estrictamente necesaria**. El bucle `for (int j = 0; j < tiempoAtencionTotal; j++) {}` parece intentar representar el tiempo de atención de un cliente, pero en la práctica no produce ningún efecto observable en el estado del programa ni participa en una simulación real del paso del tiempo. Se introduce, por tanto, una estructura que sugiere una necesidad futura o una complejidad prevista, pero que todavía no está implementada de forma útil.  
En mantenibilidad, esto añade ruido, complica la lectura y hace más difícil distinguir entre la lógica realmente operativa y la que solo aparenta serlo.

**Sugerencia de corrección:**  
Eliminar el bucle vacío hasta que exista una necesidad real de modelar el tiempo de atención, o reemplazarlo por una estructura que sí represente el estado temporal de cada caja.

Yo podría eliminar este bucle mientras no exista una simulación real basada en tiempos, o bien rediseñar la lógica para que cada caja conserve cuántos minutos le quedan de atención a cada cliente.


