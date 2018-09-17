# describeQuotas


## Description
Query quota, support: VM, image, key pair, template


## Request method
GET

## Request address
https://vm.jdcloud-api.com/v1/regions/{regionId}/quotas

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|[Filter[]](##Filter)|False||resourceTypes - Resource types, multiple support [instance, keyair, image, instanceTemplate]<br>|

### <a name="Filter">Filter</a>
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True||Name of filter requirements|
|**operator**|String|False||Operator of filter requirements is eq by default|
|**values**|String[]|True||Value of filter requirements|

## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**quotas**|[Quota[]](##Quota)|Quota list|
### <a name="Quota">Quota</a>
|Name|Type|Description|
|---|---|---|
|**limit**|Integer|Upper quota limit|
|**resourceType**|String|Source type [instance, keypair, image, instanceTemplate]|
|**used**|Integer|Used quota|

## Return code
|Return code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
