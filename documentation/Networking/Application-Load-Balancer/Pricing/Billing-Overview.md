# Billing overview

The Application Load Balancer will adopt Pay By Consumption for billing and charge in combination with the following two billing items:

- Load Balancer Instance Retention Fee: Related resource cost for CPU cores, memory capacity, etc. occupied by Load Balancer instances. This portion of the cost is the underlying resource occupancy fee, which is fixed regardless of whether the Load Balancer instance forwards business traffic or not.
- Traffic cost: Cost arising from user business traffic processed through Load Balancer, which will be charged on the basis of the total outgoing and inbound business traffic actually processed by the Load Balancer. It will charge no cost if Load Balancer does not forward any business traffic.

Note:
At present, the Application Load Balancer is free of charge. From March 9, 2020 to April 8, 2020, the Application Load Balancer in all regions will be billed successively according to the actual consumption, and you will enjoy a 0 discount. The Application Load Balancer in cn-north-1 region will be billed according to the actual consumption from March 9, 2020 and the Application Load Balancer in cn-south-1, cn-east-2 and cn-east-1 regions will do the same prior to April 8, 2020. The Application Load Balancer in all regions will be officially charged on April 9, 2020.

If the Application Load Balancer is associated to an Elastic IP, the Elastic IP will be charged as a separate product. For details on billing of Elastic IP, please see [Elastic IP Pricing](https://docs.jdcloud.com/elastic-ip/billing-overview).

## Relevant references

- [Billing rules](Billing-Rules.md)
- [Price overview](Price-Overview.md)
- [Purchase Process](Purchase-Process.md)
- [Renew Process](Renew-Process.md)
