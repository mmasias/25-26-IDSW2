# Reto 001 - Modelado de una "Decisión"

## Modelo Propuesto

<div align=center>

![Modelo de Decisión](/entregas/alvaradoCarlos/images/decisión.svg)

</div>

### Relaciones Propuestas

<div align=center>


| Relación | Tipo | Ciclo de Vida | Exclusividad |
|----------|------|---------------|-------------|
|Conciencia --> Elección | Asociación | Independiente | Compartida |
|Elección --> Alternativa|	Asociación|	Independiente|	Compartida|
|Cuestionamiento o-- Alternativa|Agregación| Compuesto | Compartida |
| Elección o-- Consecuencia | Agregación | Gestionado | Exclusiva |
| Alternativa --> Consecuencia | Asociación | Independiente |Compartida|
| Conciencia ..> Cuestionamiento | Uso | Independiente | Compartida


</div>

----

Aquí se encuentra la justificación detallada para cada decisión de diseño:

- [Justificación de Clasificación]()
- [Justificación de Relaciones]()
- [Implementación en Código](/entregas/alvaradoCarlos/src/Main.java)


