# describeAuthorizationTokens


## Description
<p>Query tokens in batches.</p> 
<p>Paging and filtering conditions are not supported now.</p>


## Request method
GET

## Request address
https://containerregistry.jdcloud-api.com/v1/regions/{regionId}/registries/{registryName}/tokens

|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**regionId**|String|True| |Region ID|
|**registryName**|String|True| |Registry Name|

## Request parameter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**filters**|Filter[]|False| |token - token ID, support several tokens <br>|
|**pageNumber**|Integer|False| |Page; 1 by default|
|**pageSize**|Integer|False| |Page size; it is 20 by default; value range[10, 100]|

### Filter
|Name|Type|Required or not|Default value|Description|
|---|---|---|---|---|
|**name**|String|True| |Name of Filter Requirements|
|**operator**|String|False| |Operator of filter requirements is eq by default|
|**values**|String[]|True| |Value of Filter Requirements|

## Response parameter
|Name|Type|Description|
|---|---|---|
|**result**|Result| |
|**requestId**|String| |

### Result
|Name|Type|Description|
|---|---|---|
|**authorizationTokens**|AuthorizationData[]| |
|**totalCount**|Number| |
### AuthorizationData
|Name|Type|Description|
|---|---|---|
|**authorizationToken**|String|A character string based on base64 code, including the authorization information of assigned JCR registry. After decoding, it may be used for docker login.|
|**loginCmdLine**|String|The docker login command line directly used by the user|
|**expiresAt**|String|Unix clock, which records the expiration time of authorization token. The default valid period of Authorization tokens is 12 hours.|

## Response code
|Return code|Description|
|---|---|
|**200**|OK|
|**400**|Invalid parameter|
|**401**|Authentication failed|
|**404**|Not found|
|**500**|Internal server error|
|**503**|Service unavailable|
