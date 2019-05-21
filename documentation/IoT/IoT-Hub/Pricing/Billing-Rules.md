# Billing Rules

The IoT Hub Service instance is billed according to its consumption:
- Charge by data transmission, i.e. charged according to the messages sending to and received from connected devices.
  - Free Tier: The first 5 million messages in each month are free, which are mainly used for tests. The excess shall be billed as per the following differential pricing:
  - Tier 1: 0 ~ 400,000 pcs./day, RMB 4.24/day
  - Tier 2: 400,000 pcs./day ~ 6 million pcs./day, RMB 42.4/day
  - Tier 3: 6 million pcs./day ~ 300 million pcs./day, RMB 424/day
  - For over 300 million pcs./day, please contact JD Cloud
  - Note: The computing size for the above Free Tier messages shall be 0.5KB and the computing size for other messages of differential pricing shall be 2KB.
      
- Charge by device management, i.e. charged according to the disk capacity assigned by the instance.
  - Free Tier: The first 10-day active devices in each day are free, which are mainly used for tests. The excess shall be billed as per the following pricing:
  - RMB 0.008 for daily active devices/day
 
## Charge by Data Transmission

Pay By Consumption is a Pay-As-You-Go mode whose billing period is one day. The cost of the previous period is calculated and deducted hourly according to the data bulk transmitted by your device.

### Examples

If you purchased and created the IoT Hub Service instance at 10:30:00 on April 1, 2019 and the device sent/received 5 million pieces of data on the first day and sent/received 200,000 pieces of data on April 2, 2019, then RMB 4.24 was settled for the previous day at 00:00:00 on April 3, 2019; if the device sent/received 1 million pieces of data on April 3, 2019, RMB 42.4 was settled for the previous day at 00:00:00 on April 4, 2019 and so forth.


## Charge by Device Management

Pay By Consumption is a Pay-As-You-Go mode whose billing period is one day. The cost of the previous period is calculated and deducted hourly according to the connection number of your device.

### Examples
If you purchased and created the IoT Hub Service instance at 10:30:00 on April 1, 2019 and connect it to 8 devices on the first day and 20 devices on April 2, 2019, then RMB 0.008x10 = 0.08 was settled for the previous day at 00:00:00 on April 3, 2019 and so forth.
