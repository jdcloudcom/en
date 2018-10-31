# Billing Overview

You can directly use the [Virtual Machines Price Calculator] provided by JD Cloud (https://www.jdcloud.com/calculator/calHost) to check the price of the product portfolio you need, or you can check the [Price Overview](Price-Overview.md) for the estimation of the input cost.

Please note: The price in the price overview is the unified official price excluding the user's discounts. To ensure the price accuracy, it is recommended that you log in and use the Virtual Machines price calculator or log in the Virtual Machines creation page at the console to view the configuration price.

## Billing Method
Three billing methods are involved for related resources of the Virtual Machines: [Monthly Package Billing](http://docs.jdcloud.com/cn/billing/subscription), [Billing by Configuration](http://docs.jdcloud.com/cn/billing/pay-as-you-go) and [Billing by Consumption](http://docs.jdcloud.com/cn/billing/pay-as-you-go).

## Billing Resources
### Instance

The instance is billed according to the number of vCPU cores and memory capacity corresponding to the type of your purchased instance. The billing methods include monthly package billing and billing by configuration.
### Cloud Disk

The cloud disk is billed according to your purchased capacity. The billing methods include monthly package billing and billing by configuration. The cloud disk created along with the Virtual Machines has the same billing method as the instance. To ensure a consistent life cycle, you are advised to renew the instance along with its attached cloud disk. For details, please refer to [Cloud Disk Billing Documentation](http://docs.jdcloud.com/cn/cloud-disk-service/billing-rules)

### Elastic IP

Elastic IP (EIP for short) is billed based on the fixed bandwidth selected or the actual traffic use. The EIP billed as per the fixed bandwidth supports monthly package billing and billing by configuration and the EIP billed as per actual traffic consumption only supports billing by consumption. For details, see [Elastic IP Billing Documentation](../../../Networking/Elastic-IP/Pricing/Billing-Overview.md)

* If EIP billed by fixed bandwidth is associated to the instance, to ensure the same life cycle, it is recommended that you renew the instance and its associated EIP billed by fixed bandwidth at the same time;
* If EIP billed as per traffic consumption is associated to the instance, you need to pay attention to your balance and remaining coupons to prevent EIP advance release caused by the arrears from affecting the normal operation of your business.

## Related Reference
[Virtual Machines Price Calculator](https://www.jdcloud.com/calculator/calHost)

[Price Overview](Price-Overview.md)

[Monthly Package Billing](http://docs.jdcloud.com/cn/billing/subscription)

[Billing by Configuration](http://docs.jdcloud.com/cn/billing/pay-as-you-go)

[Billing by Consumption](http://docs.jdcloud.com/cn/billing/pay-as-you-go)

[Cloud Disk Billing Documentation](http://docs.jdcloud.com/cn/cloud-disk-service/billing-rules)

[Elastic IP Billing Documentation](../../../Networking/Elastic-IP/Pricing/Billing-Overview.md)




 
