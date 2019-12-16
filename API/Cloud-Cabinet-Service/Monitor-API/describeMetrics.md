# describeMetrics


## Description
Search Available Monitoring Item List

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/metrics


## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**metrics**|Metric[]| |
### Metric
|Name|Type|Description|
|---|---|---|
|**metric**|String|English identifier of monitoring item|
|**metricName**|String|Name of Monitoring Item|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
