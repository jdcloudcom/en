# lastDownsample


## Description
View the Last Point at Certain Resource

## Request Method
GET

## Request Address
https://monitor.jcloud.com/v1/regions/{regionId}/metrics/{metric}/lastDownsample

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**metric**|String|True| |English Identifier (id) of Monitoring Item|
|**regionId**|String|True| |Region Id|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**aggrType**|String|False| |Aggregation method: max avg min and so on|
|**endTime**|String|False| |Query end time of time range, UTC time, format: 2016-12- yyyy-MM-dd'T'HH:mm:ssZ (if it is blank, which shall be obtained by computing startTime and timeInterval)|
|**resourceId**|String|True| |Resourcesuuid|
|**serviceCode**|String|True| |Type of resource, taking values such as vm, lb, ip, database|
|**startTime**|String|False| |Query start time of time range, UTC time, format: yyyy-MM-dd'T'HH:mm:ssZ (current time by default, if it is earlier than 30d, it will be reset to 30d)|
|**tags**|TagFilter[]|False| |Customized Tag|
|**timeInterval**|String|False| |Queried time interval, only supporting the minute-level, for example: 1m|

### TagFilter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**key**|String|False| |Tag Key|
|**values**|String[]|False| |Tag Value|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested identifierid|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**items**|LastDownsampleRespItem[]| |
### LastDownsampleRespItem
|Name|Type|Description|
|---|---|---|
|**metric**|String| |
|**name**|String| |
|**value**|Object| |

## Return Code
|Return Code|Description|
|---|---|
|**200**|View the Last Point at Certain Resource|
