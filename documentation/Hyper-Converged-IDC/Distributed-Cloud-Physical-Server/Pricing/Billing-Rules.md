# Billing Rules

Distributed Cloud Physical Server supports two billing methods of monthly package and pay by configuration, which can be selected on demands based on different business scenarios.

## Monthly Package Billing

Costs for months or years are paid in advance, and current purchased time period supports 1 month ~ 9 months, 1 year, 2 years, and 3 years; costs are deducted at one time when creating the instance;

- To guarantee your use rights, the monthly package Distributed Cloud Physical Server cannot support deletion operation before expiration.
- Adopt the pay-in-advance method, and the expiration time of monthly package billing order is at 23:59:59 in the Nth natural month or natural year from the date of the start time of the order;
For example: the start time of the order is January 1, 2016 at 15:00:00, the purchase duration is 1 month, and the expiration time is February 1, 2016 at 23:59:59.

#### Description of Amount Overdue at Expiration


- Before expiration of your monthly package Distributed Cloud Physical Server, JD Cloud will send you email and SMS to remind you that your resources are close to expire, please pay attention to view and renew in time; JD Cloud will provide expiration warning before your monthly package instance expires, and push expiration warning notification to you 30 days, 15 days, 7 days, 3 days and 1 day before expiration.

- After your Distributed Cloud Physical Server expires, the Distributed Cloud Physical Server Console interface will only be able to perform renewal operation, and operations such as startup, shutdown and reinstalling the system cannot be performed. Please be sure to pay attention to the notification and recharge in time to avoid unnecessary losses;

- The Distributed Cloud Physical Server will not be stopped after expiration and the data will be reserved for 7 days. After 7 days, the system will shut down the Distributed Cloud Physical Server and recover the resources, in which case, the data cannot be retrieved; for the instances released upon expiration, JD Cloud will push a server stop notification and a release notification to you when they are released.

- You can normally use it after renewal. The start date of the new cycle is the next day after the expired date of the previous cycle. For example, the last expired date is January 1, 2016, 23:59:59, and then the start time after renewal is January 2, 2016, 00:00:00.

The notices will be pushed to you by SMS, email and intra-website message, please pay attention.
You may conduct relevant settings under User Center\-Message Management\-Message Settings Node to add message receivers, change notice methods, etc.

#### Refund Description
The monthly package billing method does not support refunding.

## Pay By Configuration

Pay by configuration is a method of Pay-As-You-Go. Using this method, the user can purchase based on their demands, activate and release resources at any time, and needn’t to purchase a large amount of resources in advance. Pay by configuration is based on the actual usage duration of the instance, and the statistical time is accurate to the second.

#### Enabling Requirements

Enabling requirements: To ensure your normal use, the sum of your account balance and available coupon will be no less than consumption threshold of RMB 50 when you launch an instance billed by configuration.

#### Overdue Service Stop

- If the available balance in your account (including cash balance and available coupon) cannot pay off issued bill of the instance, the instance will be determined as overdue by the system and the billing status of your instance will be changed to overdue;

- After your Distributed Cloud Physical Server is overdue, the Console interface will only be able to perform deletion, and operations such as startup, shutdown and reinstalling the system cannot be performed. Please be sure to pay attention to the notification and recharge in time to avoid unnecessary losses;

- The Distributed Cloud Physical Server will not be stopped after expiration and the data will be reserved for 7 days. After 7 days, the system will shut down the Distributed Cloud Physical Server and recover the resources, in which case, the data cannot be retrieved; for the instances released upon expiration, JD Cloud will push a server stop notification and a release notification to you when they are released.

- The stopped paid online resources can be used normally after you make a supplementary payment for the amount overdue, and you need to manually "start" for the resources through the Console.

- If you don’t want to continue using the instance paid by configuration, please delete the instance in time.

The notices will be pushed to you by SMS, email and intra-website message, please pay attention.
You may conduct relevant settings under User Center\-Message Management\-Message Settings Node to add message receivers, change notice methods, etc.
