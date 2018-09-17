# updateBucketMaxCount


## Description
Update bucket maximum


## Request method
POST

## Request address
https://oss.jdcloud-api.com/v1/regions/{regionId}/

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID, e.g.: cn-north-1|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bucketmaxcount**|Integer|True||bucket maximum, e.g.: 50, minimum 20|
|**userpin**|String|True||Assign user's pin|


## Return parameter
|Name|Type|Description|
|---|---|---|



## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid Argument|
|**403**|Access Denied|
