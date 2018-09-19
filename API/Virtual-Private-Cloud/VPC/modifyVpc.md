# modifyVpc


## Description
Modify VPC interface

## Request method
PATCH

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcs/{vpcId}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|
|**vpcId**|String|True||Vpc ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**description**|String|False||VPC description, all characters allowed to enter under UTF-8 coding, which is not exceed 256 characters.|
|**vpcName**|String|False||VPC name, only allowed to enter Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|



## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**409**|Parameter conflict |
|**500**|Internal server error|
