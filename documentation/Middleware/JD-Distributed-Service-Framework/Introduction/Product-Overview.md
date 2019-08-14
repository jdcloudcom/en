
# Product Overview

JD Cloud Distributed Service Framework (hereinafter referred to as JDSF) is a hosted service governance framework, which can provide all-round functions of service deployment, registration, discovery, call, monitoring, and others around the whole life cycle of the JD Distributed Service, facilitating implementation by users of JD Distributed Service Applications such as Spring Cloud and Dubbo. With the native Spring Cloud package, Registration Center, Configuration Center and Calling Chain Analysis Service of JD Distributed Service Framework can be accessed; relied on JD Cloud's infrastructures featured by multiple data centers with high speed network connection in the same city, all components of the product all are capable of high availability, so that users will no longer worry about service interruption due to lightning strikes, cable digging and other exceptions.


##### Description: 
The product is in Beta period and free in the period. The Beta version is the formal stable service version, so users need not to worry about its stability and security. Please take easy to try it. After Beta period, the product will be charged by instance types, and you need not to enable a new service or switch your services.


## Common Operation


	
- Registration Center Management
	- [Create Registration Center](../Operation-Guide/Cluster/Create-Cluster.md)
	- [Delete Registration Center](../Operation-Guide/Cluster/Delete-Cluster.md)
	- [Scaling](../Operation-Guide/Cluster/Expansion-Cluster.md)
- Service Management
	- [Service management list](../Operation-Guide/Service-List/Service-List.md)	
	- [Instance Management List](../Operation-Guide/Service-List/Instance-List.md)	
- Calling Chain Analysis Service
	- [Create Analysis Service](../Operation-Guide/Analysis-Service/Create-Analysis-Service.md)
	- [Delete Analysis Service](../Operation-Guide/Analysis-Service/del-Analysis-Service.md)
	- [Modify Service](../Operation-Guide/Analysis-Service/Update-Analysis-Service.md)



## Billing
JD Distributed Service Framework is charged for Registration Center and Calling Chain Analysis Service, and the price is subject to the selected service instance type. Configuration Management Service relies on the Registration Center, used for free. At present, the product is in the Beta stage, and all services are completely free of charge.

For details, refer to: [Billing Instructions](../Pricing/Billing-Overview.md)


## List of Supported Regions and Availability Zones
|Region|Region Indication|Availability Zone|Availability Zone Indication|
|---|---|---|---|
|cn-north-1|cn-north-1|Availability Zone A|cn-north-1a|
|cn-north-1|cn-north-1|Availability Zone B|cn-north-1b|
|cn-north-1|cn-north-1|Availability Zone C|cn-north-1c|
|cn-east-2|cn-east-2|Availability Zone A|cn-east-2a|
|cn-east-2|cn-east-2|Availability Zone B|cn-east-2b|
|cn-east-2|cn-east-2|Availability Zone C|cn-east-2c|
