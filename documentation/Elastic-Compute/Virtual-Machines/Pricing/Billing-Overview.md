# Billing Overview

You can directly use the [Virtual Machine Price Calculator] provided by JD Cloud (https://www.jdcloud.com/calculator/calHost) to check the price of the product portfolio you need, or you can check the [Price Overview](Price.md) for the estimation of the input cost.

Please note: The price in the price overview is the unified official price excluding the user's discounts. To ensure the price accuracy, it is recommended that you log in and use the virtual machine price calculator or log in the virtual machine creation page at the console to view the configuration price.

## Billing Method
Three billing methods are involved for related resources of the virtual machine: [Monthly Package Billing](../../../documentation/Finance/Billing/Billing-rule/Subscription.md), [Billing by Configuration](../../../Finance/Billing/Billing-rule/Pay-As-You-Go.md) and [Billing by Consumption](../../../Finance/Billing/Billing-rule/Pay-As-You-Go.md).

## Billing Resources
### Instance

The instance is billed according to the number of vCPU cores and memory capacity corresponding to the type of your purchased instance. The billing methods include monthly package billing and billing by configuration.
### Cloud Disk

The cloud disk is billed according to your purchased capacity. The billing methods include monthly package billing and billing by configuration. The cloud disk created along with the virtual machine has the same billing method as the instance. To ensure a consistent life cycle, you are advised to renew the instance along with its attached cloud disk. For details, please refer to [Cloud Disk Billing Documentation]()

### Elastic IP

Elastic IP (EIP for short) is billed based on the fixed bandwidth selected or the actual traffic use. The EIP billed as per the fixed bandwidth supports monthly package billing and billing by configuration and the EIP billed as per actual traffic consumption only supports billing by consumption. For details, see [Elastic IP Billing Documentation](../../../Networking/Elastic-IP/Pricing/Billing-Overview.md)

* If EIP billed as per fixed bandwidth is associated to the instance, to ensure the same life cycle, it is recommended that you renew the instance and its associated EIP billed as per fixed bandwidth at the same time;
* If EIP billed as per traffic consumption is associated to the instance, you need to pay attention to your balance and remaining coupons to prevent EIP advance release caused by the arrears from affecting the normal operation of your business.

## Related Reference
[Virtual Machine Price Calculator](https://www.jdcloud.com/calculator/calHost)

[Price Overview](Price.md)

[Monthly Package Billing](../../../documentation/Finance/Billing/Billing-rule/Subscription.md)

[Billing by Configuration](../../../Finance/Billing/Billing-rule/Pay-As-You-Go.md)

[Billing by Consumption](../../../Finance/Billing/Billing-rule/Pay-As-You-Go.md)

[Cloud Disk Billing Documentation]()

[Elastic IP Billing Documentation](../../../Networking/Elastic-IP/Pricing/Renew-Process.md)




 
