**Building a Rest API with Kotlin & Spring boot**

This project is an example of how to create a Rest API using Spring boot and Kotlin applying layer division




**The Person API**

GET /api/v1/person: Get all the persons

GET /api/v1/person/{ID}: Get person by person's ID

POST /api/v1/person: Insert a new person

PUT /api/v1/person: Update an existing person

DELETE /api/v1/person/{ID}: Delete person by person's ID

**Project Structure**
Domain: Object models of the domain that incorporates both behavior and data.

DAO: Data Access Object is a structural pattern that allows us to isolate the application/business layer from the persistence layer using an abstract API.

DTO: Data Transfer Object an object that carries data between processes in order to reduce the number of method.

Service: The Service Layer defines an application's boundary with a layer of services that establishes a set of available operations and coordinates the application's response in each operation.

Transformer: Transformer is a design pattern that helps objects to transform themselves into objects of any type.

Resource: RESTful Web services allow the requesting systems to access and manipulate textual representations of Web resources by using a uniform and predefined set of stateless operations.










Tutorial Video: https://www.youtube.com/watch?v=GH4lDILOUvk&list=PLNnNHr-wCfobAxSkuxMqFGdpA8E5cLR6w
