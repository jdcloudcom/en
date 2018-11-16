# batchDescribeMetricData


## Description
View multiple monitoring data of certain resource

## Request Method
GET

## Request Address
https://monitor.jcloud.com/v1/regions/{regionId}/metricsData

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**endTime**|String|False| |Query end time of time range, UTC time, format: 2016-12- yyyy-MM-dd'T'HH:mm:ssZ (if it is blank, which shall be obtained by computing startTime and timeInterval)|
|**filters**|Filter[]|False| |Customized Tag|
|**groupBy**|Boolean|False| |Confirm to group query tags|
|**resourceId**|String|True| |Resourcesuuid|
|**serviceCode**|String|True| |Type of resource, taking values such as vm, lb, ip, database|
|**startTime**|String|False| |Query start time of time range, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ (current time by default, if it is earlier than 30d, it will be reset to 30d)|
|**tags**|TagFilter[]|False| |Customized Tag|
|**timeInterval**|String|False| |Time interval: 1h, 6h, 12h, 1d, 3d, 7d, 14d, fixed time interval, fill in at least one of timeInterval and endTime|

### TagFilter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**key**|String|False| |Tag Key|
|**values**|String[]|False| |Tag Value|
### Filter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**name**|String|False| | |
|**values**|String[]|False| | |

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
|**timestamp**|Integer| |
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
|**200**|api DescribeMetricData Response|
