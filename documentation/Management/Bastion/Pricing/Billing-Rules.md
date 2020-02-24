# Billing Rules

The Bastion only supports the billing type of monthly package
 
## Monthly Package

The monthly package is pay-in-advance type, with a one-time fee of one month, several months or many years. It is suitable for the scenario of pre-estimation of device demand, and the cost is cheaper than Pay By Configuration.

### Examples

If you purchase the database instance for 6 months at 10:00:00 on August 2, 2017 at the unit price of RMB 108, you need to pay RMB 648=6*108 and you can use this resource till 23:59:59 on February 2, 2018.

### Description for Stopping Expired Service

* When the expiration time of your monthly package instance is earlier than or the same as the current time, the billing status of your instance will become due. Upon expiration, the instance will be stopped and unavailable for use;
* A notice will be sent to you by JD Cloud 30 days, 15 days, 7 days, 3 days and 1 day before expiration of your monthly package Virtual Machines, reminding you that your resources are close to expire. Please check it and immediately [Renew](./Renewal-Procedure.md) it;
* When your monthly package instance is expired, a notice of stopping expired resources service will be sent to you by JD Cloud. Please be sure to check the notice and immediately [Renew](./Renewal-Procedure.md) it to prevent any unnecessary loss when resources reclaim is triggered seven days after the instance is expired. For details, please refer to the expiration & arrears reminder;
* Your Bastion instance and data in the instance will be retained for 7 days from the time of stopping service. After 7 days, we will send you a notice to release your resources and the data cannot be retrieved after resources are reclaimed;
* Within 7 days after your resources are stopped, that is, before resource reclaim is not triggered, you can renew these resources. After renewal, the resources can be reused automatically.
		
		* Such notice will be pushed to you by SMS, email and intra-website message, please pay attention.
		* You may conduct relevant settings under User Center - Message Management - Message Settings Node to add message receivers, modify notice methods, etc.
