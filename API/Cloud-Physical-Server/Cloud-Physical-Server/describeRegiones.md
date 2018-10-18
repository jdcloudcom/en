# describeRegiones


## Description
Cloud Physical Server Region List Query

## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions


## Request parameter
None


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**regions**|Region[]| |
### Region
|Name|Type|Description|
|---|---|---|
|**azs**|Az[]|Availability Zone List|
|**region**|String|Region Code, such as cn-east-1|
|**regionName**|String|Region Name, such as East China Region 1|
### Az
|Name|Type|Description|
|---|---|---|
|**az**|String|Availability Zone Code, such as cn-east-1a|
|**azName**|String|Availability Zone Name|
|**region**|String|Region Code, such as cn-east-1|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
