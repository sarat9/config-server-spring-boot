# config-server-spring-boot
#### Central Configuration Server with Spring boot Cloud

Config server is where all configurable parameters of all microservices are stored and maintained.
It is more like externalizing properties/resource file out of project codebase to an external service altogether so that any changes to any given property does not necessitate the re-deployment of service which is using that property. 

## Application Architecture

The application consists of 2 different Microservices

-   [config-server](https://github.com/sarat9/config-server-spring-boot/tree/main/config-server)  - Config Server in Spring Boot 
-   [config-client](https://github.com/sarat9/config-server-spring-boot/tree/main/config-client)  - Microservice App as Config Client in Spring Boot
-   [config-repo](https://github.com/sarat9/config-server-spring-boot/tree/main/config-repo)  - Git repo with all configuation files


*Optional* - [microservices-architect-config-starter](https://github.com/sarat9/microservices-architect-config-starter)  -  This repo has seven other microservices, you can chose to connect them if you want.




**Problem**
- In micro-service world, managing configurations of each service separately is a tedious and time-consuming task. In other words, if there are many number of modules, and managing properties for each module with the traditional approach is very difficult.
- In a monolith there is one place where the property files are stored and when changes are needed, there is only one place that they need to be updated. In a microservice architecture, each microservice owns its own properties. This can result in duplication of a single property value across multiple microservices. If that value needs to be updated it will need to be changed in every microservice. This isn’t a big deal if you only have one or two microservices, but if that property is used in 10, 20, or 30 different ones you will have to make the change in each one and re-deploy it for the change to take effect.


**Solution**:
Central configuration server provides configurations (properties) to each micro service connected.

Config server is where all configurable parameters of all microservices are stored and maintained.
It is more like externalizing properties/resource file out of project codebase to an external service altogether so that any changes to any given property does not necessitate the re-deployment of service which is using that property. 

**Use**:
- Centralized Configuration with Spring Cloud
In the context of large number of Microservice based applications, we want the ability to configure and manage the configuration properties of all MicroServices from a centralized place.
- Config server is where all configurable parameters of all microservices are stored and maintained.It is more like externalizing properties/resource file out of project codebase to an external service altogether. 
- Any changes to any given property does not necessitate the re-deployment of service which is using that property. 


![MicroService Config Server ](https://miro.medium.com/max/932/1*R3KQqB1r0y652cj70YTcaw.png)# MicroService Config Server Sample!

![MicroService Config Server ](https://miro.medium.com/max/1050/1*a4z8iptdPYWG3OhJZ2EArQ.png)# MicroService Config Server Sample!




https://miro.medium.com/max/1050/1*a4z8iptdPYWG3OhJZ2EArQ.png


**How do we make this work without a restart ?**

The answer is “**/actuator/refresh**” endpoint on the client. if the endpoint is hit on the client, it will force the server to reload the configuration and provide client with the new value.

is this a good solution ?? yes and no.. lets take a real time example
To get the changed configs from the Config Server, we have to manually trigger the /actuator/refresh endpoint in the application. When this endpoint is triggered, every bean marked with an @RefreshScope is refreshed and the new configs become available in the application.



**Src and Ref:**

https://medium.com/@ijayakantha/microservices-centralized-configuration-with-spring-cloud-f2a1f7b78cc2
https://medium.com/@athulravindran/bootstrapping-spring-cloud-config-server-8c32b7d9c0ab
https://medium.com/walmartglobaltech/manage-application-configuration-using-spring-cloud-config-80b27ecb34b7
https://medium.com/design-and-tech-co/creating-a-configuration-microservice-using-spring-cloud-config-800d08fa596a
https://codeburst.io/spring-cloud-config-centralized-configuration-in-microservices-f4ec243512db


**Methods**

https://stackoverflow.com/questions/60500158/how-to-point-spring-cloud-config-server-to-a-git-folder-inside-a-git-repo/66583651#66583651



<a href="https://www.buymeacoffee.com/sarat" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>



[![GitHub followers](https://img.shields.io/github/followers/sarat9.svg?label=Follow%20@sarat9&style=social)](https://github.com/sarat9/)

