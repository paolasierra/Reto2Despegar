Feature: Buscar Tiquetes
 		Yo como usuario 
		Quiero conocerlos 7 tiquetes mas baratos
 		Para viajar desde Medellín a Cartagena

  Scenario: Busqueda Tiquetes Exitosa
    Given El usuario esta en la pagina de Despegar
    When el usuario ingrese a buscar vuelos
    And selecciona origen
    And ingresa destino
    And escoge fecha inicio
    And selecciona fecha regreso
    And escoge numero viajeros
    And da click en boton buscar
    And el usuario almacena los precios mas baratos en un Excel
    Then el usuario visualiza en excel el tiquete mas barato resaltado en verde
