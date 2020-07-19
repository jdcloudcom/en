# Billing Rules

API Gateway is billed by API calling times and traffic.

### 1. Inflow and Outflow Relationship of Traffic ###

   Outflow traffic of API Gateway refers to the outflow with respect to API Gateway. For example, if the backend service is called by HTTP, the traffic from API Gateway to HTTP service and the traffic which is given by API Gateway to respond a frontend client are called as outflow traffic. Correspondence is as shown in the table below:

HTTP Type|Source|Target|Traffic Type
:---|:---|:---|:---
HTTP Request | Client, Browser, SDK | API Gateway | Inflow Traffic
HTTP Request | API Gateway | Backend Service | Outflow Traffic
HTTP Request | Backend Service | API Gateway | Inflow Traffic
HTTP Request | API Gateway | Client, Browser, SDK | Outflow Traffic


### 2. Billing Method ###
(1) Method  

API Gateway is charged by recording API calling times and outflow traffic.

(2) Free sections

One request calling to API by the client is recorded as one call. For each user, the first 1 million calls to API per month are free. But the outflow traffic is not free.

(3) Charged sections 

API calling times are billed by "10,000 times/month"; during the billing period, the calling times less than 10,000 times shall be charged by the standard of 10,000 times; and the cost shall be rounded off to the nearest two decimal places. The cost of 10,000 calling times is: RMB 0.04/10,000 times.
When the public network cost is settled by outflow traffic, it shall be settled by natural days as well. 


### 3. Cost Details ###
#### (1) Outflow traffics from API Gateway to a client, browser and SDK will be always charged. ####
#### (2) Outflow traffic for calling from API Gateway to backend HTTP will be charged by location of HTTP service, with traffic and billing method as shown in the table below: ####

HTTP Service Location|HTTP Address|Traffic Type|Traffic Billing
:---|:---|:---|:---
In JD Cloud and in the Same Region of API Service | Intranet Address | Intranet Traffic | Free
In JD Cloud and in a Region Different to That of API Service | Internet Address | Internet Traffic | Charged
In JD Cloud and in the Same Region of API Service | Internet Address | Internet Traffic | Charged
Not in JD Cloud and Internet Address | Internet Traffic | Charged

Region|Cost of Unlimited Bandwidth
:---|:---
Beijing, Shanghai, Guangzhou and Suqian | Settle outflow traffic of public network by natural days, RMB 0.80/GB


#### Note:
1. Unit for billing by consumption is: GB
2. All prices in this table are for new purchase, and prices for renewal and resizing may be different.
3. Official prices will be appropriately adjusted as the case may be. For specific price, please refer to the official website, which will not remain the valid data for a long period.
4. When it failed to deduct your API Gateway service for the previous day’s bill cost, your API Gateway service will be regarded as arrearage.
5. If the arrearage time is over 24 hours, your API calling will be stopped and a renewal notification will be given to you by an SMS/email.
6. If you recharge and pay up the arrearage within 60 days since the arrearage, the service will be automatically enabled and you have used such service continuously. If you fail to pay up the arrearage within 60 days, it is believed that you have actively given up API Gateway service. API Gateway has the right to clear your API configuration information and your data will be unrecoverable.


For more details, please refer to:

- [Pay-As-You-Go billing instructions](../../../Finance/Billing/Billing-method/Postpay.md).

- [Consumption Overview](../../../Finance/Billing/Bill/Purchases-overview.md).	

* [Billing Method Instruction](../../../Finance/Billing/Billing-rule/Pay-As-You-Go.md)


	


	

