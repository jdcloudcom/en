# Billing Overview
## Instance Billing Standard
The billing standards for JCHDB instances of analysis type Cloud Database are as per node number of such instances, node specification and bucket size.

## Due Instance/Arrearage Description
Retention policies for arrear or due JCHDB instance are as follows:

|Billing Type|Due Instance/Arrearage processing Logic|
|---|---|
|Monthly Package|The instance expires will be marked as expired. If database service is unavailable and no renewal is made within 7 days, such service will be deleted after the 7-day period. Meanwhile, corresponding backup file of instance will be deleted as well, with instance data unrecoverable.|
|Pay by Configuration|Any overdue instance will be marked as arrears. If database service is unavailable and no renewal is made within 7 days, such service will be deleted. Meanwhile, corresponding backup file of instance will be deleted as well, with instance data unrecoverable.|

A notification will be given after a DRDS instance expires or becomes overdue. Please pay attention to such notification and make renewal in time, for fear that data are deleted and cannot be recovered.
For details of relevant information about billing and notification, please refer to:

- [Prepaying Billing Method](../../../Finance/Billing/Billing-method/Prepay.md) 

- [Pay-As-You-Go Billing Instructions](../../../Finance/Billing/Billing-method/Postpay.md) 
