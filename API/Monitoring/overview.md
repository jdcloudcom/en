# Cloud Monitor


## Introduction
Cloud Monitor APIs, mainly comprising create, read, update, delete of monitoring rules and query of monitoring item data


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**createAlarm**|POST|Create alarm rules, it can create alarm rules for a certain instance, or it also can create alarm rules for multiple instances at the same time.|
|**deleteAlarms**|DELETE|Delete alarm rules already created in batches|
|**describeAlarmHistory**|GET|Query alarm history, supporting query based on alarm rule ID, resource ID and product name.|
|**describeAlarms**|GET|Query monitoring rules, supporting query based on rule status, alarm status, resource ID and product name.|
|**describeAlarmsByID**|GET|Query rule details|
|**describeMetricData**|GET|View certain resource monitoring data, which needs to designate the monitoring indicator and the time range.|
|**describeMetrics**|GET|Query indicator list available to get monitoring data based on resource type|
|**describeMetricsForCreateAlarm**|GET|Query indicator list available to create monitoring rules based on resource type|
|**disableAlarm**|POST|Disable the alarm rule. After the alarm rule is disabled, the detection of monitoring item data of the instance will be stopped.|
|**enableAlarm**|POST|Enable the alarm rule, when the alarm rule is in the status of “Disabled”, the alarm rule can be enabled by using the interface.|
|**putMetricData**|POST|The interface is the interface for customized metric monitoring data reporting, which is convenient for you to report the time series data collected by yourself to the Cloud Monitor. It can report original data and aggregated statistical data. It supports reporting methods in batches. A single request contains up to 50 data points; the data size does not exceed 256k.|
|**updateAlarm**|PATCH|Modify alarm rules already created, support to modify alarm rules and notified contact information When the alarm rule is in the status of “Enabled” the alarm rule is allowed to be modified.|
