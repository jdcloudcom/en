# Billing overview
## Charging item

NLB product is paid by consumption. Namely, the expense is charged for the combination of least resource instance retention expense and the actual business consumption expense：

- Lease resource instance retention expense: Refer to relevant resource cost for CPU core, memory capacity, etc. distributed for creating NLB initial instance. It is the infrastructure charge incurred even if there is no traffic.
- Business flow consumption expense: Relevant cost incurred by the user for business flow of NLB processing.

Relevant Elastic IP cost related to NLB and cross-region traffic charge, which will be independently charged:

- EIP costs: If the Elastic IP is associated with NLB, relevant EIP cost will be independently charged.
- Cross-region traffic charge: If any cross-region traffic is incurred during the service utilization process of NLB, the cross-region traffic charge will be independently charged.

## Region and availability zone

At present, the instance price is the same all availability zones of all regions.

## Amount overdue/Expiry description

### Pay by consumption
When the instance is overdue, the billing status will be marked as the overdue status and the network load balancer service will be unavailable. If the overdue status lasts for 7 days, the instance will be deleted and such instance and its relevant configuration will be lost and unrecoverable.

## Relevant References

- [Billing rules](Billing-Rules.md)
- [Price overview](Price-Overview.md)
