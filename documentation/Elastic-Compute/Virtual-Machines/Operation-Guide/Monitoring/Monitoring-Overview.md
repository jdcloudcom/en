# Monitoring and Alarm Overview
Instance monitoring and alarms provide you with real-time instance monitoring management services, which support different monitoring dimensions, and start collecting data after instance is created successfully. It can be displayed graphically, which is convenient for you to grasp the usage of instance resources and running status. At the same time, you can set different alarm rules and the alarm notification will be triggered when this type of condition is triggered, which can  locate the fault easily for you.
## Monitoring Items 
JD Cloud provides the instance with the following monitoring items:

|**Monitoring Items** | **Definition** | **Description** |
| :--- | :--- | :--- |
|   CPU Utilization      |   Percentage of Current Non-available CPU   |   If the value is higher, the current instance load is higher <br>1.  Windows instance can view CPU usage on the instance by the task manager. In the case, sorted by CPU, you can find out what program occupies the CPU resources of the server; <br>2. Linux instance can view the CPU usage by the top command. After logging in to the instance, execute the command top on the command line, and then enter shift+p on the keyboard to let top sort by CPU usage. You can view the processes that currently occupy the CPU.   |
|  Memory Utilization   |  Percentage of Current Memory Usage of Total Memory      |  The higher the value is, the more current memory usage of instance, which is the current amount of used memory/the total amount of memory purchased.           |
|   Network In/Out Traffic      |   Network Interface average in/out traffic per second, in bps    |  the average rate of instance traffic in and out, monitoring the traffic of the instance Network Interface, including intranet and the public network. If you need to view the traffic in and out of the public network separately, you can view the monitoring information of the associate EIP of the current instance.          |
|  Disk Read and Write Traffic   |  Disk average read/write traffic per second, in Kbps      |   The data amount of write/read per second for the current instance system disk.               |

## Monitoring Data Description
* Monitoring data collection period is 1 minute;
* The statistical period supports 1 hour, 6 hours, 12 hours, 1 day, 3 days, 7 days and 14 days by default. In addition, you can also set the statistical period, with the shortest 1 minute and the longest one month;
* The monitoring values of different statistical periods are aggregated corresponding. For example, in the case of a 6-hour statistical period, a monitoring value is displayed on the monitoring map for 5 minutes. The monitoring value is the aggregation of the collected values ​​in the corresponding statistical period. Currently, only the average value is supported. In the near future, we will support three different aggregation methods of average, maximum and minimum values ​​and support you to set them on the page;
* The monitoring data can be saved for up to 180 days. In the console, users can observe the monitoring data for 30 days. If you need to obtain monitoring data for 30 days-180 days, please open ticket.

## Others
* bps indicates the number of bits transmitted per second, ps is per second, the same meaning as /s;
* Kbps=1024bps。