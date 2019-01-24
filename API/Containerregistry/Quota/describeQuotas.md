# describeQuotas


## Description
Query Quota

## Request method
GET

## Request address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/quotas

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |resourceTypes - resource type, currently only supports [registry, repository] and only supports simultaneously query two quotas. <br>|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**quotas**|Quota[]|Quota list|
### Quota
|Name|Type|Description|
|---|---|---|
|**resourceType**|String|Resource Type [registry/repository]|
|**limit**|Integer|Available Resource Cap|
|**used**|Integer|Number of Used Resources|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
