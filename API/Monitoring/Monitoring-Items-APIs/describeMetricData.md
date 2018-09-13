# describeMetricData


## Description
View certain resource monitoring data, which needs to designate the monitoring indicator and the time range.

## Request method
GET

## Request address
https://monitor.jdcloud-api.com/v1/regions/{regionId}/metrics/{metric}/metricData

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**metric**|String|True||English identifier (id) of monitoring item|
|**regionId**|String|True||Region Id|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**endTime**|String|False||Query end time of time range, UTC time, format: 2016-12- yyyy-MM-dd'T’HH:mm:ssZ (if it is blank, which shall be obtained by computing startTime and timeInterval)|
|**resourceId**|String|True||uuid of resource|
|**serviceCode**|String|True||Type of resource, taking values such as vm, lb, ip, database|
|**startTime**|String|False||Query start time of time range, UTC time, format: yyyy-MM-dd'T’HH:mm:ssZ (current time by default, if it is earlier than 30d, it will be reset to 30d)|
|**tags**|[TagFilter[]](##TagFilter)|False||Customized tag|
|**timeInterval**|String|False||Time interval: 1h, 6h, 12h, 1d, 3d, 7d, 14d, fixed time interval, fill in at least one of timeInterval and endTime|

### <a name="TagFilter">TagFilter</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**key**|String|True||Tag key|
|**values**|String[]|True||Tag value|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested identifier id|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**metricDatas**|[MetricData[]](##MetricData)||
### <a name="MetricData">MetricData</a>
|Name|Type|Description|
|---|---|---|
|**data**|[DataPoint[]](##DataPoint)||
|**metric**|[Metric](##Metric)||
### <a name="DataPoint">DataPoint</a>
|Name|Type|Description|
|---|---|---|
|**timestamp**|Integer|Time stamp|
|**value**|String|Value|
### <a name="Metric">Metric</a>
|Name|Type|Description|
|---|---|---|
|**calculateUnit**|String|Computing unit of indicator, such as bit/s, %, k|
|**metric**|String|English identifier of monitoring item|
|**metricName**|String|Name of monitoring item|

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
