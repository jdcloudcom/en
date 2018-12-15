# Billing Rules

The Elastic IP supports three types of billing types:
 * Monthly package billing
 * Billing by configuration
 * Billing by consumption

## Monthly Package

### Introduction
The monthly package is Pay-In-Advance type, with a one-time fee of one month, several months or many years. It is suitable for the scenario of pre-estimation of Elastic IP bandwidth demand, and the cost is cheaper than billing by configuration.
### Example
If the users purchase 1M of 1 month bandwidth BGP Elastic IP at 10:00:00 on 2017-8-2 whose monthly unit price is ¥ 23, the users need to pay ¥ 23=23*1, and then the users can use this resources before 2017-9-2 23:59:59.
### Details
- Costs for months or years are paid in advance, and current purchased time period supports 1 month~9 months, 1 year, 2 years, and 3 years; costs are deducted at one time when creating the resources;

- The resources of the monthly package do not support deletion before it expires. To guarantee the users' use rights, please confirm the business needs and then purchase.

- The expiration time of monthly package billing order is 23:59:59 in the nth natural month or natural year from the start time of the order;
For example, the start time is 15:00:00 on January 1, 2016, and the duration time is 1 month. The expiration time shall be 23:59:59 on February 1, 2016.

## Pay by Configuration

### Introduction
Pay by configuration is a Pay-As-the users-Go type whose billing period is one hour. The cost of the previous period is calculated and deducted at each hour according to the Elastic IP configuration the users purchased and the actual usage time (accurate to the second) in the billing cycle.
### Example
The fee (¥ 0.06*0.5=0.03) of BGP Elastic IP the users purchased at 10:30:00 on 2017-8-2 which is charged according to the billing by configuration with a bandwidth of 1M and whose cost per hour is ¥ 0.06/hour for the last hour (half hour actually used) will be settled at 11:00:00 on 2017-8-2, and the cost (¥ 0.06) will be settled per hour later while the balance cost of the cycle will be settled when the users delete the Elastic IP.
### Details
- Billing by the actual purchase configuration of the resources whose statistical time is accurate to the second is suitable for scenarios with large fluctuations in business volume;

- Enabling instruction: To ensure the users' normal use, the users' account balance shall not be less than ¥ 50 when billing by configuration for resources is enabled. the users need to recharge before use if the account balance is less than ¥ 50

- Paying mode: Adopting the Pay-As-the users-Go mode, the bill will be generated in the wee hours by resources configuration and actual use duration and the cost shall be settled.

## Pay by Consumption

### Introduction
Billing by consumption is a Pay-As-the users-Go type whose billing cycle is one day. Each Elastic IP is charged with the retention cost every day, and the traffic cost is settled at the actual outbound traffic per day.
### Example
The BGP Elastic IP the users purchased at 10:30:00 on 2017-8-2 is charged according to the billing by consumption. Assuming the traffic is 1GB on the day, the cost for the previous day is settled at 00:00:00 on 2017-8-3 (¥ 0.48+0.8*1=1.28).The period balance payment will be settled when the users delete the Elastic IP.
### Details
- Billing by the actual traffic usage of the EIP, the statistical time is accurate to the second, suitable for scenarios with large fluctuations in public network business in a single day;

- Enabling instruction: To ensure the users' normal use, the users' account balance shall not be less than ¥ 50 when billing by consumption for EIP is enabled. The users need to recharge before use if the account balance is less than ¥ 50

- The billing adopts the Pay-As-the users-Go mode. There is no charge for the enabling. And at the 00:00:00 of each natural day after the creation, the cost will be billed and settled according to the resources retention time and the actual traffic usage．

- When deleting EIP, bill and settle costs according to the actual retention time and traffic usage within the billing cycle.

- Billing by consumption EIP does not support renewal.
