
API Gateway using Spring-Cloud-Gateway

# Netflix ZUUL vs Spring-Cloud-Gateway
Zuul is a <b>blocking API</b>. A blocking gateway api makes use of as many threads as the number of incoming requests. 
So this approach is more resource intensive. If no threads are available to process incoming request then the request has to wait in queue.<br>
Spring Cloud Gateway is a <b>non blocking API</b>. When using non blocking API, a thread is always available to process the incoming request.<br> These request are then processed asynchronously in the background 
and once completed the response is returned. So no incoming request never gets blocked when using Spring Cloud Gateway.

# Spring-cloud-gateway
An API Gateway acts as a single entry point for a collection of microservices. Any external client cannot access the microservices directly but can access them only through the application gateway<br>
In a real world scenario an external client can be any one of the three-<br>
     *Mobile Application<br>
     *Desktop Application<br>
     *External Services or third party Apps<br>

![image](https://user-images.githubusercontent.com/26468158/81772798-651e6d00-94ac-11ea-809c-2f9904a7ac84.png)

# Spring Cloud Gateway Architecture

Spring Cloud Gateway is API Gateway implementation by Spring Cloud team on top of Spring reactive ecosystem.<br> 

It consists of the following building blocks:: <br>
-<b>Route</b>: Route the basic building block of the gateway. It consists of :<br>
      *ID <br>
      *Destination URI <br>
      *Collection of predicates and a collection of filters <br>
-A route is matched if aggregate predicate is true.<br>
-<b>Predicate</b>: This is similar to Java 8 Function Predicate. Using this functionality we can match HTTP request, such as headers , url, cookies or parameters.<br>
-<b>Filter</b>: These are instances Spring Framework GatewayFilter. Using this we can modify the request or response as per the requirement.<br>

![image](https://user-images.githubusercontent.com/26468158/81773405-cb57bf80-94ad-11ea-9215-a5eb269749d3.png)

When the client makes a request to the Spring Cloud Gateway, the Gateway Handler Mapping first checks if the request matches a route. 
This matching is done using the predicates. 
If it matches the predicate then the request is sent to the filters.

# Sample Application flow

* India TSP is a microservice
* Turkey TSP is a microservice

![image](https://user-images.githubusercontent.com/26468158/81775343-4f13ab00-94b2-11ea-9a48-134e66aead8b.png)

![image](https://user-images.githubusercontent.com/26468158/81776544-9a2ebd80-94b4-11ea-843f-c4d616c30d44.png)

# Sample API Gateway Routing application.yml

![image](https://user-images.githubusercontent.com/26468158/81774218-aa906980-94af-11ea-8e73-17567476e3ed.png)

