# Identidad

## Primera iteración

Es la primera iteración, por ende, se intentaron buscar la mayoría de clases, pero que creería que aún faltan, sin embargo no sabría como describirlas o como llamarlas, por ende, busqué la manera de hacerlo lo más específico posible.

<div align="center">

![Primera Iteración](./images/primeraIteracionUML.svg)
[Código](./modelosUML/primeraIteracion.puml)

</div>

## Explicación de relaciones

- Persona y Cultura: La cultura puede existir independiente de una persona y una persona puede existir independiente de una cultura. (Una no depende de la otra)
- Persona y Familia: Una persona pertenece/está relacionada con una familia
- Persona y RelacionSocial: Una persona mantiene relaciones sociales
- Persona y Creencia: La creencia puede existir independiente de una persona y una persona puede existir independiente de una creencia. (Una no depende de la otra)
- Persona y Emoción: Una persona usa/tiene emociones

---

## Segunda iteración

Tomando en cuenta las palabras del catedrático se dedujo que también debería de tener una edad (la cuál te da un criterio e identidad) o las experiencias que haz vivido.
Además, la identidad es un concepto, no naces con ella.

<div align="center">

![Segunda Iteración](./images/segundaIteracionUML.svg)
[Código](./modelosUML/segundaIteracion.puml)

</div>

## Explicación de nuevas relaciones

- No naces con una identidad, la vas formando/creando por ende, debería de ser una entidad separada de persona
- Las personas tienen una edad (redundante)
- Las experiencias vividas te dan una identidad
