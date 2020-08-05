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
## Explore the Rest API
**Publish Mesages**
```
Method  	: 	POST
URL		:	http://localhost:8080/kafka/publish?message=Hello

NB:This is a pub-sub setup and when youn are running on local after posting your message on postman or using the swagger documentation
provided you should notice the produced and consumed message on the IDE console
You can check for the produced messages on Confluent Cloud Apache Kakfka dashboard also.
#To access the kafka confluent cloud dashboard and check the messages that you are posting using this simple demo api
use the following url: 
https://confluent.cloud/login 
#unfortunately when setting up the cluster you only use one email so until we figure something out, use the following credentials
to get access to the kafka confluent cloud cluster using the web UI 
email:victor.sithole@qubedlab.com 
password:Vickells8# 
#topic name:test 
#clustername:qubedlab_kafka_cluster 
