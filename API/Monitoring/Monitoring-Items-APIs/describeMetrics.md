# describeMetrics


## Description
Query metric list to get monitoring data list based on product type

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/metrics

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**serviceCode**|String|True||Product name: <br>vm--> virtual machine<br>disk-->cloud disk<br>ip--> public IP<br>balance-->load balancer<br>database-->MySQL Service revision<br>cdn-->JD CDN<br>redis-->redis cloud cache<br>mongodb-->mongoDB cloud cache<br>storage-->cloud storage<br>sqlserver-->cloud database sqlserver revision <br>nativecontainer-->container<br>|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**metrics**|MetricDetail[]||
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
