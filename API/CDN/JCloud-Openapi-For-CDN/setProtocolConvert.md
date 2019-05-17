# setProtocolConvert


## Description
Set forwarding protocol

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/liveDomain/{domain}/protocolConvert

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**certificate**|String|False| |https certificate must be uploaded when transferring https format|
|**rsaKey**|String|False| |https Private Key must be uploaded when transferring https format|
|**protocolConverts**|ProtocolConvert[]|False| | |

### ProtocolConvert
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**sourceProtocol**|String|False| |Currently, Source Protocol only can be rtmp|
|**targetProtocol**|String|False| |Target Protocol|

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
