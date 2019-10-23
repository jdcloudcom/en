# Billing Overview
## Charging Items

The IoT Hub Service is billed according to the number of messages used. The number of messages refers to the number of the messages released by the device, the messages released through Cloud API by the application and the messages transmitted to the device by the IoT communication platform, settled as per unit byte (2KB) of the message content length.

Actual message number per message entry; the message content length is measures by the unit of 2KB, and the message number is calculated by "content length per message entry/2KB" and rounded to an integer.

| Message number (unit: entry(ies)/month) | Unit price (unit: RMB/one million message entries) |
| --------------------- | -------------------------- |
| ≤1.5 million                | 0                          |
| >1.5 million               | 2.7                        |

## Region and Availability Zone

At present, IoT Hub Service is provided in cn-north-1 region only.

## Arrear Description

Grace period: 3 days, i.e., a user can continue to use the service normally within 3 days since the defaulting day. When you make the payment, you need to pay up the overdue amount and the cost of the 3 days.

Retention period: The service will be stopped since 00:00 of the fourth defaulting day. Data will be kept for 7 days since the day when the service is stopped. Service will be recovered when you pay up the overdue amount. User resources will be released if you fail to pay up the overdue amount since 00:00 of the eighth day.

## Related References

- [Billing Rules](Billing-Rules.md)
- [Price Overview](Price-Overview.md)

