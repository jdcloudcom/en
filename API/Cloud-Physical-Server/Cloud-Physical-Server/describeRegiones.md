# describeRegiones


## Description
Cloud Physical Server Region List Query

## Request method
GET

## Request address
https://cps.jdcloud-api.com/v1/regions


## Request parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**networkType**|String|False| |Network type basic/vpc, basic by default|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**regions**|Region[]| |
### Region
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Code, such as cn-east-1|
|**regionName**|String|Region Name, such as East China Region 1|
|**azs**|Az[]|Availability Zone List|
### Az
|Name|Type|Description|
|---|---|---|
|**region**|String|Region Code, such as cn-east-1|
|**az**|String|Availability Zone Code, such as cn-east-1a|
|**azName**|String|Availability Zone Name|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Bad request|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
