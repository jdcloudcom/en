# describeMetricData


## Description
View the data of a single monitoring item of a certain resource

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/metrics/{metric}/metricData

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center ID|
|**metric**|String|True| |English Identifier (id) of Monitoring Item|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**resourceId**|String|True| |Resource ID|
|**startTime**|Integer|True| |Search start time of time range, UNIX time stamp (support data search of latest 90 days)|
|**endTime**|Integer|True| |Search end time of time range, UNIX time stamp (support data search of latest 90 days)|
|**timeInterval**|String|False| |Time interval: m, h and d, for example 10 minutes = 10m, 1 hour = 1h, 3 days = 3d; the default value is 5m, supporting the minimum value 5m and the maximum value 90d<br>At present, for bandwidth uplink and downlink traffic search, the time interval will be set as 1m or 5m depending on whether the time range is greater than 2h|
|**ip**|String|False| |Interchanger IP, be sure to designate port while designating ip|
|**port**|String|False| |Port, be sure to designate ip while designating port|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**metricData**|MetricData| |
### MetricData
|Name|Type|Description|
|---|---|---|
|**data**|DataPoint[]| |
|**statistic**|Statistic| |
|**metric**|Metric| |
### Metric
|Name|Type|Description|
|---|---|---|
|**metric**|String|English identifier of monitoring item|
|**metricName**|String|Name of Monitoring Item|
### Statistic
|Name|Type|Description|
|---|---|---|
|**max**|Double|Maximum|
|**min**|Double|Minimum|
|**avg**|Double|Mean Value|
### DataPoint
|Name|Type|Description|
|---|---|---|
|**timestamp**|Integer|UNIX Time Stamp|
|**value**|Double|Sampling Value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
