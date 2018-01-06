Spring Boot Mongo
============================================
The content initially was taken from:
[spring-boot-sample-data-mongodb](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-data-mongodb)



Run tests
---------
```
mongo
db.customer.find().pretty();
```


To run
------
* SampleMongoApplication main class
* `mvn clean install spring-boot:run`


To verify
---------
```
curl http://localhost:8080
curl http://localhost:8080/helloworld
```
