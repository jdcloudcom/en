# createKey


## Description
Create Key

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/kms

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**keyName**|String|False| |key Name|
|**keyDesc**|String|False| |key Description|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createkey#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**accessKey**|String|Generated accessKey|
|**secretKey**|String|Generated secretKey|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
