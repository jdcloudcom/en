# addLiveStreamDomainSnapshot


## Description
Add domain live snapshot configuration

## Request Method
POST

## Request Address
https://live.jdcloud-api.com/v1/snapshotDomains:template


## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Your Pushing Streaming Accelerated Domain|
|**template**|String|True| |Snapshot Template|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|


## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
