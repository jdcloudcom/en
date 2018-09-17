# listBuckets


## Description
List all bucket of current user


## Request method
GET

## Request address
https://oss.jdcloud-api.com/v1/regions/{regionId}/buckets

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID, e.g.: cn-north-1|

## Request parameter
None


## Return parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String||
|**result**|[Result](##Result)||


### <a name="Result">Result</a>
|Name|Type|Description|
|---|---|---|
|**buckets**|[Bucket[]](##Bucket)||
|**owner**|[User](##User)||
### <a name="Bucket">Bucket</a>
|Name|Type|Description|
|---|---|---|
|**creationDate**|String||
|**name**|String||
### <a name="User">User</a>
|Name|Type|Description|
|---|---|---|
|**displayName**|String||
|**id**|String||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid Argument|
|**403**|Access Denied|
