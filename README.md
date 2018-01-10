Sample Spring Boot Mongo Application
============================================
The content initially was taken from:
[spring-boot-sample-data-mongodb](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-data-mongodb)



Run Integration tests
---------------------
*Please note, that integration tests require local mongo up and running.*

To run integration tests can execute either:
* From IDE SampleMongoApplicationIT, then verify mongo db
* `mvn clean package verify -DskipITs=false`

```
mongo
db.customer.find().pretty();
```


To run
------
* SampleMongoApplication main class
* `mvn clean package spring-boot:run`


To verify
---------
```
mongo
db.customer.find().pretty();
db.customer.remove({});
db.customer.find().pretty();

curl http://localhost:8080
curl http://localhost:8080/init
curl http://localhost:8080
curl http://localhost:8080/helloworld
```
