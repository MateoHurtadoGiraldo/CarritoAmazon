# Desafío 1: Replica Escenario De Prueba Con Selenium Y Cucumber

## Sobre este Proyecto:
En este proyecto se automatizo el flujo E2E a la pgina de Amazon, en la cual se busca un producto que esta en un lugar especifico y se trata de agregar al carrito de compras. 

Este proyecto esta hecho con Selenium Webdriver Y Cucumber, se siguen las buenas practicas aprendidas en los tutoriales del curso. 

### ¿Qué es Selenium WebDriver?
[Selenium WebDriver](https://www.selenium.dev/documentation/webdriver/) es una colección de APIs que se utilizan para automatizar la interacción con navegadores web. Proporciona una forma de controlar el navegador desde el código, permitiendo simular las acciones de un usuario real, como hacer clic en botones, ingresar texto, navegar entre páginas y más. Es una herramienta fundamental para las pruebas automatizadas de aplicaciones web, asegurando su correcto funcionamiento y la validación de funcionalidades a través de diferentes navegadores.

### ¿Qué es Cucumber?
[Cucumber](https://cucumber.io/docs) es una herramienta de Behavior-Driven Development (BDD) que permite escribir pruebas en un lenguaje sencillo y legible por personas no técnicas, llamado Gherkin. Las pruebas se describen en términos de "características" y "escenarios", utilizando un formato estructurado de "Dado" (Given), "Cuando" (When) y "Entonces" (Then). Cucumber facilita la colaboración entre desarrolladores, testers y stakeholders, ya que las pruebas se convierten en una especificación viva del comportamiento esperado de la aplicación. Luego, estas descripciones se vinculan a código de automatización para su ejecución.

### ¿Qué es Gradle?
[Gradle](https://gradle.org/) es una potente herramienta de automatización de construcciones que gestiona las dependencias del proyecto y facilita la compilación, ejecución y empaquetamiento de la aplicación.

### ¿Qué es una dependencia?
Una dependencia o librería es un programa desarrollado por terceros, que nuestro proyecto utiliza para llevar a cabo ciertas funcionalidades. En lugar de escribir todo el código necesario desde cero, incorporamos estas herramientas externas para simplificar el desarrollo y aprovechar soluciones ya probadas y optimizadas. Muchas de estas dependencias las descargamos desde [MVN Repository](https://mvnrepository.com/).

## Configuración del Proyecto

### Requisitos Previos
Para ejecutar este proyecto se debe tener unas instalaciones previas que son:
- Java Development Kit (JDK) 17
- Gradle

### Instalación de Java Development Kit (JDK) 17
Para instalar el JDK buscamos en el navegador JDK Download, entramos en [Oracle](https://www.oracle.com/co/java/technologies/downloads/),  buscamos un JDK que sea Long-Term Support (LTS), ya que estos tienen un soporte más amplio y son más estables. puede ser el JDK 17 o JDK 21. En este caso utilizamos el JDK 17 que tiene un soporte hasta el año 2029. Luego descarga el instalador del JDK adecuado para tu versión de Windows (32 o 64 bits). Por último, solo debes ejecutarlo y seguir las indicaciones.

Para saber si tenemos instalado Java solo utilizamos el comando java --version en el CMD de nuestro computador.

### Instalación de Gradle
Para instalar Gradle buscamos en el navegador Gradle Download, esto nos lleva a la página de [Gradle](https://gradle.org/install/) y descargamos el instalador. Al descargarlo lo ejecutamos y seguimos las indicaciones.

Para saber si tenemos instalado Gradle solo utilizamos el comando gradle --version en el CMD de nuestro computador. 

### Extensiones de VS code
Para este proyecto se utilizaron alguna extensiones de VS Code que ayudan a . Las extensiones que vamos a descargar son:
- Extension Pack for Java
- Gradle for Java
- Gradle Language Support
- Cucumber
- Snippets and Syntax Highlight for Gherkin (Cucumber)

### Instalación de Dependencias
Para este proyecto Java con Gradle implementamos algunas dependencias en el archivo buil.gradle que se bajaron de [MVN Repository](https://mvnrepository.com/).
- **Selenium Java**: Se utiliza la versión 4.21.0.
- **TestNG**: Se utiliza la versión 7.11.0.
- **Cucumber JVM: Java**: Se utiliza la versión 7.22.0. Esta versión de be ser la misma que la del Cucumber JVM: JUnit 4.
- **Cucumber JVM: JUnit 4**: Se utiliza la version 7.22.0. Esta versión de be ser la misma que la del Cucumber JVM:Java.
- **WebDriverManager** (Debe ser la de bonigarcia): Se utiliza la versión 5.7.0.

## A tener en cuenta
Al realizar la automatizacion de esta pagina, al principio siempre sale un captchat. Para resolver el problema del captcha se implemento un codigo que hace que el programa espere 15 segundos para resolverlo manualmente. Si el Captcha no se resuelve en esos 15 segundos la prueba falla. 

```java
public void espera() {
        try {
            Thread.sleep(15000); //pausa de 15 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
```

## Estructura del Proyecto

## Ejecución de Pruebas
