# setLiveDomainRefer


## Description
Set domain refer Anti-Leech

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/refer

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**referType**|String|False| |refer type, value: block (blacklist), allow (White List), block by default|
|**referList**|String[]|False| |For the domain list separated by commas; if the referList is uploaded empty, it is deleted|
|**allowNoReferHeader**|String|False| |Allow null refer access or not, “on” by default|
|**allowNullReferHeader**|String|False| |Allow access without ua, “on” by default|


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
