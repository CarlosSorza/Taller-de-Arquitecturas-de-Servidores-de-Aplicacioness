# TALLER 3: TALLER DE ARQUITECTURAS DE SERVIDORES DE APLICACIONES, META PROTOCOLOS DE OBJETOS, PATRÓN IOC, REFLEXIÓN

## Carlos Alberto Sorza Gómez

## Descripción

Para este taller los estudiantes deberán construir un servidor Web (tipo Apache) en Java. El servidor debe ser capaz de entregar páginas html e imágenes tipo PNG. Igualmente el servidor debe proveer un framework IoC para la construcción de aplicaciones web a partir de POJOS. Usando el servidor se debe construir una aplicación Web de ejemplo. El servidor debe atender múltiples solicitudes no concurrentes.

Para este taller desarrolle un prototipo mínimo que demuestre capcidades reflexivas de JAVA y permita por lo menos cargar un bean (POJO) y derivar una aplicación Web a partir de él. 

Debe entregar su trabajo al final del laboratorio. Luego puede complementar para entregarlo en 8 días. Se verificara y compararán el commit del día de inicio del laboratorio y el dela entrega final.

### Prerequisitos

Para desarrollar este proyecto se utilizó lo siguiente:

- **Maven**: Apache Maven es una herramienta encargada de gestionar el ciclo de vida del software.
- **Git**: Es un sistema distribuido de control de versiones (VCS).
- **Java 17**: Java es un lenguaje de programación orientado a objetos, de propósito general, altamente portátil y versátil.




### Pasos de instalación 

Como primer paso vamos a clonar el repositorio

```
    https://github.com/CarlosSorza/Taller-de-Arquitecturas-de-Servidores-de-Aplicacioness.git

```
Se accede a la carpeta principal del repositorio repositorio que acabamos de clonar

	 cd TALLER-DE-ARQUITECTURAS-DE-SERVIDORES-DE-APLICACIONES-META-PROTOCOLOS-DE-OBJETOS-PATRON-

Hacemos la construccion del proyecto

	 mvn package
---
### Ejecución

Ejecutamos los siguientes comando
	
	 mvn clean package install
	 mvn clean install

Ahora corremos el servidor
	
	 java -cp "target\classes" edu.escuelaing.arep.ASE.app.main




Por ultimo accedemos en en el navegador a la siguiente URL

	 http://localhost:35000/

Aquí se debería cargar la siguiente página, desde la cual podemos comenzar a realizar las búsquedas necesarias.


![alt text](/Images/image.png)

# Documentos HTML

![alt text](/Images/image-1.png)

![alt text](/Images/image-2.png)




# Documentos PNG

![alt text](/Images/image-3.png)









# ¿Cómo puede el desarrollador crear una aplicación con este framework?

Es un proceso sencillo. Siga estos pasos:

1. Cree una clase dentro de los archivos `edu.escuelaing.arep.ASE.app.controllers`.


![alt text](/Images/image-4.png)
2. Implemente los métodos necesarios, asegurándose de usar la etiqueta `@RequestMapping`. Cabe mencionar que los métodos deben ser estáticos y retornar una cadena de texto (`String`).

![alt text](/Images/image-5.png)

3. Ejecute el servidor y verifique que lo implementado funcione correctamente desde el navegador.


   ![alt text](/Images/image-6.png)



---
### Ejecutando test

Ejecutamos el comando

	mvn test
	
---





## Construido con

* [Maven](https://maven.apache.org/): Apache Maven es una herramienta que estandariza la configuración y gestión del ciclo de vida del proyecto.
* [Git](https://rometools.github.io/rome/): Sistema de control de versiones distribuido (VCS).
* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/): Un entorno de desarrollo integrado (IDE) que facilita la escritura, depuración y gestión del código, con numerosas características que optimizan el proceso de desarrollo de software.
* [Java 19](https://www.java.com/es/): Lenguaje de programación de propósito general orientado a objetos, con tipado fuerte de variables.
* [HTML](https://developer.mozilla.org/es/docs/Learn/Getting_started_with_the_web/HTML_basics): Lenguaje de marcado utilizado para estructurar el contenido de una página web.
* [JavaScript](https://developer.mozilla.org/es/docs/Learn/JavaScript/First_steps/What_is_JavaScript): Lenguaje de programación usado para crear páginas web dinámicas.
* [CSS](https://developer.mozilla.org/es/docs/Web/CSS): Lenguaje utilizado para aplicar estilos a páginas web.



