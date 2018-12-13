# describeCmMetricDataByTagSpec


## Description
Query custom metric monitoring items data

## Request Method
GET

## Request Address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/cm/namespaces/{namespace}/metrics/{metric}/metricData

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**metric**|String|True| |English Identifier (id) of Monitoring Item, Name of Monitoring Item|
|**namespace**|String|True| |namespace|
|**regionId**|String|True| |Region Id|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**aggrType**|String|False| |Indicator aggregation mode, each indicator has a default aggregation mode, and the optional values include: sum,avg.max.min; how to merge the data of multiple objects (resourceId -> cluster)|
|**downSampleType**|String|False| |Indicator sampling mode, avg by default, and the optional values include: sum,avg,max,min,last; How to merge data of the same object when changing the time point granularity (1m->20m)|
|**endTime**|String|False| |Query end time of time range, UTC time, format: 2016-12- yyyy-MM-dd'T’HH:mm:ssZ (if it is null, it shall be obtained by computing startTime and timeInterval)|
|**groupBy**|Boolean|False| |Confirm to group query tags?|
|**startTime**|String|False| |Query start time of time range, UTC time, format: yyyy-MM-dd'T’HH:mm:ssZ (current time by default, if it is earlier than 30d, it will be reset to 30d)|
|**tags**|TagFilter[]|False| |Customized Tag|
|**timeInterval**|String|False| |Time interval: 1h, 6h, 12h, 1d, 3d, 7d, 14d, fixed time interval, fill in at least one of timeInterval and endTime|

### TagFilter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**key**|String|False| |Tag Key|
|**values**|String[]|False| |Tag Value|

## Return Parameter
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

## Return Code
|Return Code|Description|
|---|---|
|**200**|api DescribeMetricDataByTag Response|
