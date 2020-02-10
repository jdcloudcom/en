# Event Source Service

 


Event Source Service is a collection of all services that can trigger function execution. At present, OSS is supported and API Gateway, Queue Service and Cloud Event Service are provided as event source services, so you can configure these services as the event source of Function. After configuring the event source mapping for the function, these event sources will automatically call your function when detecting the event.  

## Configuration of Event Source Service

Function configures Event Source Service by creating an event source trigger, and the configuration process is as below:

1. Create an event source service trigger and set the event type of the trigger function.
2. Configure the function enter object event, event object formats vary by the trigger, the event you write provides event source information for the function, for example: Object Storage Service OSS Event Source, event includes specified bucket information, object information, user ID, and so on. For details, please refer to:
   - [Processing Program](../../../buildfunction/programming-model/python/processing-program.md)
   - [Configure Trigger and Event Format](../configtigger-event.md)
