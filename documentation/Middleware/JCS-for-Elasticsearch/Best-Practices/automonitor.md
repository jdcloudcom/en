## Suggestions for Monitoring Alarm Configuration
We provide some general alarm configuration suggestions for your reference according to our realistic experiences.

Indicator | Suggested Alarm Threshold | Description
:---: | :--- | :---
Cluster Status | An alarm is given, when the monitoring value is >=2 for 10 consecutive times (i.e., in red) | 0 means green, the cluster is in the healthiest status; 1 means yellow, the high availability of the cluster is affected, but the search results are still complete; 2 means red, the cluster is abnormal, the search can only return part of the data
Node Disk Util | An alarm is given when the maximum value is >=75 for 10 consecutive times (more than 80% prohibited) | Too high disk utilization will cause the failure of data being written normally |
| Node HeapMemory Util | An alarm is given when the maximum value is >=85 for 10 consecutive times (more than 90% prohibited) | Search performance will be affected when the value is too high
Node CPU Util | An alarm is given when the maximum value is >=95 for 10 consecutive times | If the CPU use rate is too high, it will decrease the cluster node processing capacity or even cause system breakdown
