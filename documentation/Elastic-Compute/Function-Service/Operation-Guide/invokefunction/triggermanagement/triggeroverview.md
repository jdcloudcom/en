# Trigger Overview

Function Service is the Serverless service that is triggered by the event, and the core components are Function and event sources. The event source is the producer of the event, and the function is the processor of the event; the trigger defines the rules by which an event source triggers a function. In the event source, when an event occurs, the event source invokes the function corresponding to the trigger if the pre-configured trigger rules are satisfied.

   The function can be triggered by jJD Cloud Service, console or SDK. During Beta, see [Trigger List](triggerlist.md) for event source types supported by Function Service, and trigger types are in the process of enrichment.

 

Trigger Configuration:


`eventSource`: Type of Trigger (for example: OSS, API Gateway).

`eventSourceId`: Resource Descriptor Executed by Trigger EventSourceId corresponds to apiId and BucketId, separately.

`configurationId`: Trigger Configuration Information, corresponding to apiId and ConfigurationId, separately, configuration information of each trigger varies by the trigger type, please refer to the corresponding [Event Source Service](eventsourceservice/eventsource-service.md).
