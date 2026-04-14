## Cambios realizados

### Clase nueva: `Consola`

He creado una nueva clase llamada `Consola` para separar la entrada/salida del resto del modelo. La idea principal es que todo lo relacionado con el usuario (leer datos con `Scanner`, imprimir por pantalla, limpiar la consola, etc.) esté concentrado en un único sitio.

Antes tenía esta lógica repartida entre varias clases (`Coordenada`, `Tablero` y `Jugador`), lo que hacía el código más difícil de mantener. Ahora el modelo ya no depende de cómo se interactúa con el usuario.

---

### Clase `Coordenada` — simplificada

He simplificado la clase `Coordenada` para que solo represente un dato.

**Cambios realizados:**

- He eliminado el método `pedir()`, ya que una coordenada no debería encargarse de pedir datos al usuario.
- He añadido un constructor para inicializar directamente los valores:

```java
public Coordenada(int fila, int columna) {
    this.fila = fila;
    this.columna = columna;
}