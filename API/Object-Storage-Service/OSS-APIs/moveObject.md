# moveObject


## Description
moveobject


## Request method
PUT

## Request address
https://oss.jdcloud-api.com/v1/regions/{regionId}/buckets/{bucketname}/objectkey/{objectkey}

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**bucketname**|String|True||bucket name, e.g.: test-bucket|
|**objectkey**|String|True||objectkey, e.g.: test-object|
|**regionId**|String|True||Region ID, e.g.: cn-north-1|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**x-jss-move-source**|String|True||source Information|


## Response   parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|Result||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**moveObjectResult**|Result||
### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**etag**|String||
|**lastModified**|String||

## Response   code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid Argument|
|**403**|Access Denied|
|**404**|The specified bucket does not exist.|
