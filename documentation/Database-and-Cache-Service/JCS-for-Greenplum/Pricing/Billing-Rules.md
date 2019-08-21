# Billing Rules

JCS for Greenplum supports two billing types:

- Monthly Package Billing
- Pay By Configuration

## Monthly Package

The monthly package is pay-in-advance type, with a one-time fee of one month, several months or many years. It is suitable for the scenario of pre-estimation of device demand, and the cost is cheaper than pay-by-configuration billing.

### Examples

If you purchase the Greenplum instance for 6 months at 10:00:00 on August 2, 2017, with the unit price of RMB 108, you need to pay RMB 648=6*56 and you can use this resource till 23:59:59 on February 2, 2018.

## Pay by Configuration

Pay by configuration is a pay-as-you-go type whose billing period is one hour. The cost of the previous period is calculated and deducted at each hour according to the instance configuration you purchased and the actual usage time (accurate to the second) in the billing cycle.

### Examples

The hourly fee for the database instance you purchased at 10:30:00 on August 2, 2017 which is under pay-by-configuration billing, the cost of the last hour (half hour actually used) will be settled at 11:00:00 on August 2, 2017 (RMB 0.5), and the cost (RMB 1) will be settled per hour later while the balance cost of the cycle will be settled when you delete the database instance.