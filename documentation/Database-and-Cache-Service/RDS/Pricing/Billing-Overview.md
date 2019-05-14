# Billing Overview
## Instance Charging Standard
The charging standard for the RDS service instance is based on the types of the instance and the storage space. The charging standards vary from different instance types. See details in
- [MySQL Price Overview](./Price-Overview/MySQL-Price.md)
- [Percona Price Overview](./Price-Overview/Percona-Price.md)
- [MariaDB Price Overview](./Price-Overview/MariaDB-Price.md)
- [PostgreSQL Price Overview](./Price-Overview/PostgreSQL-Price.md)
- [SQL Server Price Overview](./Price-Overview/SQL-Server-Price.md)


## Instance Expiration/Arrear Description
The following are retention policies for arrears or expiration of RDS service instances.

|Billing Type|Instance Expiration/Arrear Handling Logic|
|---|---|
|Monthly Package|After the instance expires, it will be marked as expired and the database service will be unavailable. If the renewal is not made within 7 days, the instance will be deleted 7 days later, and all backup files of the instance as well. Once deleted, the instance data cannot be recovered. |
|Pay by Configuration|After the instance expires, it will be marked as expired and the database service will be unavailable. If the renewal is not made within 7 days, the instance will be deleted, and all backup files of the instance as well. Once deleted, the instance data cannot be recovered. |

The RDS service instance will receive a message reminder upon expiration or arrears. Please pay attention to check and renew in time to avoid the data being deleted and unable be retrieved.
See information related to billing and notification in 
- [Pay-In-Advance Billing Instructions](../../../Finance/Billing/Billing-method/Prepay.md)
- [Pay-As-You-Go Billing Instructions](../../../Finance/Billing/Billing-method/Postpay.md). 
