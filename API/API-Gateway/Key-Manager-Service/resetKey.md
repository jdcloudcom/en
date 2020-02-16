# resetKey


## Description
Reset the acesskey and secretkey of key

## Request Method
PUT

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/kms

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyId**|String|True| |keyId|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](resetkey#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**keyInfo**|[KeyInfo](resetkey#keyinfo)| |
### <div id="keyinfo">KeyInfo</div>
|Name|Type|Description|
|---|---|---|
|**userId**|String|userid|
|**keyId**|String|keyid|
|**keyName**|String|keyname|
|**accessKey**|String|ak|
|**secretKey**|String|sk|
|**keyDesc**|String|key Description Information|
|**createTime**|String|Creation Time|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
