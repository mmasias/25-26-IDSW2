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

A partir del documento de [legibilidad](legibilidad.md), se pide:

- Por cada sección
  - Un ejemplo de aplicación correcta.
  - Dos ejemplos de aplicación incorrecta (uno en las secciones Código muerto, DRY y YAGNI).
  - Un argumento por cada ejemplo, que justifique por qué dicha clasificación. Cada argumento debe referenciar explícitamente un principio del documento de legibilidad y comentar el efecto concreto en mantenibilidad.
  - La corrección -sobre su propio repositorio- de los ejemplos incorrectos.
- Añada una sección final breve — 3-5 líneas — donde indique en cuál de las 8 categorías le resultó más difícil de encontrar en su propio código y por qué.
- Los ejemplos deben ser propios, públicos y existentes en sus propios repo.
- La entrega debe realizarse en un archivo creado a partir del documento [legibilidad.md](legibilidad.md), colocado en la carpeta de documentos de su carpeta de entregas, incluyendo completa la tabla que está indicada debajo.
- No se deben entregar más archivos: solo el README.md en la raíz de su carpeta personal y el archivo legibilidad.md en la carpeta docs.
- Complete la tabla con enlaces a las líneas exactas del archivo en el repositorio en el que identificó el escenario positivo o negativo.
- Agregue (en la columna de justificación) el argumento que justifique dicha elección. Se valorará ampliamente una justificación que combine teoría y práctica.
- Asimismo, para los casos de aplicación incorrecta, la corrección debe realizarse en una rama de su repo original, y debe concluir con un pull request a usted mismo, que incluya la justificación de la corrección que ha propuesto.

### Justificaciones

|Categoría||Justificación||
|-|-|-|-|
|**Nombrado**|[archivos](https://github.com/Ingenieria-Informatica-UNEATLANTICO/23-24-prg2-examen-final-mariaarroniz/tree/main/src)|Se ve claramente qué es cada uno
||[commit](https://github.com/Ingenieria-Informatica-UNEATLANTICO/23-24-prg1-examen-parcial-mariaarroniz/commit/53d4759b17a854907dfb623b328cbe0dfe027472)|Nombre inapropiado para un examen|Repositorio de examen, no se puede pushear después de haberlo entregado
||[idiomas](https://github.com/mariaarroniz/23-24-prg2-ep/blob/main/ArronizMaria/Teacher.java)|Todo en inglés y de pronto nombres de variables y atributo de pregunta en castellano|[refactor: language changes on main and question classes](https://github.com/mariaarroniz/23-24-prg2-ep/pull/1) 
|**Comentarios**|No encontrados|Mmasias del pasado se avergonzaría si hubiera alguno||||||||
|**Formato**|[lista](https://github.com/mariaarroniz/24-25-EDA1/blob/main/entregas/mariaArroniz/10-07/List.java)|Los metodos ordenados
||[números](https://github.com/mariaarroniz/23-24-prg1/blob/main/entregas/arronizMaria/Entrega-001/Reto004/reto004.java)|Espacios innecesarios|[refactor: less spaces better view](https://github.com/mariaarroniz/23-24-prg1/pull/1)
||[library](https://github.com/mariaarroniz/Old-code/blob/main/1.Primero/2.Segundo%20cuatrimestre/Biblioteca/Library.java)|Falta mucho código|[refactor: changes in every class](https://github.com/mariaarroniz/Old-code/pull/1)
|**Estándares**|[tarjetas](https://github.com/mariaarroniz/Old-code/blob/main/1.Primero/1.Primer%20cuatrimestre/Entrega-002/Reto-006/Tarjetas.java)|Asquerosamente clara la estructura que toma la operacion de cada tarjeta
||[commit](https://github.com/mariaarroniz/23-24-prg2-ep/commits/main/)|No sigue el estandar de nombres de la industria para los commits|[feat: add Teacher.java for parcial exam](https://github.com/mariaarroniz/23-24-prg2-ep/pull/2)
||[viaje de Marco (objetos)](https://github.com/mariaarroniz/Old-code/tree/main/1.Primero/2.Segundo%20cuatrimestre/Viaje%20de%20Marco)|Clase Madre deberia seguir la misma estructura que Marco y Amedio, a parte de código faltante|[feat: add classes Madre, App, Journey](https://github.com/mariaarroniz/Old-code/pull/4)
|**Consistencia**|[viaje de Marco (estructurado)](https://github.com/mariaarroniz/Old-code/blob/main/1.Primero/1.Primer%20cuatrimestre/ViajeDeMarco/ViajeDeMarco1.java)|Cada método de probabilidades es igual, más legible el código
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Código muerto**|[inundacion](https://github.com/mariaarroniz/Old-code/blob/main/2.Segundo/2.Segundo%20cuatrimestre/RellenoInundacion.java)|Bloques de código comentado... pero eran otras formas de hacer lo mismo
||[restaurante](https://github.com/mariaarroniz/Old-code/blob/main/1.Primero/2.Segundo%20cuatrimestre/Restaurante/Restaurante.java)|Métodos que ni existen, main?...|[refactor: added 'simulacion' and all the classes fixed](https://github.com/mariaarroniz/Old-code/pull/2)
|**DRY**|[manolito](https://github.com/mariaarroniz/Old-code/tree/main/1.Primero/1.Primer%20cuatrimestre/Manolito)|Re-diseño del código para hacerlo funcional
||Ejemplo -||PR corrección
|**YAGNI**|[inundacion](https://github.com/mariaarroniz/Old-code/blob/main/2.Segundo/2.Segundo%20cuatrimestre/RellenoInundacion.java)|Si quieres usas ese código o no
||[snailGame](https://github.com/mariaarroniz/Old-code/blob/main/1.Primero/1.Primer%20cuatrimestre/SnailGame/SnailGame.java)|No necesitas parar en cada dia que pasa, puede ser solo en eventos importantes|[refactor: changed pauses](https://github.com/mariaarroniz/Old-code/pull/3)