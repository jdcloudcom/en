# describeMetrics


## Description
Query metric list to get monitoring data list based on product type, metric reference <a href="https://docs.jdcloud.com/cn/monitoring/metrics">Metrics</a>

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v1/metrics


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**serviceCode**|String|True| |Type of resource, taking values such as vm, lb, ip, database|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

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
|**metricName**|String|Name of Monitoring Item|
|**serviceCode**|String|Identifier of Resource Type|

## Return Code
|Return Code|Description|
|---|---|
|**200**|get Metric list of serviceCode|
