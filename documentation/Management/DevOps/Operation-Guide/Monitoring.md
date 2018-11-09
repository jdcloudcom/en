# Intelligent monitoring

**Preface**

The intelligent is a set of full link monitoring system covering basic monitoring, survival monitoring, performance monitoring and business monitoring. You can have a comprehensive understanding of resources, performance, and running status through monitoring. Exception detection and multidimensional data analysis help cut loss in time, shorten exception MTTR, and ensure normal operation of services.


**Terminology definition**

- NS: it is the abbreviation of namespace, representing a monitoring object, which can be a machine, an instance, a domain name, an application and a set of system.
- Monitoring object types: basic monitoring object types are divided into host (machine), instance. After aggregation computing, the monitoring object types are fallen into app (application) and system.
- Basic monitoring: basic monitoring items refer to the monitoring items of machines, which usually includes cpu.idle, mem.free.percent, etc.
- Port monitoring: monitor the status and response time of port(s).
- Process monitoring: monitor the status and resource occupation of the process(es).
- Log monitoring: monitoring keywords, PV from the logs.
- Customized Metric Monitoring: perform customized monitoring with user’s scripts.
- Alarm ACK: refers to acknowledge alarm and be under processing. The system will record the personnel information of ACK alarm.
- Alarm repair: for alarm events that cannot return to the recovery state due to configuration changes, manually change its state to restore.
- Alarm block: for NS or alarm configuration, block email, SMS, and voice for alarm events, but the event will be recorded in the alarm history.

**Product Functions**

**Monitoring configuration**

1. Collection configuration. In addition to the basic monitoring items, the collection configuration is required for all other types of monitoring, the supported monitoring types include process monitoring, port monitoring, log monitoring and Customized Metric Monitoring.

![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide17.png)
 
2. Aggregation configuration. The aggregation configuration is divided into primary aggregation and secondary aggregation. The primary aggregation is to calculate the aggregation values within the range of application nodes; the secondary aggregation is to calculate aggregation values in the system scope on the premise of primary aggregation, and four arithmetic operations can be performed on these aggregation values.

3. Alarm configuration. Alarm rules, alarm contact groups, and alarm methods can be configured for monitoring items in the alarm configuration

 ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide18.png)

4. After the service tree is created, an alarm group is created for system operation and maintenance, system testing, and application development according to the roles in the service tree by default.

 ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide19.png)

5. Each product line and each system node can all create an on-duty group for the convenience of receiving alarm of round robin for the on duty staff.

 ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide20.png)

**Alarm management**

1. Alarm history. All events that trigger alarm rules in alarm history can be viewed, with statistics panels and lists supporting alarm history sharing and download functions.

 ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide21.png)

2. Alarm block. For the known faults and the faults in the processing, it can set block and the alarm will not be received within the block time, so as to avoid interference. The alarm will be automatically enabled after the block time ends. Support for alarm rules and single, multiple ns block alarms.

 ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide22.png)

**Data visualization**

1. Dashboard. You can configure charts that you need to view on a daily basis into a dashboard for view at any time. The dashboard supports threshold filtering, i.e., only the monitoring item data that satisfy the threshold conditions displayed so that exceptions and failures can be discovered more quickly. Currently the dashboard supports two components of trend chart and list.

 ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide23.png)

2. Trend chart. Check NS and monitoring indicators at the top of the trend chart to view the trend chart data and it supports the switching of statistical values, unit switching, as well as sharing, large graph and other functions.

 ![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide24.png)

3. Single IP chart search. When you only want to view a monitoring item for a certain IP or the IP that you want to query is not in the service tree within the scope of privilege, you can search the monitoring data of that IP through a single IP chart search. But this function only works for indicators of machines and instances.

![image](https://github.com/jdcloudcom/cn/blob/DevOps/image/DevOps/Operation-Guide25.png)
