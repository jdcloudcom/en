# Price Overview

Payment Method: Paying by Consumption

Payment dimension: Conduct total charging of Notification Service used with user as the unit, making statistics by day. The period is from 00:00:00 to 23:59:59 of the same day.

Notification Service Charge=API Call Cost+Message Notification Cost

### API Call Cost:

For the cost incurred by API calling times due to the Notification Service, the unit price is RMB 2 per one million times, with the results accurate to the third decimals.

| Calling Times | Cost per One Million Times |
| -------- | ------------ |
| 1 Million Times  | RMB 2          |

Description: For calculation of API calling times, each 4k message body is counted as one API calling the one less than 4K is also counted as one request (if your message body is 256K, the API calling times=256K÷4K=64 times)

### Message notification cost:

For the cost incurred due to message notification times of the Notification Service, the unit price varies with different notification types and the results shall be exact to the third decimals.

| Billing Item   | Cost                                  |
| -------- | ------------------------------------- |
| HTTP/S   | RMB 2/1 million times                           |
| Email | RMB 2 per 1,000 Emails                            |
| SMS Push | Details of Charge of Text Message              |
| Queue Service | Notification Service push is free of charge and calling to Queue Service API will be charged |
| Function Service | Notification Service push is free of charge and calling to Function Service will be charged  |
