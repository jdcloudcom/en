# lastDownsample


## Description
View the last monitoring data point of a certain resource

## Request Method
GET

## Request Address
https://jdccs.jdcloud-api.com/v1/idcs/{idc}/metrics/{metric}/lastDownsample

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**idc**|String|True| |IDC Data Center ID|
|**metric**|String|True| |English Identifier (id) of Monitoring Item|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**resourceId**|String|True| |Resource ID, supporting batch search of multiple resourceIds, separating two ids with the mark "\|"|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**items**|LastDownsampleRespItem[]| |
### LastDownsampleRespItem
|Name|Type|Description|
|---|---|---|
|**metric**|String|English identifier of monitoring item|
|**resourceId**|String|Resource ID|
|**value**|Double|Sampling Value|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
