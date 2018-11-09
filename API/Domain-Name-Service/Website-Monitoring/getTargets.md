# getTargets


## Description
Query available monitor objects of subdomains

## Request method
GET

## Request address
https://clouddnsservice.jdcloud-api.com/v1/regions/{regionId}/domain/{domainId}/getTargets

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**domainId**|String|True| |Domain Name ID|
|**regionId**|String|True| |Region ID to which the instance belongs|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**subDomainName**|String|True| |Subdomain|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ID of This Request|
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**data**|String[]|Array of Available Monitoring Objects Returned|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|BAD_REQUEST|
