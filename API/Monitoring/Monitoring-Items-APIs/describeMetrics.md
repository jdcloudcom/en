# describeMetrics


## Description
Query metric list to get monitoring data list based on product type, metric reference <a href="https://docs.jdcloud.com/cn/monitoring/metrics">Metrics</a>

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/metrics


## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**serviceCode**|String|True| |Product Name: <br>vm--> Virtual Machine<br>disk-->Cloud Disk Service<br>ip--> Public IP<br>balance-->Load Balancer<br>database-->MySQL Service Version<br>cdn-->JD CDN<br>redis-->JCS for Redis<br>mongodb-->MongoDB Cloud Cache<br>storage-->Cloud Storage<br>sqlserver-->cloud Database Sqlserver Version <br>nativecontainer-->Container<br>|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**metrics**|MetricDetail[]| |
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
|**200**|get Metric list of serviceCode|
