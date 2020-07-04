# Billing Overview

## Billing Item
Billing items of the Telecom, Unicom and Mobile lines include: basic protection, elastic protection, business bandwidth, forwarding port count and protection domain count.

Billing items of the BGP line include: BGP IP count, basic protection, elastic protection, business bandwidth, forwarding port count and protection domain count.

### Basic Protection
Anti-DDoS Pro provides fixed defense capabilities, including fixed attack protection peak value (Gbps) and CC defense peak value (QPS). Monthly package.
The price of basic protection varies with the ISP lines selected. The optional ISP lines are Telecom+Unicom+CMCC's ISP line and BGP  ISP line.

### Elastic Protection
The elastic protection refers to the extended DDoS protective capability provided when the actual attack traffic exceeds the protective capability of basic protection, including the extension of the of DDoS attack protection peak value (Gbps) and the CC defense peak value (QPS).
The elastic protection can be upgraded and degraded. If the attack traffic does not exceed the protection peak value of the basic protection, no cost will be charged.

### Business Bandwidth
Refers to the consumption bandwidth of normal service in non-DDoS attack state. Unit: Mbps. By fault, 100 Mbps is gifted. You can purchase the business bandwidth extension package according to your demands.

### Port Count
The number of gifted ports supported by non-web service forwarding configuration is 60 by default, and the port extension package is available for purchase as needed

### Protection Domain Count
The number of gifted protection domains supported by web service forwarding configuration is 60 by default, and the protection domain extension package is available for purchase as needed

## Payment Method
### Pay-In-Advance
It covers IP count + basic protection + business bandwidth + port count + domain count, shall be billed yearly/monthly in a unified way and can be upgraded rather than be degraded.
### Pay-As-You-Go
The elastic protection part is charged daily according to the larger actual billing interval of the Attack Peak Value exceeding the minimum protective capability (Gbps) or CC protective capability (QPS) of the day before,
then a bill of Pay-As-You-Go will be generated.
If the attack does not exceed the defense peak value of basic protection, you will not be charged for the elastic protection.


## Renewal Rules
Monthly package renewal: extends the expiration time of Anti-DDoS Pro instance. The renewal duration can be from 1 month to 6 months, 1 year, 2 years and 3 years. Among which, Yearly Package of 100G and above is allowed to be renewed annually only.

If the renewal is made before the expiration date, the start time of the new order is the expiration date of the original order. If the renewal is made after the expiration, the start time of the new order is the day of renewal;
Batch renewal: Batch renewal for multiple Anti-DDoS Pro instances will extend the usage duration of the selected resources according to the selected renewal duration by the user.


## Arrear/Expiration Instructions
### Monthly Package
Upon an instance expires, the billing status will be marked as expired. Anti-DDoS Pro protection service will be disabled, and be back to origin directly according to the forwarding configuration. If the renewal is not made within 7 days, the instance will be deleted 7 days later, and all data configurations of the instance as well. Once deleted, the instance data cannot be recovered.
If the renewal is made within 7 days, the minimum bandwidth protective capability and elastic protective capability can be back to normal right after renewal. Before your Anti-DDoS Pro instance expires, JD Cloud will send you reminds in form of mail and text message. Please check and renew in time; when your Anti-DDoS Pro instance expires, you will receive a mail and text message to notify that your resources have expired. Be sure to view the notification and renew in time to avoid unnecessary losses.

### Pay-As-You-Go of Elastic Traffic
When the sum of the balance in your account and the coupon that can be used to pay the resources is insufficient to pay the cost of the last billing cycle (24 hours) caused by the elastic traffic and the deduction fails, your Anti-DDoS Pro instance will become overdue. If you fail to recharge the account within seven days (168 hours) after the account is in arrears, the elastic protection capability of Anti-DDoS Pro instance will be disabled, with only the basic protection capability remained.


## Related Reference

- [Billing Rules](Billing-Rules.md)
- [Price Overview](Price-Overview.md)
