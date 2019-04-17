# Core Concepts 

## Serverless

Users use the Serverless service, do not necessarily care about the infrastructure such as the underlayer server, and only need to care about the business itself, so that the overall business is lightweight. Services can auto scale the required resources in real time according to the actual needs of the business, while users only need to pay for the actual consumption of resources.

 

## FaaS

Function as a service (FaaS) provides a stateless, event-triggered, transient, resilient, auto scaling Serverless computing service.

FaaS is triggered by an event, the function is only triggered by an event only when the event occurs, and it only processes this event, in stateless running. Function service automatically schedules resource to run functions in real time according to the counts of concurrent requests to easily address business peak and trough.

 

## Function

Function is the smallest resource unit in Function Service, and each function includes user-customized code and any dependent library.

 

## Event

Function is triggered and executed by events. A trigger passes an event to Function when it triggers a function. The event is passed with a specific JSON data structure and passed to Function in a method of an event incoming parameter.

 

## Trigger and Event Source

A trigger is a method to trigger the execution of a function.

Event source is a JD Cloud Service that triggers a function and executes its logic.

The event source generates events, when an event occurs, the event source calls the function corresponding to the trigger if the rules defined by the trigger are satisfied; and triggers the function execution in a synchronous or asynchronous manner according to the characteristics of the event source.
