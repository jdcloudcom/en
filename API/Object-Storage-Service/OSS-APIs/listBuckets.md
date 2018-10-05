# listBuckets


## Description
List all bucket of current user


## Request method
GET

## Request address
https://oss.jdcloud-api.com/v1/regions/{regionId}/buckets

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID, e.g.: cn-north-1|

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
|**buckets**|Bucket[]| |
|**owner**|User| |
### Bucket
|Name|Type|Description|
|---|---|---|
|**creationDate**|String| |
|**name**|String| |
### User
|Name|Type|Description|
|---|---|---|
|**displayName**|String| |
|**id**|String| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid Argument|
|**403**|Access Denied|
