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
If it matches the predicate then the request is sent to the filters.<br>
*PreFilter = Decides which downstream microservice needs to be called (i.e Service 1 or Service 2), it also modifies the request if required.<br>
*PostFilter = Post filter will be called once response needs to be send to a calling consumer, it also modifies the response if required.<br>

# Sample API Gateway Routing application.yml

![image](https://user-images.githubusercontent.com/26468158/81774218-aa906980-94af-11ea-8e73-17567476e3ed.png)

