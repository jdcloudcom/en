# JCLOUD MONITOR API


## Introduction
monitor API


### Version
v1


## API
|Interface name|Request mehod|Function description|
|---|---|---|
|**batchCreateAlarms**|POST|Batch create alarm rules, it can create multiple alarm rules for several instances.|
|**batchDeleteAlarms**|DELETE|Delete alarm rules in batches|
|**batchDescribeMetricData**|GET|View multiple monitoring data of certain resource|
|**batchDisableAlarms**|POST|Disable rules by batch|
|**batchEnableAlarms**|POST|Enable rules by batch|
|**createAlarm**|POST|Create alarm rules, it can create alarm rules for a certain instance, or it also can create alarm rules for multiple instances at the same time.|
|**describeAlarmContacts**|GET|Query rule alarm contacts|
|**describeAlarmHistory**|GET|Query the alarm history</br>The priority of retrieval condition combination from high to low is </br>1. serviceCode</br>1.1 serviceCode + resourceId</br>1.2 serviceCode + resourceIds</br>2. serviceCodes</br>3. all user rules|
|**describeAlarms**|GET|Query rules, query the parameter set and priority level from high to low are: </br>1: serviceCode cannot be blank</br>1.1: serviceCode + resourceId</br>1.2: serviceCode + resourceIds</br>2: serviceCodes cannot be blank</br>3: all user rules|
|**describeAlarmsByID**|GET|Query Rule Details|
|**describeMetricData**|GET|Get statistics for the specified metric. To get more precise data points, the user can narrow or increase the specified time range.|
|**describeMetrics**|GET|Query metric list to get monitoring data list based on product type|
|**describeMetricsForCreateAlarm**|GET|Query metric list available to create monitoring rules based on resource type|
|**disableAlarm**|POST|Disable the alarm rule. After the alarm rule is disabled, the detection of monitoring item data of the instance will be stopped.|
|**enableAlarm**|POST|Enable the alarm rule, when the alarm rule is in the status of “Disabled”, the alarm rule can be enabled by using the API.|
|**lastDownsample**|GET|View the Last Point at Certain Resource|
|**putMetricData**|POST|The interface is the interface for customized metric monitoring data reporting, which is convenient for you to report the time series data collected by yourself to the Cloud Monitor. It can report original data and aggregated statistical data. It supports reporting methods in batches. A single request contains up to 50 data points; the data size does not exceed 256k.|
|**updateAlarm**|PATCH|Modify the created alarm rules|
