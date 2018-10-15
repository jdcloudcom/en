# Billing Overview
## Charging Standards of Instance
The charging standards of distributed relational database DRDS instance is based on the specification of the instance, i.e., the number of CPU cores and memory size of the instance. DRDS itself does not store data, so the specification is independent of disk size

## Instance Amount Overdue at Expiration Description
The following is the retention policy for DRDS instance amount overdue or expiration.

|Billing Type|Instance Expiration/Amount Overdue Processing Logic|
|---|---|
|Monthly Package|After instance expiration, it will be tagged as expiration status, the database service will be unavailable, e.g., if there is no renewal within 7 days, it will be deleted after 7 days and the backup files corresponding to the instance will also be deleted, so the instance data cannot be recovered. |
|Pay by Configuration|After instance amount overdue, it will be tagged as amount overdue status, the database service will be unavailable, e.g., if there is no renewal within 7 days, it will be deleted and the backup files corresponding to the instance will also be deleted, so the instance data cannot be recovered. |

There will be a message reminder when DRDS instance is expired or overdue. Please note to check the information and renew in time to avoid the deletion of data.
For details of information of billing and notification, please view the details:<br>
- [Pay-In-Advance Billing Instructions](../../../Finance/Billing/Billing-method/Prepay.md) 
- [Pay-As-You-Go Billing Instructions](../../../Finance/Billing/Billing-method/Postpay.md) 
