I have created this microservices application, to mock how microservices application work.
The application has functionality like: 
1. make calls and add data to tables in sql.
2. Have Logger implementation, that will help developer debug if in future we encounter any bugs.
3. Implemented Lombok, api server, and circuit breaker algorithm.
4. Implemented cacheable and cacheEviction policy to springboot .
5. Implemented Dockerfile, and created docker image.

Things yet to implement: 
1. Stored procedure calls, as springboot enable cache in stored procedure calls.
2. to implement table value functions and scalar function in database layer.
