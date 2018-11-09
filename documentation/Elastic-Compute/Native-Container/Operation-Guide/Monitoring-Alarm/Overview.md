
# Monitor and Alarm Overview

Instance monitoring and alarms provide you with real-time instance monitoring management services, support different monitoring dimensions, and start collecting data after the instance is successfully created, it can be displayed graphically, which is convenient for you to grasp the usage of instance resources and running status, set different alarm rules, trigger the alarm notification when this type of condition is triggered, so that you can easily locate the fault.
Monitoring Items

JD Cloud provides the following monitoring items for the Instance:

| Monitoring Items | Definitions | Description |
| --- | --- | --- |
| CPU Use Rate | Percentage of Current Non-Idle CPUs | The higher the value is, the higher the current instance load will be |
|  Memory use rate |	Current memory usage as a percentage of total memory | If the value is higher, it indicates that the current instance memory usage is more, which is regarded as the current used memory/the total amount of memory purchased.         |
| Network in/out traffic | NIC average in/out traffic per second, in bps | Indicates the average rate of outgoing and inbound instance traffic, and monitors the traffic of the instance NIC, including the intranet and the public network. If you need to view the incoming and outgoing traffic of the EIP separately, you can view the monitoring information of associate EIP to the current instance.               |
| Disk read/write traffic | Disk average read/write traffic per second in Kbps | The amount of write/read data per second for the current instance system disk.                |


Monitoring Data Description

The monitoring data collection period is 1 minute；

The statistical period supports 1 hour, 6 hours, 12 hours, 1 day, 3 days, 7 days and 14 days by default. In addition, you can also set the statistical period, with a minimum of 1 minute and a maximum of 1 month;

The monitoring value of different statistical periods will be aggregated, for example, in the case of a 6-hour statistical period, a monitoring value is displayed on the monitoring map for 5 minutes, the monitoring value is the aggregation of the collected values in the corresponding statistical period. Currently, only the average value is supported. Recently, it will support three different types of aggregation, namely, the average, the maximum and the minimum, as well as support you to set on the page;

The monitoring data can be stored for up to 180 days. In the console, users can observe the monitoring data for 30 days. If you need to obtain monitoring data for 30 days to 180 days, please open ticket.

Others

bps stands for the number of bit transmitted per second; ps stands for per second, similar to /s;

Kbps=1024bps。
