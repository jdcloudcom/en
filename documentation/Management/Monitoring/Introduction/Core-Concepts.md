# Core Concepts
## Monitoring Category
**Monitoring Metric**  
Metric is the basic concept of the Cloud Monitor. An indicator represents a set of data points that are published to the Monitoring and sorted by time. An indicator can be thought of as a variable to be monitored, and a data point represents a value that changes over time. For example, the CPU usage of a particular VM Instance is an indicator provided by the JD Cloud VM. The data points themselves can come from any application or business activity from which you collect data.
The Cloud Service Resource sends indicators to the Monitoring. You can retrieve statistics about these data points by an ordered set of time series data.

**Statistical Data**   
Statistical Data is the Metric Data Aggregation over a specified time period. All statistical data are equipped with units of measure. Common units include seconds (time units), Bytes (bits), bits (bits), % (percentage), and secondary (counting units).

**Time Period**   
The time period is the interval length of the Monitoring Statistical Data, and each time stamp data represents the result of aggregating all the collected data within a specified time period. The minimum granularity of the time period is one Minute.

**Time Stamp**  
Each metric data point in the Monitoring must be equipped with a time stamp indicating the time of this raw data collection. The Time Stamp used in the request must be a dateTime object and contain the full date and hours, minutes, and seconds, for example: 2000-01-31 23:59:59, it is recommended that you provide Time Stamp in Beijing time (East Eight Time Zone).

**Indicator Data Aggregation**  
The Monitoring aggregates statistical data based on the length of the monitoring period that you specify when you retrieve statistical data.  
If a 1-hour monitoring period is selected, the minimum granularity is 1 minute, that is, each data point is the result of aggregating all the collected data within one minute. The minimum granularity of aggregation for different monitoring cycles is as follows:

Monitoring Cycle| Minimum Granularity
---|---
1 Hour | 1 Minute
6 Hours | 5 Minutes
12 Hours | 10 Minutes
1 Day | 20 Minutes
3 Days | 1 Hour
7 Days | 2 Hours
1 Month | 3 Hours

**Monitoring Cycle**   
Refers to the Monitoring Time period of an indicator in the Monitoring, which can be selected by: Supports up to the monitoring period of the previous month from the current day. Optional cycle range: 1 hour, 6 hours, 12 hours, 1 day, 3 days, 7 days, 14 days, optional time period.

**Monitoring Status**  
Normal: The current resource is running normally and the indicator data does not meet the alarm criteria which has been set.  
Alarm: The current Resource metric Data has reached the alarm criteria which has been set.  
Data Deficiencies: The current resource monitoring data has not been obtained yet.  
Not Set: The current resource does not set alarm rules.  
Not Enabled: The current resource has set alarm but is not enabled.

**Data Comparison**  
It means that users can compare the monitoring data of resources in any two time spans within the same time span according to business needs.

**View Dimension**  
It refers to how the monitoring data is displayed in the graph, including the two dimensions of detail and summary.  
Details: Multiple instances of the same indicator are not aggregated, and one Monitoring Item of a resource displays a piece of data.
Summary: Multiple instances of the same indicator are aggregated to display, and one Monitoring Item of a resource displays a piece of data.

**Availability**  
It refers to the number of detection results/detection result total number *100 whose status code returned by the detection point is less than 400 during the detection period.

**Response Time**  
Response time is the time from initiation of the detection to receipt of the request result. If there is a redirect during the detection, this value contains the redirect time.
## Alarm Category
**Alarm**  
Use alarm to monitor a single indicator over a specified time period and perform one or more specified actions based on how the indicator value changes relative to the threshold. According to the alarm rules you set, when the resource reaches the threshold, you will be notified by SMS or E-mail at the first time to protect your business.

**Alarm Statistical Cycle**  
The alarm system will check whether your corresponding monitoring data exceeds the alarm threshold according to this cycle. For example, if the statistical period of setting the memory usage alarm rule is 1 minute, it will check whether the memory usage exceeds the threshold every other 1 minute.

**Statistical Method**  
Statistic is the aggregation of Monitoring Item data within a specified time period. The statistical methods currently available include average, maximum, minimum, and sum.

**Average**  
The average of the monitoring data during the statistical period. The statistical result is the average of all monitoring data collected within 15 minutes, and when this average is greater than 80%, the threshold is considered to be exceeded.

**Maximum**  
The maximum of the monitoring data during the statistical period. In the monitoring data collected during the statistical period, the maximum value exceeds 80%, that is, the threshold value is exceeded.

**Minimum**  
The minimum of the monitoring data during the statistical period. In the monitoring data collected during the statistical period, the minimum value exceeds 80%, that is, the threshold value is exceeded.

**Continuous Cycle**  
Alarm after several consecutive times exceeding the threshold: The alarm is triggered after the value of the Monitoring Item for several consecutive statistical periods continues to exceed the threshold.  
For example: Set the CPU usage to exceed 80% alarm, the statistical period is 5 minutes, and the alarm will be triggered after 3 consecutive times exceeding the threshold. If the CPU usage exceeds 80% for the first time, no alarm will be sent. After 5 Minutes, the second detection CPU usage exceeds 80% and no alarm will be issued. An alarm notification is sent when the third detection is still over 80%. That is, from the first time the actual data exceeding the threshold to the final alarm rule being sent, the minimum time required to consume is the statistical period (continuous detection times -1) = 5 (3-1) = 10 minutes.
