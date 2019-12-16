# lastDownsample


## Description
Aggregate metric data to one point with different aggregation methods. downAggrType: last (last point), max (maximum value), min (minimum value), avg (average value) and sum (summation). Return value of this API is the original value reported to metric, which is not subject to unit conversion. metric introduction: <a href="https://docs.jdcloud.com/en/monitoring/metrics">Metrics</a>

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v2/regions/{regionId}/metrics/{metric}/lastDownsample

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**metric**|String|True| |English Identifier (id) of Monitoring Item|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**serviceCode**|String|True| |Resource type values include vm, lb, ip, database, etc. Please search available serviceCode with the describeServices APIs|
|**dimension**|String|False| |For available resource dimension under serviceCode, please search with the describeServices APIs|
|**resourceId**|String|True| |Resource uuid, supporting batch search of multiple resourceIds, separating two ids with the mark "\|". e.g.: id1|id2|id3|id4|
|**tags**|TagFilter[]|False| |Customized Tag|
|**startTime**|String|False| |Start time of search time range, UTC time, format: 2016-12-11T00:00:00+0800 (in case of earlier than 30d, such time will be reset as 30d) (please note that in url, + shall be translated to %2B. Therefore, in url, the format is 2016-12-11T00:00:00%2B0800)|
|**endTime**|String|False| |End time of search time range, UTC time, format: 2016-12-11T00:00:00+0800 (if it is null, the end time will be calculated with startTime and timeInterval) (please note that in url, + shall be translated to %2B. Therefore, in url, the format is 2016-12-11T00:00:00%2B0800)|
|**timeInterval**|String|False| |Query time interval, maximum 30 days, supporting minute level, hour level and day level, such as 1m, 1h and 1d|
|**aggrType**|String|False| |Aggregation method: max avg min and so on, used for aggregation with different dimensions|
|**downAggrType**|String|False| |Aggregation method: max avg min and so on, an aggregation method used for aggregating data of a period within the dimensions to a point, default: last|

### TagFilter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|False| |Tag Key|
|**values**|String[]|False| |Tag Value|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifierid|

### Result
|Name|Type|Description|
|---|---|---|
|**items**|LastDownsampleRespItem[]| |
### LastDownsampleRespItem
|Name|Type|Description|
|---|---|---|
|**metric**|String| |
|**name**|String| |
|**tags**|Object| |
|**value**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|View the Last Point at Certain Resource |



