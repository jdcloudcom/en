# deleteNamespace


## Description
Delete namespace; if there are other subordinate resources associated with it, it is not allowed to delete it

## Request Method
DELETE

## Request Address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/namespace

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**namespaceId**|Integer|True|||


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**status**|Boolean|Delete the namespace successful marker|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**500**|INTERNAL_ERROR|
|**400**|INTERNAL_ERROR|
