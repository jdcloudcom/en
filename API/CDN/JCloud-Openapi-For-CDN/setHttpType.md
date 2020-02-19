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
|**httpType**|String|True| |http type only can be http or https, it is http by default. When it is set as https, "Set Communications Protocol" APIs need to be called to upload certificates and private keys|
|**certificate**|String|False| |User certificate must be set when Type is https|
|**rsaKey**|String|False| |Credential Private Key|
|**jumpType**|String|True| |Three Types: default, http, https|
|**certFrom**|String|False| |There are two types of certificate sources: default, ssl|
|**sslCertId**|String|False| |ssl Certificate id|
|**syncToSsl**|Boolean|False| |Whether to synchronize to ssl, boolean values, value true or false|
|**certName**|String|False| |When syncToSsl is true, certName is mandatory|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](sethttptype#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**taskId**|String|Task taskId|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**404**|NOT_FOUND|