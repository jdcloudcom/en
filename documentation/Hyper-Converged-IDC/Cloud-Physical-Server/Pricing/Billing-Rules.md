# Billing rules

Cloud Physical Server supports two billing methods, namely Monthly Package and Pay By Configuration, which can be selected as required depending on different business scenarios.

## Monthly Package Billing

Costs for months or years are paid in advance, and current purchased time period supports 1 month~9 months, 1 year, 2 years, and 3 years; costs are deducted at one time when creating the instance;

- To guarantee your use rights, the monthly package Cloud Physical Server cannot support deletion action before expiration.
- Adopt the pay-in-advance method, and the expiration time of monthly package billing order is at 23:59:59 in the Nth natural month or natural year from the start time of the order;
For example: The start time of the order is January 1, 2016 at 15:00:00, the purchase duration is 1 month, and the expiration time is February 1, 2016 at 23:59:59.

## Description for Stopping Expired Service

- When the expiration time of your monthly package instance is earlier than or the same as the current time, your instance billing status will become expired. Upon expiration, the instance will be stopped and unavailable for use;

- Before expiration of your monthly package Cloud Physical Server, JD Cloud will send you email and SMS to remind you that your resources are close to expire, please pay attention to view and renew in time; JD Cloud will provide expiration early warning before your monthly package instance expires, and push expiration early warning notification to you 30 days, 15 days, 7 days, 3 days and 1 day before expiration.;

- Upon expiration of your cloud physical server, JD Cloud will send you a notification to notify you that your resources have expired. Please be sure to check the notification and renew in time to prevent unnecessary losses.

- The Distributed Cloud Physical Server will be stopped immediately upon expiration and the data will be reserved for 7 days. After 7 days, the system will recover the resources, in which case, the data cannot be retrieved; for the instances released for expiration, JD Cloud will push a server stop notification and a release notification to you when they are released.

- Within 7 days after your resources are stopped, that is, before resource recovery is not triggered, the cloud physical server console interface will only be able to perform renewal operation, and other operations such as startup, shutdown and reinstalling the system cannot be performed. After a successful renewal, the instance shall still be in "shut-down" status, and you need to manually "start" for the instance through the Console. Please be sure to check your notification.

The notices will be pushed to you by SMS, email and intra-website message, please pay attention.
You may conduct relevant settings under User Center\-Message Management\-Message Settings Node to add message receivers, change notice methods, etc.

### Refund Description

The monthly package billing method does not support refunding.

## Pay by configuration

Pay By Configuration is a billing method that you can use first and then pay the bill. Using this method, you can purchase based on your demand, enable and release resources at any time without purchasing a large quantity of resources in advance. For Pay By Configuration, the billing is depending on the actual duration of use of instance, which is accurate to seconds.<br/>

### Subscription Requirements

Subscription requirement: In order to ensure your normal use, the sum of the balance and available voucher in your account shall not be less than the consumption threshold of RMB 50 when you subscribe an instance which is billed by configuration.<br/>

### Arrearage and Service Suspension Description

- The available balance in your account (including case balance and available voucher) cannot offset the Instance bill, the system will determine that the instance is in arrears and the billing status of your instance will become in arrears.<br/>

- Your Cloud Physical Server can be continuously and normally used for 3 hours after it is in arrears. After such 3 hours, it will be stopped and then will not be billed. On the Console interface, only the Delete operation can be performed, while other operations such as Startup, Shutdown, System Installation cannot be performed. Please be sure to read the notice and top up in time to avoid unnecessary losses;<br/>

- After your Cloud Physical Server is stopped, the data will be reserved for 7 days. After such 7 days, the system will withdraw the resources and no data will be retrieved since then. For the instance released due to arrears, an out-of-service notice and release notice will be pushed to you when it is released.<br/>

- After you pay the arrears, it can be normally used, but the instance is still in the state of "Shutdown", and therefore you need to perform "Startup" operation manually on the Console. Please pay attention to the notice.<br/>

- If you do not want to continue using the instance billed by configuration, please delete it in time.<br/>

The above notices will be sent to you by SMS, email and mail. Please pay attention. You can make relevant configuration in User Center - Message Management - Message Setting Node, such as adding message receiver and modifying the notification method.<br/>
