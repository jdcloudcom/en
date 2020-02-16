# queryKeys


## Description
Search key list

## Request Method
GET

## Request Address
https://apigateway.jdcloud-api.com/v1/regions/{regionId}/kms

|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|

## Request Parameter
|Name|Type|Required or Not|Default Value|Description|
|---|---|---|---|---|
|**pageNumber**|Integer|False|1|page; it is 1 by default, the value range: [1,∞)|
|**pageSize**|Integer|False|20|Paging size; it is 20 by default; value range: [10, 100]|
|**orderBy**|String|False| |Sort types|
|**userType**|String|False| |User Type|
|**keyId**|String|False| |Key Pair Id|


## Return Parameter
|Name|Type|Description|
|---|---|---|
|**result**|[Result](querykeys#result)| |
|**requestId**|String| |

### <div id="result">Result</div>
|Name|Type|Description|
|---|---|---|
|**total**|Integer|total count|
|**data**|[KeyInfo[]](querykeys#keyinfo)|key Details|
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
