# Reto 001 - Relaciones por Colaboración (Diseño)

**Escenario elegido:** Conversación

He elegido este escenario porque, aunque es un dominio cotidiano que todos entendemos (como WhatsApp o Discord), presenta varias posibilidades de diseño para este reto y permite debatir sobre sobre ciclos de vida (ej. ¿Un mensaje puede existir sin una conversacion? o ¿Un usuario desaparece si se borra la conversacion? o ¿Un archivo adjunto pertenece a un solo mensaje o se guarda en una galería compartida?)...

Y para modelar este dominio, he decidido abstraer el concepto de **Conversación** para que soporte tanto interacciones digitales (apps de mensajería) como físicas (encontrarse a un amigo en la calle, hablar en lenguaje de señas o usar código morse).

## 1. Identificar

### Entidades Seleccionadas

* *Participante (Persona / Sistema):*
* *Usuario* 
* *Conversación (Interacción)* 
* *Mensaje*
* *Adjunto*
* *Servidor / Red*
* *Notificación*
* *Contacto (Agenda)*
* *Formato*
* **Código / Idioma*
* **Canal / Medio*

## 2. Relacionar

*(Pendiente)*

## 3. Codigo java

*(Pendiente)*

## 4. Cuestionar

*(Ver si las relaciones elegidas sobreviven a cambios en las decisiones de dominio)*

### Visión a futuro (Expansión del Dominio)

Para poner a prueba la resistencia de este diseño en fases posteriores planteo:

1. **Paso a Tiempo Real:** Ampliar el modelo para incluir una conversación en vivo (llamada de voz/video). Esto servirá para evaluar si entidades como `Mensaje` deben evolucionar hacia `Streaming` o `Sesion`, alterando las reglas de temporalidad.

2. **Traducción / Transformación:** Al haber identificado el `Formato` como una entidad o propiedad clave, el sistema debería ser capaz de soportar un intermediario que reciba un mensaje en código morse y lo entregue en texto, sin romper la relación de la `Conversación`.