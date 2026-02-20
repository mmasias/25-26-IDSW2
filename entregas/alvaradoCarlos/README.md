# Reto 001 - Modelado de una "Decisión"

## Modelo Propuesto

<div align=center>

![Modelo de Decisión](/entregas/alvaradoCarlos/images/decisión_iteración2.svg)

</div>

### Relaciones Propuestas

<div align=center>


| Relación | Tipo | Ciclo de Vida |
|----------|------|---------------|
|**Conciencia --> Elección** | [Asociación](/entregas/alvaradoCarlos/src/Conciencia.java) | Independiente |  
|**Elección --> Alternativa**|	[Asociación]()|	Independiente|	
|**Cuestionamiento --> Alternativa**|[Agregación]()| Compuesto |  
| **Elección --> Consecuencia** | [Agregación]() | Gestionado |  
| **Alternativa --> Consecuencia** | [Asociación]() | Independiente |
| **Conciencia --> Cuestionamiento** | [Uso]() | Independiente | 
| **Sentimiento --> Emoción** | [Composición]() | Dependiente |
| **Sentimiento --> Cuestionamiento** | [Agregación]() | Independiente |  
| **Consecuencia --> Emoción** | [Uso]() | Independiente |  


</div>

----

Aquí se encuentra la justificación detallada para cada decisión de diseño:

- [Justificación de Clasificación](/entregas/alvaradoCarlos/docs/clasificación.md)
- Justificación de Relaciones
    - [Primera Iteración](/entregas/alvaradoCarlos/docs/iteracion1/relaciones.md)
    - [Segunda Iteración](/entregas/alvaradoCarlos/docs/iteracion2/relaciones.md)
- [Implementación en Código](/entregas/alvaradoCarlos/src/Main.java)



