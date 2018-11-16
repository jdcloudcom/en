# batchEnableAlarms


## Description
Enable rules by batch

## Request Method
POST

## Request Address
https://monitor.jcloud.com/v1/regions/{regionId}/alarms:enable

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region Id|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**ids**|String[]|True| |ID list of alarm rule|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Requested identifierid|


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
