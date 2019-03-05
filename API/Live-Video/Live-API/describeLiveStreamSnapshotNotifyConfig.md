# describeLiveStreamSnapshotNotifyConfig


## Description
Search snapshot callback configuration

## Request Method
GET

## Request Address
https://live.jdcloud-api.com/v1/snapshotNotifys/{publishDomain}:config

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**publishDomain**|String|True| |Pushing Streaming Accelerated Domain|

## Request Parameter
None


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**requestId**|String|ruquestId|
|**result**|Result| |

### Result
|Name|Type|Description|
|---|---|---|
|**notifyUrl**|String|Callback Address|
|**publishDomain**|String|Your Accelerated Domain|

## Return Code
|Return Code|Description|
|---|---|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**503**|Service unavailable|
|**200**|OK|
|**500**|Internal server error|
