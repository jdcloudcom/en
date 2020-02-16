# checkKeyExist


## Description
Check if AccessKey is duplicated

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/accessKeys:checkAccessKeyExist

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**accessKey**|String|True| | |
|**accessKeyType**|String|True| | |


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](checkkeyexist#result)|Check if AccessKey is duplicated|
|**requestId**|String|Request ID|

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**accessKeyId**|Sring|Return to AccessKeyID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication falied|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
