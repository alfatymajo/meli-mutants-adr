


# Meli - Challenge Tecnico BE - Mutantes
#### Por Alexis Rodriguez

*********
![alt text](https://github.com/alfatymajo/meli-mutants-adr/blob/master/xmen-portada.png "Portada Xmen")
*********

* Documento con la consigna del proyecto: [Challenge MeLi BE- Mutantes.pdf](https://github.com/alfatymajo/meli-mutants-adr/blob/master/Challenge%20MeLi%20BE-%20Mutantes.pdf)

*********

## Instalacion requerida

+ **Java 1.8**
+ **Google Cloud Tools For Eclipse** (Para testear la API de forma local)

# Herramientas\Tecnologías utilizadas

| Nombre        | Descripción   |
| ------------- |:-------------:|
| **Java 8**      | Lenguaje de Programación |
| **Eclipse**      | IDE de desarrollo      |
| **Maven** |  Gestor de dependencias\Paquetes      |
| **JUnit** | Framework de test automaticos/unitarios |
| **Git**      | Versionado      |
| **GitHub**      | Repositorio      |
| **Jersey**      | Framework para creacion de RESTful Web Services      |
| **Google App Engine**      | Entorno de Desarrollo - PaaS de Alojamiento de la API      |
| **Google Cloud SQL**      | Servicio web para el alojamiento de la base de datos      |
| **Mysql**      | Sistema de gestión de Bases de Datos relacionales     |

*********

# Nivel 1 - Creación del metodo principal.

En la carpeta **Nivel 1** del presente repositorio se encuentra el proyecto con el codigo fuente correspondiente al primer requisito. Asimismo el proyecto se encuentra compilado en un archivo **.JAR** para luego ser importado y reutilizado en el proyecto correspondiente a los niveles 2 y 3.

Algunas aclaraciones de la consigna.

En base al ejemplo expuesto en el pdf con las consignas y en el texto que dice "Sabrás si un humano es mutante, si encuentras más de una secuencia de cuatro letras iguales, de forma oblicua, horizontal o vertical.", es que se toman en cuenta para el calculo todas las lineas horizontales, verticales y la diagonal principal de la matriz, como se ve en el ejemplo. Ademas como se indico que el **ADN** corresponde a una matriz **NxN**, entonces se toman como validas solamente aquellas representaciones de ADN correspondientes a matrices cuadradas.

## Instrucciones Nivel 1

Para utilizar el programa deben importar la carpeta del proyecto (**MELI_MUTANTS**) a un Workspace de Eclipse. Para realizar unas simples pruebas bastara con ejecutar la siguiente clase, contenedora del metodo `main()`:

```java
SimpleTest.Class

```

La misma ejecutara un caso aleatorio entre unos pocos ya predefinidos. Si se quiere ejecutar mas casos se pueden ejecutar los test restantes o el **Test Suite**, para ejecutar todos los test de una sola vez. Los mismos se encuentran configurados con el framework **JUnit**.

# Nivel 2 - Creación de la API REST

En la carpeta de **Nivel 2** encontraremos el proyecto de eclipse correspondiente al segundo desafio propuesto en la consigna principal. Dicho desafio comparte cosas con el desafio de **Nivel 3** (comparten el mismo proyecto). De todas formas se detallan los puntos y considerasciones que atañen solo al nivel 2.

La **API** en cuestión esta construida para que funcione en un **Entorno Estandar de Google APP Engine**, por lo que para que puedan levantar el proyecto correctamente deberan instalar el software de eclipse **Google Tools For Eclipse**. 

*********

## Detalles del servicio

| DESCRIPCION  | PETICION  | HEADER  | RESPUESTA
| ------ | ------ | ------ | ------ |
| Servicio Mutant | **POST** | **Content-Type: application/json** | Caso OK devuelve un **HTTP 200** (si es mutante) o **HTTP 403** en caso contrario

Cuando se logre levantar la aplicacion en el entorno de app engine, la misma debe ser accedida mediante la siguiente URL que es generada por defecto: **http://localhost:8080/mutant**. Cabe destacar que la misma solo recibe peticiones **POST**.

La API se encuentra actualmente implementada en una instancia de **Google App Engine**, con el mismo comportamiento presentado en el entonrno local y se puede acceder mediante la siguiente URL:

**http://meli-mutants-adr.appspot.com/mutant**

Para poder correr la aplicacion en un ambiente local deberan importar la carpeta del proyecto (**ApiRest**) ubicada dentro de la carpeta **Nivel 2** en el repositorio.

*********

# Nivel 3 - Creación e integración de la API con la base de datos.

Para este ultimo desafio se optó por subir la base de datos a una instancia de **Google Cloud SQL** y persistir los datos de la aplicación en la misma. Para que funcione en nuestro entorno local se debera contar con el servicio de **Mysql** y un servidor web (por ejemplo **Apache**) en el cual correr la instancia de la base de datos a la cual se le crearan las tablas necesarias para la aplicación. Se recomienda utilizar un enlatado de servicios, como por ejemplo **XAMPP**, para poder tener lista la base de datos sin mayor complicaciones de instalación y/o configuración.

Debido a temas internos del entorno **Google App Engine**, la libreria de conexion a la base de datos no es la misma, por lo que existe una diferencia entre el entorno local y el implementado en **Google Cloud**. La unica diferencia es el metodo utilizado para armar el Connection String.

El proyecto (el mismo que el importado en el nivel 2), del modo en el que se encuentra en el repositorio, ya esta listo para ser corrido en un entorno local. Para que funcione correctamente se deben crear las estructuras de las tablas utilizadas por la aplicación. Por este motivo se adjuntan los **Scripts SQL** en la capreta **Nivel 3**, en la carpeta **SQL Scripts**, necesarios para crear e inicializar las tablas principales.

Para terminar de configurar la aplicación y poder utilizarla sin inconvenientes deberan introducir en el fichero de configuración, los datos correspondientes a la base de datos creada anteriormente. El mismo se encuentra en la siguiente ruta del proyecto: **ApiRest\WebContent\WEB-INF\application.properties**

A continuación se muestra una captura del contenido del mismo:

![alt text](https://github.com/alfatymajo/meli-mutants-adr/blob/master/xmen-portada.png "Captura App Properties")