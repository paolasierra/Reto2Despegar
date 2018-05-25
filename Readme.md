Resumen de codificaci�n
========================

Se cre� un proyecto en Graddle, se actualizaron las dependencias necesarias, se descarg� la versi�n del navegador a utilizar y se defini� el Feature en lenguaje Gherkin, partiendo de alli se crearon los paquetes: Runner (con el cual se guarda la clase desde la cu�l se ejecuta el proyecto), stepsDefinition (dentro del cual se defini� la clase relacionada al Feature y sus respectivos m�todos) y pages (una clase para manejar todos los m�todos que hacen el llamado a cada componente de la pagina en su orden de ejecuci�n y una clase para manejar el almacenamiento de los precios de los vuelos en excel)

Framework
=========
Cucumber

Compilador
==========
Eclipse

Pr�cticas de Automatizaci�n
===========================
BDD

Herramienta de Automatizaci�n
=============================
Selenium 

Navegador
=========
Google Chrome versi�n 2.38

Estrategia de automatizaci�n
=============================
Se bas� primero que todo en navegar por la p�gina de Despegar con el fin de conocer bien el funcionamiento de la misma, luego de eso tom� los identificadores de los objetos de la p�gina a trav�s del "Copy Xpath" y de acuerdo a esto cre� las funciones en Java que me permitieran ingresar la informaci�n para finalmente llevarla a un archivo de Excel. 

Conclusi�n de la automatizaci�n
=============================
Es importante primero que todo tener una estrategia de lo que se desea automatizar para poder orientar la construccion de los test script, indagar y tratar de conocer bien el funcionamiento del objeto de prueba.
