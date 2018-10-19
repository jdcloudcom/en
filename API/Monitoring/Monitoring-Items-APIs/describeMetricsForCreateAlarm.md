# describeMetricsForCreateAlarm


## Description
Query metric list available to create monitoring rules based on resource type

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/metricsForCreateAlarm


## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**serviceCode**|String|False| |Type of resource, blank by default, displaying all items<br>vm--> Virtual Machine<br>disk-->Cloud Disk Service<br>ip--> Public IP<br>balance-->Load Balancer<br>database-->MySQL Service Version<br>cdn-->JD CDN<br>redis-->JCS for Redis<br>mongodb-->MongoDB Cloud Cache<br>storage-->Cloud Storage<br>sqlserver-->cloud Database Sqlserver Version <br>nativecontainer-->Container<br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**serviceCodeList**|ServiceCodeMetrics[]| |
### ServiceCodeMetrics
|Name|Type|Description|
|---|---|---|
|**metrics**|MetricDetail[]| |
|**serviceCode**|String| |
### MetricDetail
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Computing unit of metric, such as bit/s, %, and byte|
|**downSample**|String|Sampling Frequency|
|**metric**|String|Metric|
|**metricName**|String|Metric Name|
|**serviceCode**|String|Identifier of Resource Type|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
