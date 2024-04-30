
# Sistema de Peajes

El Sistema de Peajes es una aplicación prototipo de gestion de cobro de peajes, con dos tipos de usuarios: administrador y cliente.
## Características

- **Panel de Entrada:**
  - Interfaz de inicio de sesión para administradores y clientes.
  - Opción para seleccionar el tipo de usuario (admin o cliente).

- **Funcionalidades del Administrador:**
  - Aplicar Bonificaciones:
    - Asignar bonificaciones a matrículas específicas.
  - Aceptar Recargas:
    - Procesar recargas de saldo realizadas por clientes.
  - Emular Tránsito:
    - Simular el tránsito de vehículos por puntos de peaje para pruebas y análisis.

- **Funcionalidades del Cliente (Propietario):**
  - Panel de Control:
    - Visualizar información detallada sobre vehículos registrados.
    - Ver saldo general y bonificaciones disponibles.
    - Consultar histórico de tránsitos por peajes.
    - Historial de recargas realizadas y posibilidad de solicitar nuevas recargas.
    - Notificaciones: Recibir mensajes de notificación sobre transacciones y actualizaciones importantes.

## Tecnologías Utilizadas

- Java: Lenguaje de programación principal.
- Swing: Biblioteca para la creación de interfaces gráficas de usuario (GUI).

## Patrones de Diseño

- **[Principio Expert (Expert Principle)](#principio-expert-expert-principle)**
- **[División Lógica (Logical Division)](#división-lógica-logical-division)**
- **[Fachada (Facade)](#fachada-facade)**
- **[Herencia y Polimorfismo (Inheritance and Polymorphism)](#herencia-y-polimorfismo-inheritance-and-polymorphism)**
- **[MVC](#mvc)**
- **[Excepciones (Exceptions)](#excepciones)**
- **[Interfaces](#interfaces)**
- **[Observer](#observer)**

## Instalación y Ejecución

1. Clona el repositorio desde GitHub: `git clone <https://github.com/JulioLopez27/Sistema-peajes.git>`.
2. Importa el proyecto en NetBeans.
3. Ejecuta la aplicación desde NetBeans.
## Autor

- [Julio López](https://www.github.com/JulioLopez27)


## Contacto
Para cualquier pregunta, contáctame mediante el correo julioneo95@hotmail.com

## Anexo: Detalles de los Patrones de Diseño

## Principio Expert (Expert Principle)
### Descripción:
Este principio establece que una clase debe ser responsable de sus propias operaciones y datos relacionados. En otras palabras, una clase debe tener la información necesaria para realizar sus propias acciones, en lugar de depender de otras clases para obtener información o realizar acciones en su nombre. Esto promueve la cohesión y reduce el acoplamiento en el diseño de software.
### Aplicación en el Proyecto:
En el sistema de peajes, se aplica el principio de experto asegurándose de que cada clase sea responsable de sus propias operaciones y datos, evitando así la dependencia excesiva entre clases y promoviendo un diseño más modular y mantenible.

---

## División Lógica (Logical Division)
### Descripción:
Este principio implica dividir un sistema en componentes o módulos más pequeños y cohesivos, cada uno de los cuales se ocupa de una tarea específica o una parte del dominio del problema. La división lógica ayuda a simplificar el diseño, facilitar el mantenimiento y promover la reutilización del código.
### Aplicación en el Proyecto:
En el sistema de peajes, se divide lógicamente el sistema en componentes o módulos separados, como el panel de entrada, las funcionalidades del administrador y del cliente, para facilitar el desarrollo, la comprensión y el mantenimiento del código.

---

## Fachada (Facade)
### Descripción:
El patrón de diseño de fachada proporciona una interfaz unificada y simplificada a un conjunto más grande de interfaces en un subsistema. Esto oculta la complejidad del subsistema y proporciona a los clientes una interfaz fácil de usar.
### Aplicación en el Proyecto:
En el sistema de peajes, se utiliza el patrón de fachada para proporcionar una interfaz simplificada para los usuarios a través del panel de entrada, ocultando la complejidad de las funcionalidades subyacentes y facilitando la interacción del usuario con el sistema.

---

## Herencia y Polimorfismo (Inheritance and Polymorphism)
### Descripción:
La herencia permite que una clase herede atributos y comportamientos de otra clase (superclase), mientras que el polimorfismo permite que un objeto se comporte de múltiples formas dependiendo del contexto.
### Aplicación en el Proyecto:
Se utiliza la herencia y el polimorfismo en el sistema de peajes para representar relaciones entre clases y permitir que diferentes tipos de objetos (por ejemplo, vehículos) se comporten de manera diferente según el contexto, como en la aplicación de bonificaciones o en el cálculo de tarifas de peaje.

---

## MVC
### Descripción:
El patrón de diseño MVC separa una aplicación en tres componentes principales: el Modelo (que representa los datos y la lógica de negocio), la Vista (que representa la interfaz de usuario) y el Controlador (que maneja las interacciones del usuario y actualiza el modelo y la vista según sea necesario).
### Aplicación en el Proyecto:
En el sistema de peajes, se utiliza el patrón MVC para separar la lógica de negocio (modelo), la presentación (vista) y el control de la interacción del usuario (controlador), lo que facilita la modularidad y la escalabilidad del sistema.

---

## Excepciones (Exceptions)
### Descripción:
Las excepciones son eventos inesperados o errores que ocurren durante la ejecución de un programa. El manejo de excepciones permite a los desarrolladores detectar y manejar estos errores de manera adecuada, mejorando la robustez y la confiabilidad del software.
### Aplicación en el Proyecto:
En el sistema de peajes, se utilizan excepciones para manejar situaciones inesperadas, como errores de entrada del usuario o problemas de comunicación con la base de datos, garantizando que el sistema responda de manera adecuada y siga funcionando de manera confiable.

---

## Interfaces
### Descripción:
Las interfaces en programación representan un contrato entre un objeto y el mundo exterior, especificando los métodos que deben ser implementados por las clases que las implementan. Las interfaces permiten la abstracción y la interoperabilidad entre diferentes componentes del sistema.
### Aplicación en el Proyecto:
En el sistema de peajes, se utilizan interfaces para definir contratos entre diferentes componentes del sistema, como las interfaces para las funcionalidades del administrador y del cliente, lo que facilita la implementación de clases con comportamientos específicos y promueve la modularidad y la reutilización del código.

---

## Observer
### Descripción:
El patrón Observer establece una relación de uno a muchos entre objetos, de modo que cuando un objeto cambia su estado, todos los objetos que dependen de él son notificados y actualizados automáticamente.
### Aplicación en el Proyecto:
En el sistema de peajes, se utiliza el patrón Observer para permitir que los objetos (por ejemplo, la interfaz de usuario) se suscriban y reciban notificaciones sobre cambios en el estado de otros objetos (por ejemplo, el saldo de la cuenta de un cliente), lo que facilita la actualización de la interfaz en tiempo real y mejora la experiencia del usuario.
