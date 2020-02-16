# createAccessKey


## Description
Create New Key Pair

## Request Method
POST

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/accessKeys

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**description**|String|False| |Description|
|**accessKeyType**|String|False| |Key Pair Type|
|**accessKey**|String|False| |Access Key|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](createaccesskey#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**accessKeyId**|String|Created Key Pair ID|

## Return Code
|Return Code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
