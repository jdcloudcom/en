# operateRR


## Description
Enable, disable, delete the resolution records under the main domain name

## Request method
POST

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/RROperate

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True||Domain Name ID|
|**regionId**|String|True||Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**action**|String|True||Operation type, on->enable, off->disable, del->delete|
|**ids**|Integer[]|True||Resolution record ID of the operation demanded|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of this request|



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
