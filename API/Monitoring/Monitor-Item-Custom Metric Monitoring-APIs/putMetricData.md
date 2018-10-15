# putMetricData


## Description
The API is for reporting the custom metric monitoring data, facilitating the user to report the collected time series data to the Monitoring. Original data and aggregated statistical data can be reported in batches. A single request contains up to 50 data points; the data size does not exceed 256k.

## Request method
POST

## Request address
https://monitor.{regionId}.jdcloud-api.com/v1/customMetrics

None

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**metricDataList**|MetricDataCm[]|False| |Data Parameter|

### MetricDataCm
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**dimensions**|Object|True| |Data dimension, data type is map type, support at least one, up to five tags, no more than 255 bytes in total length, only English, numbers, underlines_, dot., [0-9][a-z] [A-Z] [. _ ] are allowed, others will return err|
|**metric**|String|True| |Metric name, no more than 255 bytes in length, only English, numbers, underlines_, dot., [0-9][a-z] [A-Z] [. _ ] are allowed, others will return err|
|**namespace**|String|True| |Naming space, no more than 255 bytes in length, only English, numbers, underlines_, dot., [0-9][a-z] [A-Z] [. _ ] are allowed, others will return err|
|**timestamp**|Integer|True| |Timestamp for reporting data points only supports 10-bit, second timestamp, the time of the past 30 days cannot be written in|
|**type**|Integer|True| |Data reporting type, 1 is the original value, 2 is aggregated data. When the aggregated data is reported, it is suggested that it shall be reported during the period of 60s, otherwise, it cannot be queried normally.|
|**values**|Object|True| |Metric value collection, the data type must be the map type, key is the data type, value is the data value, when type=1, key only can be “value”, the reported is the original value, when type=2, key can be “avg”, “sum”, “last”, “max”, “min”, “count”, which only support the above types, otherwise it will report an error, value contents are integers or floating point numbers, the largest value is 9223372036854775807, count only supports numbers >=0|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**error**|Object|Error Information|
|**requestId**|String|Request ID|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**errMetricDataList**|MetricDataList[]| |
|**success**|Boolean|All successful write-ins are true, otherwise are false|
### MetricDataList
|Name|Type|Description|
|---|---|---|
|**errDetail**|String|Error Data Description|
|**errMetricData**|String|Error Data|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**500**|internal server error|
|**429**|quota exceed|
