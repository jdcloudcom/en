# JCLOUD MONITOR API


## Introduction
monitor API


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**createAlarm**|POST|Create alarm rules, it can create alarm rules for a certain instance, or it also can create alarm rules for multiple instances at the same time.|
|**deleteAlarmsCm**|DELETE|Delete Customized Metric Monitoring Rules|
|**describeAlarmContacts**|GET|Query rule alarm contacts|
|**describeAlarmHistory**|GET|Query the alarm history</br>The priority of retrieval condition combination from high to low is </br>1. serviceCode</br>1.1 serviceCode + resourceId</br>1.2 serviceCode + resourceIds</br>2. serviceCodes</br>3. all user rules|
|**describeAlarmHistoryAllRegion**|POST|Query the alarm history</br>The priority of retrieval condition combination from high to low is </br>1. serviceCode</br>1.1 serviceCode + resourceId</br>1.2 serviceCode + resourceIds</br>2. serviceCodes</br>3. all user rules|
|**describeAlarms**|GET|Query rules, query the parameter set and priority level from high to low are: </br>1: serviceCode cannot be blank</br>1.1: serviceCode + resourceId</br>1.2: serviceCode + resourceIds</br>2: serviceCodes cannot be blank</br>3: all user rules|
|**describeAlarmsByID**|GET|Query Rule Details|
|**describeCmMetricDataByTagSpec**|GET|Query Customized Metric Monitoring Items Data|
|**describeMetricData**|GET|View multiple monitoring item data of a resource, metric introduction 1: <a href="https://docs.jdcloud.com/cn/monitoring/metrics">Metrics</a>|
|**describeMetrics**|GET|Query available monitoring item list based on the product lines, metric introduction: <a href="https://docs.jdcloud.com/cn/monitoring/metrics">Metrics</a>|
|**describeMetricsForCreateAlarm**|GET|Query metric list available to create monitoring rules based on resource type, metric introduction:<a href="https://docs.jdcloud.com/cn/monitoring/metrics">Metrics</a>|
|**disableAlarm**|POST|Disable the alarm rule. After the alarm rule is disabled, the detection of monitoring item data of the instance will be stopped.|
|**enableAlarm**|POST|Enable the alarm rule, when the alarm rule is in the status of “Disabled”, the alarm rule can be enabled by using the API.|
|**lastDownsample**|GET|View the Last Point at Certain Resource, metric introduction: <a href="https://docs.jdcloud.com/cn/monitoring/metrics">Metrics</a>|
|**putMetricData**|POST|The interface is the interface for Custom Metric Monitoring data reporting, which is convenient for you to report the time series data collected by yourself to the Cloud Monitor. Report data of different regions for domain names of different regions, refer to: <a href="https://docs.jdcloud.com/cn/monitoring/reporting-monitoring-data"> Calling Description </a> Available original data and aggregated statistical data for report. It supports reporting methods in batches. A single request contains up to 50 data points; the data size does not exceed 256k.|
|**updateAlarm**|PATCH|Modify the created alarm rules|
