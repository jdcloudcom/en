# Description for Expiration/Arrears

Once DTS task is due or in arrears, data transmission will be stopped and will be deleted if it is not renewed within 7 days.

## Billing Method

### Monthly Package

Once the task is due, the billing status will be marked as expired and the service will be stopped. If the task is not renewed within 7 days, it will be deleted on the day following the 7-day period.

### By Configuration/Consumption

After the task is in arrears, the billing status will be marked as in arrears and the service will be stopped. If the task is still in arrears after 7 days, it will be deleted on the day following the 7-day period.

## Impact of Service Suspension

### Data Migration

- During the full synchronization phase, migration task will be stopped and cannot be restarted.
- In the incremental synchronization phase, migration task will be stopped. If data are discrete due to the reason that the source library binlog has been cleared, the task cannot be restarted.

### Data Subscription

If data are discrete due to the reason that the source library binlog has been cleared, the subscription task cannot be restarted.
