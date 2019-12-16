# JCLOUD MONITOR API


## Introduction
monitor API


### Version
v2


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**createAlarm**|POST|Create alarm rules |
|**deleteAlarms**|DELETE|Delete Rules|
|**describeAlarm**|GET|Query Rule Details|
|**describeAlarmContacts**|GET|Query rule alarm contacts|
|**describeAlarmHistory**|GET|Query Alarm History|
|**describeAlarms**|GET|Search rule list|
|**describeMetricData**|GET|View a single monitoring item data of a specific resource, metric introduction: <a href="https://docs.jdcloud.com/en/monitoring/metrics">Metrics</a>, APIs can be used<a href="https://docs.jdcloud.com/en/monitoring/metrics">describeMetrics</a>: Search available metric list for product line.|
|**describeMetrics**|GET|Query available monitoring item list based on the product lines, metric introduction: <a href="https://docs.jdcloud.com/en/monitoring/metrics">Metrics</a>|
|**describeMetricsForAlarm**|GET|Search indicator lists used for creating alarm rules, metric introduction: <a href="https://docs.jdcloud.com/en/monitoring/metrics">Metrics</a>|
|**describeProductsForAlarm**|GET|Search the product list used for creating alarm rules|
|**describeServices**|GET|Search available product line list for monitoring graph|
|**enableAlarms**|POST|Enabling and Disabling Rules|
|**lastDownsample**|GET|Aggregate a single metric data of a specific resource to one point, metric introduction: href="https://docs.jdcloud.com/en/monitoring/metrics">Metrics</a>|
|**putMetricData**|POST|The interface is the interface for Custom Metric Monitoring data reporting, which is convenient for you to report the time series data collected by yourself to the Cloud Monitor. Report data of different regions for domain names of different regions, refer to: <a href="https://docs.jdcloud.com/en/monitoring/reporting-monitoring-data"> Calling Description </a> Available original data and aggregated statistical data for report. It supports reporting methods in batches. A single request contains up to 50 data points; the data size does not exceed 256k.|
|**updateAlarm**|PUT|Modify the created alarm rules  |


