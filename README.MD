# CONCURRENCIAS

Desarrolla un ejercicio en Java que simule un sistema de control de acceso a un edificio. Crea una clase Edificio con un método acceso que tome el nombre de la persona y simule el acceso. Utiliza dos hilos para representar dos entradas al edificio y muestra mensajes indicando quién está accediendo y desde qué entrada. 

## Instrucciones:

1. Crea la Clase Edificio:Define una clase llamada Edificio con un método acceso que tome el nombre de la persona y simule el acceso al edificio. Agrega lógica para imprimir mensajes que indiquen quién está accediendo y desde qué entrada.

2. Implementa la Clase AccesoThread: Define una clase llamada AccesoThread que extienda Thread y represente la acción de acceso al edificio desde una entrada específica. Pasa una instancia de Edificio al constructor para que cada hilo pueda interactuar con el edificio.

3. Desde la Clase Principal, Simula el Sistema de Control de Acceso: En la clase principal, crea una instancia de Edificio y dos instancias de AccesoThread para representar dos entradas al edificio. Inicia los hilos y muestra mensajes indicando quién está accediendo y desde qué entrada.