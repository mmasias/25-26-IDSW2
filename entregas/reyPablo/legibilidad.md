|Categoría||Justificación||
|-|-|-|-|
|**Nombrado**|Ejemplo +|Los nombres de las clases Asignatura, Examen o Profesor cumplen a la perfección con la regla. Son sustantivos, empiezan por mayúscula y utilizan términos exactos del dominio del problema, lo que hace que cualquier persona que lea el código entienda inmediatamente qué entidades se están modelando.|[Enlace al repo](https://github.com/Pareyor/23-24-prg2-ep/tree/main/src/ExamenParcial/ReyOrtizPablo)|
||Ejemplo -|Los nombres de paquetes deben ser sustantivos y comenzar en minúsculas|[Enlace al PR](https://github.com/Pareyor/23-24-prg2-ep/pull/1)
||Ejemplo -|Se deben evitar las codificaciones y nombres como por ejemplo DNI se debería usar documentoIdentidad, algo más internacional.|[Enlace al PR](https://github.com/Pareyor/23-24-prg2-ep/pull/1)
|**Comentarios**||No realicé comentarios en los códigos|
|**Formato**|Ejemplo +|En la clase cine,los atributos están arriba, seguidos del constructor y luego los métodos. Cada bloque está separado por exactamente una línea en blanco, lo que facilita la lectura sin desperdiciar espacio ni amontonar el código|[Enlace al repo](https://github.com/Pareyor/23-24-prg2/tree/correccionIDSW2/entregas/reyPablo/Reto-003)|
||Ejemplo -|En la clase Visitante todo el bloque de la clase está desplazado hacia la derecha. Esto sugiere visualmente que la clase Visitante está dentro de otra estructura, cuando debería estar al nivel de la raíz del archivo.|[Enlace al PR](https://github.com/Pareyor/23-24-prg2/pull/1)
||Ejemplo -|A diferencia de la clase anterior, en la clase Ticket los métodos get y set están pegados unos a otros sin ninguna línea de separación. Esto hace que el código parezca un muro de texto difícil de escanear visualmente.|[Enlace al PR](https://github.com/Pareyor/23-24-prg2/pull/1)
|**Estándares**|Ejemplo +|El código sigue el estándar declarar las variables de instancia (cola, numClientes) y la constante (MAX_COLA) al principio de la clase. |[Enlace al repo](https://github.com/Pareyor/24-25-EDA1/tree/correccionIDSW2/entregas/ReyOrtizPablo/Reto-001)|
||Ejemplo -|Uso de caracteres no ASCII en identificadores (añadirCliente). Aunque Java permite técnicamente usar la letra ñ o tildes, la norma estándar dicta el uso exclusivo de caracteres ASCII. Cambiar añadirCliente por un término del dominio como agregarCliente|[Enlace al PR](https://github.com/Pareyor/24-25-EDA1/pull/2)
||Ejemplo -|Distribución de métodos, los métodos públicos (la API de tu clase) deben ir primero, y los métodos privados (ayudantes) deben ir al final para no interrumpir la lectura de la funcionalidad principal.|[Enlace al PR](https://github.com/Pareyor/24-25-EDA1/pull/2)
|**Consistencia**|Ejemplo +|
||Ejemplo -||PR corrección
||Ejemplo -||PR corrección
|**Código muerto**|Ejemplo +|En el método procesarSiguiente() cada línea dentro de este método tiene un propósito activo y demostrable. El if (numClientes > 0) asegura que la lógica no falle, el elemento se extrae, el bucle desplaza los elementos restantes de forma justificada y actualiza el contador. No hay líneas redundantes, y todo el código es 100% alcanzable e imprescindible para el sistema.|[Enlace al repo](https://github.com/Pareyor/24-25-EDA1/tree/correccionIDSW2/entregas/ReyOrtizPablo/Reto-001)|
||Ejemplo -|En el método abandonarCola(String cliente) en ejecutarSimulacion() e genera un cliente usando clienteAleatorio(). Este método garantiza (por su bucle do-while) que el cliente generado no está en la cola. Luego, si accion == 2, llamas a abandonarCola(cliente). Como ese cliente no está en la cola, el condicional if (cola[i].equals(cliente)) dentro de abandonarCola jamás se evalúa como verdadero.|[Enlace al PR](https://github.com/Pareyor/24-25-EDA1/pull/1)
|**DRY**|Ejemplo +|
||Ejemplo -||PR corrección
|**YAGNI**|Ejemplo +|
||Ejemplo -||PR corrección
