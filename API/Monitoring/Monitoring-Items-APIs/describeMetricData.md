# describeMetricData


## Description
View a single monitoring item data of a specific resource, metric introduction: <a href="https://docs.jdcloud.com/en/monitoring/metrics">Metrics</a>, APIs can be used<a href="https://docs.jdcloud.com/en/monitoring/metrics">describeMetrics</a>: Search available metric list for product line.

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v2/regions/{regionId}/metrics/{metric}/metricData

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**metric**|String|True| |English Identifier (id) of Monitoring Item|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**aggrType**|String|False| |The aggregation method is used for aggregation on different timer shafts. For example, the same resourceId of the balance product has different dimensions such as port=80 and port=8080. The reference optional values include: sum, avg, min and max|
|**downSampleType**|String|False| |Sampling method, used for aggregating data on the time shaft dimension during the aggregation period to one point. The reference optional values include: sum (data sum during aggregation period), avg (average value), last (last value), min (minimum value) and max (maximum value)|
|**startTime**|String|False| |Start time of search time range, UTC time, format: 2016-12-11T00:00:00+0800 (please note that in url, + shall be translated to %2B. Therefore, in url, the format is 2016-12-11T00:00:00%2B0800)|
|**endTime**|String|False| |End time of search time range, UTC time, format: 2016-12-11T00:00:00+0800 (if it is null, the end time will be calculated with startTime and timeInterval) (please note that in url, + shall be translated to %2B. Therefore, in url, the format is 2016-12-11T00:00:00%2B0800)|
|**timeInterval**|String|False| |Time interval: 1h, 6h, 12h, 1d, 3d, 7d, 14d, fixed time interval, fill in at least one of timeInterval and endTime|
|**tags**|TagFilter[]|False| |Monitor dimension information of index data and select different dimensions of indicator data according to tags|
|**groupBy**|Boolean|False| |Confirm to group query tags|
|**rate**|Boolean|False| |Whether need to solve the rate|
|**serviceCode**|String|False| |Resource type values include vm, lb, ip, database. etc.<a href="https://docs.jdcloud.com/en/monitoring/api/describeservices?content=API&SOP=JDCloud">describeServices</a>: Search the list of product lines accessed to Monitoring|
|**dimension**|String|False| |Resource Dimension|
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
|**200**|api DescribeMetricData Response  |

