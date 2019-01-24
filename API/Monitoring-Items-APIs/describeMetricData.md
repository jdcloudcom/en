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
|**aggrType**|String|False| |Aggregation method, which is equal to downSampleType or avg by default, see http://opentsdb.net/docs/build/html/user_guide/query/aggregators.html?highlight=zimsum#available-aggregators for optional values|
|**downSampleType**|String|False| |Sampling method, which is equal to aggrType or avg by default, see http://opentsdb.net/docs/build/html/user_guide/query/aggregators.html?highlight=avg#available-aggregators for optional values|
|**endTime**|String|False| |Query end time of time range, UTC time, format: 2016-12- yyyy-MM-dd'T’HH:mm:ssZ (if it is blank, which shall be obtained by computing startTime and timeInterval)|
|**groupBy**|Boolean|False| |Confirm to group query tags|
|**rate**|Boolean|False| |Whether need to solve the rate|
|**resourceId**|String|True| |Uuid of Resource|
|**serviceCode**|String|True| |Type of resource, taking values such as vm, lb, ip, and database|
|**startTime**|String|False| |Query start time of time range, UTC time, format: yyyy-MM-dd'T’HH:mm:ssZ |
|**tags**|TagFilter[]|False| |Custom/Tag, at least pass one tag and tag.Values cannot be null|
|**timeInterval**|String|False| |Time interval: 1h, 6h, 12h, 1d, 3d, 7d, 14d, fixed time interval, timeInterval is 1h by default, 1h before current time|

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
