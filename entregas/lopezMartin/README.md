# Modelado de la identidad de una persona

Persona es la clase principal

## Elementos que tienen relacion con la identidad de una `Persona`

- Nombre
- Apellido
- Edad 
- Género 
- DNI
- Religión 
- Educación académica
- Gusto
- Carácter 
- Nacionalidad 
- Rasgo físico
- Idioma 
- Persona(familiares y amigos) 
- Profesión 

<div align=center>

|Relación|Clases|Justificación|
|-|-|-|
|COMPOSICIÓN|Persona y Carácter| El carácter de una persona muere si la persona muere. Su existencia queda a total dependencia de la persona.
|COMPOSICIÓN|Persona y Edad| El tiempo de vida de una persona muere cuando esta muere.
|COMPOSICIÓN|Persona y Género| El género de una persona es un rasgo intrínseco. No podrían vivir independientemente.
|COMPOSICIÓN|Persona y Rasgo física| Si la persona muere sus rasgos físicos mueren.
|AGREGACIÓN|Persona y Nombre| El nombre puede existir independientemente de la persona
|AGREGACIÓN|Persona y Apellido| El apellido puesde existir independientemente de la persona
|AGREGACIÓN|Persona y Nacionalidad| La nación a la que una persona pertenece existe independientemente de esa persona.
|AGREGACIÓN|Persona y Idioma| Los idiomas que una persona habla son independientes de la persona.
|AGREGACIÓN|Persona y Educación académica| La educación académica que recibe una persona sigue existiendo aunque la persona muera.
|ASOCIACIÓN|Persona y Religión| La persona tiene una relación duradera con una religión y ambos existen independientemente.
|ASOCIACIÓN|Persona y Familia| La relación que una persona tiene con su familia tiene una cierta duración. Y ambas partes coexisten independientemente.
|ASOCIACIÓN|Persona y Amigos| La relación que una persona tiene con sus amigos tiene una cierta duración. Y ambas partes coexisten independientemente.
|ASOCIACIÓN|Persona y Profesión| Una persona tiene una ocupación determinada durante un periodo de tiempo, pero puede cambiar.
|USO|Persona y Gusto| La persona hace uso esporádico de sus gustos para interactuar con otra personas, objetos o actividades.
|USO|Persona y DNI| El DNI es un documento que una persona usa ocasionalmente para realizar ciertas funciones en una sociedad.

</div>

| Diagrama |
|-------|
| ![Diagrama](images/dominio.svg)|
| [Código UML](modelosUML/dominio.puml)|
