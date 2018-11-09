# Billing Rules

The following description is only for instances. If you need to check the instance association resource billing rules, please refer to [Cloud Disk Billing Documentation](http://docs.jdcloud.com/cn/cloud-disk-service/price-overview) and [Elastic IP Billing Documentation](../../../Networking/Elastic-IP/Pricing/Billing-Overview.md). The instance of JD Cloud provides two billing methods for different business scenario requirements, namely, monthly package billing and billing by configuration.

## Monthly Package Billing

Pay in advance for several months or years. The current time periods available for purchase include 1 month to 9 months, 1 year, 2 years and 3 years, and the fee will be deducted at a time when you create the instance;

To protect your use rights, the instance under monthly package cannot be deleted before it expires.

Pay-in-advance is adopted first, and the expiration time of an order under monthly package is 23:59:59 in the Nth natural month or natural year from the date of the order start time;
For example: if the order start time is 15:00:00 on January 1, 2018, and the purchased time period is 1 month, the expiration time is 23:59:59 on February 1, 2018.

### Instructions for Service Stop Due to Expiration

* When the expiration time of your instance under monthly package is earlier than or equal to the current time, your instance billing state will be changed to expired. After the expiration, the instance services will be stopped and you cannot continue to use the instance;
* 30 days, 15 days, 7 days, 3 days and 1 day before the expiration of your Virtual Machines under monthly package, JD Cloud will respectively send you a notice reminding you that the resource is about to expire. Please pay attention to check and promptly [Renew](Renew-Process.md);
* After the expiration of your instance under monthly package, JD Cloud will send you a notice reminding you that the resource has expired. Please pay attention to the notice and promptly [Renew](Renew-Process.md) to avoid unnecessary losses caused by resource recovery made seven days after the instance expiration. For details, please refer to the expiration & arrears reminder;
* Your instance and the data in the instance will be retained for 7 days from the time when the services are stopped. 7 days later, a resource release notice will be sent to you. After the resource is recovered, the data cannot be retrieved;
* Within the 7 days when the resource is deactivated, that is, before the resource recovery is triggered, you can renew it. After the renewal, the resource will be automatically activated for use. If the instance is not restored to the running state after the renewal, please manually [Start Instance](../Operation-Guide/Instance/Start-Instance.md).
		
		* The above notices will be sent to you by SMS, email and station letter. Please pay attention.
		* You can make related settings via User Center - Message Management - Message Settings, and you can add message recipients and modify means of notification, etc.

## Example of Pay By Configuration

It is billed according to the actual usage time based on the instance type with statistical time accurate to the second. It is applicable to scenarios with large fluctuations in traffic, and resources can be enabled and released at any time.

Opening Requirements: To ensure your normal use, the sum of your account balance and available coupon will be no less than RMB 50 when you launch an instance billed by configuration.

In the pay-as-you-go mode, the bill for the previous hour will be generated according to the instance type and actual usage time and charge is then cleared.

### Instructions for Service Stop Due to Arrears
* If the available balance of your account (including cash balance, available coupons) cannot settle the issued bill of the instance, the system will determine the instance in arrears and your instance billing state will become in arrears;
* When your Virtual Machines become in arrears, the services will be stopped 24 hours after the arrears, and you will not be billed after the services are stopped;
* When your Virtual Machines become in arrears, a resource arrears notice will be sent to you. Please pay attention to check the notice and recharge it in time to avoid unnecessary losses. Please refer to the expiration & arrears reminder for details.
* Your instance and the data in the instance will be retained for 7 days from the time when the services are stopped. 7 days later, a resource release notice will be sent to you. After the resource is recovered, the data cannot be retrieved;
* When you make up the arrears, the resources will be automatically restored and the billing will be restarted. If the instance is not restored to the running state after the recharge, please manually [Start Instance](../Operation-Guide/Instance/Start-Instance.md);
* If you do not want to continue to use the instance billed by configuration, please duly [Delete Instance](../Operation-Guide/Instance/Delete-Instance.md).


## Functional Limits
Instances of different billing methods support different functions, as detailed in the following table:

Function|Billing by Configuration|Monthly Package Billing            
:---|:---|:---
Renewal|Not supported|Support<br>You can manually renew it before the instance expires or activate the automatic renewal function for the instance. Please refer to the renewal for details.
Release the instance at any time|Support. You only need to shut down the instance to release the instance. For details, please refer to instance deletion. If you no longer need this instance, please release the instance as soon as possible to avoid unnecessary charges. |Not supported. The instance is automatically released if the renewal is not made within 7 days after the instance expires.             
Resize instance|Support|Support 
Associate EIP|Support|Support    
Attach cloud disk|Support|Support 
Expand cloud disk|Support. For details, please refer to cloud disk expansion|Support. For details, please refer to cloud disk expansion.        
Convert billing method|Support conversion of billing by instances configuration to monthly package billing|Not Supported  
Create all types of instances|Support|Support   
Free use of monitoring and Load Balancer|Support|Support

## Billing Method Conversion
* An instance billed by configuration can be changed into an instance billed under monthly package through [Renew][Renew-Process.md]
* An instance billed under monthly package cannot be converted into the one billed by configuration

## Related Reference
[Cloud Disk Billing Documentation](http://docs.jdcloud.com/cn/cloud-disk-service/price-overview)

[Elastic IP Billing Documentation](../../../Networking/Elastic-IP/Pricing/Billing-Overview.md)

[Renew](Renew-Process.md)

[Start Instance](../Operation-Guide/Instance/Start-Instance.md)

[Delete Instance](../Operation-Guide/Instance/Stop-Instance.md)






 
