# deleteForbiddenStream


## Description
Delete forbidden stream

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/stream:unForbidden

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**deleteStreams**|[DeleteStream[]](#deletestream)|True| |Forbidden Stream To Be Deleted|

### <div id="DeleteStream">DeleteStream</div>
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**stream**|String|True| |Forbidden Stream|
|**app**|String|True| |Blocked pushing streaming app|
|**publishIp**|String|True| | |

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
