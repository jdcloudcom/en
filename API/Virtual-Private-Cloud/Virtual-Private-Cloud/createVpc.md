# createVpc


## Description
Create VPC

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcs/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**vpcName**|String|True| |VPC name, only allow Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|
|**addressPrefix**|String|False| |If it is blank, segment is not limited; if it is not blank, it is 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28|
|**description**|String|False| |VPC description, allow all characters under UTF-8 coding, which cannot exceed 256 characters.|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result|Returned Results|
|**requestId**|String|Request ID|

### Result
|Name|Type|Description|
|---|---|---|
|**vpcId**|String|VPC ID|

## Response code
|Return code|Description|
|---|---|
|**200**|Successful operation|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**409**|Parameter conflict|
|**429**|Quota exceeded|
|**500**|Internal server error|
|**503**|Service unavailable|
