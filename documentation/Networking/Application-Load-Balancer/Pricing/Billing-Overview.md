# Billing overview

Since January 7, 2020, billing method for Application Load Balancer will change from Pay By Configuration to Pay By Consumption. Billing method for Application Load Balancer created before such modification will still be Pay By Configuration, while the billing method for Application Load Balancer created thereafter will be Pay By Consumption. At present, no matter what kind of billing method is adopted, the products of Application Load Balancer are temporarily for free, without any charge.

At the time of subsequent formal charging, all Application Load Balancer will adopt Pay By Consumption for billing and charge in combination with the following two billing items:

- Lease Load Balancer instance retention expense: Related resource cost for CPU core, memory capacity, etc. occupied by Load Balancer instances. This portion of the cost is the underlying resource occupancy fee, which is fixed regardless of whether the Load Balancer instance forwards business traffic or not.
- Traffic cost: Cost arising from user business traffic processed through Load Balancer, which will be charged on the basis of the total outgoing and inbound business traffic actually processed by the Load Balancer. It will charge no cost if Load Balancer does not forward any business traffic.

If the Application Load Balancer is associated to an Elastic IP, the Elastic IP will be charged as a separate product. For details on billing of Elastic IP, please see [Elastic IP Pricing](https://docs.jdcloud.com/elastic-ip/billing-overview).

## Relevant references

- [Billing rules](Billing-Rules.md)
- [Price overview](Price-Overview.md)
- [Purchase Process](Purchase-Process.md)
- [Renew Process](Renew-Process.md)
