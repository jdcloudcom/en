# delDomain


## Description
Delete Main Domain Name

## Request method
DELETE

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domainDel

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|Integer|True| |Domain Name ID to be Deleted|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
