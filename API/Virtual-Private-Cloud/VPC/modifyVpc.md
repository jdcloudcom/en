# modifyVpc


## Description
Modify VPC API

## Request method
PATCH

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcs/{vpcId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**vpcId**|String|True| |Vpc ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False| |VPC description, allow all characters under UTF-8 coding, which cannot exceed 256 characters.|
|**vpcName**|String|False| |VPC name, only allow Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**409**|Parameter conflict |
|**500**|Internal server error|
