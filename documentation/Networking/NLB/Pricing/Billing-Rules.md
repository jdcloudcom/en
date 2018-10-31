# Billing rules

Support types of NLB:
 
Billing by consumption:
 
 - Lease resource retention expense: Refer to relevant resource cost for CPU core, memory capacity, etc. distributed for creating NLB initial instance. It is the basic charge incurred even if there is no traffic.
 
 - Business flow consumption expense: Relevant cost incurred by the user for business flow of NLB processing.

## Pay by consumption

### Introduction
Billing by consumption is a Pay-As-You-Go type. The billing cycle is one day. Each NLB is charged with the resource retention cost every day, and the traffic cost is settled at the actual outbound traffic per day.
### Example
If the NLB you purchased at 10:30:00 on 2017-8-2 is charged according to the billing by consumption. Assuming the traffic is 1GB on the day, the cost for the previous day is settled at 00:00:00 on 2017-8-3: resource retention cost (currently RMB 0.0/ day) + unit price of traffic (currently RMB 0.0/ GB)*1= RMB 0.0. The period balance payment will be settled when you delete the NLB.
### Detailed description
- NLB is billed by the actual traffic, and the statistical time is accurate to the second.

- Turn-on instruction: To ensure the normal use, your account balance shall not be less than RMB 50 when the NLB billed by consumption is turned on. If the account balance is less than RMB 50, you need to recharge before use.

- The billing adopts the Pay-As-You-Go mode. There is no charge for the opening. And at the 00:00:00 of each natural day after the creation, the cost will be billed and settled according to the resources retention time and the actual traffic usage．

- When deleting NLB, it will be billed and settled according to the actual retention time and traffic usage within the billing cycle.

- NLB paid by consumption cannot be renewed