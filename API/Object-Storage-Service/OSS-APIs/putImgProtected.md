# putImgProtected


## Description
Create original image protection


## Request method
PUT

## Request address
https://oss.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketname}:imgProtected

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bucketname**|String|True||Bucket Name, e.g.: test|
|**regionId**|String|True||Region ID, e.g.: cn-north-1|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**condition**|String|True||Original image protection configuration|


## Response   parameter
|Name|Type|Description|
|---|---|---|



## Response   code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid Argument|
|**403**|Access Denied|
|**409**|The requested bucket name is not available. The bucket namespace is shared by all users of the system. Please select a different name and try again.|
