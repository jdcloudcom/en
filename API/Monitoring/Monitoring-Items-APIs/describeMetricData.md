# describeMetricData


## 描述
Get statistics for the specified metric. To get more precise data points, the user can narrow or increase the specified time range.

## 请求方式
GET

## 请求地址
https://monitor.jdcloud-api.com/v1/regions/{regionId}/metrics/{metric}/metricData

|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**metric**|String|True||Metric|
|**regionId**|String|True||Region Id|

## 请求参数
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**endTime**|String|False||Query end time of time range, UTC time, format: 2016-12- yyyy-MM-dd'T’HH:mm:ssZ (if it is blank, which shall be obtained by computing startTime and timeInterval)|
|**resourceId**|String|True||uuid of resource|
|**serviceCode**|String|True||Type of resource, taking values such as vm, lb, ip, database|
|**startTime**|String|False||Query start time of time range, UTC time, format: yyyy-MM-dd'T’HH:mm:ssZ (current time by default, if it is earlier than 30d, it will be reset to 30d)|
|**tags**|[TagFilter[]](##TagFilter)|False||Customized tag|
|**timeInterval**|String|False||Time interval: 1h, 6h, 12h, 1d, 3d, 7d, 14d, fixed time interval, fill in at least one of timeInterval and endTime|

### <a name="TagFilter">TagFilter</a>
|名称|类型|是否必需|默认值|描述|
|---|---|---|---|---|
|**key**|String|True||Tag key|
|**values**|String[]|True||Tag value|

## 返回参数
|名称|类型|描述|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|名称|类型|描述|
|---|---|---|
|**metricDatas**|[MetricData[]](##MetricData)||
### <a name="MetricData">MetricData</a>
|名称|类型|描述|
|---|---|---|
|**data**|[DataPoint[]](##DataPoint)||
|**metric**|[Metric](##Metric)||
### <a name="DataPoint">DataPoint</a>
|名称|类型|描述|
|---|---|---|
|**timestamp**|Integer|Time stamp|
|**value**|String|Value|
### <a name="Metric">Metric</a>
|名称|类型|描述|
|---|---|---|
|**calculateUnit**|String|Computing unit of metric, such as bit/s, %, k|
|**metric**|String|English identifier of monitoring item|
|**metricName**|String|Name of monitoring item|

## 返回码
|返回码|描述|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
