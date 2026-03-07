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


## Código muerto

## DRY

## YAGNI


