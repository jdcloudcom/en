# deleteBucket


## Description
Delete a bucket


## Request method
DELETE

## Request address
https://oss.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketname}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bucketname**|String|True| |bucket name, e.g.: test-bucket|
|**regionId**|String|True| |Region ID, e.g.: cn-north-1|

## Request parameter
None


## Response parameter
None



## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid Argument|
|**403**|Access Denied|
|**404**|The specified bucket does not exist.|
