# Documentación de Uso de IA 

Este proyecto integra herramientas de Inteligencia Artificial para optimizar el flujo de desarrollo, desde la concepción de la arquitectura hasta la implementación del código en Java.

## 1. Herramientas Utilizadas
* **Gemini (Google):** Utilizado como consultor de arquitectura para el refinamiento del modelo de dominio, definición de tipos de datos y validación de relaciones UML.
* **GitHub Copilot:** Utilizado como asistente de codificación para la generación de scaffolding y boilerplate inicial de las entidades.

## 2. Áreas de Aplicación

### Diseño de Arquitectura y Modelado
Se utilizó la IA para validar la lógica de negocio del sistema de streaming, discutiendo puntos clave como:
* La jerarquía de herencia entre **Song**, **Single**, **Album** y **EP**.
* El uso de tipos de datos adecuados (como puede ser,. el uso de `long` para el contador **playCount** para evitar errores de overflow).
* La distinción técnica entre relaciones de **composición** (User-Profile) y **agregación** (Playlist-Song).

### Generación de Código (Scaffolding)
Para la transición del diseño UML a código Java, se empleó la IA para poblar las entidades con sus respectivos atributos:
* **Proceso:** A partir del diagrama UML, la IA generó las declaraciones de campos privados.
* **Beneficio:** Reducción de errores manuales de tipado y ahorro de tiempo en tareas repetitivas de escritura de atributos.

## 3. Proceso de Supervisión y Control 
Todo el contenido generado o sugerido por la IA ha sido sometido a un proceso de revisión manual:
1. **Validación de Tipos:** Se verificó manualmente que los tipos fuesen estrictamente los utilizados en el diagrama.
2. **Coherencia:** Se comprobó que la estructura de clases en Java fuera un reflejo exacto del diagrama de clases oficial del proyecto.

