### MicroServicio Productos
Este microservicio se encarga de gestionar la información de los productos disponibles en el sistema. Por temas de simplicidad, solo se agregan dos métodos: uno para agregar y otro para listar. Este microservicio utiliza una base de datos PostgreSQL para almacenar y recuperar la información de los productos.

### MicroServicio Control de Inventario
Este microservicio se dedica al control y gestión del inventario de productos. Es responsable de realizar un seguimiento de la cantidad disponible de cada producto y gestionar la actualización del inventario cuando se realizan compras. Al igual que el microservicio de productos, este microservicio utiliza una base de datos PostgreSQL para almacenar y consultar la información del inventario.

### MicroServicio Manejo de Órdenes
Este microservicio se encarga de gestionar las órdenes de los usuarios. Utiliza una base de datos MySQL para almacenar y recuperar la información almacenada con las órdenes. Además, realiza una llamada al servicio de inventario cuando es necesario verificar la disponibilidad de productos antes de completar una orden.

### MicroServicio Notificaciones
La comunicación entre el microservicio de órdenes e inventario se realiza a través de una llamada a la API del servicio del inventario utilizando WebClient de Spring WebFlux. Esto permite al microservicio de órdenes modificar la disponibilidad de productos antes de completar una orden, brindando una experiencia de usuario más precisa y evitando órdenes de productos no disponibles.
