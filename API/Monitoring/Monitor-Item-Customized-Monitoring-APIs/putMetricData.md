# putMetricData


## Description
The API is for reporting the custom metric monitoring data, facilitating the user to report the collected time series data to the Monitoring. Report data of different regions for domain names of different region, refer to : <a href="https://docs.jdcloud.com/cn/monitoring/reporting-monitoring-data"> Calling Description </a>Original data and aggregated statistical data can be reported in batches. A single request contains up to 50 data points; the data size does not exceed 256k.

## Request Method
POST

## Request Address
https://monitor.{regionId}.jdcloud-api.com/v1/customMetrics


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**metricDataList**|MetricDataCm[]|False| |Data Parameter|

### MetricDataCm
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**namespace**|String|True| |Naming space, no more than 255 bytes in length, only English, numbers, underlines_, dot., [0-9][a-z] [A-Z] [. _ ] are allowed, others will return err|
|**metric**|String|True| |Metric name, no more than 255 bytes in length, only English, numbers, underlines_, dot., [0-9][a-z] [A-Z] [. _ ] are allowed, others will return err|
|**dimensions**|Object|True| |Data dimension, data type is map type, support at least one, up to six tags, no more than 1,024 bytes in total length, only English, numbers, underlines_, dot., [0-9][a-z] [A-Z] [. _ ] are allowed. For others, it will return err.eg:{"host":"127.0.0.1","region":"cn-north-1","role":"M"}|
|**timestamp**|Long|True| |Timestamp for reporting data points only supports 10-bit, second timestamp, the time of the past 30 days cannot be written in|
|**type**|Integer|True| |Data reporting type, 1 is the original value, 2 is aggregated data. When the aggregated data is reported, it is suggested that it shall be reported during the period of 60s, otherwise, it cannot be queried normally.|
|**values**|Object|True| |Metric value collection, the data type must be the map type, key is the data type, value is the data value, when type=1, key only can be “value”, the reported is the original value, when type=2, key can be “avg”, “sum”, “last”, “max”, “min”, “count”, which only support the above types, otherwise it will report an error, value contents are integers or floating point numbers, the largest value is 9223372036854775807, count only supports numbers >=0|
|**unit**|String|False| |Data unit, no more than 64 bytes in length, only English, numbers, underlines_, dot., [0-9][a-z] [A-Z] [. _ ] are allowed, err will be returned for others|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String|Requested identifierid|
|**error**|Object|Error Information|

### Result
|Name|Type|Description|
|---|---|---|
|**success**|Boolean|All successful write-ins are true, otherwise are false|
|**errMetricDataList**|MetricDataList[]| |
### MetricDataList
|Name|Type|Description|
|---|---|---|
|**errMetricData**|String|Error Data|
|**errDetail**|String|Error Data Description|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|invalid parameter|
|**429**|quota exceed|
|**500**|internal server error|
