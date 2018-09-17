# operateMonitor


## Description
Operation collection for monitoring items, including: delete, pause, start, manual recovery and manual switch

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/monitorOperate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**action**|String|True||Delete - del, pause - stop, start - start, manually recover - recover, manually switch - switch|
|**ids**|Integer[]|True||Monitor Item ID|
|**switchTarget**|String|False||Machine value of the monitoring items, required for manual switch|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of this request|



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
