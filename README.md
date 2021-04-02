## Intercorp Retail- Client. Spring boot ,GIT ,  Maven , Java 8 , Cloud Firestore , JPA and Swagger.

### Sr Developer José Francisco valdez 
 Linkedin https://www.linkedin.com/in/jose-francisco-valdez-282a1b1a/

## How it works:
## 0.1 Runs as Spring boot app.

### Clone the repository:
1) git clone https://github.com/pilon33/retailTestJfv.git

2) Update maven project:
3)Build project 
4)Runs As --> Spring Boot App

## Tester Api in Swagger UI:
Swagger UI: http://localhost:8080/swagger-ui.html

![image](https://user-images.githubusercontent.com/12847173/113461420-e5b2c880-93f2-11eb-84a7-acdccfbf80a7.png)

### POST request to `/creacliente` crea cliente (Nombre,Apellido,Edad,Fecha de nacimiento).
* Example: curl -X POST "http://localhost:8080/creacliente" -H "accept: application/json" -H "Content-Type: application/json" -d "{ \"apellido\": \"perez\", \"edad\": 21, \"fecha_Nacimiento\": \"2000-07-07\", \"nombre\": \"adrian\"}"

### GET request to `/listclientes` returna Lista de personas con todos los datos + fecha probable de muerte de cada una.
* Example: curl -X GET "http://localhost:8080/kpideclientes" -H "accept: application/json"

### GET request to `/kpideclientes` retorna Promedio edad entre todos los clientes y Desviación estándar entre las edades de todos los clientes.
* Example: curl -X GET "http://localhost:8080/listclientes" -H "accept: application/json"


#### Tester Api in Postman:

![image](https://user-images.githubusercontent.com/12847173/113461513-4e9a4080-93f3-11eb-8a6e-ba7771022577.png)

