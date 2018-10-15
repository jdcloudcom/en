# operateMonitor


## Description
Operation Collection for Monitoring Items, including delete, pause, start, manual recovery and manual switch

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/monitorOperate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**action**|String|True| |Delete - del, Pause - stop, Start - start, Manually Recover - recover, Manually Switch - switch|
|**ids**|Integer[]|True| |Monitor Item ID|
|**switchTarget**|String|False| |Machine Value of the Monitoring Items, required for manual switch|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
