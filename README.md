# Introducción a la superviviencia en sistemas distribuidos

En un sistema distribuido de procesamiento de pagos, el 'survivor' es el componente encargado de asegurar que las transacciones se completen correctamente a pesar de fallos temporales en otros servicios. El sistema debe manejar pagos provenientes de tres canales diferentes: web, móvil y POS. Cada canal tiene sus propias características y umbrales de rendimiento. El 'survivor' debe persistir cada solicitud de pago con una clave de idempotencia para evitar duplicados, y debe ser capaz de recuperarse automáticamente si el servicio de procesamiento de pagos falla temporalmente.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Survivor A 1788900223035 |
| **Nivel** | trainee-l1 |
| **Tipo** | theoretical |
| **Tiempo estimado** | 2 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración del sistema

**Objetivo:** Comprender las fuentes de pagos y las restricciones del sistema

**Tiempo estimado:** 30 minutos

**Instrucciones:**

- Identificar los tres canales de pago y sus características específicas.
- Enumerar las restricciones del sistema, incluyendo umbrales de rendimiento y reglas de negocio.

**Entregable:** Lista de canales de pago con sus características y restricciones del sistema.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las diferencias en latencia y volumen de transacciones entre los canales.
- Piensa en cómo la idempotencia puede ayudar a evitar duplicados.

</details>

### Fase 2: Diseño del 'survivor'

**Objetivo:** Diseñar el componente 'survivor' para manejar pagos idempotentes

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Diseñar el flujo de trabajo del'survivor' para manejar pagos provenientes de los tres canales.
- Definir cómo el'survivor' persistirá las solicitudes de pago con una clave de idempotencia.

**Entregable:** Diagrama del flujo de trabajo del'survivor' y descripción de cómo se persisten las solicitudes de pago.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo el'survivor' puede manejar diferentes tipos de fallos en el sistema de procesamiento de pagos.
- Considera cómo la clave de idempotencia puede garantizar que no haya duplicados.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es el 'survivor' en el contexto de un sistema distribuido de procesamiento de pagos?
- **paraQueSirve**: ¿Para qué sirve el 'survivor' en el sistema de procesamiento de pagos?
- **comoSeUsa**: ¿Cómo se usa la clave de idempotencia en el'survivor' para evitar duplicados?
- **queDecisionesImplica**: ¿Qué decisiones debes tomar al diseñar el flujo de trabajo del'survivor'?

## Criterios de Evaluacion

- Identificación correcta de los canales de pago y sus características.
- Enumeración de las restricciones del sistema y comprensión de su impacto.
- Diseño del flujo de trabajo del'survivor' que maneje pagos idempotentes.
- Definición clara de cómo se persisten las solicitudes de pago con una clave de idempotencia.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
