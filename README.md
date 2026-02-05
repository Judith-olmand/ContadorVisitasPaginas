- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDABC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
Contador de Visitas a Páginas
Herramienta de consola en Java diseñada para contabilizar la frecuencia de acceso a diferentes URLs o nombres de páginas web.

🚀 Funcionalidades
- Seguimiento en tiempo real: Registra visitas introduciendo nombres de páginas de forma interactiva.
- Conteo acumulativo: Identifica si una página ya ha sido visitada e incrementa su contador automáticamente.
- Reporte dual: Al finalizar, muestra los resultados utilizando dos métodos de iteración diferentes (keySet y entrySet).
- Cierre controlado: El proceso termina de forma segura al escribir la palabra "fin".

🛠️ Estructura técnica
Utiliza un HashMap<String, Integer> para mapear nombres de páginas con sus respectivos totales. Implementa una lógica de control de flujo para inicializar o actualizar valores dentro del mapa según la existencia previa de la clave.
