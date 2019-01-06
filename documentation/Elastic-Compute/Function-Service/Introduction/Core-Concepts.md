# Core Concepts 

## Serverless

When using Serverless Service, users don't need to pay attention to the resources required and their operational maintenance, just pay attention to the business itself, and services can auto scale the required resources in real time according to the actual needs of the business, while users only need to pay for the actual consumption of resources.

 

## FaaS

FaaS provides a stateless, event-triggered, transient, resilient, auto scaling Serverless computing service.

FaaS is triggered by an event, the function is only triggered by an event only when the event occurs, and it only processes this event, in stateless running. To meet high concurrency requirements, Function Service provides automatic auto scaling capability, which will start corresponding instance in real time according to the change of the request quantity to process the event request, and reduce instances in real time with event reduction or without event triggering.

 

## Function

Function is the smallest resource unit in Function Service, and each function includes user-customized code and any dependent library.

 

## Event

Function is triggered and executed by events. A trigger passes an event to Function when it triggers a function. The event is passed with a specific JSON data structure and passed to Function in a method of an event incoming parameter.

 

## Trigger and Event Source

A trigger is a method to trigger the execution of a function.

Event source is a JD Cloud Service that triggers a function and executes its logic.

In an event-driven computing model, the event source is the producer of the event and the function is the processor of the event, but the trigger provides a centralized and unified method to manage different event sources. In the event source, when an event occurs, the event source calls the function corresponding to the trigger if the rules defined by the trigger are satisfied.

When a trigger triggers a function, it can trigger the function synchronously or asynchronously according to its own characteristics. When a function is triggered synchronously, the trigger waits for the function execution to be completed and gets the result of the function execution; when a function is triggered asynchronously, the trigger only triggers the function and ignores the result of the function execution.
