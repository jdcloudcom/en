# Billing Rules

The JCS for MongoDB supports two types of billing:
- Monthly Package
- Pay By Configuration
 
## Monthly Package

The monthly package employs the mode of Pay-In-Advance, with the one-time payment for one month, several months or several years. It is applicable to the scenario of estimating the equipment demand in advance, and the price is lower than the billing pay by configuration.

### Example

You can purchase a 6-month database instance at 2017-8-2 10:00:00, the monthly unit price is RMB 108, then you need to pay RMB 648=6*56, and you can use this resource to 2018-2-2 23:59:59.

## Pay By Configuration

The configuration employs the mode of Pay-As-You-Go, the billing period is one hour. According to the configuration of the instance you purchased and the actual usage time (accurate to the second) in the billing cycle, the cost of the previous period is calculated on every hour and deducted.

### Example
For the database instance that you purchased at 2017-8-2 10:30:00, the hourly fee is RMB 1, and it should be settled at 2017-8-2 11:00:00 for the last one hour (the actual use of half) at the price of RMB 0.5. The fee for subsequent time will be settled on every hour (RMB 1), the balance payment will be settled when you delete the database instance.
