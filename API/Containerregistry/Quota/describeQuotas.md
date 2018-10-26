# describeQuotas


## Description
Query Quota

## Request Method
GET

## Request Address
https://openapi.cr.jdcloud.com/v1/regions/{regionId}/quotas

|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |resourceTypes - resource type, currently only supports [registry, repository] and only supports simultaneously query two quotas. <br>|

### Filter
|Name|Type|Required or Not|Default|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**quotas**|Quota[]|Quota List|
### Quota
|Name|Type|Description|
|---|---|---|
|**limit**|Integer|Available Resource Cap|
|**resourceType**|String|Resource Type [registry/repository]|
|**used**|Integer|Number of Used Resources|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
