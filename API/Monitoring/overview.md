# Monitoring


## Introduction
Monitoring APIs, mainly comprising creation, deletion, change and review of monitoring rules and query of monitoring item data


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**createAlarm**|POST|Create alarm rules, it can create alarm rules for a certain instance, or it also can create alarm rules for multiple instances at the same time.|
|**deleteAlarms**|DELETE|Delete alarm rules already created in batches|
|**describeAlarmHistory**|GET|Query alarm history, supporting query based on alarm rule ID, resource ID and product name.|
|**describeAlarms**|GET|Query monitoring rules, supporting query based on rule status, alarm status, resource ID and product name.|
|**describeAlarmsByID**|GET|Query Rule Details|
|**describeMetricData**|GET|Get statistics for the specified metric. To get more precise data points, the user can narrow or increase the specified time range.|
|**describeMetrics**|GET|Query metric list to get monitoring data list based on product type|
|**describeMetricsForCreateAlarm**|GET|Query metric list available to create monitoring rules based on resource type|
|**disableAlarm**|POST|Disable the alarm rule. After the alarm rule is disabled, the detection of monitoring item data of the instance will be stopped.|
|**enableAlarm**|POST|Enable the alarm rule, when the alarm rule is in the status of “Disabled”, the alarm rule can be enabled by using the API.|
|**putMetricData**|POST|The API is for reporting the custom metric monitoring data, facilitating the user to report the collected time series data to the Monitoring. Original data and aggregated statistical data can be reported in batches. A single request contains up to 50 data points; the data size does not exceed 256k.|
|**updateAlarm**|PATCH|Modify alarm rules already created, support to modify alarm rules and notified contact information When the alarm rule is in the status of “Enabled” the alarm rule is allowed to be modified.|
