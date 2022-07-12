Josue Rivas Muñoz
# Proyecto base
Este proyecto contiene una base genérica para ser utilizada en cualquier nuevo proyecto
Está basado en la unión y depuración de diferentes proyectos desarrollados en java y  javaspring
y se busca tener un proyecto como base con la suficiente estructura para poder iniciar un desarrollo completo.

Actualmente el proyecto está pensado para ser consumido por una aplicación Angular, la cual está en desarrollo y será publicado el menú que genera esta estructura de forma dinamica.
Sin embargo perfectamente puede servir para ser usada por React o cualquier otra tecnología.

En caso de utilizar JSF o algún otro sistema legacy, se deberá modificar el paquete controller para que no utilice los restcontrollers.

### Distribución  del proyecto.
El proyecto cuenta con los siguientes elementos:
- JavaSpring
- Docker
- Base de datos
- Keycloak

Se plantea todo el código fuente requerido para el funcionamiento  de la aplicación pero 
también se adjunta un docker compose para levantar un contenedor de postgresql y un administrador de  postgresql
Además se tiene previsto para utilizar keycloak, aunque este deberá ser analizado en cada nueva implementación.
Por último se adjunta un script básico para el desarrollo de la aplicación

### Paquetes
#### Controller: Hace referencia a los servicios rest que recibirán las peticiones 
#### Entity: Este paquete utiliza las entidades mapeadas desde JPA y que obtienen la información de la base de datos.
#### repository:  realiza los procesos del reposotorio de datos manejado por JPA, en este paquete se deben agregar los metodos personalizados de conexión a la bd que utilizarán las consultas de  las entidades.
#### service: este paquete realiza la logica de negocio, también puede ser renombrado a "bo" y utiliza los repositorios para acceder a los datos.
#### config: De momento solo tiene la configuración de seguridad, pero debe implementar cualquier otro elemento de seguridad
#### dto: objetos que se utilizarán para enviar  datos de un lado a otro. Para algunas entidades que puedan ser muy grandes, se recomienda desde el service, retornar un dto en vez de retornar los entityes

Esta aplicación está construida con perfiles, y por defecto la seguridad está configurada para que el perfil dev pueda hacer uso de la aplicación
para otros ambientes se deberán realizar las configuraciones necesarias para que otros perfiles puedan acceder a la información.