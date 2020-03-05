


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
| **Git**      | Versionado      |
| **GitHub**      | Repositorio      |
| **Jersey**      | Framework para creacion de RESTful Web Services      |
| **Google App Engine**      | Entorno de Desarrollo - PaaS de Alojamiento de la API      |
| **Google Cloud SQL**      | Servicio web para el alojamiento de la base de datos      |
| **Mysql**      | Sistema de gestión de Bases de Datos relacionales     |

*********

# Nivel 1 - Creación del metodo principal.

En la carpeta Nivel 1 del presente repositorio se encuentra el proyecto con el codigo fuente correspondiente al primer requisito. Asimismo el proyecto se encuentra compilado en un archivo **.JAR** para luego ser importado y reutilizado en el proyecto correspondiente a los niveles 2 y 3.

Algunas aclaraciones de la consigna.

En base al ejemplo expuesto en el pdf con las consignas y en el texto que dice "Sabrás si un humano es mutante, si encuentras más de una secuencia de cuatro letras iguales, de forma oblicua, horizontal o vertical.", es que se toman en cuenta para el calculo todas las lineas horizontales, verticales y la diagonal principal de la matriz, como se ve en el ejemplo. Ademas al indicar que **ADN** corresponde a una matriz **NxN**, entonces se toman como validas solamente aquellas representaciones de ADN correspondientes a matrices cuadradas.

## Instrucciones Nivel 1

Para utilizar el programa deben importar la carpeta del proyecto (**MELI_MUTANTS**) a un Workspace de Eclipse. Para realizar unas simples pruebas bastara con ejecutar la siguiente clase, contenedora del metodo `main()`:

```java
SimpleTest.Class

```

La misma ejecutara un caso aleatorio entre unos pocos ya predefinidos. Si se quiere ejecutar mas casos se pueden ejecutar los test restantes o el **Test Suite**, para ejecutar todos los test de una sola vez. Los mismos se encuentran configurados con el framework **JUnit**.


