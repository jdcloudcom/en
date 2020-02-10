# Features


## Function runtime

You can compile function code with development languages (see Table 1) supported by Function Service.

| Type Upon Running | Version Upon Running | Document Link |
| ---------- | -------- | -------- |
| Python 2.7  | Python 2.7 Version| [python runtime](../Operation-Guide/buildfunction/runtime/python.md) |  
| Python 3.6   | Python 3.6 Version| [python runtime](../Operation-Guide/buildfunction/runtime/python.md) | 
| Python 3.7   | Python 3.7 Version| [python runtime](../Operation-Guide/buildfunction/runtime/python.md) | 
| NodeJS 6    | NodeJS 6.17 Version | [nodejs runtime](../Operation-Guide/buildfunction/runtime/nodejs.md) | 
| NodeJS 8    | NodeJS 8.16 Version | [nodejs runtime](../Operation-Guide/buildfunction/runtime/nodejs.md) | 
| Java 8    | Java 8 Version | [java runtime](../Operation-Guide/buildfunction/runtime/java.md) | 


## Functions supports multiple methods to upload code

Function code management method supports online editing and local .zip/.jar package upload.

## Functions supports multiple types of triggers

During Beta, see Table 2 for trigger types and invoking methods supported by Function Service:

Table 2: Trigger Information Supported by Function

| Event Source Trigger      | Function Invoking Method | Reference       |
| ---------- | ------------ | ---------- |
| OSS | Asynchronous invoke     | [OSS Trigger](../Operation-Guide/invokefunction/triggermanagement/eventsourceservice/oss-tirgger.md)|
| API Gateway | Synchronous invoke     | [API Gateway Trigger](../Operation-Guide/invokefunction/triggermanagement/eventsourceservice/apig-tigger.md)|
| Queue Service | Asynchronous Invoking     | [Queue Service Trigger](../Operation-Guide/invokefunction/triggermanagement/eventsourceservice/JQS-trigger.md)|
| Cloud Event Service | Asynchronous Call     | [Cloud Event Trigger](../Operation-Guide/invokefunction/triggermanagement/eventsourceservice/cloudevent.md)|

## Function Management Method

You can manage functions via methods below:
- Console
- API、SDK
- SCA CLI Local Development Tool
