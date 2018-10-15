# getAccessKeys


## Description
Obtain accessKey and accessKeySecret based on userpin

## Request method
GET

## Request address
https://idata-jmr-api.jcloud.com/v1/regions/{regionId}/accessKeys

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

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
|**data**|UserAccessKey|User’s AK/SK|
|**message**|String| |
|**status**|String| |
### UserAccessKey
|Name|Type|Description|
|---|---|---|
|**accessKey**|String|Access key, AccessKey is used for calling cloud service API with program method|
|**accessKeySecret**|String|AccessKeySecret is the key pair used to verify the user|
|**account**|String|User Account|
|**created**|String|Creation Time|
|**expire**|String|Expiration Time|
|**id**|Integer|User Pass ID|
|**modified**|String|Update Time|
|**modifier**|String|Update Operator|
|**pin**|String|User Name|
|**state**|Integer|Status|
|**yn**|Integer| |

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**500**|Internal server error|
