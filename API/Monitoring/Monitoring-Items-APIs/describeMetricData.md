# describeMetricData


## Description
View multiple monitoring item data of a resource, metric introduction 1: <a href="https://docs.jdcloud.com/cn/monitoring/metrics">Metrics</a>

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/metrics/{metric}/metricData

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**metric**|String|True| |English Identifier (id) of Monitoring Item|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**aggrType**|String|False| |Indicator aggregation mode, each indicator has a default aggregation mode, and the optional values include: sum,avg.max.min|
|**endTime**|String|False| |Query end time of time range, UTC time, format: 2016-12- yyyy-MM-dd'T’HH:mm:ssZ (if it is blank, which shall be obtained by computing startTime and timeInterval)|
|**groupBy**|Boolean|False| |Confirm to group query tags|
|**resourceId**|String|True| |Uuid of Resource|
|**serviceCode**|String|True| |Type of resource, taking values such as vm, lb, ip, and database|
|**startTime**|String|False| |Query start time of time range, UTC time, format: yyyy-MM-dd'T’HH:mm:ssZ (current time by default, if it is earlier than 30d, it will be reset to 30d)|
|**tags**|TagFilter[]|False| |Custom Tag|
|**timeInterval**|String|False| |Time interval: 1h, 6h, 12h, 1d, 3d, 7d, 14d, fixed time interval, fill in at least one of timeInterval and endTime|

### TagFilter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**key**|String|False| |Tag Key|
|**values**|String[]|False| |Tag Value|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

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
### DataPoint
|Name|Type|Description|
|---|---|---|
|**timestamp**|Long| |
|**value**|Object| |
### Metric
|Name|Type|Description|
|---|---|---|
|**aggregator**|String| |
|**calculateUnit**|String| |
|**metric**|String| |
|**metricName**|String| |
|**period**|String| |
### Tag
|Name|Type|Description|
|---|---|---|
|**tagKey**|String| |
|**tagValue**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|api DescribeMetricData Response|
