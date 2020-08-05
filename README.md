# spring-boot-kafka-api
Build Restful API for a simple kafka application using Spring Boot and Apache Kafka.

## Running the kafka
To run the kafka:
```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

**Create kafka topic**
```bash
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
```

## Running the program
To run the application:
```
mvn spring-boot:run
```
## Explore Rest APIs
**Publish Mesages**
```
Method  	: 	POST
URL		:	http://localhost:9000/kafka/publish?message=Hello
