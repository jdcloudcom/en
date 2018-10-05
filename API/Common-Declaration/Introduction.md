
# Introduction #

Welcome to JD Cloud OpenAPI service.

The JD Cloud OpenAPI provides the management capability of all JD Cloud resources through API, to be used by JD Cloud users and cooperation partners. OpenAPI is an effective complement to JD Cloud Console, enabling users to control their cloud resources more flexibly.



## Preconditions ##


To use the OpenAPI of a product line, firstly, you need to understand the functionality, billing and other information of the product through the product documents.

Before calling the JD Cloud OpenAPI, you need to apply for the AccessKey and SecretKey key pair (AK/SK) in advance on the AccessKey management page managed by the JD Cloud User Center Account. AK/SK information should be kept safely. If lost, it may cause illegal users to use this information to operate your resources in the cloud, causing losses to your data and property. AK/SK key pair can be put into use and forbidden to be used. If putting into use, it can call OpenAPI, but if forbidden to be used, it cannot call OpenAPI.


 

## Billing Method ##

The Billing Method of resources created by using OpenAPI is exactly the same as the Billing Method of resources created by using the console. When creating resources that require to be billed, the billing method must be specified. Please refer to the details in the ChargeSpec field in each API request parameter. At present, three kinds of Billing Method are supported:

Billing Method|Meaning|Instruction
:---|:---|:---
prepaid_by_duration | Pay-In-Advance | Default value. You need to specify the billing unit chargeUnit and the billing time duration chargeDuration
postpaid_by_usage | Pay-As-You-Go by consumption | 
postpaid_by_duration | Pay-As-You-Go by configuration |            


 

## Region Code ##

When calling OpenAPI, you must fill in the correct region code according to the actual location of the resources (RegionId).

Region code|Region name
:---|:---
cn-north-1 
cn-east-1 
cn-east-2 
cn-south-1  
                         


When accessing resources without region attributes, such as accounts, bills and so on, but the interface needs to fill in the region code, then fill in the default region code cn-north-1.

A region contains one or more Availability Zones. Availability Zone refers to the physical data center in the same region but subject to independent network and power supply. The failure of one Availability Zone will not affect other Availability Zones. Multiple Availability Zones can help applications achieve higher availability. Some of the interfaces may also require the code of Availability Zones. If API has no special specifications, fill in the following code:

Region|Availability Zone|code of Availability Zone
:---|:---|:---
cn-north-1 | Availability Zone A | cn-north-1a 
cn-north-1 | Availability Zone B | cn-north-1b  
cn-east-1| Availability Zone A | cn-east-1a 
cn-east-2| Availability Zone A | cn-north-2a  
cn-east-2 | Availability Zone B | cn-north-2b 
cn-south-1 | Availability Zone A | cn-south-1a  
   



## Error Return Format ##

When there is an API access error, the returned data body generally contains the following parts of information, including code, status, message and details, code refers to error classification, status refers to detailed division of error classification, message refers to the developer-oriented error reason and details refers to the detailed information related to the error (some types of errors provide this information). E.g:

    {
        "requestId": "bbf8vinuw9142j3npttfgp2kg4vf9bj7", 
        "error": {
            "status": "ACCESS_ERROR", 
            "code": 401, 
            "message": "lack of header authorization[gw]"
        }
    }


As you can see from the returned information about error, the failure was due to the lack of the necessary authorization signature information for the request that was initiated.




## Use Restrictions ##

The call frequency to OpenAPI is limited per minute. For most services, the call frequency is limited to 1000 times/minute, and some special API interfaces may have separate frequency limit. If exceeding the frequency limit, it will return the error information with the http return code of 429 and status as RATE_LIMIT.

 

## Use Method ##

Recommend direct use of JD Cloud SDK for access to JD Cloud OpenAPI. Please refer to the use method of SDK.

[Java](/SDK/Java/Java.md)

[Python](/SDK/Python/Python.md)

[Go](/SDK/Go/Go.md)

[Node.js](/SDK/Nodejs/Node.js.md)

[PHP](/SDK/PHP/PHP.md)

[.Net](/SDK/dotnet/.Net.md)

[C++](/SDK/cplusplus/cplusplus.md)

