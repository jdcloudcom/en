# describeMetrics


## Description
Query indicator list available to get monitoring data based on resource type

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/metrics

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**serviceCode**|String|True||Type of resource: <br>vm--> virtual machine<br>disk-->cloud disk<br>ip--> public IP<br>balance-->load balancer<br>database-->MySQL Service revision<br>cdn-->JD CDN<br>redis-->redis cloud cache<br>mongodb-->mongoDB cloud cache<br>storage-->cloud storage<br>sqlserver-->cloud database sqlserver revision <br>nativecontainer-->container<br>|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested identifier id|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**metrics**|[MetricDetail[]](##MetricDetail)||
### <a name="MetricDetail">MetricDetail</a>
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Computing unit of indicator, such as bit/s, %, byte|
|**downSample**|String|Sampling frequency|
|**metric**|String|English identifier of monitoring indicator|
|**metricName**|String|Name of monitoring indicator|
|**serviceCode**|String|Identifier of resource type|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
