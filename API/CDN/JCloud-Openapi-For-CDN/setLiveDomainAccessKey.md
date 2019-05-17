# setLiveDomainAccessKey


## Description
Set URL authentication

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/accesskeyConfig

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accesskeyType**|Integer|False| |url Authentication On 1 Off 0|
|**accesskeyKey**|String|False| |url Authentication must be uploaded when uploading|
|**authLifeTime**|Integer|False| |The default value is 300s when it is on, 0 when it is off|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|Object| |
|**requestId**|String| |


## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|
