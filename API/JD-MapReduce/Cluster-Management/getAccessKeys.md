# getAccessKeys


## Description
Obtain accessKey and accessKeySecret based on userpin

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/accessKeys

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True||Region ID|

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
|**data**|[UserAccessKey](##UserAccessKey)|User’s AK/SK|
|**message**|String||
|**status**|String||
### <a name="UserAccessKey">UserAccessKey</a>
|Name|Type|Description|
|---|---|---|
|**accessKey**|String|Access key, AccessKey is used for calling cloud service API with program method|
|**accessKeySecret**|String|AccessKeySecret is the key pair used to verify the user|
|**account**|String|User account|
|**created**|String|Creation time|
|**expire**|String|Expiration time|
|**id**|Integer|User pass id|
|**modified**|String|Update time|
|**modifier**|String|Update operator|
|**pin**|String|User name|
|**state**|Integer|Status|
|**yn**|Integer||

## Return code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
