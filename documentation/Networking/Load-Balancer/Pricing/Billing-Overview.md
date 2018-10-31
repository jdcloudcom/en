# Billing overview
## Charging items

The load balancer (LB) product is paid by consumption. Namely, the expense is charged for the combination of least resource instance retaining expense and the actual business consumption expense;

- Lease resource instance retaining charge: Refer to relevant resource cost for CPU core, memory capacity, etc. distributed for creating LB initial instance. The infrastructure charge will be collected from the user even if there is no traffic.
- Business flow consumption expense: Relevant cost incurred by the user for business flow of LB processing.

Relevant elastic IP cost related to LB and cross-region traffic charge will be independently charged:

- Elastic IP costs: If the elastic IP is associated with LB, relevant cost of elastic IP will be independently collected.
- Trans-region traffic charge: If any cross-region traffic is incurred during the service utilization process of LB, the trans-region traffic charge will be independently charged again.

## Region and availability zone

At present, the instance price is the same all availability zones of all regions.

## Amount overdue/Expiry description

### Pay by consumption
When the instance is overdue, the billing status will be marked as the overdue status and the load balancer service will be unavailable. If the overdue status lasts for 7 days, the instance will be deleted and such instance and its relevant configuration will be lost and unrecoverable.

## Relevant references

- [Billing rules](Billing-Rules.md)
- [Price overview](Price-Overview.md)
