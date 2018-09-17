# describeMetricsForCreateAlarm


## Description
Query metric list available to create monitoring rules based on resource type

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/metricsForCreateAlarm

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**serviceCode**|String|False||Type of resource, blank by default, displaying all items<br>vm--> virtual machine<br>disk-->cloud disk<br>ip--> public IP<br>balance-->load balancer<br>database-->MySQL Service revision<br>cdn-->JD CDN<br>redis-->redis cloud cache<br>mongodb-->mongoDB cloud cache<br>storage-->cloud storage<br>sqlserver-->cloud database sqlserver revision <br>nativecontainer-->container<br>|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**serviceCodeList**|[ServiceCodeMetrics[]](##ServiceCodeMetrics)||
### <a name="ServiceCodeMetrics">ServiceCodeMetrics</a>
|Name|Type|Description|
|---|---|---|
|**metrics**|[MetricDetail[]](##MetricDetail)||
|**serviceCode**|String||
### <a name="MetricDetail">MetricDetail</a>
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Computing unit of metric, such as bit/s, %, byte|
|**downSample**|String|Sampling frequency|
|**metric**|String|Metric|
|**metricName**|String|Metric name|
|**serviceCode**|String|Identifier of resource type|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
