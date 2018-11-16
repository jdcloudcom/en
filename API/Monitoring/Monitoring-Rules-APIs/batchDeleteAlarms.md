# batchDeleteAlarms


## Description
Delete Rules by Batch

## Request Method
DELETE

## Request Address
https://monitor.jcloud.com/v1/regions/{regionId}/alarms

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**filter**|Filter[]|True| |filter name is 'ids' and the alarm id to be deleted|

### Filter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**name**|String|False| | |
|**values**|String[]|False| | |

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested identifierid|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
