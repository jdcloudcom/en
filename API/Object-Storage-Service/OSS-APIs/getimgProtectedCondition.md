# getimgProtectedCondition


## Description
Obtain original image protection configuration of current bucket


## Request method
GET

## Request address
https://oss.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketname}:imgProtected

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bucketname**|String|True||Bucket Name, e.g.: test|
|**regionId**|String|True||Region ID, e.g.: cn-north-1|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**imgProtectedResult**|Result||
### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**codition**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid Argument|
|**403**|Access Denied|
