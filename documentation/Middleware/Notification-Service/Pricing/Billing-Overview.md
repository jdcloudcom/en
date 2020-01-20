# Billing Overview

## Billing Method

Billing Method of Notification Service: [Pay By Consumption](http://docs.jdcloud.com/en/billing/pay-as-you-go).

## Charging Items

Notification Service is charged by API calling times and message notification times.

- API calling cost is charged based on the user’s calling times of API provided by Notification Service
- Message notification cost is charged by the number of pushed messages and notifications

## Region and Availability Zone

At present, the price of Notification Service is the same among all availability zones of all regions.

## Amount Overdue/Expiry Description

- The billing cycle for Notification Service is 24 hours, which means that JD Cloud will charge the service usage for your previous natural day on the current natural day and will deduct the service charge from your JD Cloud account by bill amount. In order to ensure the availability of your services, please keep sufficient balance in your JD Cloud account;
- At present, your account balance is not enough to pay the bill amount, and the Notification Service is in arrears for more than 24 hours. JD Cloud will suspend providing service for you, that is, you can no longer operate the Notification Service Console and make API call. Meanwhile, message push will be stopped.
- If the period during which the Notification Service is in arrears exceeds the life cycle of the message, the unprocessed message data will be automatically released, and the released data will not be recovered. 
