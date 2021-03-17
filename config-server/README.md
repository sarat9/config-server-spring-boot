# config-server-spring-boot
Central Configuration Server with Spring boot Cloud

#

#config-server

#

## Build Instruction
```
mvn clean install
java -jar .\target\config-server-0.0.1-SNAPSHOT.jar
```

*App runs on port **8888***

##




@EnableConfigServer:
Add the @EnableConfigServer annotation before the Spring Application and build the project. With this annotation, this artifact will act like a spring config server.



application.yml:




@RefreshScope annotation:
By default, the configuration values are read on the client’s startup, and not again. We can force a bean to refresh its configuration — to pull updated values from the Config Server — by annotating with @RefreshScope.
