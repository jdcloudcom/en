
# Monitor and Alarm Overview

The monitoring and alarm will provide the real-time monitoring and management service for the Native Container Pod and the Native Container Instance, supporting different monitoring dimensions. The data will be collected once the resources are successfully created and directly displayed in the form of charts, thus you can know information as resource usage conditions and running status conveniently. At the same time, you can set different alarm rules. The alarm notification can be triggered upon meeting the triggering conditions, making fault localization easy.

**Monitoring Items**

JD Cloud provides the following monitoring options to the Native Container Pod and the Native Container Instance:

| Monitoring Items | Definitions | Description |
| --- | --- | --- |
| CPU Use Rate | Percentage of Current Non-Idle CPUs | The higher the value is, the higher the current instance load will be |
|  Memory use rate |	Current memory usage as a percentage of total memory | If the value is higher, it indicates that the current instance memory usage is more, which is regarded as the current used memory/the total amount of memory purchased.         |
| Network in/out traffic | NIC average in/out traffic per second, in bps | Indicates the average rate of outgoing and inbound instance traffic, and monitors the traffic of the instance NIC, including the intranet and the public network. If you need to view the incoming and outgoing traffic of the EIP separately, you can view the monitoring information of associate EIP to the current instance.               |
| Disk read/write traffic | Disk average read/write traffic per second in Kbps | The amount of write/read data per second for the current instance system disk.                |


**Monitoring Data Description**

The monitoring data collection period is 1 minute；

The statistical period supports 1 hour, 6 hours, 12 hours, 1 day, 3 days, 7 days and 14 days by default. In addition, you can also set the statistical period, with a minimum of 1 minute and a maximum of 1 month;

The monitoring value of different statistical periods will be aggregated, for example, in the case of a 6-hour statistical period, a monitoring value is displayed on the monitoring map for 5 minutes, the monitoring value is the aggregation of the collected values in the corresponding statistical period. Currently, only the average value is supported. Recently, it will support three different types of aggregation, namely, the average, the maximum and the minimum, as well as support you to set on the page;

The monitoring data can be stored for up to 180 days. In the console, users can observe the monitoring data for 30 days. If you need to obtain monitoring data for 30 days to 180 days, please open ticket.

**Others**

bps stands for the number of bit transmitted per second; ps stands for per second, similar to /s;

Kbps=1024bps.


**Power Status Instruction**   
Native Container Instance and Pod support setting alarm rules according to power status. Set in [Container Instance Monitoring](https://cms-console.jdcloud.com/containerMonitor),[Pod](https://cms-console.jdcloud.com/monitor/pod).  

|Native Container Instance Power Status|Corresponding Number|
|-----|-----|
|Creating|1|
|Created|2|
|Starting|3|
|Running|4|
|Stopping|5|
|Stop|6|
|Deleting|7|
|Unknown|8|
|Error|9|

|Native Container Pod Power Status|Corresponding Number|
|-----|-----|
|Creating|1|
|Created|2|
|Starting|3|
|Running|4|
|Stopping|5|
|Stop|6|
|Deleting|7|
|Unknown|8|
|Error|9|
|Succeeded|10|
|Failed|11|

