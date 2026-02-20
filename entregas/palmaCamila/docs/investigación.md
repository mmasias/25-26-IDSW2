# Bibliografía

> **NOTA:** He realizado una investigación profunda sobre cómo los ingenieros programan a los LLM para que sean capaces de proporcionar decisiones o simular procesos de decisión. Sin embargo, los dos recursos que más me llamaron la atención fueron estos, ya que están explicados por ingenieros de IBM. A partir de ellos me inspiré para elaborar los diagramas y tratar de recrear cómo un LLM toma esas decisiones y la complejidad que implica dicho proceso.

### [How AI Agents and Decision Agents Combine Rules & ML in Automation](https://www.youtube.com/watch?v=-mldKsBR0UM)

La tesis central del video es que los LLM deben encargarse de las decisiones de contexto y orquestación, actuando como el enlace inteligente entre el usuario y los sistemas rígidos del banco. Específicamente, el video muestra cómo los LLM toman cuatro tipos de decisiones operativas:

### 1. Decidir la intención  
El sistema utiliza un agente de chat para interpretar si el cliente solo tiene una duda sobre políticas o si quiere iniciar un proceso de compra real.

### 2. Decidir la delegación (Orquestación)  
Un "agente orquestador" decide qué herramienta especializada activar. Por ejemplo, si el cliente pregunta por requisitos, llama a un agente de políticas; si quiere el préstamo, llama a un agente de flujo de trabajo.

### 3. Decidir la relevancia de los datos  
Mediante "agentes de ingestión", el LLM decide qué información es válida dentro de documentos desordenados (como un folleto de un barco con notas a mano) para estructurarla y enviarla al sistema.

### 4. Decidir la explicación  
Finalmente, un "agente explicador" traduce los registros técnicos y lógicos de por qué se pausó una solicitud (generados por un sistema de reglas) a un lenguaje natural que un humano pueda entender y resolver.

### [Explainable AI: Demystifying AI Agents Decision-Making](https://www.youtube.com/watch?v=yJkCuEu3K68)  

Un LLM "decide" eligiendo la ruta estadística más fuerte entre millones de opciones de texto. Como esto carece de juicio humano, dependemos de la IA Explicable (XAI) para auditar esa estadística, asegurando que sea precisa, rastreable y entendible.