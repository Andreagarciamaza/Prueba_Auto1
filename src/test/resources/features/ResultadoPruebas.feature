#Author: andreagarciamaza@gmail.com
#language:es
@Regresion
Característica: Ingresar a Google y digitar la prueba Pruebaz 
   Como usuario debo ingresar a la pagina de Google y digital la palabra Pruebaz , luego verificar 
   que se cargue la palabra correcta "Pruebas" 
  @Escenario1
  Escenario: Ingresar a Google y digitar la palabra Pruebaz, verificar que aparezca la palabra  "Pruebas" y validar que la lista de resultados sea mayor a 6	
    Dado que Andrea  ingresa a la pagina de google
    Cuando ella digita la palabra pruebaz de manera erronea y luego hace click sobre la palabra correcta
    Entonces ella deberia obtener la lista de los resultados y validar que la cantidad sea mayor a 6
    
  