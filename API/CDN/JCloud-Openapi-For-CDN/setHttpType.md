# setHttpType


## Description
Set http protocol

## Request Method
POST

## Request Address
https://cdn.jdcloud-api.com/v1/domain/{domain}/httpType

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**domain**|String|True| |User Domain|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**httpType**|String|False| |http type only can be http or https, it is http by default. When it is set as https, “Set Communications Protocol” APIs need to be called to upload certificates and private keys|
|**certificate**|String|False| |User certificate must be set when Type is https|
|**rsaKey**|String|False| |Credential Private Key|
|**jumpType**|String|False| |Three Types: default, http, https|


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
