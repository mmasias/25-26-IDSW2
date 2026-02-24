# Reto 001 - Modelado de una "Decisión"

## Modelo Propuesto

<div align=center>

![Modelo de Decisión](/entregas/alvaradoCarlos/images/decisión_iteración3.svg)

</div>

### Relaciones Propuestas

<div align=center>


| Relación | Tipo | Ciclo de Vida |
|----------|------|---------------|
|**Conciencia --> Elección** | [Asociación](/entregas/alvaradoCarlos/src/Conciencia.java) | Independiente |  
|**Elección --> Alternativa**|	[Asociación](/entregas/alvaradoCarlos/src/Eleccion.java)|	Independiente|	
|**Cuestionamiento --> Alternativa**|[Agregación](/entregas/alvaradoCarlos/src/Cuestionamiento.java)| Compuesto |  
| **Elección --> Consecuencia** | [Agregación](/entregas/alvaradoCarlos/src/Eleccion.java) | Gestionado |  
| **Alternativa --> Consecuencia** | [Asociación](/entregas/alvaradoCarlos/src/Alternativa.java) | Independiente |
| **Conciencia --> Cuestionamiento** | [Uso](/entregas/alvaradoCarlos/src/Conciencia.java) | Independiente | 
| **Sentimiento --> Emoción** | [Composición](/entregas/alvaradoCarlos/src/Sentimiento.java) | Dependiente |
| **Sentimiento --> Cuestionamiento** | [Agregación](/entregas/alvaradoCarlos/src/Sentimiento.java) | Independiente |  
| **Consecuencia --> Emoción** | [Uso](/entregas/alvaradoCarlos/src/Consecuencia.java) | Independiente |  
| **Entorno --> Cuestionamiento** | [Uso](/entregas/alvaradoCarlos/src/Entorno.java) | Independiente |  
| **Entorno --> Alternativa** | [Uso](/entregas/alvaradoCarlos/src/Entorno.java) | Independiente |  
| **Consecuencia --> Entorno** | [Asociación](/entregas/alvaradoCarlos/src/Consecuencia.java) | Independiente |  

</div>

----

Aquí se encuentra la justificación detallada para cada decisión de diseño:

- [Justificación de Clasificación](/entregas/alvaradoCarlos/docs/clasificación.md)
- Justificación de Relaciones
    - [Primera Iteración](/entregas/alvaradoCarlos/docs/iteracion1/relaciones.md)
    - [Segunda Iteración](/entregas/alvaradoCarlos/docs/iteracion2/relaciones.md)
    - [Tercera Iteración](/entregas/alvaradoCarlos/docs/iteracion3/relaciones.md)
- [Implementación en Código](/entregas/alvaradoCarlos/src/Main.java)



