# batchDeleteDomainGroup


## Description
Delete domain groups in batches

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domainGroup:batchDelete


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**ids**|Long[]|True| |id of deleted domain group|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
