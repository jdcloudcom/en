# Billing Overview

JD Cloud Distributed Service Framework (JDSF) is respectively billed for namespace, calling chain analysis services and JD Distributed Service gateway, and the price is related to the selected service specification.

**Description**

-  The price of this product does not include the cost of using JD Cloud VMs and other IaaS layer cloud resources by a user.

-  When the client calls through the API gateway, the API gateway will be charged as per the API calling number. For specific charging rules, please refer to billing instructions for API gateway product.

-  Configuration Management Service relies on the Registration Center, used for free.

-  JD Distributed Service Gateway is billed as per QPS specifications.

-  The beta version is the single instance mode of registration center and does not support expansion and high availability.


#### Namespace Price Description

| Specification Tier |  Beta Version Unit Price (RMB/hour) | Basic Version Unit Price (RMB/hour) |
| :- | :- | :- |
| 1-50 (Beta Version) |  0.7 | Not Support |
| 1-80      | Not Support | 1.8 |
| 81-200    | Not Support | 2.8 |
| 201-500   | Not Support | 4.2 |
| 501-1000  | Not Support | 7.6 |
| 1001-1500 | Not Support | 9.8 |


#### Calling Chain Analysis Service Price Description

| Specification Tier (TPS) |  Unit Price (RMB/hour) |
| :- | :- |
| 1-200 (Beta Version) | 1 |
| 1-300     | 1.8 |
| 301-600   | 2.6 |	
| 601-1000  | 4.8 |	
| 1001-1500 | 5.8 |		



#### JD Distributed Service Gateway Price Description

| Specification Tier (QPS) |  Unit Price (RMB/hour) |
| :- | :- |
| 1-500 (Beta Version) | 0.7 |
| 1-1500     | 1.6 |
| 1501-3000   | 2.6 |	


	

## Open Beta Test Description

Beta Time: From December 31, 2018 to December 30, 2019

-  All services are completely free of charge in the Beta stage.

-  JD Distributed Service gateway will be billed as per QPS specification. During Beta, QPS below 3000 is free of charge.

-  At the end of the Beta, the namespace will be bound and billed as per the price of the **Basic Version**.  


## Billing Instructions to Pay-In-Advance/Pay-As-You-Go

Please refer to:

* [Pay-In-Advance Billing Instructions](../../../Finance/Billing/Billing-method/Prepay.md).		
* [Pay-As-You-Go Billing Instructions](../../../Finance/Billing/Billing-method/Postpay.md).			
		
