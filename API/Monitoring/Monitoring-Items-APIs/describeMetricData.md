# describeMetricData


## Description
View multiple monitoring item data of a resource, metric introduction 1: <a href="https://docs.jdcloud.com/cn/monitoring/metrics">Metrics</a>

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/metrics/{metric}/metricData

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**metric**|String|True| |English Identifier (id) of Monitoring Item|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**aggrType**|String|False| |Aggregation method, which is equal to downSampleType or avg by default, reference optional values: sum, avg, last, min and max|
|**downSampleType**|String|False| |Sampling method, which is equal to aggrType or avg by default, reference optional values: sum, avg, last, min and max|
|**startTime**|String|False| |Query start time of time range, UTC time, format: yyyy-MM-dd'T’HH:mm:ssZ (current time by default, if it is earlier than 30d, it will be reset to 30d)|
|**endTime**|String|False| |Query end time of time range, UTC time, format: 2016-12- yyyy-MM-dd'T'HH:mm:ssZ (if it is blank, which shall be obtained by computing startTime and timeInterval)|
|**timeInterval**|String|False| |Time interval: 1h, 6h, 12h, 1d, 3d, 7d, 14d, fixed time interval, fill in at least one of timeInterval and endTime|
|**tags**|TagFilter[]|False| |Custom Tag|
|**groupBy**|Boolean|False| |Confirm to group query tags|
|**rate**|Boolean|False| |Whether need to solve the rate|
|**serviceCode**|String|True| |Type of resource, taking values such as vm, lb, ip, database|
|**resourceId**|String|True| |Uuid of Resource|

### TagFilter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|False| |Tag Key|
|**values**|String[]|False| |Tag Value|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**metricDatas**|MetricData[]| |
### MetricData
|Name|Type|Description|
|---|---|---|
|**data**|DataPoint[]| |
|**metric**|Metric| |
|**tags**|Tag[]| |
### Tag
|Name|Type|Description|
|---|---|---|
|**tagKey**|String| |
|**tagValue**|String| |
### Metric
|Name|Type|Description|
|---|---|---|
|**aggregator**|String| |
|**calculateUnit**|String| |
|**metric**|String| |
|**metricName**|String| |
|**period**|String| |
### DataPoint
|Name|Type|Description|
|---|---|---|
|**timestamp**|Long| |
|**value**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|api DescribeMetricData Response|
