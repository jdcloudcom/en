# getStorageList


## Description
Create or update storage

## Request method
GET

## Request address
https://streamcompute.jdcloud-api.com/v1/regions/{regionId}/storageList

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**namespaceId**|String|True| |namespaceId|
|**storageType**|String|True| |Storage Type|


## Response parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String| |
|**result**|Result| |


### Result
|Name|Type|Description|
|---|---|---|
|**storageList**|Object[]| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**401**|UNAUTHENTICATED|
