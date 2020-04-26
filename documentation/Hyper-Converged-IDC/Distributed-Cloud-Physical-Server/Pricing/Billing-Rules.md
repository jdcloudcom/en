# Billing Rules

Distributed Cloud Physical Server supports two billing methods of monthly package and pay by configuration, which can be selected on demands based on different business scenarios.

## Monthly Package Billing

Costs for months or years are paid in advance, and current purchased time period supports 1 month ~ 9 months, 1 year, 2 years, and 3 years; costs are deducted at one time when creating the instance;

- To guarantee your use rights, the monthly package Distributed Cloud Physical Server cannot support deletion operation before expiration.
- Adopt the pay-in-advance method, and the expiration time of monthly package billing order is at 23:59:59 in the Nth natural month or natural year from the date of the start time of the order;
For example: the start time of the order is January 1, 2016 at 15:00:00, the purchase duration is 1 month, and the expiration time is February 1, 2016 at 23:59:59.

#### Description for Stopping Expired Service

- When the expiration time of your monthly package instance is earlier than or the same as the current time, your instance billing status will become expired. Upon expiration, the instance will be stopped and unavailable for use;

- Before expiration of your monthly package Distributed Cloud Physical Server, JD Cloud & AI will send you email and SMS to remind you that your resources are close to expire, please pay attention to view and renew in time; JD Cloud & AI will provide expiration warning before your monthly package instance expires, and push expiration warning notification to you 30 days, 15 days, 7 days, 3 days and 1 day before expiration.

- Upon expiration of your Distributed Cloud Physical Server, JD Cloud & AI will send you a notification to notify you that your resources have expired. Please be sure to check the notification and renew in time to prevent unnecessary losses.

- The Distributed Cloud Physical Server will be stopped immediately upon expiration and the data will be reserved for 7 days. After 7 days, the system will recover the resources, in which case, the data cannot be retrieved; for the instances released for expiration, JD Cloud & AI will push a server stop notification and a release notification to you when they are released.

- Within 7 days after your resources are stopped, that is, before resource recovery is not triggered, the cloud physical server console interface will only be able to perform renewal operation, and other operations such as startup, shutdown and reinstalling the system cannot be performed. After a successful renewal, the instance shall still be in "shut-down" status, and you need to manually "start" for the instance through the Console. Please be sure to check your notification.

The notices will be pushed to you by SMS, email and intra-website message, please pay attention.
You may conduct relevant settings under User Center\-Message Management\-Message Settings Node to add message receivers, change notice methods, etc.

#### Refund Description
The monthly package billing method does not support refunding.

## Pay By Configuration

Pay by configuration is a method of Pay-As-You-Go. Using this method, the user can purchase based on their demands, activate and release resources at any time, and needn’t to purchase a large amount of resources in advance. Pay by configuration is based on the actual usage duration of the instance, and the statistical time is accurate to the second.

#### Enabling Requirements

Enabling requirements: To ensure your normal use, the sum of your account balance and available coupon will be no less than consumption threshold of RMB 50 when you launch an instance billed by configuration.

#### Description for Service Stopping Due to Arrearage

- If the available balance in your account (including cash balance and available coupon) cannot pay off issued bill of the instance, the instance will be determined as overdue by the system and the billing status of your instance will be changed to overdue;

- You can continue to normally use your Distributed Cloud Physical Server for 3 hours after the payment is overdue. After 3 hours, the overdue service will be stopped, and no billing will be charged anymore. The Console interface will only be able to perform the deletion operation, and other operations such as startup, shutdown and reinstalling the system cannot be performed. Please be sure to pay attention to the notification and recharge in time to avoid unnecessary losses;

- After the Distributed Cloud Physical Server is stopped, the data will be reserved for 7 days. After 7 days, the system will recover the resources, in which case, the data cannot be retrieved; for the instances released for arrearage, JD Cloud & AI will push a server stop notification and a release notification to you when they are released.

- The instance can be used after you make a supplementary payment for the amount overdue, but the instance shall still be in "shut-down" status, so you need to manually "start" for the instance through the Console. Please be sure to check your notification.

- If you don’t want to continue using the instance paid by configuration, please delete the instance in time.

The notices will be pushed to you by SMS, email and intra-website message, please pay attention.
You may conduct relevant settings under User Center \- Message Management \- Message Settings Node to add message receivers, change notice methods, etc.
