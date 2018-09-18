# createVpc


## Description
Create virtual private cloud

## Request method
POST

## Request address
https://vpc.jdcloud-api.com/v1/regions/{regionId}/vpcs/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**addressPrefix**|String|False||If it is blank, segment is not limited; if it is not blank, it is 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16 and their subnets included and the length of subnet mask is between 16 and 28|
|**description**|String|False||vpc description, all characters allowed to enter under UTF-8 coding, which is not exceed 256 characters.|
|**vpcName**|String|True||Virtual private cloud name, only allowed to enter Chinese, numbers, capital and lowercase letters, English underline “_” and line-through “-”, must provide a name which cannot exceed 32 characters.|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|Request ID|
|**result**|Result|Returned results|


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**vpcId**|String|Virtual private cloud ID|

## Return code
|Return code|Description|
|---|---|
|**409**|Parameter conflict|
|**200**|Successful operation|
|**429**|Quota exceeded|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**500**|Internal server error|
|**503**|Service unavailable|
|**404**|Not found|
