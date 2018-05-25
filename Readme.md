Resumen de codificación
========================

Se creó un proyecto en Graddle, se actualizaron las dependencias necesarias, se descargó la versión del navegador a utilizar y se definió el Feature en lenguaje Gherkin, partiendo de alli se crearon los paquetes: Runner (con el cual se guarda la clase desde la cuál se ejecuta el proyecto), stepsDefinition (dentro del cual se definió la clase relacionada al Feature y sus respectivos métodos) y pages (una clase para manejar todos los métodos que hacen el llamado a cada componente de la pagina en su orden de ejecución y una clase para manejar el almacenamiento de los precios de los vuelos en excel)

Framework
=========
Cucumber

Compilador
==========
Eclipse

Prácticas de Automatización
===========================
BDD

Herramienta de Automatización
=============================
Selenium 

Navegador
=========
Google Chrome versión 2.38

Estrategia de automatización
=============================
Se basó primero que todo en navegar por la página de Despegar con el fin de conocer bien el funcionamiento de la misma, luego de eso tomé los identificadores de los objetos de la página a través del "Copy Xpath" y de acuerdo a esto creé las funciones en Java que me permitieran ingresar la información para finalmente llevarla a un archivo de Excel. 

Conclusión de la automatización
=============================
Es importante primero que todo tener una estrategia de lo que se desea automatizar para poder orientar la construccion de los test script, indagar y tratar de conocer bien el funcionamiento del objeto de prueba.
