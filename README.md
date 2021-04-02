## Intercorp Retail- Client. Spring boot , Maven , Java 8 , Cloud Firestore , JPA and Swagger.

### Sr Developer José Francisco valdez 
 Linkedin https://www.linkedin.com/in/jose-francisco-valdez-282a1b1a/

## How it works:
## 0.1 Runs as Spring boot app.

* Clone the repository:
```bash
https://github.com/pilon33/jfv-challenge-subsidiary.git
```
* Update maven project:
```Build project 
```Runs As 
Spring Boot App

### Tester in Swagger UI:

http://localhost:8080/swagger-ui.html


### POST request to `/creacliente` crea cliente (Nombre,Apellido,Edad,Fecha de nacimiento).
* Example: curl -X POST "http://localhost:8080/creacliente" -H "accept: application/json" -H "Content-Type: application/json" -d "{ \"apellido\": \"perez\", \"edad\": 21, \"fecha_Nacimiento\": \"2000-07-07\", \"nombre\": \"adrian\"}"

### GET request to `/listclientes` returna Lista de personas con todos los datos + fecha probable de muerte de cada una.
* Example: curl -X GET "http://localhost:8080/kpideclientes" -H "accept: application/json"

### GET request to `/kpideclientes` retorna Promedio edad entre todos los clientes y Desviación estándar entre las edades de todos los clientes.
* Example: curl -X GET "http://localhost:8080/listclientes" -H "accept: application/json"




