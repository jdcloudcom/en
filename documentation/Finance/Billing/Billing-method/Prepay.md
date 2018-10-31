# Instruction on the Pay-In-Advance billing
## What is Pay-In-Advance?

Pay-In-Advance refers to a payment model that users can pay in advance for the cloud resources of fixed configuration and fixed duration and such cloud resources will be built and put into use as soon as the payment has been successfully completed.  
Usually, Pay-In-Advance refers to a purchase model based on monthly package. Users can pay the charges for a month, several months or several years at a time according to their use demand. After successful payment, cloud resources will be allocated to users until the expiry date when the user does not pay again the charges. The corresponding resources will be withdrawn.

## What will happen to the Pay-In-Advance cloud resources when they expire?
When Pay-In-Advance cloud resources expires and the user dose not pay for it again, then such cloud resources will be stopped to provide services and released.
The mechanism for handling expiry is as follows:

| Period | Mechanism for Handling |  
| :--------   | :---------  | 
| 30 days before the expiry date~1 day before the expiry date| 1. The system will separately push notifications to users for reminding that the resources will expire shortly 30, 15, 7, 3 and 1 day(s) before the expiry date; <br> 2. Notifications are pushed by mail, SMS and station letters;|   
|On the expiry date |1. The cloud resources that are not paid again on the expiry date will be stopped to provide services immediately after the expiry date. The system will push notifications to users of the service stopping due to expiry; <br>2. Notifications are pushed by mail, SMS and station letters;|  
| On the expiry date~7 days after the expiry date|1. During this period, if users pay again for the cloud resources, then the cloud resources will automatically start the provide services and users can continue to use it; <br>2. If users do not pay again for the resources during this period, the system will push the user a reminder of the imminent release of the resources on the 4th and 6th days after the expiration of the service;|
|8 days after the expiry date|1.If the user has not yet paid for the cloud resources, the system will destroy such cloud resources, and its data will be cleared which can not be restored; <br>2. After the resources are destroyed due to expiry, the users will be notified by mail, SMS, in-station mail;|

