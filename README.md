# confluentkafka-demoservice-api
Restful API for a simple kafka application using Spring Boot and Confluent Cloud Apache Kafka.

**Create kafka topic**
create a topic of your choice on confluent cloud using the CLI or web UI in this case topic test was already
created

## Running the program
To run the application:
```
mvn spring-boot:run
```
## Explore Rest APIs
**Publish Mesages**
```
Method  	: 	POST
URL		:	http://localhost:8080/kafka/publish?message=Hello

NB:This is a pub-sub setup and when youn are running on local after posting your message on postman or using the swagger documentation
provided you should notice the produced and consumed message on the IDE console
This is applicable on the Confluent Cloud Apache Kakfka dashboard also
