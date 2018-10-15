# describeQuotas


## Description
Query quota, support: VM, image, key pair, template


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/quotas

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |resourceTypes - Resource types, multiple support [instance, keyair, image, instanceTemplate]<br>|
|**imageId**|String|False| |Private image Id, this parameter must be uploaded when querying imageShare quota|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**quotas**|Quota[]|Quota list|
### Quota
|Name|Type|Description|
|---|---|---|
|**limit**|Integer|Upper Quota Limit|
|**resourceType**|String|Source Type [instance, keypair, image, instanceTemplate]|
|**used**|Integer|Used Quota|

## Response code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
