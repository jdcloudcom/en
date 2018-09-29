# describeMetricData


## Description
Get statistics for the specified metric. To get more precise data points, the user can narrow or increase the specified time range.

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/metrics/{metric}/metricData

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**metric**|String|True| |Metric|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|False| |Query end time of time range, UTC time, format: 2016-12- yyyy-MM-dd'T’HH:mm:ssZ (if it is blank, which shall be obtained by computing startTime and timeInterval)|
|**resourceId**|String|True| |Uuid of Resource|
|**serviceCode**|String|True| |Type of resource, taking values such as vm, lb, ip, and database|
|**startTime**|String|False| |Query start time of time range, UTC time, format: yyyy-MM-dd'T’HH:mm:ssZ (current time by default, if it is earlier than 30d, it will be reset to 30d)|
|**tags**|TagFilter[]|False| |Custom Tag|
|**timeInterval**|String|False| |Time interval: 1h, 6h, 12h, 1d, 3d, 7d, 14d, fixed time interval, fill in at least one of timeInterval and endTime|

### TagFilter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**key**|String|True| |Tag Key|
|**values**|String[]|True| |Tag Value|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
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
### DataPoint
|Name|Type|Description|
|---|---|---|
|**timestamp**|Integer|Time Stamp|
|**value**|String|Value|
### Metric
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Computing Unit of Metric, such as bit/s, %, and k|
|**metric**|String|English Identifier of Monitoring Item|
|**metricName**|String|Name of Monitoring Item|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
