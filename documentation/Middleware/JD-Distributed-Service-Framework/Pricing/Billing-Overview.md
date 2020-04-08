# Billing Overview

JD Cloud & AI Distributed Service Framework (JDSF) is respectively billed for namespace, calling chain analysis services and JD Distributed Service gateway, and the price is related to the selected service specification. The billing method, pay by configuration or monthly package, will be provided depending on different user demands.

##  Billing Rules

- Pay by configuration:

	- The method is to charge the cost by actual resource consumption.
	
	- Subscription description: To ensure your normal use, your account balance shall not be less than RMB 50 when the Cloud Disk Service is subscribed in the billing method of pay by configuration. You need to recharge before use if the account balance is less than RMB 50.
	
	- Payment Mode: The pay-as-you-go mode is adopted. The bill of the previous day will be generated in the wee hours of each day by resource configuration and actual service time and the cost shall be settled.

	- For more information, please refer to: [Pay-As-You-Go Billing Instructions](../../../Finance/Billing/Billing-method/Postpay.md).

- Monthly package billing method:

	- This method refers to pay the cost of several months or years in advance. Now, the periods for purchase supported include 1~9 months, 1 year, 2 years and 3 years; costs will be deducted at one time upon creation;

	- To guarantee your use rights, resources in the monthly package do not support deletion before expiration;
	
	- For the pay-in-advance method, and the expiration time of monthly package billing order is at 23:59:59 in the Nth natural month or natural year from the date of the start time of the order;
		
	- For more information, please refer to: [Pay-In-Advance Billing Instructions](../../../Finance/Billing/Billing-method/Prepay.md).		
	
**Description**

-  The price of this product does not include the cost of using JD Cloud VMs and other IaaS layer cloud resources by a user.

-  When the client calls through the API gateway, the API gateway will be charged as per the API calling number. For specific charging rules, please refer to [Billing Instructions for API Gateway Product](../../API-Gateway/Pricing/Billing-Rules.md).

-  Configuration Management Service relies on the Registration Center, used for free.



## Renewal Rules

- Renewal of pay by configuration billing: Users are allowed to switch the billing method of pay by configuration to monthly package. For operation process, please refer to: [Renew Management](../../../Finance/Online-Buying/Renew-Management.md).

- Monthly package renewal: Extend the service time of monthly package. If any resource is renewed prior to its expiration time, the start time of the new order is the expiration time of the original one. If you complete renewal after expiration, the start time of the new order is the date of renewal.

- Batch renewal: Batch renewal is done for multiple resources, and the service time of the selected resource is expanded based on the renewal duration selected by the user.

- If it is necessary to adjust the "Automatic Renewal" method, please do so in "Renew Management". The portal is: Cost>Renew Management>JD Distributed Service Framework, then make the switch of "Automatic Renewal" in "Actions" of resource list.


<br>

## Price Overview

### Namespace Price Description
Basic Version 
| Specification Tier |  Pay By Configuration (RMB/hour) | Monthly Package (RMB/month) | 
| :- | :- | :- |
| 1-80      | 1.8 | 920 |
| 81-200    | 2.8 | 1431 | 
| 201-500   | 4.2 | 2146| 
| 501-1000  | 7.6 | 3884| 
| 1001-1500 | 9.8  | 5008 | 


### Calling Chain Analysis Service Price Description

| Specification Tier (TPS) |  Pay By Configuration (RMB/hour) | Monthly Package (RMB/month) |
| :- | :- | :- |
| 1-300     | 1.8 | 920 |
| 301-600   | 2.6 | 1329 |	
| 601-1000  | 4.8 | 2453 |	
| 1001-1500 | 5.8 | 2964 |		


#### JD Distributed Service Gateway Price Description

| Specification Tier (QPS) |  Pay By Configuration (RMB/hour) | Monthly Package (RMB/month) |
| :- | :- | :- |
| 1-1500     | 1 | 511 |
| 1501-3000   | 2 | 1022 |	


	

## Open Beta Test Description

Beta Time: From December 31, 2018 to December 30, 2019

-  All services are completely free of charge in the Beta stage.

-  JD Distributed Service gateway will be billed as per QPS specification. During Beta, QPS below 3000 is free of charge.

-  At the end of the Beta, the namespace will be bound and billed as per the price of the **Basic Version**.  


	
		
