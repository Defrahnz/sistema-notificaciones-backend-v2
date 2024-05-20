# Sistema de Notificaciones SMS (Backend)

Proyecto estilo ERP para la administración y manejo de notificaciones mediante el uso de API Rest y Twilio.

## Autores

- [@Daniel Valdivia](https://github.com/Defrahnz)
## Ejecutarlo localmente

Es necesario contar con Java 17 o superior para poder ejecutar el servidor de Spring Boot
##

> [!IMPORTANT]
Para mayor compatibilidad, se recomienda crear una carpeta de proyectos dentro del directorio raíz C:

Nos dirigimos al directorio

```bash
  cd C:/proyectos
```

Clonamos el proyecto

```bash
  git clone https://github.com/Defrahnz/sistema-notificaciones-backend-v2.git
```
## Iniciar el Servidor desde el CMD
Para iniciar el servidor backend mediante el uso de CMD, se requeríra el uso de los comandos del gestor de paquetes de Spring Boot. Para eso haremos lo siguiente

> [!NOTE]
Es importante resaltar que esta guía está realizada para sistemas operativos Windows. Se actualizará posteriormente hacia los demás Sistemas.

##
Dentro del directorio de C: crearemos una nueva carpeta llamada `desarrollo` (puede tener cualquier nombre)

```bash
  mkdir desarrollo
```

Descargamos el siguiente enlace y descomprimimos en la carpeta anteriormente creada

```bash
 https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.zip
```

Agregamos las variables de entorno para que la consola pueda interpretar los comando de Maven, para eso nos vamos al siguiente modulo de Windows
```bash
Inicio > Editar variables de Entorno del Sistema > Variables de entorno > Variables del Sistema
```

Daremos click en el botón de `Nueva` y le daremos los siguientes datos

```bash
Nombre de la Variable: MAVEN_HOME
Valor de la variable: C:\desarrollo\apache-maven-3.9.x (Tomando en cuenta el nombre que se le puso al inicio de este documento)
```

Nos movemos a la carpeta del servidor
```bash
cd C:/proyectos/sistema-notificaciones-backend-v2
```

Ejecutamos el siguiente comando para inicar el servidor de backend
```bash
mvn springboot:run
```





## Variables de Entorno

Para este proyecto se es necesario cambiar por defecto las variables de entorno de la instancia de la base de datos alojada en el archivo `application.properties`, así mismo es necesario cambiar los datos de conexión para el uso de Twilio. Las variables se referenciarán con los nombres

`bd_url`

`bd_user`

`bd_password`

Variables para la conexión con Twilio

`ACCOUNT_SID`

`AUTH_TOKEN`

Todos estos datos se escribiran en un archivo `.env`


## Licencia

[MIT](https://choosealicense.com/licenses/mit/)

