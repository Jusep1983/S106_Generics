# S106_Generics
## 📄 Descripción 
Este repositorio contiene los 3 niveles de la Tasca S1.06. Generics, los cuales se centran 
en el uso de métodos y parámetros genéricos en Java. Se exploran mediante las siguientes tareas: 
  - Definir métodos genéricos que aceptan diferentes tipos de objetos o datos.
  - Utilizar parámetros genéricos para manejar múltiples tipos de datos de manera flexible.
  - Integrar interfaces con métodos genéricos para aceptar o no objetos que las implementen.

🔽 Enunciados:
   <details>
    <summary>
      Nivel 1
    </summary>
 
    - Ejercicio 1
    Crea una clase llamada NoGenericMethods que almacene tres argumentos del mismo tipo, junto con los 
    métodos para almacenar y extraer estos objetos, y un constructor para inicializar los tres. 
    Comprueba que los argumentos se pueden colocar en cualquier posición en la llamada al constructor.
    
    - Ejercicio 2
    Crea una clase llamada Persona con los atributos nombre, apellido y edad. Luego, crea una clase 
    llamada GenericMethods con un método genérico que acepte tres argumentos de tipo genérico. 
    Este método solo debe imprimir por pantalla los argumentos que ha recibido.
    
    En el main() de la clase principal, llama al método genérico con diferentes tipos de parámetros.
    
    Ejemplo: Un objeto de la clase Persona, un String y un tipo primitivo.
    
    De esta manera, habrás comprobado que se le puede pasar cualquier tipo de parámetro y en cualquier orden.

      
   </details>
   <details>
   <summary>
   Nivel 2
   </summary>
  
    - Ejercicio 1
    Modifica el ejercicio anterior de manera que uno de los argumentos 
    del método genérico no sea genérico.

    - Ejercicio 2
    Modifica el apartado anterior de manera que los argumentos del 
    método genérico sean una lista de argumentos de longitud indefinida.

   </details>
   <details>
   <summary>
     Nivel 3
   </summary>

    - Ejercicio 1
    Para hacer este ejercicio necesitas una interfaz llamada Telefon y tres clases: 
    Smartphone, Generica y Principal.

    La interfaz Telefon debe tener un método llamado trucar(). La clase Smartphone debe 
    implementar Telefon, y además del método trucar(), también debe tener el método ferFotos().

    La clase Generica debe tener dos métodos genéricos. El primero debe recibir un tipo de argumento 
    limitado por la interfaz Telefon, y el segundo debe recibir un argumento limitado por la clase Smartphone. 
    Desde estos dos métodos, llama a los métodos pertinentes de Telefon y Smartphone. En el main() de la clase Principal, 
    pasa un objeto de la clase Smartphone a los dos métodos genéricos de la clase Generica.
    
    ¿El método limitado por la interfaz Telefon, de la clase Generica, puede llamar al método ferFotos()?

   </details>
</details>

## 💻 Tecnologías Utilizadas 
El proyecto ha sido desarrollado utilizando: 
  - Java 23.0.2
  - IntelliJ IDEA como entorno de desarrollo
  - Git y GitHub para control de versiones.

## 📋 Requisitos 
Para ejecutar el proyecto es necesario contar con: 
  - JDK 23 instalado en el sistema
  - Git instalado y configurado
  - IntelliJ IDEA
  - Conexión a internet para clonar el repositorio.

## 🛠️ Instalación 
1. Clonar el repositorio

  - Opción 1: Desde GitHub (sin terminal):

    1. Ir al repositorio en GitHub:
       
            https://github.com/Jusep1983/S106_Generics.git
    2. Hacer clic en el botón verde "Code" (Código).
    3. Seleccionar la opción "Download ZIP".
    4. Extraer el archivo ZIP en la ubicación de preferencia.

  - Opción 2: Desde IntelliJ IDEA:
    1. Abrir IntelliJ IDEA.
    2. En la pantalla de inicio, seleccionar "Get from VCS" (Obtener desde el control de versiones).
    3. En la pestaña "Version Control", seleccionar Git.
    4. En el campo "URL", pegar el enlace del repositorio:
       
            https://github.com/Jusep1983/S106_Generics.git
    5. Elegir la carpeta donde se guardará el proyecto y hacer clic en "Clone".
    6. IntelliJ IDEA detectará el proyecto y pedirá importarlo como un proyecto de Java.

  - Opción 3: Desde la terminal (con Git instalado):
    1. Abre la terminal o línea de comandos.
    2. Dirígete a la carpeta donde deseas clonar el repositorio:

            cd /ruta/donde/quieres/clonar
    3. Ejecuta el siguiente comando para clonar el repositorio:

            git clone https://github.com/Jusep1983/S106_Generics.git
    4. Después de que se complete el proceso de clonación, ve a la carpeta del proyecto:

            cd S106_Generics

2. Configurar el entorno:
    1. Abrir IntelliJ IDEA si no está abierto.
    2. Ir a File → Project Structure → Project.
    3. Asegurarse de que está seleccionado JDK 21.

## ▶️ Ejecución 
1. Abrir la clase que contiene el método main(). 
2. Hacer clic en el botón Run o presionar Shift + F10. 
3. Si es necesario, IntelliJ IDEA pedirá sincronizar dependencias, acepta la opción.

## 🌐 Despliegue 
El proyecto está diseñado para ejecutarse en un entorno local, por lo que no se ha definido un proceso de despliegue en producción.

## 🤝 Contribuciones 
Si deseas contribuir al proyecto, puedes: 
- Hacer un fork del repositorio. 
- Crear una nueva rama para tus cambios. 
- Enviar un pull request con una descripción detallada de tus modificaciones.


¡Gracias por tu interés en este proyecto! 🚀
